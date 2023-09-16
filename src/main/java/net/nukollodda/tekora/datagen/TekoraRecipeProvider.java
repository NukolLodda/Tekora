package net.nukollodda.tekora.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.nukollodda.tekora.Tekora;
import net.nukollodda.tekora.block.TekoraBlocks;
import net.nukollodda.tekora.datagen.tags.TekoraTags;
import net.nukollodda.tekora.item.TekoraItems;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class TekoraRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public TekoraRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, TekoraTags.Items.APATITE_ORE, TekoraItems.APATITE.get().asItem());
        oreBlasting(pWriter, TekoraTags.Items.AQUAMARINE_ORE, TekoraItems.AQUAMARINE.get());
        oreBlasting(pWriter, TekoraTags.Items.BAUXITE_ORE, TekoraItems.BAUXITE.get());
        oreBlasting(pWriter, TekoraTags.Items.CASSITERITE_ORE, TekoraItems.CASSITERITE.get());
        oreBlasting(pWriter, TekoraTags.Items.CHROMITE_ORE, TekoraItems.CHROMITE.get());
        oreBlasting(pWriter, TekoraTags.Items.CINNABAR_ORE, TekoraItems.CINNABAR.get());
        oreBlasting(pWriter, TekoraTags.Items.GALENA_ORE, TekoraItems.GALENA.get());
        oreBlasting(pWriter, TekoraTags.Items.GARNET_ORE, TekoraItems.GARNET.get());
        oreBlasting(pWriter, TekoraTags.Items.GRAPHITE_ORE, TekoraItems.GRAPHITE_BAR.get());
        oreBlasting(pWriter, TekoraTags.Items.PENTLANDITE_ORE, TekoraItems.PENTLANDITE.get());
        oreBlasting(pWriter, TekoraTags.Items.RUBY_ORE, TekoraItems.RUBY.get());
        oreBlasting(pWriter, TekoraTags.Items.SAPPHIRE_ORE, TekoraItems.SAPPHIRE.get());
        oreBlasting(pWriter, TekoraTags.Items.SILVER_ORE, TekoraItems.RAW_SILVER.get());
        oreBlasting(pWriter, TekoraTags.Items.URANINITE_ORE, TekoraItems.URANINITE.get());
        oreBlasting(pWriter, TekoraTags.Items.ZIRCON_ORE, TekoraItems.ZIRCON.get());

        oreBlasting(pWriter, TekoraTags.Items.RAW_SILVER_GEM, TekoraItems.SILVER_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.BAUXITE_GEM, TekoraItems.ALUMINA.get());
        oreBlasting(pWriter, TekoraItems.APT.get(), TekoraItems.TUNGSTEN_OXIDE.get());
        oreBlasting(pWriter, TekoraItems.RUTILE.get(), TekoraItems.TITANIUM_DIOXIDE.get());
        oreBlasting(pWriter, TekoraItems.THORITE.get(), TekoraItems.THORIUM_DIOXIDE.get());

        oreBlasting(pWriter, TekoraTags.Items.ALUMINUM_DUST, TekoraItems.ALUMINUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.BARIUM_DUST, TekoraItems.BARIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.BERYLLIUM_DUST, TekoraItems.BERYLLIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.BISMUTH_DUST, TekoraItems.BISMUTH_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.CADMIUM_DUST, TekoraItems.CADMIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.CALCIUM_DUST, TekoraItems.CALCIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.CERIUM_DUST, TekoraItems.CERIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.CHROMIUM_DUST, TekoraItems.CHROMIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.COBALT_DUST, TekoraItems.COBALT_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.COPPER_DUST, Items.COPPER_INGOT);
        oreBlasting(pWriter, TekoraTags.Items.DYSPROSIUM_DUST, TekoraItems.DYSPROSIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.ERBIUM_DUST, TekoraItems.ERBIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.EUROPIUM_DUST, TekoraItems.EUROPIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.GADOLINIUM_DUST, TekoraItems.GADOLINIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.GALLIUM_DUST, TekoraItems.GALLIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.GOLD_DUST, Items.GOLD_INGOT);
        oreBlasting(pWriter, TekoraTags.Items.HAFNIUM_DUST, TekoraItems.HAFNIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.HOLMIUM_DUST, TekoraItems.HOLMIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.INDIUM_DUST, TekoraItems.INDIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.IRIDIUM_DUST, TekoraItems.IRIDIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.IRON_DUST, Items.IRON_INGOT);
        oreBlasting(pWriter, TekoraTags.Items.LANTHANUM_DUST, TekoraItems.LANTHANUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.LEAD_DUST, TekoraItems.LEAD_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.LUTETIUM_DUST, TekoraItems.LUTETIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.MAGNESIUM_DUST, TekoraItems.MAGNESIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.MANGANESE_DUST, TekoraItems.MANGANESE_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.MOLYBDENUM_DUST, TekoraItems.MOLYBDENUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.NEODYMIUM_DUST, TekoraItems.NEODYMIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.NICKEL_DUST, TekoraItems.NICKEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.NIOBIUM_DUST, TekoraItems.NIOBIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.OSMIUM_DUST, TekoraItems.OSMIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.PALLADIUM_DUST, TekoraItems.PALLADIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.PLATINUM_DUST, TekoraItems.PLATINUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.PRASEODYMIUM_DUST, TekoraItems.PRASEODYMIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.RHENIUM_DUST, TekoraItems.RHENIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.RHODIUM_DUST, TekoraItems.RHODIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.RUTHENIUM_DUST, TekoraItems.RUTHENIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.SCANDIUM_DUST, TekoraItems.SCANDIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.SAMARIUM_DUST, TekoraItems.SAMARIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.STRONTIUM_DUST, TekoraItems.STRONTIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.SILVER_DUST, TekoraItems.SILVER_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.TANTALUM_DUST, TekoraItems.TANTALUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.TERBIUM_DUST, TekoraItems.TERBIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.THALLIUM_DUST, TekoraItems.THALLIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.THORIUM_DUST, TekoraItems.THORIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.THULIUM_DUST, TekoraItems.THULIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.TIN_DUST, TekoraItems.TIN_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.TITANIUM_DUST, TekoraItems.TITANIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.TUNGSTEN_DUST, TekoraItems.TUNGSTEN_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.URANIUM_DUST, TekoraItems.URANIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.VANADIUM_DUST, TekoraItems.VANADIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.YTTERBIUM_DUST, TekoraItems.YTTERBIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.YTTRIUM_DUST, TekoraItems.YTTRIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.ZINC_DUST, TekoraItems.ZINC_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.ZIRCONIUM_DUST, TekoraItems.ZIRCONIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.BRASS_DUST, TekoraItems.BRASS_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.BRONZE_DUST, TekoraItems.BRONZE_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.CARBON_STEEL_DUST, TekoraItems.CARBON_STEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.CHROMOLY_STEEL_DUST, TekoraItems.CHROMOLY_STEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.FERROBORON_DUST, TekoraItems.FERROBORON_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.HSLA_STEEL_DUST, TekoraItems.HSLA_STEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.INCONEL_DUST, TekoraItems.INCONEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.INVAR_DUST, TekoraItems.INVAR_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.MAGNETIC_NEODYMIUM_DUST, TekoraItems.MAGNETIC_NEODYMIUM_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.MU_METAL_DUST, TekoraItems.MU_METAL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.REACTOR_STEEL_DUST, TekoraItems.REACTOR_STEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.STAINLESS_STEEL_DUST, TekoraItems.STAINLESS_STEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.STEEL_DUST, TekoraItems.STEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.TUNGSTEN_CARBIDE_DUST, TekoraItems.TUNGSTEN_CARBIDE_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.TUNGSTEN_STEEL_DUST, TekoraItems.TUNGSTEN_STEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.VANASTEEL_DUST, TekoraItems.VANASTEEL_INGOT.get());
        oreBlasting(pWriter, TekoraTags.Items.ZIRCALOY_DUST, TekoraItems.ZIRCALOY_INGOT.get());

        storageBlockRecipe(pWriter, TekoraBlocks.ALUMINUM_BLOCK.get(), TekoraTags.Items.ALUMINUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.BARIUM_BLOCK.get(), TekoraTags.Items.BARIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.BERYLLIUM_BLOCK.get(), TekoraTags.Items.BERYLLIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.BISMUTH_BLOCK.get(), TekoraTags.Items.BISMUTH_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.CADMIUM_BLOCK.get(), TekoraTags.Items.CADMIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.CALCIUM_BLOCK.get(), TekoraTags.Items.CALCIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.CERIUM_BLOCK.get(), TekoraTags.Items.CERIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.CHROMIUM_BLOCK.get(), TekoraTags.Items.CHROMIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.COBALT_BLOCK.get(), TekoraTags.Items.COBALT_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.DYSPROSIUM_BLOCK.get(), TekoraTags.Items.DYSPROSIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.ERBIUM_BLOCK.get(), TekoraTags.Items.ERBIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.EUROPIUM_BLOCK.get(), TekoraTags.Items.EUROPIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.GADOLINIUM_BLOCK.get(), TekoraTags.Items.GADOLINIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.GALLIUM_BLOCK.get(), TekoraTags.Items.GALLIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.HAFNIUM_BLOCK.get(), TekoraTags.Items.HAFNIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.HOLMIUM_BLOCK.get(), TekoraTags.Items.HOLMIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.INDIUM_BLOCK.get(), TekoraTags.Items.INDIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.IRIDIUM_BLOCK.get(), TekoraTags.Items.IRIDIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.LANTHANUM_BLOCK.get(), TekoraTags.Items.LANTHANUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.LEAD_BLOCK.get(), TekoraTags.Items.LEAD_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.LUTETIUM_BLOCK.get(), TekoraTags.Items.LUTETIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.MAGNESIUM_BLOCK.get(), TekoraTags.Items.MAGNESIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.MANGANESE_BLOCK.get(), TekoraTags.Items.MANGANESE_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.MOLYBDENUM_BLOCK.get(), TekoraTags.Items.MOLYBDENUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.NEODYMIUM_BLOCK.get(), TekoraTags.Items.NEODYMIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.NICKEL_BLOCK.get(), TekoraTags.Items.NICKEL_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.NIOBIUM_BLOCK.get(), TekoraTags.Items.NIOBIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.OSMIUM_BLOCK.get(), TekoraTags.Items.OSMIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.PALLADIUM_BLOCK.get(), TekoraTags.Items.PALLADIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.PLATINUM_BLOCK.get(), TekoraTags.Items.PLATINUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.PRASEODYMIUM_BLOCK.get(), TekoraTags.Items.PRASEODYMIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.RHENIUM_BLOCK.get(), TekoraTags.Items.RHENIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.RHODIUM_BLOCK.get(), TekoraTags.Items.RHODIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.RUTHENIUM_BLOCK.get(), TekoraTags.Items.RUTHENIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.SCANDIUM_BLOCK.get(), TekoraTags.Items.SCANDIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.SAMARIUM_BLOCK.get(), TekoraTags.Items.SAMARIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.STRONTIUM_BLOCK.get(), TekoraTags.Items.STRONTIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.SILVER_BLOCK.get(), TekoraTags.Items.SILVER_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.TANTALUM_BLOCK.get(), TekoraTags.Items.TANTALUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.TERBIUM_BLOCK.get(), TekoraTags.Items.TERBIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.THALLIUM_BLOCK.get(), TekoraTags.Items.THALLIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.THORIUM_BLOCK.get(), TekoraTags.Items.THORIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.THULIUM_BLOCK.get(), TekoraTags.Items.THULIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.TIN_BLOCK.get(), TekoraTags.Items.TIN_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.TITANIUM_BLOCK.get(), TekoraTags.Items.TITANIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.TUNGSTEN_BLOCK.get(), TekoraTags.Items.TUNGSTEN_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.URANIUM_BLOCK.get(), TekoraTags.Items.URANIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.VANADIUM_BLOCK.get(), TekoraTags.Items.VANADIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.YTTERBIUM_BLOCK.get(), TekoraTags.Items.YTTERBIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.YTTRIUM_BLOCK.get(), TekoraTags.Items.YTTRIUM_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.ZINC_BLOCK.get(), TekoraTags.Items.ZINC_INGOT);
        storageBlockRecipe(pWriter, TekoraBlocks.ZIRCONIUM_BLOCK.get(), TekoraTags.Items.ZIRCONIUM_INGOT);

        storageBlockRecipe(pWriter, TekoraItems.ALUMINUM_INGOT.get(), TekoraTags.Items.ALUMINUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.BARIUM_INGOT.get(), TekoraTags.Items.BARIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.BERYLLIUM_INGOT.get(), TekoraTags.Items.BERYLLIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.BISMUTH_INGOT.get(), TekoraTags.Items.BISMUTH_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.CADMIUM_INGOT.get(), TekoraTags.Items.CADMIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.CALCIUM_INGOT.get(), TekoraTags.Items.CALCIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.CERIUM_INGOT.get(), TekoraTags.Items.CERIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.CHROMIUM_INGOT.get(), TekoraTags.Items.CHROMIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.COBALT_INGOT.get(), TekoraTags.Items.COBALT_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.DYSPROSIUM_INGOT.get(), TekoraTags.Items.DYSPROSIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.ERBIUM_INGOT.get(), TekoraTags.Items.ERBIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.EUROPIUM_INGOT.get(), TekoraTags.Items.EUROPIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.GADOLINIUM_INGOT.get(), TekoraTags.Items.GADOLINIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.GALLIUM_INGOT.get(), TekoraTags.Items.GALLIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.HAFNIUM_INGOT.get(), TekoraTags.Items.HAFNIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.HOLMIUM_INGOT.get(), TekoraTags.Items.HOLMIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.INDIUM_INGOT.get(), TekoraTags.Items.INDIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.IRIDIUM_INGOT.get(), TekoraTags.Items.IRIDIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.LANTHANUM_INGOT.get(), TekoraTags.Items.LANTHANUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.LEAD_INGOT.get(), TekoraTags.Items.LEAD_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.LUTETIUM_INGOT.get(), TekoraTags.Items.LUTETIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.MAGNESIUM_INGOT.get(), TekoraTags.Items.MAGNESIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.MANGANESE_INGOT.get(), TekoraTags.Items.MANGANESE_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.MOLYBDENUM_INGOT.get(), TekoraTags.Items.MOLYBDENUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.NEODYMIUM_INGOT.get(), TekoraTags.Items.NEODYMIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.NICKEL_INGOT.get(), TekoraTags.Items.NICKEL_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.NIOBIUM_INGOT.get(), TekoraTags.Items.NIOBIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.OSMIUM_INGOT.get(), TekoraTags.Items.OSMIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.PALLADIUM_INGOT.get(), TekoraTags.Items.PALLADIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.PLATINUM_INGOT.get(), TekoraTags.Items.PLATINUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.PRASEODYMIUM_INGOT.get(), TekoraTags.Items.PRASEODYMIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.RHENIUM_INGOT.get(), TekoraTags.Items.RHENIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.RHODIUM_INGOT.get(), TekoraTags.Items.RHODIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.RUTHENIUM_INGOT.get(), TekoraTags.Items.RUTHENIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.SCANDIUM_INGOT.get(), TekoraTags.Items.SCANDIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.SAMARIUM_INGOT.get(), TekoraTags.Items.SAMARIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.STRONTIUM_INGOT.get(), TekoraTags.Items.STRONTIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.SILVER_INGOT.get(), TekoraTags.Items.SILVER_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.TANTALUM_INGOT.get(), TekoraTags.Items.TANTALUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.TERBIUM_INGOT.get(), TekoraTags.Items.TERBIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.THALLIUM_INGOT.get(), TekoraTags.Items.THALLIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.THORIUM_INGOT.get(), TekoraTags.Items.THORIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.THULIUM_INGOT.get(), TekoraTags.Items.THULIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.TIN_INGOT.get(), TekoraTags.Items.TIN_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.TITANIUM_INGOT.get(), TekoraTags.Items.TITANIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.TUNGSTEN_INGOT.get(), TekoraTags.Items.TUNGSTEN_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.URANIUM_INGOT.get(), TekoraTags.Items.URANIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.VANADIUM_INGOT.get(), TekoraTags.Items.VANADIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.YTTERBIUM_INGOT.get(), TekoraTags.Items.YTTERBIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.YTTRIUM_INGOT.get(), TekoraTags.Items.YTTRIUM_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.ZINC_INGOT.get(), TekoraTags.Items.ZINC_NUGGET);
        storageBlockRecipe(pWriter, TekoraItems.ZIRCONIUM_INGOT.get(), TekoraTags.Items.ZIRCONIUM_NUGGET);

        storageBlockRecipe(pWriter, TekoraBlocks.ANTIMONY_BLOCK.get(), TekoraItems.ANTIMONY_PIECE.get());
        storageBlockRecipe(pWriter, TekoraBlocks.ARSENIC_BLOCK.get(), TekoraItems.ARSENIC_PIECE.get());
        storageBlockRecipe(pWriter, TekoraBlocks.BORON_BLOCK.get(), TekoraItems.BORON_PIECE.get());
        storageBlockRecipe(pWriter, TekoraBlocks.GERMANIUM_BLOCK.get(), TekoraItems.GERMANIUM_PIECE.get());
        storageBlockRecipe(pWriter, TekoraBlocks.SILICON_BLOCK.get(), TekoraItems.SILICON_PIECE.get());
        storageBlockRecipe(pWriter, TekoraBlocks.TELLURIUM_BLOCK.get(), TekoraItems.TELLURIUM_PIECE.get());

        nineBlockStorageRecipes(pWriter, TekoraItems.ALUMINUM_INGOT.get(), TekoraTags.Items.ALUMINUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.BARIUM_INGOT.get(), TekoraTags.Items.BARIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.BERYLLIUM_INGOT.get(), TekoraTags.Items.BERYLLIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.BISMUTH_INGOT.get(), TekoraTags.Items.BISMUTH_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.CADMIUM_INGOT.get(), TekoraTags.Items.CADMIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.CALCIUM_INGOT.get(), TekoraTags.Items.CALCIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.CERIUM_INGOT.get(), TekoraTags.Items.CERIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.CHROMIUM_INGOT.get(), TekoraTags.Items.CHROMIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.COBALT_INGOT.get(), TekoraTags.Items.COBALT_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.DYSPROSIUM_INGOT.get(), TekoraTags.Items.DYSPROSIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.ERBIUM_INGOT.get(), TekoraTags.Items.ERBIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.EUROPIUM_INGOT.get(), TekoraTags.Items.EUROPIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.GADOLINIUM_INGOT.get(), TekoraTags.Items.GADOLINIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.GALLIUM_INGOT.get(), TekoraTags.Items.GALLIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.HAFNIUM_INGOT.get(), TekoraTags.Items.HAFNIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.HOLMIUM_INGOT.get(), TekoraTags.Items.HOLMIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.INDIUM_INGOT.get(), TekoraTags.Items.INDIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.IRIDIUM_INGOT.get(), TekoraTags.Items.IRIDIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.LANTHANUM_INGOT.get(), TekoraTags.Items.LANTHANUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.LEAD_INGOT.get(), TekoraTags.Items.LEAD_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.LUTETIUM_INGOT.get(), TekoraTags.Items.LUTETIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.MAGNESIUM_INGOT.get(), TekoraTags.Items.MAGNESIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.MANGANESE_INGOT.get(), TekoraTags.Items.MANGANESE_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.MOLYBDENUM_INGOT.get(), TekoraTags.Items.MOLYBDENUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.NEODYMIUM_INGOT.get(), TekoraTags.Items.NEODYMIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.NICKEL_INGOT.get(), TekoraTags.Items.NICKEL_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.NIOBIUM_INGOT.get(), TekoraTags.Items.NIOBIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.OSMIUM_INGOT.get(), TekoraTags.Items.OSMIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.PALLADIUM_INGOT.get(), TekoraTags.Items.PALLADIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.PLATINUM_INGOT.get(), TekoraTags.Items.PLATINUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.PRASEODYMIUM_INGOT.get(), TekoraTags.Items.PRASEODYMIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.RHENIUM_INGOT.get(), TekoraTags.Items.RHENIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.RHODIUM_INGOT.get(), TekoraTags.Items.RHODIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.RUTHENIUM_INGOT.get(), TekoraTags.Items.RUTHENIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.SCANDIUM_INGOT.get(), TekoraTags.Items.SCANDIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.SAMARIUM_INGOT.get(), TekoraTags.Items.SAMARIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.STRONTIUM_INGOT.get(), TekoraTags.Items.STRONTIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.SILVER_INGOT.get(), TekoraTags.Items.SILVER_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.TANTALUM_INGOT.get(), TekoraTags.Items.TANTALUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.TERBIUM_INGOT.get(), TekoraTags.Items.TERBIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.THALLIUM_INGOT.get(), TekoraTags.Items.THALLIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.THORIUM_INGOT.get(), TekoraTags.Items.THORIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.THULIUM_INGOT.get(), TekoraTags.Items.THULIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.TIN_INGOT.get(), TekoraTags.Items.TIN_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.TITANIUM_INGOT.get(), TekoraTags.Items.TITANIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.TUNGSTEN_INGOT.get(), TekoraTags.Items.TUNGSTEN_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.URANIUM_INGOT.get(), TekoraTags.Items.URANIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.VANADIUM_INGOT.get(), TekoraTags.Items.VANADIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.YTTERBIUM_INGOT.get(), TekoraTags.Items.YTTERBIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.YTTRIUM_INGOT.get(), TekoraTags.Items.YTTRIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.ZINC_INGOT.get(), TekoraTags.Items.ZINC_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.ZIRCONIUM_INGOT.get(), TekoraTags.Items.ZIRCONIUM_BLOCK);

        nineBlockStorageRecipes(pWriter, TekoraItems.ALUMINUM_NUGGET.get(), TekoraTags.Items.ALUMINUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.BARIUM_NUGGET.get(), TekoraTags.Items.BARIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.BERYLLIUM_NUGGET.get(), TekoraTags.Items.BERYLLIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.BISMUTH_NUGGET.get(), TekoraTags.Items.BISMUTH_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.CADMIUM_NUGGET.get(), TekoraTags.Items.CADMIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.CALCIUM_NUGGET.get(), TekoraTags.Items.CALCIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.CERIUM_NUGGET.get(), TekoraTags.Items.CERIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.CHROMIUM_NUGGET.get(), TekoraTags.Items.CHROMIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.COBALT_NUGGET.get(), TekoraTags.Items.COBALT_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.DYSPROSIUM_NUGGET.get(), TekoraTags.Items.DYSPROSIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.ERBIUM_NUGGET.get(), TekoraTags.Items.ERBIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.EUROPIUM_NUGGET.get(), TekoraTags.Items.EUROPIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.GADOLINIUM_NUGGET.get(), TekoraTags.Items.GADOLINIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.GALLIUM_NUGGET.get(), TekoraTags.Items.GALLIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.HAFNIUM_NUGGET.get(), TekoraTags.Items.HAFNIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.HOLMIUM_NUGGET.get(), TekoraTags.Items.HOLMIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.INDIUM_NUGGET.get(), TekoraTags.Items.INDIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.IRIDIUM_NUGGET.get(), TekoraTags.Items.IRIDIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.LANTHANUM_NUGGET.get(), TekoraTags.Items.LANTHANUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.LEAD_NUGGET.get(), TekoraTags.Items.LEAD_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.LUTETIUM_NUGGET.get(), TekoraTags.Items.LUTETIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.MAGNESIUM_NUGGET.get(), TekoraTags.Items.MAGNESIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.MANGANESE_NUGGET.get(), TekoraTags.Items.MANGANESE_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.MOLYBDENUM_NUGGET.get(), TekoraTags.Items.MOLYBDENUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.NEODYMIUM_NUGGET.get(), TekoraTags.Items.NEODYMIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.NICKEL_NUGGET.get(), TekoraTags.Items.NICKEL_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.NIOBIUM_NUGGET.get(), TekoraTags.Items.NIOBIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.OSMIUM_NUGGET.get(), TekoraTags.Items.OSMIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.PALLADIUM_NUGGET.get(), TekoraTags.Items.PALLADIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.PLATINUM_NUGGET.get(), TekoraTags.Items.PLATINUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.PRASEODYMIUM_NUGGET.get(), TekoraTags.Items.PRASEODYMIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.RHENIUM_NUGGET.get(), TekoraTags.Items.RHENIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.RHODIUM_NUGGET.get(), TekoraTags.Items.RHODIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.RUTHENIUM_NUGGET.get(), TekoraTags.Items.RUTHENIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.SCANDIUM_NUGGET.get(), TekoraTags.Items.SCANDIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.SAMARIUM_NUGGET.get(), TekoraTags.Items.SAMARIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.STRONTIUM_NUGGET.get(), TekoraTags.Items.STRONTIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.SILVER_NUGGET.get(), TekoraTags.Items.SILVER_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.TANTALUM_NUGGET.get(), TekoraTags.Items.TANTALUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.TERBIUM_NUGGET.get(), TekoraTags.Items.TERBIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.THALLIUM_NUGGET.get(), TekoraTags.Items.THALLIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.THORIUM_NUGGET.get(), TekoraTags.Items.THORIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.THULIUM_NUGGET.get(), TekoraTags.Items.THULIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.TIN_NUGGET.get(), TekoraTags.Items.TIN_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.TITANIUM_NUGGET.get(), TekoraTags.Items.TITANIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.TUNGSTEN_NUGGET.get(), TekoraTags.Items.TUNGSTEN_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.URANIUM_NUGGET.get(), TekoraTags.Items.URANIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.VANADIUM_NUGGET.get(), TekoraTags.Items.VANADIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.YTTERBIUM_NUGGET.get(), TekoraTags.Items.YTTERBIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.YTTRIUM_NUGGET.get(), TekoraTags.Items.YTTRIUM_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.ZINC_NUGGET.get(), TekoraTags.Items.ZINC_INGOT);
        nineBlockStorageRecipes(pWriter, TekoraItems.ZIRCONIUM_NUGGET.get(), TekoraTags.Items.ZIRCONIUM_INGOT);

        nineBlockStorageRecipes(pWriter, TekoraItems.ANTIMONY_PIECE.get(), TekoraTags.Items.ANTIMONY_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.ARSENIC_PIECE.get(), TekoraTags.Items.ARSENIC_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.BORON_PIECE.get(), TekoraTags.Items.BORON_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.GERMANIUM_PIECE.get(), TekoraTags.Items.GERMANIUM_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.SILICON_PIECE.get(), TekoraTags.Items.SILICON_BLOCK);
        nineBlockStorageRecipes(pWriter, TekoraItems.TELLURIUM_PIECE.get(), TekoraTags.Items.TELLURIUM_BLOCK);

        crushingRecipe(pWriter, TekoraTags.Items.ALUMINUM, TekoraItems.ALUMINUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.BISMUTH, TekoraItems.BISMUTH_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.CADMIUM, TekoraItems.CADMIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.CHROMIUM, TekoraItems.CHROMIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.COBALT, TekoraItems.COBALT_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.COPPER, TekoraItems.COPPER_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.GOLD, TekoraItems.GOLD_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.INDIUM, TekoraItems.INDIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.IRIDIUM, TekoraItems.IRIDIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.IRON, TekoraItems.IRON_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.LEAD, TekoraItems.LEAD_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.MAGNESIUM, TekoraItems.MAGNESIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.MANGANESE, TekoraItems.MANGANESE_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.MOLYBDENUM, TekoraItems.MOLYBDENUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.NICKEL, TekoraItems.NICKEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.NIOBIUM, TekoraItems.NIOBIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.OSMIUM, TekoraItems.OSMIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.PALLADIUM, TekoraItems.PALLADIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.PLATINUM, TekoraItems.PLATINUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.RHODIUM, TekoraItems.RHODIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.SCANDIUM, TekoraItems.SCANDIUM_PLATE.get());;
        crushingRecipe(pWriter, TekoraTags.Items.SILVER, TekoraItems.SILVER_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.THORIUM, TekoraItems.THORIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.THULIUM, TekoraItems.THULIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.TIN, TekoraItems.TIN_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.TITANIUM, TekoraItems.TITANIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.TUNGSTEN, TekoraItems.TUNGSTEN_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.YTTERBIUM, TekoraItems.YTTERBIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.ZINC, TekoraItems.ZINC_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.ZIRCONIUM, TekoraItems.ZIRCONIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.BRASS, TekoraItems.BRASS_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.BRONZE, TekoraItems.BRONZE_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.CHROMOLY_STEEL, TekoraItems.CHROMOLY_STEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.FERROBORON, TekoraItems.FERROBORON_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.GALVANIZED_STEEL, TekoraItems.GALVANIZED_STEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.HSLA_STEEL, TekoraItems.HSLA_STEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.INCONEL, TekoraItems.INCONEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.INVAR, TekoraItems.INVAR_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.MAGNETIC_NEODYMIUM, TekoraItems.MAGNETIC_NEODYMIUM_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.MU_METAL, TekoraItems.MU_METAL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.REACTOR_STEEL, TekoraItems.REACTOR_STEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.STAINLESS_STEEL, TekoraItems.STAINLESS_STEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.STEEL, TekoraItems.STEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.TUNGSTEN_CARBIDE, TekoraItems.TUNGSTEN_CARBIDE_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.TUNGSTEN_STEEL, TekoraItems.TUNGSTEN_STEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.VANASTEEL, TekoraItems.VANASTEEL_PLATE.get());
        crushingRecipe(pWriter, TekoraTags.Items.ZIRCALOY, TekoraItems.ZIRCALOY_PLATE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TekoraBlocks.ALLOY_FURNACE.get())
                .pattern("111")
                .pattern("121")
                .pattern("000")
                .define('0', Items.SMOOTH_STONE).define('1', TekoraTags.Items.STEEL_INGOT).define('2', Items.FURNACE)
                .unlockedBy(getHasName(Items.FURNACE), has(Items.FURNACE)).save(pWriter);
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredients, ItemLike pResult) {
        oreBlasting(pFinishedRecipeConsumer, List.of(pIngredients), pResult, getItemName(pResult.asItem()));
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, TagKey<Item> pIngredients, ItemLike pResult) {
        oreBlasting(pFinishedRecipeConsumer, pIngredients, pResult, getItemName(pResult.asItem()));
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                     List<ItemLike> pIngredients, ItemLike pResult, String pGroup) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), RecipeCategory.MISC, pResult, 1, 100, RecipeSerializer.BLASTING_RECIPE)
                    .group(getItemName(pResult)).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,
                            Tekora.MODID + ":" + getItemName(pResult) + "_from_blasting_" + getItemName(itemlike));

            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), RecipeCategory.MISC, pResult, 1, 200, RecipeSerializer.SMELTING_RECIPE)
                    .group(getItemName(pResult)).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,
                            Tekora.MODID + ":" + getItemName(pResult) + "_from_smelting_" + getItemName(itemlike));
        }
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                     TagKey<Item> pIngredients, ItemLike pResult, String pGroup) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredients), RecipeCategory.MISC, pResult, 1, 100, RecipeSerializer.BLASTING_RECIPE)
             .group(getItemName(pResult)).unlockedBy(getHasName(pResult), has(pIngredients))
             .save(pFinishedRecipeConsumer,
                     Tekora.MODID + ":" + getItemName(pResult) + "_from_blasting" +
                             pIngredients.location().getPath().replace('/', '_'));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredients), RecipeCategory.MISC, pResult, 1, 200, RecipeSerializer.SMELTING_RECIPE)
                .group(getItemName(pResult)).unlockedBy(getHasName(pResult), has(pIngredients))
                .save(pFinishedRecipeConsumer,
                        Tekora.MODID + ":" + getItemName(pResult) + "_from_smelting" +
                                pIngredients.location().getPath().replace('/', '_'));
    }
    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pWriter,
                                                  ItemLike pResult, TagKey<Item> pInput) {
        nineBlockStorageRecipes(pWriter, pResult, Ingredient.of(pInput), Ingredient.of(pInput).getItems()[0].getItem(), pResult.toString());
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pInput) {
        nineBlockStorageRecipes(pWriter, pResult, Ingredient.of(pInput), pInput, pResult.toString());
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pWriter, ItemLike pResult, Ingredient pInput,
                                                  ItemLike pUnlocker, @Nullable String pGroup) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 9)
                .requires(pInput).group(pGroup)
                .unlockedBy(getHasName(pUnlocker), has(pUnlocker))
                .save(pWriter);
    }

    protected static void storageBlockRecipe(Consumer<FinishedRecipe> pWriter, ItemLike pResult, TagKey<Item> pInput) {
        storageBlockRecipe(pWriter, pResult, Ingredient.of(pInput), Ingredient.of(pInput).getItems()[0].getItem(), pResult.toString());
    }

    protected static void storageBlockRecipe(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pInput) {
        storageBlockRecipe(pWriter, pResult, Ingredient.of(pInput), pInput, pResult.toString());
    }

    protected static void storageBlockRecipe(Consumer<FinishedRecipe> pWriter,
                                             ItemLike pResult, Ingredient pInput, ItemLike pUnlocker, @Nullable String pGroup) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult)
                .requires(pInput, 9).group(pGroup)
                .unlockedBy(getHasName(pUnlocker), has(pUnlocker))
                .save(pWriter, getItemName(pResult) + "_from_components");
    }

    protected static void crushingRecipe(Consumer<FinishedRecipe> pWriter, ItemLike pInput, ItemLike pResult) {
        crushingRecipe(pWriter, Ingredient.of(pInput), pResult);
    }

    protected static void crushingRecipe(Consumer<FinishedRecipe> pWriter, TagKey<Item> pInput, ItemLike pResult) {
        crushingRecipe(pWriter, Ingredient.of(pInput), pResult);
    }

    protected static void crushingRecipe(Consumer<FinishedRecipe> pWriter, Ingredient pInput, ItemLike pResult) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult)
                .requires(pInput).requires(TekoraTags.Items.HAMMER).group(pResult.asItem().toString())
                .unlockedBy(getHasName(TekoraItems.IRON_HAMMER.get()), has(TekoraItems.IRON_HAMMER.get()))
                .save(pWriter, getItemName(pResult) + "_from_hammer");
    }
}