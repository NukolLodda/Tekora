package net.nukollodda.tekora.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.nukollodda.tekora.Tekora;
import net.nukollodda.tekora.item.TekoraItems;

public class TekoraItemModelProvider extends ItemModelProvider {
    public TekoraItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Tekora.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(TekoraItems.APATITE);
        simpleItem(TekoraItems.AQUAMARINE);
        simpleItem(TekoraItems.BAUXITE);
        simpleItem(TekoraItems.CASSITERITE);
        simpleItem(TekoraItems.CHROMITE);
        simpleItem(TekoraItems.CINNABAR);
        simpleItem(TekoraItems.GALENA);
        simpleItem(TekoraItems.GARNET);
        simpleItem(TekoraItems.PENTLANDITE);
        simpleItem(TekoraItems.RAW_SILVER);
        simpleItem(TekoraItems.RUBY);
        simpleItem(TekoraItems.SAPPHIRE);
        simpleItem(TekoraItems.URANINITE);
        simpleItem(TekoraItems.ZIRCON);

        simpleItem(TekoraItems.BASTNAESITE_SHARD);
        simpleItem(TekoraItems.MAGNETITE_SHARD);
        simpleItem(TekoraItems.MONAZITE_SHARD);
        simpleItem(TekoraItems.ORPIMENT_SHARD);
        simpleItem(TekoraItems.RUTILE_SHARD);
        simpleItem(TekoraItems.SCHEELITE_SHARD);
        simpleItem(TekoraItems.SPERRYLITE_SHARD);
        simpleItem(TekoraItems.STIBNITE_SHARD);

        simpleItem(TekoraItems.COLTAN_PIECE);
        simpleItem(TekoraItems.PYRITE_PIECE);
        simpleItem(TekoraItems.PYROLUSITE_PIECE);
        simpleItem(TekoraItems.SPHALERITE_PIECE);
        simpleItem(TekoraItems.THORITE_PIECE);
        simpleItem(TekoraItems.WOLFRAMITE_PIECE);

        simpleItem(TekoraItems.BASTNAESITE);
        simpleItem(TekoraItems.COLTAN);
        simpleItem(TekoraItems.MAGNETITE);
        simpleItem(TekoraItems.MONAZITE);
        simpleItem(TekoraItems.ORPIMENT);
        simpleItem(TekoraItems.PYRITE);
        simpleItem(TekoraItems.PYROLUSITE);
        simpleItem(TekoraItems.RUTILE);
        simpleItem(TekoraItems.SCHEELITE);
        simpleItem(TekoraItems.SPERRYLITE);
        simpleItem(TekoraItems.SPHALERITE);
        simpleItem(TekoraItems.STIBNITE);
        simpleItem(TekoraItems.THORITE);
        simpleItem(TekoraItems.WOLFRAMITE);

        simpleItem(TekoraItems.DOLOMITE);
        simpleItem(TekoraItems.FLUORITE);

