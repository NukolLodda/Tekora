package net.nukollodda.tekora.client.screens;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.nukollodda.tekora.Tekora;
import net.nukollodda.tekora.menu.ElectricFurnaceMenu;

public class ElectricFurnaceScreen extends AbstractContainerScreen<ElectricFurnaceMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Tekora.MODID, "textures/screens/electric_blaster_gui.png");

    public ElectricFurnaceScreen(ElectricFurnaceMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(GuiGraphics pGraphics, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f,1.0f,1.0f,1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        pGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight); // renders texture

        renderProgressArrow(pGraphics, x, y);
        renderElectricityAmount(pGraphics, x, y);
    }

    private void renderProgressArrow(GuiGraphics pGraphics, int x, int y) {
        if (menu.isCrafting()) {
            pGraphics.blit(TEXTURE, x + 79, y + 27, 176, 0, menu.getScaledProgress(), 17);
        }
    }

    private void renderElectricityAmount(GuiGraphics pGraphics, int x, int y) {
        pGraphics.blit(TEXTURE, x + 100, y + 55 + (38 - menu.getElectricityAmt()), 176, 52 - menu.getElectricityAmt(), 14, menu.getElectricityAmt());
    }

    @Override
    public void render(GuiGraphics pGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pGraphics);
        super.render(pGraphics, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pGraphics, pMouseX, pMouseY);
    }
}