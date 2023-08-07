package net.nukollodda.tekora.block.entity.entities.machines;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nukollodda.tekora.Tekora;
import net.nukollodda.tekora.block.TekoraBlocks;
import net.nukollodda.tekora.block.entity.entities.machines.AlloyFurnaceEntity;
import net.nukollodda.tekora.block.entity.entities.machines.CrusherEntity;
import net.nukollodda.tekora.block.entity.entities.machines.ElectricFurnaceEntity;
import net.nukollodda.tekora.block.entity.entities.machines.InfusionFurnaceEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Tekora.MODID);

    public static final RegistryObject<BlockEntityType<AlloyFurnaceEntity>> ALLOY_FURNACE =
            BLOCK_ENTITIES.register("alloy_furnace", () ->
                BlockEntityType.Builder.of(AlloyFurnaceEntity::new,
                    TekoraBlocks.ALLOY_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<InfusionFurnaceEntity>> INFUSION_FURNACE =
            BLOCK_ENTITIES.register("infusion_furnace", () ->
                BlockEntityType.Builder.of(InfusionFurnaceEntity::new,
                    TekoraBlocks.INFUSION_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<CrusherEntity>> CRUSHER =
            BLOCK_ENTITIES.register("crusher", () ->
                    BlockEntityType.Builder.of(CrusherEntity::new,
                    TekoraBlocks.CRUSHER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ElectricFurnaceEntity>> ELECTRIC_FURNACE =
            BLOCK_ENTITIES.register("electric_furnace", () ->
                    BlockEntityType.Builder.of(ElectricFurnaceEntity::new,
                    TekoraBlocks.ELECTRIC_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}