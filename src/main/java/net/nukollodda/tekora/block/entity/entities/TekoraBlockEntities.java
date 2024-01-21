package net.nukollodda.tekora.block.entity.entities;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nukollodda.tekora.Tekora;
import net.nukollodda.tekora.block.TekoraBlocks;
import net.nukollodda.tekora.block.entity.entities.connectors.EnergyCableEntity;
import net.nukollodda.tekora.block.entity.entities.enstorage.InfiniteBatteryEntity;
import net.nukollodda.tekora.block.entity.entities.generators.HydroelectricGeneratorEntity;
import net.nukollodda.tekora.block.entity.entities.machines.*;

public class TekoraBlockEntities {
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

    public static final RegistryObject<BlockEntityType<CompressorEntity>> COMPRESSOR =
            BLOCK_ENTITIES.register("compressor", () ->
                BlockEntityType.Builder.of(CompressorEntity::new,
                    TekoraBlocks.COMPRESSOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<CutterEntity>> CUTTER =
            BLOCK_ENTITIES.register("cutter", () ->
                    BlockEntityType.Builder.of(CutterEntity::new,
                            TekoraBlocks.CUTTER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ExtruderEntity>> EXTRUDER =
            BLOCK_ENTITIES.register("extruder", () ->
                    BlockEntityType.Builder.of(ExtruderEntity::new,
                            TekoraBlocks.EXTRUDER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ElectricFurnaceEntity>> ELECTRIC_FURNACE =
            BLOCK_ENTITIES.register("electric_furnace", () ->
                BlockEntityType.Builder.of(ElectricFurnaceEntity::new,
                    TekoraBlocks.ELECTRIC_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<CentrifugeEntity>> CENTRIFUGE =
            BLOCK_ENTITIES.register("centrifuge", () ->
                    BlockEntityType.Builder.of(CentrifugeEntity::new,
                            TekoraBlocks.CENTRIFUGE.get()).build(null));


    public static final RegistryObject<BlockEntityType<InfiniteBatteryEntity>> INFINITE_BATTERY =
            BLOCK_ENTITIES.register("infinite_battery", () ->
                BlockEntityType.Builder.of(InfiniteBatteryEntity::new,
                    TekoraBlocks.INFINITE_BATTERY.get()).build(null));

    public static final RegistryObject<BlockEntityType<EnergyCableEntity>> ENERGY_CABLE =
            BLOCK_ENTITIES.register("energy_cable", () ->
                    BlockEntityType.Builder.of(EnergyCableEntity::new,
                            TekoraBlocks.COPPER_CABLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<HydroelectricGeneratorEntity>> HYDROELECTRIC_GENERATOR =
            BLOCK_ENTITIES.register("hydroelectric_generator", () ->
                    BlockEntityType.Builder.of(HydroelectricGeneratorEntity::new,
                            TekoraBlocks.HYDROELECTRIC_GENERATOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<PulverizerEntity>> PULVERIZER =
            BLOCK_ENTITIES.register("pulverizer", () -> BlockEntityType.Builder.of(PulverizerEntity::new,
                    TekoraBlocks.PULVERIZER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
