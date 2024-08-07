package net.tekoramods.tekora.block.models;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.client.renderer.block.model.ItemOverrides;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.ModelBaker;
import net.minecraft.client.resources.model.ModelState;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.client.model.geometry.IGeometryBakingContext;
import net.minecraftforge.client.model.geometry.IGeometryLoader;
import net.minecraftforge.client.model.geometry.IUnbakedGeometry;
import net.tekoramods.tekora.Tekora;

import java.util.function.Function;

public class CableModel implements IGeometryLoader<CableModel.Geometry> {
    public static final ResourceLocation LOADER = new ResourceLocation(Tekora.MODID, "cableloader");

    public static void register(ModelEvent.RegisterGeometryLoaders event) {
        event.register("cableloader", new CableModel());
    }
    @Override
    public Geometry read(JsonObject jsonObject, JsonDeserializationContext deserializationContext) throws JsonParseException {
        boolean facade = jsonObject.has("facade") && jsonObject.get("facade").getAsBoolean();
        return new Geometry(facade);
    }

    public static class Geometry implements IUnbakedGeometry<Geometry> {
        private final boolean facade;
        public Geometry(boolean facade) {
            this.facade = facade;
        }
        @Override
        public BakedModel bake(IGeometryBakingContext context, ModelBaker baker, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState, ItemOverrides overrides, ResourceLocation modelLocation) {
            return new CableBakedModel(context, this.facade);
        }
    }
}
