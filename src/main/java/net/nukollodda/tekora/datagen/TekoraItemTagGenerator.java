package net.nukollodda.tekora.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.nukollodda.tekora.Tekora;
import net.nukollodda.tekora.block.TekoraBlocks;
import net.nukollodda.tekora.datagen.tags.TekoraTags;
import net.nukollodda.tekora.item.TekoraItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TekoraItemTagGenerator extends ItemTagsProvider {
    public TekoraItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                                  CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Tekora.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(TekoraTags.Items.ALUMINUM_INGOT).add(TekoraItems.ALUMINUM_INGOT.get());
        this.tag(TekoraTags.Items.BARIUM_INGOT).add(TekoraItems.BARIUM_INGOT.get());
        this.tag(TekoraTags.Items.BERYLLIUM_INGOT).add(TekoraItems.BERYLLIUM_INGOT.get());
        this.tag(TekoraTags.Items.BISMUTH_INGOT).add(TekoraItems.BISMUTH_INGOT.get());
        this.tag(TekoraTags.Items.CADMIUM_INGOT).add(TekoraItems.CADMIUM_INGOT.get());
        this.tag(TekoraTags.Items.CALCIUM_INGOT).add(TekoraItems.CALCIUM_INGOT.get());
        this.tag(TekoraTags.Items.CERIUM_INGOT).add(TekoraItems.CERIUM_INGOT.get());
        this.tag(TekoraTags.Items.CHROMIUM_INGOT).add(TekoraItems.CHROMIUM_INGOT.get());
        this.tag(TekoraTags.Items.CESIUM_INGOT).add(TekoraItems.CESIUM_INGOT.get());
        this.tag(TekoraTags.Items.COBALT_INGOT).add(TekoraItems.COBALT_INGOT.get());
        this.tag(TekoraTags.Items.DYSPROSIUM_INGOT).add(TekoraItems.DYSPROSIUM_INGOT.get());
        this.tag(TekoraTags.Items.ERBIUM_INGOT).add(TekoraItems.ERBIUM_INGOT.get());
        this.tag(TekoraTags.Items.EUROPIUM_INGOT).add(TekoraItems.EUROPIUM_INGOT.get());
        this.tag(TekoraTags.Items.GADOLINIUM_INGOT).add(TekoraItems.GADOLINIUM_INGOT.get());
        this.tag(TekoraTags.Items.GALLIUM_INGOT).add(TekoraItems.GALLIUM_INGOT.get());
        this.tag(TekoraTags.Items.HAFNIUM_INGOT).add(TekoraItems.HAFNIUM_INGOT.get());
        this.tag(TekoraTags.Items.HOLMIUM_INGOT).add(TekoraItems.HOLMIUM_INGOT.get());
        this.tag(TekoraTags.Items.INDIUM_INGOT).add(TekoraItems.INDIUM_INGOT.get());
        this.tag(TekoraTags.Items.IRIDIUM_INGOT).add(TekoraItems.IRIDIUM_INGOT.get());
        this.tag(TekoraTags.Items.LANTHANUM_INGOT).add(TekoraItems.LANTHANUM_INGOT.get());
        this.tag(TekoraTags.Items.LEAD_INGOT).add(TekoraItems.LEAD_INGOT.get());
        this.tag(TekoraTags.Items.LITHIUM_INGOT).add(TekoraItems.LITHIUM_INGOT.get());
        this.tag(TekoraTags.Items.LUTETIUM_INGOT).add(TekoraItems.LUTETIUM_INGOT.get());
        this.tag(TekoraTags.Items.MAGNESIUM_INGOT).add(TekoraItems.MAGNESIUM_INGOT.get());
        this.tag(TekoraTags.Items.MANGANESE_INGOT).add(TekoraItems.MANGANESE_INGOT.get());
        this.tag(TekoraTags.Items.MOLYBDENUM_INGOT).add(TekoraItems.MOLYBDENUM_INGOT.get());
        this.tag(TekoraTags.Items.NEODYMIUM_INGOT).add(TekoraItems.NEODYMIUM_INGOT.get());
        this.tag(TekoraTags.Items.NICKEL_INGOT).add(TekoraItems.NICKEL_INGOT.get());
        this.tag(TekoraTags.Items.NIOBIUM_INGOT).add(TekoraItems.NIOBIUM_INGOT.get());
        this.tag(TekoraTags.Items.OSMIUM_INGOT).add(TekoraItems.OSMIUM_INGOT.get());
        this.tag(TekoraTags.Items.PALLADIUM_INGOT).add(TekoraItems.PALLADIUM_INGOT.get());
        this.tag(TekoraTags.Items.PLATINUM_INGOT).add(TekoraItems.PLATINUM_INGOT.get());
        this.tag(TekoraTags.Items.POTASSIUM_INGOT).add(TekoraItems.POTASSIUM_INGOT.get());
        this.tag(TekoraTags.Items.PRASEODYMIUM_INGOT).add(TekoraItems.PRASEODYMIUM_INGOT.get());
        this.tag(TekoraTags.Items.RHENIUM_INGOT).add(TekoraItems.RHENIUM_INGOT.get());
        this.tag(TekoraTags.Items.RHODIUM_INGOT).add(TekoraItems.RHODIUM_INGOT.get());
        this.tag(TekoraTags.Items.RUBIDIUM_INGOT).add(TekoraItems.RUBIDIUM_INGOT.get());
        this.tag(TekoraTags.Items.RUTHENIUM_INGOT).add(TekoraItems.RUTHENIUM_INGOT.get());
        this.tag(TekoraTags.Items.SCANDIUM_INGOT).add(TekoraItems.SCANDIUM_INGOT.get());
        this.tag(TekoraTags.Items.SAMARIUM_INGOT).add(TekoraItems.SAMARIUM_INGOT.get());
        this.tag(TekoraTags.Items.SODIUM_INGOT).add(TekoraItems.SODIUM_INGOT.get());
        this.tag(TekoraTags.Items.STRONTIUM_INGOT).add(TekoraItems.STRONTIUM_INGOT.get());
        this.tag(TekoraTags.Items.SILVER_INGOT).add(TekoraItems.SILVER_INGOT.get());
        this.tag(TekoraTags.Items.TANTALUM_INGOT).add(TekoraItems.TANTALUM_INGOT.get());
        this.tag(TekoraTags.Items.TERBIUM_INGOT).add(TekoraItems.TERBIUM_INGOT.get());
        this.tag(TekoraTags.Items.THALLIUM_INGOT).add(TekoraItems.THALLIUM_INGOT.get());
        this.tag(TekoraTags.Items.THORIUM_INGOT).add(TekoraItems.THORIUM_INGOT.get());
        this.tag(TekoraTags.Items.THULIUM_INGOT).add(TekoraItems.THULIUM_INGOT.get());
        this.tag(TekoraTags.Items.TIN_INGOT).add(TekoraItems.TIN_INGOT.get());
        this.tag(TekoraTags.Items.TITANIUM_INGOT).add(TekoraItems.TITANIUM_INGOT.get());
        this.tag(TekoraTags.Items.TUNGSTEN_INGOT).add(TekoraItems.TUNGSTEN_INGOT.get());
        this.tag(TekoraTags.Items.URANIUM_INGOT).add(TekoraItems.URANIUM_INGOT.get());
        this.tag(TekoraTags.Items.VANADIUM_INGOT).add(TekoraItems.VANADIUM_INGOT.get());
        this.tag(TekoraTags.Items.YTTERBIUM_INGOT).add(TekoraItems.YTTERBIUM_INGOT.get());
        this.tag(TekoraTags.Items.YTTRIUM_INGOT).add(TekoraItems.YTTRIUM_INGOT.get());
        this.tag(TekoraTags.Items.ZINC_INGOT).add(TekoraItems.ZINC_INGOT.get());
        this.tag(TekoraTags.Items.ZIRCONIUM_INGOT).add(TekoraItems.ZIRCONIUM_INGOT.get());
        this.tag(TekoraTags.Items.BRASS_INGOT).add(TekoraItems.BRASS_INGOT.get());
        this.tag(TekoraTags.Items.BRONZE_INGOT).add(TekoraItems.BRONZE_INGOT.get());
        this.tag(TekoraTags.Items.CARBON_STEEL_INGOT).add(TekoraItems.CARBON_STEEL_INGOT.get());
        this.tag(TekoraTags.Items.CHROMOLY_STEEL_INGOT).add(TekoraItems.CHROMOLY_STEEL_INGOT.get());
        this.tag(TekoraTags.Items.FERROBORON_INGOT).add(TekoraItems.FERROBORON_INGOT.get());
        this.tag(TekoraTags.Items.GALVANIZED_STEEL_INGOT).add(TekoraItems.GALVANIZED_STEEL_INGOT.get());
        this.tag(TekoraTags.Items.HSLA_STEEL_INGOT).add(TekoraItems.HSLA_STEEL_INGOT.get());
        this.tag(TekoraTags.Items.INCONEL_INGOT).add(TekoraItems.INCONEL_INGOT.get());
        this.tag(TekoraTags.Items.INVAR_INGOT).add(TekoraItems.INVAR_INGOT.get());
        this.tag(TekoraTags.Items.MAGNETIC_NEODYMIUM_INGOT).add(TekoraItems.MAGNETIC_NEODYMIUM_INGOT.get());
        this.tag(TekoraTags.Items.MU_METAL_INGOT).add(TekoraItems.MU_METAL_INGOT.get());
        this.tag(TekoraTags.Items.REACTOR_STEEL_INGOT).add(TekoraItems.REACTOR_STEEL_INGOT.get());
        this.tag(TekoraTags.Items.STAINLESS_STEEL_INGOT).add(TekoraItems.STAINLESS_STEEL_INGOT.get());
        this.tag(TekoraTags.Items.STEEL_INGOT).add(TekoraItems.STEEL_INGOT.get());
        this.tag(TekoraTags.Items.TUNGSTEN_CARBIDE_INGOT).add(TekoraItems.TUNGSTEN_CARBIDE_INGOT.get());
        this.tag(TekoraTags.Items.TUNGSTEN_STEEL_INGOT).add(TekoraItems.TUNGSTEN_STEEL_INGOT.get());
        this.tag(TekoraTags.Items.VANASTEEL_INGOT).add(TekoraItems.VANASTEEL_INGOT.get());
        this.tag(TekoraTags.Items.ZIRCALOY_INGOT).add(TekoraItems.ZIRCALOY_INGOT.get());

        this.tag(TekoraTags.Items.ALUMINUM_NUGGET).add(TekoraItems.ALUMINUM_NUGGET.get());
        this.tag(TekoraTags.Items.BARIUM_NUGGET).add(TekoraItems.BARIUM_NUGGET.get());
        this.tag(TekoraTags.Items.BERYLLIUM_NUGGET).add(TekoraItems.BERYLLIUM_NUGGET.get());
        this.tag(TekoraTags.Items.BISMUTH_NUGGET).add(TekoraItems.BISMUTH_NUGGET.get());
        this.tag(TekoraTags.Items.CADMIUM_NUGGET).add(TekoraItems.CADMIUM_NUGGET.get());
        this.tag(TekoraTags.Items.CALCIUM_NUGGET).add(TekoraItems.CALCIUM_NUGGET.get());
        this.tag(TekoraTags.Items.CERIUM_NUGGET).add(TekoraItems.CERIUM_NUGGET.get());
        this.tag(TekoraTags.Items.CESIUM_NUGGET).add(TekoraItems.CESIUM_NUGGET.get());
        this.tag(TekoraTags.Items.CHROMIUM_NUGGET).add(TekoraItems.CHROMIUM_NUGGET.get());
        this.tag(TekoraTags.Items.COBALT_NUGGET).add(TekoraItems.COBALT_NUGGET.get());
        this.tag(TekoraTags.Items.COPPER_NUGGET).add(TekoraItems.COPPER_NUGGET.get());
        this.tag(TekoraTags.Items.DYSPROSIUM_NUGGET).add(TekoraItems.DYSPROSIUM_NUGGET.get());
        this.tag(TekoraTags.Items.ERBIUM_NUGGET).add(TekoraItems.ERBIUM_NUGGET.get());
        this.tag(TekoraTags.Items.EUROPIUM_NUGGET).add(TekoraItems.EUROPIUM_NUGGET.get());
        this.tag(TekoraTags.Items.GADOLINIUM_NUGGET).add(TekoraItems.GADOLINIUM_NUGGET.get());
        this.tag(TekoraTags.Items.GALLIUM_NUGGET).add(TekoraItems.GALLIUM_NUGGET.get());
        this.tag(TekoraTags.Items.HAFNIUM_NUGGET).add(TekoraItems.HAFNIUM_NUGGET.get());
        this.tag(TekoraTags.Items.HOLMIUM_NUGGET).add(TekoraItems.HOLMIUM_NUGGET.get());
        this.tag(TekoraTags.Items.INDIUM_NUGGET).add(TekoraItems.INDIUM_NUGGET.get());
        this.tag(TekoraTags.Items.IRIDIUM_NUGGET).add(TekoraItems.IRIDIUM_NUGGET.get());
        this.tag(TekoraTags.Items.LANTHANUM_NUGGET).add(TekoraItems.LANTHANUM_NUGGET.get());
        this.tag(TekoraTags.Items.LEAD_NUGGET).add(TekoraItems.LEAD_NUGGET.get());
        this.tag(TekoraTags.Items.LITHIUM_NUGGET).add(TekoraItems.LITHIUM_NUGGET.get());
        this.tag(TekoraTags.Items.LUTETIUM_NUGGET).add(TekoraItems.LUTETIUM_NUGGET.get());
        this.tag(TekoraTags.Items.MAGNESIUM_NUGGET).add(TekoraItems.MAGNESIUM_NUGGET.get());
        this.tag(TekoraTags.Items.MANGANESE_NUGGET).add(TekoraItems.MANGANESE_NUGGET.get());
        this.tag(TekoraTags.Items.MOLYBDENUM_NUGGET).add(TekoraItems.MOLYBDENUM_NUGGET.get());
        this.tag(TekoraTags.Items.NEODYMIUM_NUGGET).add(TekoraItems.NEODYMIUM_NUGGET.get());
        this.tag(TekoraTags.Items.NICKEL_NUGGET).add(TekoraItems.NICKEL_NUGGET.get());
        this.tag(TekoraTags.Items.NIOBIUM_NUGGET).add(TekoraItems.NIOBIUM_NUGGET.get());
        this.tag(TekoraTags.Items.OSMIUM_NUGGET).add(TekoraItems.OSMIUM_NUGGET.get());
        this.tag(TekoraTags.Items.PALLADIUM_NUGGET).add(TekoraItems.PALLADIUM_NUGGET.get());
        this.tag(TekoraTags.Items.PLATINUM_NUGGET).add(TekoraItems.PLATINUM_NUGGET.get());
        this.tag(TekoraTags.Items.POTASSIUM_NUGGET).add(TekoraItems.POTASSIUM_NUGGET.get());
        this.tag(TekoraTags.Items.PRASEODYMIUM_NUGGET).add(TekoraItems.PRASEODYMIUM_NUGGET.get());
        this.tag(TekoraTags.Items.RHENIUM_NUGGET).add(TekoraItems.RHENIUM_NUGGET.get());
        this.tag(TekoraTags.Items.RHODIUM_NUGGET).add(TekoraItems.RHODIUM_NUGGET.get());
        this.tag(TekoraTags.Items.RUBIDIUM_NUGGET).add(TekoraItems.RUBIDIUM_NUGGET.get());
        this.tag(TekoraTags.Items.RUTHENIUM_NUGGET).add(TekoraItems.RUTHENIUM_NUGGET.get());
        this.tag(TekoraTags.Items.SCANDIUM_NUGGET).add(TekoraItems.SCANDIUM_NUGGET.get());
        this.tag(TekoraTags.Items.SAMARIUM_NUGGET).add(TekoraItems.SAMARIUM_NUGGET.get());
        this.tag(TekoraTags.Items.STRONTIUM_NUGGET).add(TekoraItems.STRONTIUM_NUGGET.get());
        this.tag(TekoraTags.Items.SILVER_NUGGET).add(TekoraItems.SILVER_NUGGET.get());
        this.tag(TekoraTags.Items.SODIUM_NUGGET).add(TekoraItems.SODIUM_NUGGET.get());
        this.tag(TekoraTags.Items.TANTALUM_NUGGET).add(TekoraItems.TANTALUM_NUGGET.get());
        this.tag(TekoraTags.Items.TERBIUM_NUGGET).add(TekoraItems.TERBIUM_NUGGET.get());
        this.tag(TekoraTags.Items.THALLIUM_NUGGET).add(TekoraItems.THALLIUM_NUGGET.get());
        this.tag(TekoraTags.Items.THORIUM_NUGGET).add(TekoraItems.THORIUM_NUGGET.get());
        this.tag(TekoraTags.Items.THULIUM_NUGGET).add(TekoraItems.THULIUM_NUGGET.get());
        this.tag(TekoraTags.Items.TIN_NUGGET).add(TekoraItems.TIN_NUGGET.get());
        this.tag(TekoraTags.Items.TITANIUM_NUGGET).add(TekoraItems.TITANIUM_NUGGET.get());
        this.tag(TekoraTags.Items.TUNGSTEN_NUGGET).add(TekoraItems.TUNGSTEN_NUGGET.get());
        this.tag(TekoraTags.Items.URANIUM_NUGGET).add(TekoraItems.URANIUM_NUGGET.get());
        this.tag(TekoraTags.Items.VANADIUM_NUGGET).add(TekoraItems.VANADIUM_NUGGET.get());
        this.tag(TekoraTags.Items.YTTERBIUM_NUGGET).add(TekoraItems.YTTERBIUM_NUGGET.get());
        this.tag(TekoraTags.Items.YTTRIUM_NUGGET).add(TekoraItems.YTTRIUM_NUGGET.get());
        this.tag(TekoraTags.Items.ZINC_NUGGET).add(TekoraItems.ZINC_NUGGET.get());
        this.tag(TekoraTags.Items.ZIRCONIUM_NUGGET).add(TekoraItems.ZIRCONIUM_NUGGET.get());

        this.tag(TekoraTags.Items.ALUMINUM_PLATE).add(TekoraItems.ALUMINUM_PLATE.get());
        this.tag(TekoraTags.Items.BISMUTH_PLATE).add(TekoraItems.BISMUTH_PLATE.get());
        this.tag(TekoraTags.Items.CADMIUM_PLATE).add(TekoraItems.CADMIUM_PLATE.get());
        this.tag(TekoraTags.Items.CHROMIUM_PLATE).add(TekoraItems.CHROMIUM_PLATE.get());
        this.tag(TekoraTags.Items.COBALT_PLATE).add(TekoraItems.COBALT_PLATE.get());
        this.tag(TekoraTags.Items.COPPER_PLATE).add(TekoraItems.COPPER_PLATE.get());
        this.tag(TekoraTags.Items.GOLD_PLATE).add(TekoraItems.GOLD_PLATE.get());
        this.tag(TekoraTags.Items.INDIUM_PLATE).add(TekoraItems.INDIUM_PLATE.get());
        this.tag(TekoraTags.Items.IRIDIUM_PLATE).add(TekoraItems.IRIDIUM_PLATE.get());
        this.tag(TekoraTags.Items.IRON_PLATE).add(TekoraItems.IRON_PLATE.get());
        this.tag(TekoraTags.Items.LEAD_PLATE).add(TekoraItems.LEAD_PLATE.get());
        this.tag(TekoraTags.Items.MAGNESIUM_PLATE).add(TekoraItems.MAGNESIUM_PLATE.get());
        this.tag(TekoraTags.Items.MANGANESE_PLATE).add(TekoraItems.MANGANESE_PLATE.get());
        this.tag(TekoraTags.Items.MOLYBDENUM_PLATE).add(TekoraItems.MOLYBDENUM_PLATE.get());
        this.tag(TekoraTags.Items.NICKEL_PLATE).add(TekoraItems.NICKEL_PLATE.get());
        this.tag(TekoraTags.Items.NIOBIUM_PLATE).add(TekoraItems.NIOBIUM_PLATE.get());
        this.tag(TekoraTags.Items.OSMIUM_PLATE).add(TekoraItems.OSMIUM_PLATE.get());
        this.tag(TekoraTags.Items.PALLADIUM_PLATE).add(TekoraItems.PALLADIUM_PLATE.get());
        this.tag(TekoraTags.Items.PLATINUM_PLATE).add(TekoraItems.PLATINUM_PLATE.get());
        this.tag(TekoraTags.Items.RHODIUM_PLATE).add(TekoraItems.RHODIUM_PLATE.get());
        this.tag(TekoraTags.Items.SCANDIUM_PLATE).add(TekoraItems.SCANDIUM_PLATE.get());;
        this.tag(TekoraTags.Items.SILVER_PLATE).add(TekoraItems.SILVER_PLATE.get());
        this.tag(TekoraTags.Items.THORIUM_PLATE).add(TekoraItems.THORIUM_PLATE.get());
        this.tag(TekoraTags.Items.THULIUM_PLATE).add(TekoraItems.THULIUM_PLATE.get());
        this.tag(TekoraTags.Items.TIN_PLATE).add(TekoraItems.TIN_PLATE.get());
        this.tag(TekoraTags.Items.TITANIUM_PLATE).add(TekoraItems.TITANIUM_PLATE.get());
        this.tag(TekoraTags.Items.TUNGSTEN_PLATE).add(TekoraItems.TUNGSTEN_PLATE.get());
        this.tag(TekoraTags.Items.YTTERBIUM_PLATE).add(TekoraItems.YTTERBIUM_PLATE.get());
        this.tag(TekoraTags.Items.ZINC_PLATE).add(TekoraItems.ZINC_PLATE.get());
        this.tag(TekoraTags.Items.ZIRCONIUM_PLATE).add(TekoraItems.ZIRCONIUM_PLATE.get());
        this.tag(TekoraTags.Items.BRASS_PLATE).add(TekoraItems.BRASS_PLATE.get());
        this.tag(TekoraTags.Items.BRONZE_PLATE).add(TekoraItems.BRONZE_PLATE.get());
        this.tag(TekoraTags.Items.CHROMOLY_STEEL_PLATE).add(TekoraItems.CHROMOLY_STEEL_PLATE.get());
        this.tag(TekoraTags.Items.COPPER_STEEL_PLATE).add(TekoraItems.COPPER_STEEL_PLATE.get());
        this.tag(TekoraTags.Items.FERROBORON_PLATE).add(TekoraItems.FERROBORON_PLATE.get());
        this.tag(TekoraTags.Items.GALVANIZED_STEEL_PLATE).add(TekoraItems.GALVANIZED_STEEL_PLATE.get());
        this.tag(TekoraTags.Items.HSLA_STEEL_PLATE).add(TekoraItems.HSLA_STEEL_PLATE.get());
        this.tag(TekoraTags.Items.INCONEL_PLATE).add(TekoraItems.INCONEL_PLATE.get());
        this.tag(TekoraTags.Items.INVAR_PLATE).add(TekoraItems.INVAR_PLATE.get());
        this.tag(TekoraTags.Items.MAGNETIC_NEODYMIUM_PLATE).add(TekoraItems.MAGNETIC_NEODYMIUM_PLATE.get());
        this.tag(TekoraTags.Items.MU_METAL_PLATE).add(TekoraItems.MU_METAL_PLATE.get());
        this.tag(TekoraTags.Items.REACTOR_STEEL_PLATE).add(TekoraItems.REACTOR_STEEL_PLATE.get());
        this.tag(TekoraTags.Items.STAINLESS_STEEL_PLATE).add(TekoraItems.STAINLESS_STEEL_PLATE.get());
        this.tag(TekoraTags.Items.STEEL_PLATE).add(TekoraItems.STEEL_PLATE.get());
        this.tag(TekoraTags.Items.TUNGSTEN_CARBIDE_PLATE).add(TekoraItems.TUNGSTEN_CARBIDE_PLATE.get());
        this.tag(TekoraTags.Items.TUNGSTEN_STEEL_PLATE).add(TekoraItems.TUNGSTEN_STEEL_PLATE.get());
        this.tag(TekoraTags.Items.VANASTEEL_PLATE).add(TekoraItems.VANASTEEL_PLATE.get());
        this.tag(TekoraTags.Items.ZIRCALOY_PLATE).add(TekoraItems.ZIRCALOY_PLATE.get());

        this.tag(TekoraTags.Items.ALUMINUM_DUST).add(TekoraItems.ALUMINUM_DUST.get());
        this.tag(TekoraTags.Items.BARIUM_DUST).add(TekoraItems.BARIUM_DUST.get());
        this.tag(TekoraTags.Items.BERYLLIUM_DUST).add(TekoraItems.BERYLLIUM_DUST.get());
        this.tag(TekoraTags.Items.BISMUTH_DUST).add(TekoraItems.BISMUTH_DUST.get());
        this.tag(TekoraTags.Items.CADMIUM_DUST).add(TekoraItems.CADMIUM_DUST.get());
        this.tag(TekoraTags.Items.CALCIUM_DUST).add(TekoraItems.CALCIUM_DUST.get());
        this.tag(TekoraTags.Items.CERIUM_DUST).add(TekoraItems.CERIUM_DUST.get());
        this.tag(TekoraTags.Items.CESIUM_DUST).add(TekoraItems.CESIUM_DUST.get());
        this.tag(TekoraTags.Items.CHROMIUM_DUST).add(TekoraItems.CHROMIUM_DUST.get());
        this.tag(TekoraTags.Items.COBALT_DUST).add(TekoraItems.COBALT_DUST.get());
        this.tag(TekoraTags.Items.COPPER_DUST).add(TekoraItems.COPPER_PLATE.get());
        this.tag(TekoraTags.Items.GOLD_DUST).add(TekoraItems.GOLD_DUST.get());
        this.tag(TekoraTags.Items.DYSPROSIUM_DUST).add(TekoraItems.DYSPROSIUM_DUST.get());
        this.tag(TekoraTags.Items.ERBIUM_DUST).add(TekoraItems.ERBIUM_DUST.get());
        this.tag(TekoraTags.Items.EUROPIUM_DUST).add(TekoraItems.EUROPIUM_DUST.get());
        this.tag(TekoraTags.Items.GADOLINIUM_DUST).add(TekoraItems.GADOLINIUM_DUST.get());
        this.tag(TekoraTags.Items.GALLIUM_DUST).add(TekoraItems.GALLIUM_DUST.get());
        this.tag(TekoraTags.Items.HAFNIUM_DUST).add(TekoraItems.HAFNIUM_DUST.get());
        this.tag(TekoraTags.Items.HOLMIUM_DUST).add(TekoraItems.HOLMIUM_DUST.get());
        this.tag(TekoraTags.Items.INDIUM_DUST).add(TekoraItems.INDIUM_DUST.get());
        this.tag(TekoraTags.Items.IRIDIUM_DUST).add(TekoraItems.IRIDIUM_DUST.get());
        this.tag(TekoraTags.Items.IRON_DUST).add(TekoraItems.IRON_DUST.get());
        this.tag(TekoraTags.Items.LANTHANUM_DUST).add(TekoraItems.LANTHANUM_DUST.get());
        this.tag(TekoraTags.Items.LEAD_DUST).add(TekoraItems.LEAD_DUST.get());
        this.tag(TekoraTags.Items.LITHIUM_DUST).add(TekoraItems.LITHIUM_DUST.get());
        this.tag(TekoraTags.Items.LUTETIUM_DUST).add(TekoraItems.LUTETIUM_DUST.get());
        this.tag(TekoraTags.Items.MAGNESIUM_DUST).add(TekoraItems.MAGNESIUM_DUST.get());
        this.tag(TekoraTags.Items.MANGANESE_DUST).add(TekoraItems.MANGANESE_DUST.get());
        this.tag(TekoraTags.Items.MOLYBDENUM_DUST).add(TekoraItems.MOLYBDENUM_DUST.get());
        this.tag(TekoraTags.Items.NEODYMIUM_DUST).add(TekoraItems.NEODYMIUM_DUST.get());
        this.tag(TekoraTags.Items.NICKEL_DUST).add(TekoraItems.NICKEL_DUST.get());
        this.tag(TekoraTags.Items.NIOBIUM_DUST).add(TekoraItems.NIOBIUM_DUST.get());
        this.tag(TekoraTags.Items.OSMIUM_DUST).add(TekoraItems.OSMIUM_DUST.get());
        this.tag(TekoraTags.Items.PALLADIUM_DUST).add(TekoraItems.PALLADIUM_DUST.get());
        this.tag(TekoraTags.Items.PLATINUM_DUST).add(TekoraItems.PLATINUM_DUST.get());
        this.tag(TekoraTags.Items.POTASSIUM_DUST).add(TekoraItems.POTASSIUM_DUST.get());
        this.tag(TekoraTags.Items.PRASEODYMIUM_DUST).add(TekoraItems.PRASEODYMIUM_DUST.get());
        this.tag(TekoraTags.Items.RHENIUM_DUST).add(TekoraItems.RHENIUM_DUST.get());
        this.tag(TekoraTags.Items.RHODIUM_DUST).add(TekoraItems.RHODIUM_DUST.get());
        this.tag(TekoraTags.Items.RUBIDIUM_DUST).add(TekoraItems.RUBIDIUM_DUST.get());
        this.tag(TekoraTags.Items.RUTHENIUM_DUST).add(TekoraItems.RUTHENIUM_DUST.get());
        this.tag(TekoraTags.Items.SCANDIUM_DUST).add(TekoraItems.SCANDIUM_DUST.get());
        this.tag(TekoraTags.Items.SAMARIUM_DUST).add(TekoraItems.SAMARIUM_DUST.get());
        this.tag(TekoraTags.Items.SODIUM_DUST).add(TekoraItems.SODIUM_DUST.get());
        this.tag(TekoraTags.Items.STRONTIUM_DUST).add(TekoraItems.STRONTIUM_DUST.get());
        this.tag(TekoraTags.Items.SILVER_DUST).add(TekoraItems.SILVER_DUST.get());
        this.tag(TekoraTags.Items.TANTALUM_DUST).add(TekoraItems.TANTALUM_DUST.get());
        this.tag(TekoraTags.Items.TERBIUM_DUST).add(TekoraItems.TERBIUM_DUST.get());
        this.tag(TekoraTags.Items.THALLIUM_DUST).add(TekoraItems.THALLIUM_DUST.get());
        this.tag(TekoraTags.Items.THORIUM_DUST).add(TekoraItems.THORIUM_DUST.get());
        this.tag(TekoraTags.Items.THULIUM_DUST).add(TekoraItems.THULIUM_DUST.get());
        this.tag(TekoraTags.Items.TIN_DUST).add(TekoraItems.TIN_DUST.get());
        this.tag(TekoraTags.Items.TITANIUM_DUST).add(TekoraItems.TITANIUM_DUST.get());
        this.tag(TekoraTags.Items.TUNGSTEN_DUST).add(TekoraItems.TUNGSTEN_DUST.get());
        this.tag(TekoraTags.Items.URANIUM_DUST).add(TekoraItems.URANIUM_DUST.get());
        this.tag(TekoraTags.Items.VANADIUM_DUST).add(TekoraItems.VANADIUM_DUST.get());
        this.tag(TekoraTags.Items.YTTERBIUM_DUST).add(TekoraItems.YTTERBIUM_DUST.get());
        this.tag(TekoraTags.Items.YTTRIUM_DUST).add(TekoraItems.YTTRIUM_DUST.get());
        this.tag(TekoraTags.Items.ZINC_DUST).add(TekoraItems.ZINC_DUST.get());
        this.tag(TekoraTags.Items.ZIRCONIUM_DUST).add(TekoraItems.ZIRCONIUM_DUST.get());
        this.tag(TekoraTags.Items.BRASS_DUST).add(TekoraItems.BRASS_DUST.get());
        this.tag(TekoraTags.Items.BRONZE_DUST).add(TekoraItems.BRONZE_DUST.get());
        this.tag(TekoraTags.Items.CARBON_STEEL_DUST).add(TekoraItems.CARBON_STEEL_DUST.get());
        this.tag(TekoraTags.Items.CHROMOLY_STEEL_DUST).add(TekoraItems.CHROMOLY_STEEL_DUST.get());
        this.tag(TekoraTags.Items.FERROBORON_DUST).add(TekoraItems.FERROBORON_DUST.get());
        this.tag(TekoraTags.Items.HSLA_STEEL_DUST).add(TekoraItems.HSLA_STEEL_DUST.get());
        this.tag(TekoraTags.Items.INCONEL_DUST).add(TekoraItems.INCONEL_DUST.get());
        this.tag(TekoraTags.Items.INVAR_DUST).add(TekoraItems.INVAR_DUST.get());
        this.tag(TekoraTags.Items.MAGNETIC_NEODYMIUM_DUST).add(TekoraItems.MAGNETIC_NEODYMIUM_DUST.get());
        this.tag(TekoraTags.Items.MU_METAL_DUST).add(TekoraItems.MU_METAL_DUST.get());
        this.tag(TekoraTags.Items.REACTOR_STEEL_DUST).add(TekoraItems.REACTOR_STEEL_DUST.get());
        this.tag(TekoraTags.Items.STAINLESS_STEEL_DUST).add(TekoraItems.STAINLESS_STEEL_DUST.get());
        this.tag(TekoraTags.Items.STEEL_DUST).add(TekoraItems.STEEL_DUST.get());
        this.tag(TekoraTags.Items.TUNGSTEN_CARBIDE_DUST).add(TekoraItems.TUNGSTEN_CARBIDE_DUST.get());
        this.tag(TekoraTags.Items.TUNGSTEN_STEEL_DUST).add(TekoraItems.TUNGSTEN_STEEL_DUST.get());
        this.tag(TekoraTags.Items.VANASTEEL_DUST).add(TekoraItems.VANASTEEL_DUST.get());
        this.tag(TekoraTags.Items.ZIRCALOY_DUST).add(TekoraItems.ZIRCALOY_DUST.get());

        this.tag(TekoraTags.Items.APATITE_GEM).add(TekoraItems.APATITE.get());
        this.tag(TekoraTags.Items.AQUAMARINE_GEM).add(TekoraItems.AQUAMARINE.get());
        this.tag(TekoraTags.Items.BAUXITE_GEM).add(TekoraItems.BAUXITE.get());
        this.tag(TekoraTags.Items.CASSITERITE_GEM).add(TekoraItems.CASSITERITE.get());
        this.tag(TekoraTags.Items.CHROMITE_GEM).add(TekoraItems.CHROMITE.get());
        this.tag(TekoraTags.Items.CINNABAR_GEM).add(TekoraItems.CINNABAR.get());
        this.tag(TekoraTags.Items.GALENA_GEM).add(TekoraItems.GALENA.get());
        this.tag(TekoraTags.Items.GARNET_GEM).add(TekoraItems.GARNET.get());
        this.tag(TekoraTags.Items.PENTLANDITE_GEM).add(TekoraItems.PENTLANDITE.get());
        this.tag(TekoraTags.Items.RUBY_GEM).add(TekoraItems.RUBY.get());
        this.tag(TekoraTags.Items.SAPPHIRE_GEM).add(TekoraItems.SAPPHIRE.get());
        this.tag(TekoraTags.Items.RAW_SILVER_GEM).add(TekoraItems.RAW_SILVER.get());
        this.tag(TekoraTags.Items.URANINITE_GEM).add(TekoraItems.URANINITE.get());
        this.tag(TekoraTags.Items.ZIRCON_GEM).add(TekoraItems.ZIRCON.get());

        this.tag(TekoraTags.Items.ALUMINUM).addTags(TekoraTags.Items.ALUMINUM_DUST,
                TekoraTags.Items.ALUMINUM_INGOT,
                TekoraTags.Items.ALUMINUM_PLATE);


        this.tag(TekoraTags.Items.BARIUM).addTags(TekoraTags.Items.BARIUM_DUST,
                TekoraTags.Items.BARIUM_INGOT);

        this.tag(TekoraTags.Items.BERYLLIUM).addTags(TekoraTags.Items.BERYLLIUM_DUST,
                TekoraTags.Items.BERYLLIUM_INGOT);

        this.tag(TekoraTags.Items.BISMUTH).addTags(TekoraTags.Items.BISMUTH_DUST,
                TekoraTags.Items.BISMUTH_INGOT,
                TekoraTags.Items.BISMUTH_PLATE);

        this.tag(TekoraTags.Items.CADMIUM).addTags(TekoraTags.Items.CADMIUM_DUST,
                TekoraTags.Items.CADMIUM_INGOT,
                TekoraTags.Items.CADMIUM_PLATE);

        this.tag(TekoraTags.Items.CALCIUM).addTags(TekoraTags.Items.CALCIUM_DUST,
                TekoraTags.Items.CALCIUM_INGOT);

        this.tag(TekoraTags.Items.CERIUM).addTags(TekoraTags.Items.CERIUM_DUST,
                TekoraTags.Items.CERIUM_INGOT);

        this.tag(TekoraTags.Items.CESIUM).addTags(TekoraTags.Items.CESIUM_DUST,
                TekoraTags.Items.CESIUM_INGOT);

        this.tag(TekoraTags.Items.CHROMIUM).addTags(TekoraTags.Items.CHROMIUM_DUST,
                TekoraTags.Items.CHROMIUM_INGOT,
                TekoraTags.Items.CHROMIUM_PLATE);

        this.tag(TekoraTags.Items.COBALT).addTags(TekoraTags.Items.COBALT_DUST,
                TekoraTags.Items.COBALT_INGOT,
                TekoraTags.Items.COBALT_PLATE);

        this.tag(TekoraTags.Items.COPPER).addTags(TekoraTags.Items.COPPER_PLATE,
                TekoraTags.Items.COPPER_PLATE).add(Items.COPPER_INGOT);

        this.tag(TekoraTags.Items.GOLD).addTags(TekoraTags.Items.GOLD_DUST,
                TekoraTags.Items.GOLD_PLATE).add(Items.GOLD_INGOT);

        this.tag(TekoraTags.Items.DYSPROSIUM).addTags(TekoraTags.Items.DYSPROSIUM_DUST,
                TekoraTags.Items.DYSPROSIUM_INGOT);

        this.tag(TekoraTags.Items.ERBIUM).addTags(TekoraTags.Items.ERBIUM_DUST,
                TekoraTags.Items.ERBIUM_INGOT);

        this.tag(TekoraTags.Items.EUROPIUM).addTags(TekoraTags.Items.EUROPIUM_DUST,
                TekoraTags.Items.EUROPIUM_INGOT);

        this.tag(TekoraTags.Items.GADOLINIUM).addTags(TekoraTags.Items.GADOLINIUM_DUST,
                TekoraTags.Items.GADOLINIUM_INGOT);

        this.tag(TekoraTags.Items.GALLIUM).addTags(TekoraTags.Items.GALLIUM_DUST,
                TekoraTags.Items.GALLIUM_INGOT);

        this.tag(TekoraTags.Items.HAFNIUM).addTags(TekoraTags.Items.HAFNIUM_DUST,
                TekoraTags.Items.HAFNIUM_INGOT);

        this.tag(TekoraTags.Items.HOLMIUM).addTags(TekoraTags.Items.HOLMIUM_DUST,
                TekoraTags.Items.HOLMIUM_INGOT);

        this.tag(TekoraTags.Items.INDIUM).addTags(TekoraTags.Items.INDIUM_DUST,
                TekoraTags.Items.INDIUM_INGOT,
                TekoraTags.Items.INDIUM_PLATE);

        this.tag(TekoraTags.Items.IRIDIUM).addTags(TekoraTags.Items.IRIDIUM_DUST,
                TekoraTags.Items.IRIDIUM_INGOT,
                TekoraTags.Items.IRIDIUM_PLATE);

        this.tag(TekoraTags.Items.IRON).addTags(TekoraTags.Items.IRON_DUST,
                TekoraTags.Items.IRON_PLATE).add(Items.IRON_INGOT);

        this.tag(TekoraTags.Items.LANTHANUM).addTags(TekoraTags.Items.LANTHANUM_DUST,
                TekoraTags.Items.LANTHANUM_INGOT);

        this.tag(TekoraTags.Items.LEAD).addTags(TekoraTags.Items.LEAD_DUST,
                TekoraTags.Items.LEAD_INGOT,
                TekoraTags.Items.LEAD_PLATE);

        this.tag(TekoraTags.Items.LITHIUM).addTags(TekoraTags.Items.LITHIUM_DUST,
                TekoraTags.Items.LITHIUM_INGOT);

        this.tag(TekoraTags.Items.LUTETIUM).addTags(TekoraTags.Items.LUTETIUM_DUST,
                TekoraTags.Items.LUTETIUM_INGOT);

        this.tag(TekoraTags.Items.MAGNESIUM).addTags(TekoraTags.Items.MAGNESIUM_DUST,
                TekoraTags.Items.MAGNESIUM_INGOT,
                TekoraTags.Items.MAGNESIUM_PLATE);

        this.tag(TekoraTags.Items.MANGANESE).addTags(TekoraTags.Items.MANGANESE_DUST,
                TekoraTags.Items.MANGANESE_INGOT,
                TekoraTags.Items.MANGANESE_PLATE);

        this.tag(TekoraTags.Items.MOLYBDENUM).addTags(TekoraTags.Items.MOLYBDENUM_DUST,
                TekoraTags.Items.MOLYBDENUM_INGOT,
                TekoraTags.Items.MOLYBDENUM_PLATE);

        this.tag(TekoraTags.Items.NEODYMIUM).addTags(TekoraTags.Items.NEODYMIUM_DUST,
                TekoraTags.Items.NEODYMIUM_INGOT);

        this.tag(TekoraTags.Items.NICKEL).addTags(TekoraTags.Items.NICKEL_DUST,
                TekoraTags.Items.NICKEL_INGOT,
                TekoraTags.Items.NICKEL_PLATE);

        this.tag(TekoraTags.Items.NIOBIUM).addTags(TekoraTags.Items.NIOBIUM_DUST,
                TekoraTags.Items.NIOBIUM_INGOT,
                TekoraTags.Items.NIOBIUM_PLATE);

        this.tag(TekoraTags.Items.OSMIUM).addTags(TekoraTags.Items.OSMIUM_DUST,
                TekoraTags.Items.OSMIUM_INGOT,
                TekoraTags.Items.OSMIUM_PLATE);

        this.tag(TekoraTags.Items.PALLADIUM).addTags(TekoraTags.Items.PALLADIUM_DUST,
                TekoraTags.Items.PALLADIUM_INGOT,
                TekoraTags.Items.PALLADIUM_PLATE);

        this.tag(TekoraTags.Items.PLATINUM).addTags(TekoraTags.Items.PLATINUM_DUST,
                TekoraTags.Items.PLATINUM_INGOT,
                TekoraTags.Items.PLATINUM_PLATE);

        this.tag(TekoraTags.Items.POTASSIUM).addTags(TekoraTags.Items.POTASSIUM_DUST,
                TekoraTags.Items.POTASSIUM_INGOT);

        this.tag(TekoraTags.Items.PRASEODYMIUM).addTags(TekoraTags.Items.PRASEODYMIUM_DUST,
                TekoraTags.Items.PRASEODYMIUM_INGOT);

        this.tag(TekoraTags.Items.RHENIUM).addTags(TekoraTags.Items.RHENIUM_DUST,
                TekoraTags.Items.RHENIUM_INGOT);

        this.tag(TekoraTags.Items.RHODIUM).addTags(TekoraTags.Items.RHODIUM_DUST,
                TekoraTags.Items.RHODIUM_INGOT,
                TekoraTags.Items.RHODIUM_PLATE);

        this.tag(TekoraTags.Items.RUBIDIUM).addTags(TekoraTags.Items.RUBIDIUM_DUST,
                TekoraTags.Items.RUBIDIUM_INGOT);

        this.tag(TekoraTags.Items.RUTHENIUM).addTags(TekoraTags.Items.RUTHENIUM_DUST,
                TekoraTags.Items.RUTHENIUM_INGOT);

        this.tag(TekoraTags.Items.SCANDIUM).addTags(TekoraTags.Items.SCANDIUM_DUST,
                TekoraTags.Items.SCANDIUM_INGOT,
                TekoraTags.Items.SCANDIUM_PLATE);

        this.tag(TekoraTags.Items.SAMARIUM).addTags(TekoraTags.Items.SAMARIUM_DUST,
                TekoraTags.Items.SAMARIUM_INGOT);

        this.tag(TekoraTags.Items.SODIUM).addTags(TekoraTags.Items.SODIUM_DUST,
                TekoraTags.Items.SODIUM_INGOT);

        this.tag(TekoraTags.Items.STRONTIUM).addTags(TekoraTags.Items.STRONTIUM_DUST,
                TekoraTags.Items.STRONTIUM_INGOT);

        this.tag(TekoraTags.Items.SILVER).addTags(TekoraTags.Items.SILVER_DUST,
                TekoraTags.Items.SILVER_INGOT,
                TekoraTags.Items.SILVER_PLATE);

        this.tag(TekoraTags.Items.TANTALUM).addTags(TekoraTags.Items.TANTALUM_DUST,
                TekoraTags.Items.TANTALUM_INGOT);

        this.tag(TekoraTags.Items.TERBIUM).addTags(TekoraTags.Items.TERBIUM_DUST,
                TekoraTags.Items.TERBIUM_INGOT);

        this.tag(TekoraTags.Items.THALLIUM).addTags(TekoraTags.Items.THALLIUM_DUST,
                TekoraTags.Items.THALLIUM_INGOT);

        this.tag(TekoraTags.Items.THORIUM).addTags(TekoraTags.Items.THORIUM_DUST,
                TekoraTags.Items.THORIUM_INGOT,
                TekoraTags.Items.THORIUM_PLATE);

        this.tag(TekoraTags.Items.THULIUM).addTags(TekoraTags.Items.THULIUM_DUST,
                TekoraTags.Items.THULIUM_INGOT,
                TekoraTags.Items.THULIUM_PLATE);

        this.tag(TekoraTags.Items.TIN).addTags(TekoraTags.Items.TIN_DUST,
                TekoraTags.Items.TIN_INGOT,
                TekoraTags.Items.TIN_PLATE);

        this.tag(TekoraTags.Items.TITANIUM).addTags(TekoraTags.Items.TITANIUM_DUST,
                TekoraTags.Items.TITANIUM_INGOT,
                TekoraTags.Items.TITANIUM_PLATE);

        this.tag(TekoraTags.Items.TUNGSTEN).addTags(TekoraTags.Items.TUNGSTEN_DUST,
                TekoraTags.Items.TUNGSTEN_INGOT,
                TekoraTags.Items.TUNGSTEN_PLATE);

        this.tag(TekoraTags.Items.URANIUM).addTags(TekoraTags.Items.URANIUM_DUST,
                TekoraTags.Items.URANIUM_INGOT);

        this.tag(TekoraTags.Items.VANADIUM).addTags(TekoraTags.Items.VANADIUM_DUST,
                TekoraTags.Items.VANADIUM_INGOT);

        this.tag(TekoraTags.Items.YTTERBIUM).addTags(TekoraTags.Items.YTTERBIUM_DUST,
                TekoraTags.Items.YTTERBIUM_INGOT);

        this.tag(TekoraTags.Items.YTTRIUM).addTags(TekoraTags.Items.YTTRIUM_DUST,
                TekoraTags.Items.YTTRIUM_INGOT);

        this.tag(TekoraTags.Items.ZINC).addTags(TekoraTags.Items.ZINC_DUST,
                TekoraTags.Items.ZINC_INGOT,
                TekoraTags.Items.ZINC_PLATE);

        this.tag(TekoraTags.Items.ZIRCONIUM).addTags(TekoraTags.Items.ZIRCONIUM_DUST,
                TekoraTags.Items.ZIRCONIUM_INGOT,
                TekoraTags.Items.ZIRCONIUM_PLATE);

        this.tag(TekoraTags.Items.BRASS).addTags(TekoraTags.Items.BRASS_DUST,
                TekoraTags.Items.BRASS_INGOT,
                TekoraTags.Items.BRASS_PLATE);

        this.tag(TekoraTags.Items.BRONZE).addTags(TekoraTags.Items.BRONZE_DUST,
                TekoraTags.Items.BRONZE_INGOT,
                TekoraTags.Items.BRONZE_PLATE);

        this.tag(TekoraTags.Items.CARBON_STEEL).addTags(TekoraTags.Items.CARBON_STEEL_DUST,
                TekoraTags.Items.CARBON_STEEL_INGOT);

        this.tag(TekoraTags.Items.CHROMOLY_STEEL).addTags(TekoraTags.Items.CHROMOLY_STEEL_DUST,
                TekoraTags.Items.CHROMOLY_STEEL_INGOT,
                TekoraTags.Items.CHROMOLY_STEEL_PLATE);

        this.tag(TekoraTags.Items.FERROBORON).addTags(TekoraTags.Items.FERROBORON_DUST,
                TekoraTags.Items.FERROBORON_INGOT,
                TekoraTags.Items.FERROBORON_PLATE);

        this.tag(TekoraTags.Items.GALVANIZED_STEEL).addTags(TekoraTags.Items.GALVANIZED_STEEL_INGOT,
                TekoraTags.Items.GALVANIZED_STEEL_PLATE);

        this.tag(TekoraTags.Items.HSLA_STEEL).addTags(TekoraTags.Items.HSLA_STEEL_DUST,
                TekoraTags.Items.HSLA_STEEL_INGOT,
                TekoraTags.Items.HSLA_STEEL_PLATE);

        this.tag(TekoraTags.Items.INCONEL).addTags(TekoraTags.Items.INCONEL_DUST,
                TekoraTags.Items.INCONEL_INGOT,
                TekoraTags.Items.INCONEL_PLATE);

        this.tag(TekoraTags.Items.INVAR).addTags(TekoraTags.Items.INVAR_DUST,
                TekoraTags.Items.INVAR_INGOT,
                TekoraTags.Items.INVAR_PLATE);

        this.tag(TekoraTags.Items.MAGNETIC_NEODYMIUM).addTags(TekoraTags.Items.MAGNETIC_NEODYMIUM_DUST,
                TekoraTags.Items.MAGNETIC_NEODYMIUM_INGOT,
                TekoraTags.Items.MAGNETIC_NEODYMIUM_PLATE);

        this.tag(TekoraTags.Items.MU_METAL).addTags(TekoraTags.Items.MU_METAL_DUST,
                TekoraTags.Items.MU_METAL_INGOT,
                TekoraTags.Items.MU_METAL_PLATE);

        this.tag(TekoraTags.Items.REACTOR_STEEL).addTags(TekoraTags.Items.REACTOR_STEEL_DUST,
                TekoraTags.Items.REACTOR_STEEL_INGOT,
                TekoraTags.Items.REACTOR_STEEL_PLATE);

        this.tag(TekoraTags.Items.STAINLESS_STEEL).addTags(TekoraTags.Items.STAINLESS_STEEL_DUST,
                TekoraTags.Items.STAINLESS_STEEL_INGOT,
                TekoraTags.Items.STAINLESS_STEEL_PLATE);

        this.tag(TekoraTags.Items.STEEL).addTags(TekoraTags.Items.STEEL_DUST,
                TekoraTags.Items.STEEL_INGOT,
                TekoraTags.Items.STEEL_PLATE);

        this.tag(TekoraTags.Items.TUNGSTEN_CARBIDE).addTags(TekoraTags.Items.TUNGSTEN_CARBIDE_DUST,
                TekoraTags.Items.TUNGSTEN_CARBIDE_INGOT,
                TekoraTags.Items.TUNGSTEN_CARBIDE_PLATE);

        this.tag(TekoraTags.Items.TUNGSTEN_STEEL).addTags(TekoraTags.Items.TUNGSTEN_STEEL_DUST,
                TekoraTags.Items.TUNGSTEN_STEEL_INGOT,
                TekoraTags.Items.TUNGSTEN_STEEL_PLATE);

        this.tag(TekoraTags.Items.VANASTEEL).addTags(TekoraTags.Items.VANASTEEL_DUST,
                TekoraTags.Items.VANASTEEL_INGOT,
                TekoraTags.Items.VANASTEEL_PLATE);

        this.tag(TekoraTags.Items.ZIRCALOY).addTags(TekoraTags.Items.ZIRCALOY_DUST,
                TekoraTags.Items.ZIRCALOY_INGOT,
                TekoraTags.Items.ZIRCALOY_PLATE);
    }
}