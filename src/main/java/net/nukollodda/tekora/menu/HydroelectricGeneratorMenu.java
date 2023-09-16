package net.nukollodda.tekora.menu;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.nukollodda.tekora.block.TekoraBlocks;
import net.nukollodda.tekora.block.entity.entities.machines.ElectricFurnaceEntity;
import net.nukollodda.tekora.menu.types.AbstractTekoraMenu;

public class HydroelectricGeneratorMenu extends AbstractTekoraMenu {
    public final ElectricFurnaceEntity blockEnt;
    private final Level level;
    private final ContainerData data;
    public HydroelectricGeneratorMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        this(id, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(0));
    }

    public HydroelectricGeneratorMenu(int id, Inventory inv, BlockEntity entity, ContainerData data) {
        super(TekoraMenuTypes.HYDROELECTRIC_GENERATOR_MENU.get(), id, 0);
        checkContainerSize(inv, 3);
        blockEnt = (ElectricFurnaceEntity) entity;
        this.level = inv.player.level();
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);
        addDataSlots(data);
    }

    public int getEnergy() {
        int energy = this.data.get(0);
        int maxEn = this.data.get(1);

        return maxEn != 0 && energy != 0 ? energy * 48 / maxEn : 0;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEnt.getBlockPos()),
                pPlayer, TekoraBlocks.HYDROELECTRIC_GENERATOR.get());
    }
}