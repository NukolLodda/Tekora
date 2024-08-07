package net.tekoramods.tekora.item.containers;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.tekoramods.tekora.fluid.TekoraChemicalFluidType;
import net.tekoramods.tekora.block.fluids.AbstractTekoraFluidBlock;
import net.tekoramods.tekora.item.tools.ITekoraColored;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class TekoraBucketItem extends BucketItem implements ITekoraColored {
    public TekoraBucketItem(Supplier<? extends Fluid> supplier) {
        super(supplier, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET));
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        Block block = getFluid().defaultFluidState().createLegacyBlock().getBlock();
        if (block instanceof AbstractTekoraFluidBlock fluidBlock) {
            fluidBlock.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public int getColor() {
        if (getFluid().getFluidType() instanceof TekoraChemicalFluidType tekoraFluid) {
            try {
                return tekoraFluid.getTintColor();
            } catch (Exception ignored) {}
        }
        return 0x1165b0;
    }
}