        simpleItem(TekoraItems.ALUMINUM_INGOT);
        simpleItem(TekoraItems.BARIUM_INGOT);
        simpleItem(TekoraItems.BERYLLIUM_INGOT);
        simpleItem(TekoraItems.BISMUTH_INGOT);
        simpleItem(TekoraItems.CADMIUM_INGOT);
        simpleItem(TekoraItems.CALCIUM_INGOT);
        simpleItem(TekoraItems.CERIUM_INGOT);
        simpleItem(TekoraItems.CESIUM_INGOT);
        simpleItem(TekoraItems.CHROMIUM_INGOT);
        simpleItem(TekoraItems.COBALT_INGOT);
        simpleItem(TekoraItems.DYSPROSIUM_INGOT);
        simpleItem(TekoraItems.ERBIUM_INGOT);
        simpleItem(TekoraItems.EUROPIUM_INGOT);
        simpleItem(TekoraItems.GADOLINIUM_INGOT);
        simpleItem(TekoraItems.GALLIUM_INGOT);
        simpleItem(TekoraItems.HAFNIUM_INGOT);
        simpleItem(TekoraItems.HOLMIUM_INGOT);
        simpleItem(TekoraItems.INDIUM_INGOT);
        simpleItem(TekoraItems.IRIDIUM_INGOT);
        simpleItem(TekoraItems.LANTHANUM_INGOT);
        simpleItem(TekoraItems.LEAD_INGOT);
        simpleItem(TekoraItems.LITHIUM_INGOT);
        simpleItem(TekoraItems.LUTETIUM_INGOT);
        simpleItem(TekoraItems.MAGNESIUM_INGOT);
        simpleItem(TekoraItems.MANGANESE_INGOT);
        simpleItem(TekoraItems.MOLYBDENUM_INGOT);
        simpleItem(TekoraItems.NEODYMIUM_INGOT);
        simpleItem(TekoraItems.NICKEL_INGOT);
        simpleItem(TekoraItems.NIOBIUM_INGOT);
        simpleItem(TekoraItems.OSMIUM_INGOT);
        simpleItem(TekoraItems.PALLADIUM_INGOT);
        simpleItem(TekoraItems.PLATINUM_INGOT);
        simpleItem(TekoraItems.PRASEODYMIUM_INGOT);
        simpleItem(TekoraItems.POTASSIUM_INGOT);
        simpleItem(TekoraItems.RHENIUM_INGOT);
        simpleItem(TekoraItems.RHODIUM_INGOT);
        simpleItem(TekoraItems.RUBIDIUM_INGOT);
        simpleItem(TekoraItems.RUTHENIUM_INGOT);
        simpleItem(TekoraItems.SAMARIUM_INGOT);
        simpleItem(TekoraItems.SCANDIUM_INGOT);
        simpleItem(TekoraItems.SILVER_INGOT);
        simpleItem(TekoraItems.SODIUM_INGOT);
        simpleItem(TekoraItems.STRONTIUM_INGOT);
        simpleItem(TekoraItems.TANTALUM_INGOT);
        simpleItem(TekoraItems.TERBIUM_INGOT);
        simpleItem(TekoraItems.THALLIUM_INGOT);
        simpleItem(TekoraItems.THORIUM_INGOT);
        simpleItem(TekoraItems.THULIUM_INGOT);
        simpleItem(TekoraItems.TIN_INGOT);
        simpleItem(TekoraItems.TITANIUM_INGOT);
        simpleItem(TekoraItems.TUNGSTEN_INGOT);
        simpleItem(TekoraItems.URANIUM_INGOT);
        simpleItem(TekoraItems.VANADIUM_INGOT);
        simpleItem(TekoraItems.YTTERBIUM_INGOT);
        simpleItem(TekoraItems.YTTRIUM_INGOT);
        simpleItem(TekoraItems.ZINC_INGOT);
        simpleItem(TekoraItems.ZIRCONIUM_INGOT);

