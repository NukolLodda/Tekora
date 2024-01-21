package net.nukollodda.tekora.block.entity.entities.machines;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.Containers;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.nukollodda.tekora.block.entity.blocks.machines.AbstractMachineBlock;
import net.nukollodda.tekora.block.entity.entities.TekoraBlockEntities;
import net.nukollodda.tekora.block.entity.entities.machines.types.AbstractTekoraBasicMachineEntity;
import net.nukollodda.tekora.menu.PulverizerMenu;
import net.nukollodda.tekora.recipes.types.CuttingRecipe;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CutterEntity extends AbstractTekoraBasicMachineEntity<CuttingRecipe> { // C may be changed to ItemFluidContainer some day
    public CutterEntity(BlockPos pPos, BlockState pBlockState) {
        super(TekoraBlockEntities.CUTTER.get(), pPos, pBlockState);
    }
    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new PulverizerMenu(id, inv, this, this.data);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("cutter.progress", this.progress);
        tag.putInt("cutter.electricity", energyStorage.getEnergyStored());
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        itemHandler.deserializeNBT(tag.getCompound("inventory"));
        this.progress = tag.getInt("cutter.progress");
        this.energyStorage.setEnergy(tag.getInt("cutter.electricity"));
    }

    public void drops() {
        if (this.level != null) {
            SimpleContainer inv = new SimpleContainer(itemHandler.getSlots());
            for (int i = 0; i < itemHandler.getSlots(); i++) {
                inv.setItem(i, itemHandler.getStackInSlot(i));
            }
            Containers.dropContents(this.level, this.worldPosition, inv);
        }
    }

    public static void tick(Level level, BlockPos pos, BlockState state, CutterEntity entity) {
        if (level.isClientSide()) {
            return;
        } // if a recipe exists, the tick does something
        if (entity.hasElectricity()) {
            state = state.setValue(AbstractMachineBlock.LIT, true);
            level.setBlock(pos, state, 3);
        } else {
            state = state.setValue(AbstractMachineBlock.LIT, false);
            level.setBlock(pos, state, 3);
        }

        SimpleContainer inv = entity.getContainer();
        Optional<CuttingRecipe> recipe = entity.getRecipe(inv);
        if (((recipe.isPresent() && entity.hasRecipe(recipe.get(), inv)) || entity.hasHardCodedRecipe()) && entity.hasEnoughElectricity()) {
            entity.progress++;
            entity.energyStorage.extractEnergy(ENERGY_REQ, false);
            setChanged(level, pos, state);
            if (entity.progress > entity.maxProgress) { // crafts the item
                entity.craftItem(recipe.orElse(null), inv);
            }
        } else {
            entity.resetProgress();
            setChanged(level, pos, state);
        }
    }

    @Override
    protected boolean hasRecipe(CuttingRecipe pRecipe, SimpleContainer pContainer) {
        return canInsertItemIntoOutputSlot(pContainer, pRecipe.getResultItem(level.registryAccess()))
                && canInsertAmountIntoResidueSlot(pContainer) && canInsertItemIntoResidueSlot(pContainer, pRecipe.getResidue());
    }

    @Override
    protected Optional<CuttingRecipe> getRecipe(SimpleContainer pContainer) {
        return this.level.getRecipeManager().getRecipeFor(CuttingRecipe.Type.INSTANCE, pContainer, this.level);
    }

    @Override
    protected SimpleContainer getContainer() {
        SimpleContainer inv = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inv.setItem(i, itemHandler.getStackInSlot(i));
        }
        return inv;
    }

    protected ItemStack getHardCodedRecipeResult() {
        SimpleContainer inv = new SimpleContainer(this.itemHandler.getSlots());
        inv.setItem(0, this.itemHandler.getStackInSlot(0));
        String itemName = inv.getItem(0).getItem().toString();
        String subsec = itemName.contains("_ingot") ?
                itemName.substring(0, itemName.lastIndexOf('_')) : itemName;
        TagKey<Item> itemTag = ItemTags.create(new ResourceLocation("forge", "rods/" + subsec));
        Ingredient.TagValue items = new Ingredient.TagValue(itemTag);
        ItemStack tagItem = items.getItems().toArray(new ItemStack[0])[0];
        if (!tagItem.getItem().equals(Items.BARRIER) &&
                canInsertItemIntoOutputSlot(inv, tagItem)) {
            tagItem.setCount(this.itemHandler.getStackInSlot(2).getCount() + 2);
            return tagItem;
        }
        return null;
    }

    protected ItemStack getJsonRecipeOutput(SimpleContainer inv, Level level) {
        Optional<CuttingRecipe> recipe = level.getRecipeManager()
                .getRecipeFor(CuttingRecipe.Type.INSTANCE, inv, level);
        ItemStack result = recipe.get().getResultItem(level.registryAccess());
        result.setCount(result.getCount() + (recipe.get().getExtraOutputChance() > Math.random() ? 1 : 0) + inv.getItem(2).getCount());
        return result;
    }

    protected ItemStack getJsonRecipeResidue(SimpleContainer inv, Level level) {
        Optional<CuttingRecipe> recipe = level.getRecipeManager()
                .getRecipeFor(CuttingRecipe.Type.INSTANCE, inv, level);
        ItemStack residue = recipe.get().getResidue();
        residue.setCount(residue.getCount() - (recipe.get().getExtraResidueChance() > Math.random() ? 0 : 1) + inv.getItem(1).getCount());
        return residue;
    }
}