        simpleItem(TekoraItems.BRASS_INGOT);
        simpleItem(TekoraItems.BRONZE_INGOT);
        simpleItem(TekoraItems.CARBON_STEEL_INGOT);
        simpleItem(TekoraItems.CHROMOLY_STEEL_INGOT);
        simpleItem(TekoraItems.FERROBORON_INGOT);
        simpleItem(TekoraItems.GALVANIZED_STEEL_INGOT);
        simpleItem(TekoraItems.HSLA_STEEL_INGOT);
        simpleItem(TekoraItems.INCONEL_INGOT);
        simpleItem(TekoraItems.INVAR_INGOT);
        simpleItem(TekoraItems.MAGNETIC_NEODYMIUM_INGOT);
        simpleItem(TekoraItems.MU_METAL_INGOT);
        simpleItem(TekoraItems.REACTOR_STEEL_INGOT);
        simpleItem(TekoraItems.STAINLESS_STEEL_INGOT);
        simpleItem(TekoraItems.STEEL_INGOT);
        simpleItem(TekoraItems.TUNGSTEN_CARBIDE_INGOT);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_INGOT);
        simpleItem(TekoraItems.VANASTEEL_INGOT);
        simpleItem(TekoraItems.ZIRCALOY_INGOT);

        simpleItem(TekoraItems.COPPER_STEEL);

        simpleItem(TekoraItems.GRAPHITE_BAR);
        simpleItem(TekoraItems.IODINE_BAR);

        simpleItem(TekoraItems.ANTIMONY_PIECE);
        simpleItem(TekoraItems.ARSENIC_PIECE);
        simpleItem(TekoraItems.BORON_PIECE);
        simpleItem(TekoraItems.GERMANIUM_PIECE);
        simpleItem(TekoraItems.SILICON_PIECE);
        simpleItem(TekoraItems.TELLURIUM_PIECE);

        simpleItem(TekoraItems.MAGNESIUM_DIBORIDE);
        simpleItem(TekoraItems.NIOBIUM_TIN);
        simpleItem(TekoraItems.SILICON_CARBIDE);

        simpleItem(TekoraItems.ALUMINUM_NUGGET);
        simpleItem(TekoraItems.BARIUM_NUGGET);
        simpleItem(TekoraItems.BERYLLIUM_NUGGET);
        simpleItem(TekoraItems.BISMUTH_NUGGET);
        simpleItem(TekoraItems.CADMIUM_NUGGET);
        simpleItem(TekoraItems.CALCIUM_NUGGET);
        simpleItem(TekoraItems.CERIUM_NUGGET);
        simpleItem(TekoraItems.CESIUM_NUGGET);
        simpleItem(TekoraItems.CHROMIUM_NUGGET);
        simpleItem(TekoraItems.COBALT_NUGGET);
        simpleItem(TekoraItems.COPPER_NUGGET);
        simpleItem(TekoraItems.DYSPROSIUM_NUGGET);
        simpleItem(TekoraItems.ERBIUM_NUGGET);
        simpleItem(TekoraItems.EUROPIUM_NUGGET);
        simpleItem(TekoraItems.GADOLINIUM_NUGGET);
        simpleItem(TekoraItems.GALLIUM_NUGGET);
        simpleItem(TekoraItems.HAFNIUM_NUGGET);
        simpleItem(TekoraItems.HOLMIUM_NUGGET);
        simpleItem(TekoraItems.INDIUM_NUGGET);
        simpleItem(TekoraItems.IRIDIUM_NUGGET);
        simpleItem(TekoraItems.LANTHANUM_NUGGET);
        simpleItem(TekoraItems.LEAD_NUGGET);
        simpleItem(TekoraItems.LITHIUM_NUGGET);
        simpleItem(TekoraItems.LUTETIUM_NUGGET);
        simpleItem(TekoraItems.MAGNESIUM_NUGGET);
        simpleItem(TekoraItems.MANGANESE_NUGGET);
        simpleItem(TekoraItems.MOLYBDENUM_NUGGET);
        simpleItem(TekoraItems.NEODYMIUM_NUGGET);
        simpleItem(TekoraItems.NICKEL_NUGGET);
        simpleItem(TekoraItems.NIOBIUM_NUGGET);
        simpleItem(TekoraItems.OSMIUM_NUGGET);
        simpleItem(TekoraItems.PALLADIUM_NUGGET);
        simpleItem(TekoraItems.PLATINUM_NUGGET);
        simpleItem(TekoraItems.PRASEODYMIUM_NUGGET);
        simpleItem(TekoraItems.POTASSIUM_NUGGET);
        simpleItem(TekoraItems.RHENIUM_NUGGET);
        simpleItem(TekoraItems.RHODIUM_NUGGET);
        simpleItem(TekoraItems.RUBIDIUM_NUGGET);
        simpleItem(TekoraItems.RUTHENIUM_NUGGET);
        simpleItem(TekoraItems.SAMARIUM_NUGGET);
        simpleItem(TekoraItems.SCANDIUM_NUGGET);
        simpleItem(TekoraItems.SILVER_NUGGET);
        simpleItem(TekoraItems.SODIUM_NUGGET);
        simpleItem(TekoraItems.STRONTIUM_NUGGET);
        simpleItem(TekoraItems.TANTALUM_NUGGET);
        simpleItem(TekoraItems.TERBIUM_NUGGET);
        simpleItem(TekoraItems.THALLIUM_NUGGET);
        simpleItem(TekoraItems.THORIUM_NUGGET);
        simpleItem(TekoraItems.THULIUM_NUGGET);
        simpleItem(TekoraItems.TIN_NUGGET);
        simpleItem(TekoraItems.TITANIUM_NUGGET);
        simpleItem(TekoraItems.TUNGSTEN_NUGGET);
        simpleItem(TekoraItems.URANIUM_NUGGET);
        simpleItem(TekoraItems.VANADIUM_NUGGET);
        simpleItem(TekoraItems.YTTERBIUM_NUGGET);
        simpleItem(TekoraItems.YTTRIUM_NUGGET);
        simpleItem(TekoraItems.ZINC_NUGGET);
        simpleItem(TekoraItems.ZIRCONIUM_NUGGET);

        simpleItem(TekoraItems.PHOSPHORUS_DUST);
        simpleItem(TekoraItems.SULFUR_DUST);
        simpleItem(TekoraItems.SELENIUM_DUST);

        simpleItem(TekoraItems.GRAPHITE_DUST);
        simpleItem(TekoraItems.IODINE_DUST);

        simpleItem(TekoraItems.COPPER_DUST);
        simpleItem(TekoraItems.GOLD_DUST);
        simpleItem(TekoraItems.IRON_DUST);

        simpleItem(TekoraItems.ALUMINUM_DUST);
        simpleItem(TekoraItems.BARIUM_DUST);
        simpleItem(TekoraItems.BERYLLIUM_DUST);
        simpleItem(TekoraItems.BISMUTH_DUST);
        simpleItem(TekoraItems.CADMIUM_DUST);
        simpleItem(TekoraItems.CALCIUM_DUST);
        simpleItem(TekoraItems.CERIUM_DUST);
        simpleItem(TekoraItems.CESIUM_DUST);
        simpleItem(TekoraItems.CHROMIUM_DUST);
        simpleItem(TekoraItems.COBALT_DUST);
        simpleItem(TekoraItems.DYSPROSIUM_DUST);
        simpleItem(TekoraItems.ERBIUM_DUST);
        simpleItem(TekoraItems.EUROPIUM_DUST);
        simpleItem(TekoraItems.GADOLINIUM_DUST);
        simpleItem(TekoraItems.GALLIUM_DUST);
        simpleItem(TekoraItems.HAFNIUM_DUST);
        simpleItem(TekoraItems.HOLMIUM_DUST);
        simpleItem(TekoraItems.INDIUM_DUST);
        simpleItem(TekoraItems.IRIDIUM_DUST);
        simpleItem(TekoraItems.LANTHANUM_DUST);
        simpleItem(TekoraItems.LEAD_DUST);
        simpleItem(TekoraItems.LITHIUM_DUST);
        simpleItem(TekoraItems.LUTETIUM_DUST);
        simpleItem(TekoraItems.MAGNESIUM_DUST);
        simpleItem(TekoraItems.MANGANESE_DUST);
        simpleItem(TekoraItems.MOLYBDENUM_DUST);
        simpleItem(TekoraItems.NEODYMIUM_DUST);
        simpleItem(TekoraItems.NICKEL_DUST);
        simpleItem(TekoraItems.NIOBIUM_DUST);
        simpleItem(TekoraItems.OSMIUM_DUST);
        simpleItem(TekoraItems.PALLADIUM_DUST);
        simpleItem(TekoraItems.PLATINUM_DUST);
        simpleItem(TekoraItems.PRASEODYMIUM_DUST);
        simpleItem(TekoraItems.POTASSIUM_DUST);
        simpleItem(TekoraItems.RHENIUM_DUST);
        simpleItem(TekoraItems.RHODIUM_DUST);
        simpleItem(TekoraItems.RUBIDIUM_DUST);
        simpleItem(TekoraItems.RUTHENIUM_DUST);
        simpleItem(TekoraItems.SAMARIUM_DUST);
        simpleItem(TekoraItems.SCANDIUM_DUST);
        simpleItem(TekoraItems.SILVER_DUST);
        simpleItem(TekoraItems.SODIUM_DUST);
        simpleItem(TekoraItems.STRONTIUM_DUST);
        simpleItem(TekoraItems.TANTALUM_DUST);
        simpleItem(TekoraItems.TERBIUM_DUST);
        simpleItem(TekoraItems.THALLIUM_DUST);
        simpleItem(TekoraItems.THORIUM_DUST);
        simpleItem(TekoraItems.THULIUM_DUST);
        simpleItem(TekoraItems.TIN_DUST);
        simpleItem(TekoraItems.TITANIUM_DUST);
        simpleItem(TekoraItems.TUNGSTEN_DUST);
        simpleItem(TekoraItems.URANIUM_DUST);
        simpleItem(TekoraItems.VANADIUM_DUST);
        simpleItem(TekoraItems.YTTERBIUM_DUST);
        simpleItem(TekoraItems.YTTRIUM_DUST);
        simpleItem(TekoraItems.ZINC_DUST);
        simpleItem(TekoraItems.ZIRCONIUM_DUST);

        simpleItem(TekoraItems.COPPER_STEEL_DUST);

        simpleItem(TekoraItems.BRASS_DUST);
        simpleItem(TekoraItems.BRONZE_DUST);
        simpleItem(TekoraItems.CARBON_STEEL_DUST);
        simpleItem(TekoraItems.CHROMOLY_STEEL_DUST);
        simpleItem(TekoraItems.FERROBORON_DUST);
        simpleItem(TekoraItems.HSLA_STEEL_DUST);
        simpleItem(TekoraItems.INCONEL_DUST);
        simpleItem(TekoraItems.INVAR_DUST);
        simpleItem(TekoraItems.MAGNETIC_NEODYMIUM_DUST);
        simpleItem(TekoraItems.MU_METAL_DUST);
        simpleItem(TekoraItems.REACTOR_STEEL_DUST);
        simpleItem(TekoraItems.STAINLESS_STEEL_DUST);
        simpleItem(TekoraItems.STEEL_DUST);
        simpleItem(TekoraItems.TUNGSTEN_CARBIDE_DUST);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_DUST);
        simpleItem(TekoraItems.VANASTEEL_DUST);
        simpleItem(TekoraItems.ZIRCALOY_DUST);

        simpleItem(TekoraItems.ALUMINA);
        simpleItem(TekoraItems.AHCP);
        simpleItem(TekoraItems.APT);
        simpleItem(TekoraItems.BAKING_SODA);
        simpleItem(TekoraItems.BN_DUST);
        simpleItem(TekoraItems.BORAX);
        simpleItem(TekoraItems.POTASSIUM_PM);
        simpleItem(TekoraItems.SALT);
        simpleItem(TekoraItems.SILICA);
        simpleItem(TekoraItems.SODIUM_CYANIDE);

        simpleItem(TekoraItems.AMMONIUM_CHLORIDE);
        simpleItem(TekoraItems.BERYLLIUM_CHLORIDE);
        simpleItem(TekoraItems.CALCIUM_CHLORIDE);
        simpleItem(TekoraItems.MAGNESIUM_CHLORIDE);
        simpleItem(TekoraItems.POTASSIUM_CHLORIDE);

        simpleItem(TekoraItems.ALUMINUM_FLUORIDE);
        simpleItem(TekoraItems.BERYLLIUM_FLUORIDE);
        simpleItem(TekoraItems.CALCIUM_FLUORIDE);
        simpleItem(TekoraItems.LITHIUM_FLUORIDE);
        simpleItem(TekoraItems.MAGNESIUM_FLUORIDE);
        simpleItem(TekoraItems.SODIUM_FLUORIDE);
        simpleItem(TekoraItems.THORIUM_TETRAFLUORIDE);
        simpleItem(TekoraItems.URANIUM_TETRAFLUORIDE);
        simpleItem(TekoraItems.NIOBIUM_PENTAFLUORIDE);
        simpleItem(TekoraItems.TANTALUM_PENTAFLUORIDE);
        simpleItem(TekoraItems.URANIUM_HEXAFLUORIDE);

        simpleItem(TekoraItems.NICKEL_IODIDE);
        simpleItem(TekoraItems.POTASSIUM_IODIDE);

        simpleItem(TekoraItems.BORIC_ACID);
        simpleItem(TekoraItems.PHOSPHORIC_ACID);
        simpleItem(TekoraItems.SODIUM_HYDRIDE);

        simpleItem(TekoraItems.CALCIUM_CARBONATE);
        simpleItem(TekoraItems.MAGNESIUM_CARBONATE);
        simpleItem(TekoraItems.NICKEL_CARBONATE);
        itemSpecifiedTexture(TekoraItems.SODIUM_CARBONATE, "sodium_compound");
        simpleItem(TekoraItems.PRASEODYMIUM_HYDROXIDE);
        simpleItem(TekoraItems.POTASSIUM_HYDROXIDE);
        itemSpecifiedTexture(TekoraItems.SODIUM_HYDROXIDE, "sodium_compound");
        simpleItem(TekoraItems.CALCIUM_PHOSPHATE);
        simpleItem(TekoraItems.COPPER_NITRATE);
        simpleItem(TekoraItems.SILVER_NITRATE);
        simpleItem(TekoraItems.ZINC_NITRATE);
        itemSpecifiedTexture(TekoraItems.SODIUM_SULFITE, "sodium_compound");
        simpleItem(TekoraItems.BARIUM_SULFATE);
        simpleItem(TekoraItems.BERYLLIUM_SULFATE);
        simpleItem(TekoraItems.CALCIUM_SULFATE);
        simpleItem(TekoraItems.MAGNESIUM_SULFATE);
        simpleItem(TekoraItems.POTASSIUM_SULFATE);
        itemSpecifiedTexture(TekoraItems.SODIUM_SULFATE, "sodium_compound");
        simpleItem(TekoraItems.STRONTIUM_SULFATE);
        itemSpecifiedTexture(TekoraItems.SODIUM_THIOSULFATE, "sodium_compound");

        simpleItem(TekoraItems.BARIUM_OXIDE);
        simpleItem(TekoraItems.CADMIUM_OXIDE);
        simpleItem(TekoraItems.CALCIUM_OXIDE);
        simpleItem(TekoraItems.CHROMIUM_OXIDE);
        simpleItem(TekoraItems.COBALT_OXIDE);
        simpleItem(TekoraItems.DYSPROSIUM_OXIDE);
        simpleItem(TekoraItems.ERBIUM_OXIDE);
        simpleItem(TekoraItems.EUROPIUM_OXIDE);
        simpleItem(TekoraItems.FERRIC_OXIDE);
        simpleItem(TekoraItems.GADOLINIUM_OXIDE);
        simpleItem(TekoraItems.HOLMIUM_OXIDE);
        simpleItem(TekoraItems.LANTHANUM_OXIDE);
        simpleItem(TekoraItems.LEAD_OXIDE);
        simpleItem(TekoraItems.LUTETIUM_OXIDE);
        simpleItem(TekoraItems.MAGNESIUM_OXIDE);
        simpleItem(TekoraItems.MANGANESE_OXIDE);
        simpleItem(TekoraItems.MOLYBDENUM_OXIDE);
        simpleItem(TekoraItems.NEODYMIUM_OXIDE);
        simpleItem(TekoraItems.POTASSIUM_OXIDE);
        simpleItem(TekoraItems.PRASEODYMIUM_OXIDE);
        simpleItem(TekoraItems.PROTACTINIUM_DIOXIDE);
        simpleItem(TekoraItems.SAMARIUM_OXIDE);
        simpleItem(TekoraItems.SCANDIUM_OXIDE);
        itemSpecifiedTexture(TekoraItems.SODIUM_OXIDE, "sodium_compound");
        simpleItem(TekoraItems.STRONTIUM_OXIDE);
        simpleItem(TekoraItems.TERBIUM_OXIDE);
        simpleItem(TekoraItems.THULIUM_OXIDE);
        simpleItem(TekoraItems.TUNGSTEN_OXIDE);
        simpleItem(TekoraItems.YTTERBIUM_OXIDE);
        simpleItem(TekoraItems.YTTRIUM_OXIDE);
        simpleItem(TekoraItems.CERIUM_DIOXIDE);
        simpleItem(TekoraItems.MANGANESE_DIOXIDE);
        simpleItem(TekoraItems.SELENIUM_DIOXIDE);
        simpleItem(TekoraItems.THORIUM_DIOXIDE);
        simpleItem(TekoraItems.TIN_DIOXIDE);
        simpleItem(TekoraItems.TITANIUM_DIOXIDE);
        simpleItem(TekoraItems.URANIUM_DIOXIDE);
        simpleItem(TekoraItems.BORON_TRIOXIDE);
        simpleItem(TekoraItems.PHOSPHORUS_PENTOXIDE);
        simpleItem(TekoraItems.VANADIUM_PENTOXIDE);
        simpleItem(TekoraItems.RHENIUM_HEPTOXIDE);

        simpleItem(TekoraItems.BISMUTH_SULFIDE);
        simpleItem(TekoraItems.CADMIUM_SULFIDE);
        simpleItem(TekoraItems.COPPER_SULFIDE);
        simpleItem(TekoraItems.FERRIC_SULFIDE);
        simpleItem(TekoraItems.FERROUS_SULFIDE);
        simpleItem(TekoraItems.GERMANIUM_SULFIDE);
        simpleItem(TekoraItems.LEAD_SULFIDE);
        simpleItem(TekoraItems.MANGANESE_SULFIDE);
        simpleItem(TekoraItems.SODIUM_SULFIDE);
        simpleItem(TekoraItems.THALLIUM_SULFIDE);
        simpleItem(TekoraItems.ZINC_SULFIDE);
        simpleItem(TekoraItems.MOLYBDENUM_DISULFIDE);
        simpleItem(TekoraItems.RHENIUM_DISULFIDE);
        simpleItem(TekoraItems.ARSENIC_TRISULFIDE);
        simpleItem(TekoraItems.RESIDUE);

        simpleItem(TekoraItems.COPPER_PLATE);
        simpleItem(TekoraItems.GOLD_PLATE);
        simpleItem(TekoraItems.IRON_PLATE);

        simpleItem(TekoraItems.ALUMINUM_PLATE);
        simpleItem(TekoraItems.BISMUTH_PLATE);
        simpleItem(TekoraItems.CADMIUM_PLATE);
        simpleItem(TekoraItems.CHROMIUM_PLATE);
        simpleItem(TekoraItems.COBALT_PLATE);
        simpleItem(TekoraItems.INDIUM_PLATE);
        simpleItem(TekoraItems.IRIDIUM_PLATE);
        simpleItem(TekoraItems.LEAD_PLATE);
        simpleItem(TekoraItems.MAGNESIUM_PLATE);
        simpleItem(TekoraItems.MANGANESE_PLATE);
        simpleItem(TekoraItems.MOLYBDENUM_PLATE);
        simpleItem(TekoraItems.NICKEL_PLATE);
        simpleItem(TekoraItems.NIOBIUM_PLATE);
        simpleItem(TekoraItems.OSMIUM_PLATE);
        simpleItem(TekoraItems.PALLADIUM_PLATE);
        simpleItem(TekoraItems.PLATINUM_PLATE);
        simpleItem(TekoraItems.RHODIUM_PLATE);
        simpleItem(TekoraItems.SCANDIUM_PLATE);
        simpleItem(TekoraItems.SILVER_PLATE);
        simpleItem(TekoraItems.THORIUM_PLATE);
        simpleItem(TekoraItems.THULIUM_PLATE);
        simpleItem(TekoraItems.TIN_PLATE);
        simpleItem(TekoraItems.TITANIUM_PLATE);
        simpleItem(TekoraItems.TUNGSTEN_PLATE);
        simpleItem(TekoraItems.YTTERBIUM_PLATE);
        simpleItem(TekoraItems.ZINC_PLATE);
        simpleItem(TekoraItems.ZIRCONIUM_PLATE);

        simpleItem(TekoraItems.COPPER_STEEL_PLATE);

        simpleItem(TekoraItems.BRASS_PLATE);
        simpleItem(TekoraItems.BRONZE_PLATE);
        simpleItem(TekoraItems.CHROMOLY_STEEL_PLATE);
        simpleItem(TekoraItems.FERROBORON_PLATE);
        simpleItem(TekoraItems.GALVANIZED_STEEL_PLATE);
        simpleItem(TekoraItems.HSLA_STEEL_PLATE);
        simpleItem(TekoraItems.INCONEL_PLATE);
        simpleItem(TekoraItems.INVAR_PLATE);
        simpleItem(TekoraItems.MAGNETIC_NEODYMIUM_PLATE);
        simpleItem(TekoraItems.MU_METAL_PLATE);
        simpleItem(TekoraItems.REACTOR_STEEL_PLATE);
        simpleItem(TekoraItems.STAINLESS_STEEL_PLATE);
        simpleItem(TekoraItems.STEEL_PLATE);
        simpleItem(TekoraItems.TUNGSTEN_CARBIDE_PLATE);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_PLATE);
        simpleItem(TekoraItems.VANASTEEL_PLATE);
        simpleItem(TekoraItems.ZIRCALOY_PLATE);

        simpleItem(TekoraItems.BORON_SWORD);
        simpleItem(TekoraItems.BRONZE_SWORD);
        simpleItem(TekoraItems.PLATINUM_SWORD);
        simpleItem(TekoraItems.SILVER_SWORD);
        simpleItem(TekoraItems.STEEL_SWORD);
        simpleItem(TekoraItems.THORIUM_SWORD);
        simpleItem(TekoraItems.TITANIUM_SWORD);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_SWORD);
        simpleItem(TekoraItems.VANASTEEL_SWORD);

        simpleItem(TekoraItems.BORON_AXE);
        simpleItem(TekoraItems.BRONZE_AXE);
        simpleItem(TekoraItems.PLATINUM_AXE);
        simpleItem(TekoraItems.SILVER_AXE);
        simpleItem(TekoraItems.STEEL_AXE);
        simpleItem(TekoraItems.THORIUM_AXE);
        simpleItem(TekoraItems.TITANIUM_AXE);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_AXE);
        simpleItem(TekoraItems.VANASTEEL_AXE);

        simpleItem(TekoraItems.DIAMOND_HAMMER);
        simpleItem(TekoraItems.GOLDEN_HAMMER);
        simpleItem(TekoraItems.IRON_HAMMER);
        simpleItem(TekoraItems.NETHERITE_HAMMER);

        simpleItem(TekoraItems.BORON_HAMMER);
        simpleItem(TekoraItems.BRONZE_HAMMER);
        simpleItem(TekoraItems.PLATINUM_HAMMER);
        simpleItem(TekoraItems.SILVER_HAMMER);
        simpleItem(TekoraItems.STEEL_HAMMER);
        simpleItem(TekoraItems.THORIUM_HAMMER);
        simpleItem(TekoraItems.TITANIUM_HAMMER);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_HAMMER);
        simpleItem(TekoraItems.VANASTEEL_HAMMER);

        simpleItem(TekoraItems.BORON_HELMET);
        simpleItem(TekoraItems.BORON_CHESTPLATE);
        simpleItem(TekoraItems.BORON_LEGGINGS);
        simpleItem(TekoraItems.BORON_BOOTS);
        simpleItem(TekoraItems.BRONZE_HELMET);
        simpleItem(TekoraItems.BRONZE_CHESTPLATE);
        simpleItem(TekoraItems.BRONZE_LEGGINGS);
        simpleItem(TekoraItems.BRONZE_BOOTS);
        simpleItem(TekoraItems.PLATINUM_HELMET);
        simpleItem(TekoraItems.PLATINUM_CHESTPLATE);
        simpleItem(TekoraItems.PLATINUM_LEGGINGS);
        simpleItem(TekoraItems.PLATINUM_BOOTS);
        simpleItem(TekoraItems.SILVER_HELMET);
        simpleItem(TekoraItems.SILVER_CHESTPLATE);
        simpleItem(TekoraItems.SILVER_LEGGINGS);
        simpleItem(TekoraItems.SILVER_BOOTS);
        simpleItem(TekoraItems.STEEL_HELMET);
        simpleItem(TekoraItems.STEEL_CHESTPLATE);
        simpleItem(TekoraItems.STEEL_LEGGINGS);
        simpleItem(TekoraItems.STEEL_BOOTS);
        simpleItem(TekoraItems.TITANIUM_HELMET);
        simpleItem(TekoraItems.TITANIUM_CHESTPLATE);
        simpleItem(TekoraItems.TITANIUM_LEGGINGS);
        simpleItem(TekoraItems.TITANIUM_BOOTS);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_HELMET);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_CHESTPLATE);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_LEGGINGS);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_BOOTS);
        simpleItem(TekoraItems.VANASTEEL_HELMET);
        simpleItem(TekoraItems.VANASTEEL_CHESTPLATE);
        simpleItem(TekoraItems.VANASTEEL_LEGGINGS);
        simpleItem(TekoraItems.VANASTEEL_BOOTS);

        simpleItem(TekoraItems.DIAMOND_HAMMER);
        simpleItem(TekoraItems.GOLDEN_HAMMER);
        simpleItem(TekoraItems.IRON_HAMMER);
        simpleItem(TekoraItems.NETHERITE_HAMMER);

        simpleItem(TekoraItems.BORON_HAMMER);
        simpleItem(TekoraItems.BRONZE_HAMMER);
        simpleItem(TekoraItems.PLATINUM_HAMMER);
        simpleItem(TekoraItems.SILVER_HAMMER);
        simpleItem(TekoraItems.STEEL_HAMMER);
        simpleItem(TekoraItems.THORIUM_HAMMER);
        simpleItem(TekoraItems.TITANIUM_HAMMER);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_HAMMER);
        simpleItem(TekoraItems.VANASTEEL_HAMMER);

        simpleItem(TekoraItems.BORON_SHOVEL);
        simpleItem(TekoraItems.BORON_PICKAXE);
        simpleItem(TekoraItems.BORON_AXE);
        simpleItem(TekoraItems.BORON_HOE);
        simpleItem(TekoraItems.BRONZE_SHOVEL);
        simpleItem(TekoraItems.BRONZE_PICKAXE);
        simpleItem(TekoraItems.BRONZE_AXE);
        simpleItem(TekoraItems.BRONZE_HOE);
        simpleItem(TekoraItems.PLATINUM_SHOVEL);
        simpleItem(TekoraItems.PLATINUM_PICKAXE);
        simpleItem(TekoraItems.PLATINUM_AXE);
        simpleItem(TekoraItems.PLATINUM_HOE);
        simpleItem(TekoraItems.SILVER_SHOVEL);
        simpleItem(TekoraItems.SILVER_PICKAXE);
        simpleItem(TekoraItems.SILVER_AXE);
        simpleItem(TekoraItems.SILVER_HOE);
        simpleItem(TekoraItems.STEEL_SHOVEL);
        simpleItem(TekoraItems.STEEL_PICKAXE);
        simpleItem(TekoraItems.STEEL_AXE);
        simpleItem(TekoraItems.STEEL_HOE);
        simpleItem(TekoraItems.THORIUM_SHOVEL);
        simpleItem(TekoraItems.THORIUM_PICKAXE);
        simpleItem(TekoraItems.THORIUM_AXE);
        simpleItem(TekoraItems.THORIUM_HOE);
        simpleItem(TekoraItems.TITANIUM_SHOVEL);
        simpleItem(TekoraItems.TITANIUM_PICKAXE);
        simpleItem(TekoraItems.TITANIUM_AXE);
        simpleItem(TekoraItems.TITANIUM_HOE);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_SHOVEL);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_PICKAXE);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_AXE);
        simpleItem(TekoraItems.TUNGSTEN_STEEL_HOE);
        simpleItem(TekoraItems.VANASTEEL_SHOVEL);
        simpleItem(TekoraItems.VANASTEEL_PICKAXE);
        simpleItem(TekoraItems.VANASTEEL_AXE);
        simpleItem(TekoraItems.VANASTEEL_HOE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Tekora.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder itemSpecifiedTexture(RegistryObject<Item> item, String texture) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Tekora.MODID,"item/" + texture));
    }
}