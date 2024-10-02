package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.world.inventory.TeleportationGuiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TeleportationGuiScreen extends AbstractContainerScreen<TeleportationGuiMenu> {
	private final static HashMap<String, Object> guistate = TeleportationGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox X;
	EditBox Z;

	public TeleportationGuiScreen(TeleportationGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/teleportation_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		X.render(guiGraphics, mouseX, mouseY, partialTicks);
		Z.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (X.isFocused())
			return X.keyPressed(key, b, c);
		if (Z.isFocused())
			return Z.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		X.tick();
		Z.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String XValue = X.getValue();
		String ZValue = Z.getValue();
		super.resize(minecraft, width, height);
		X.setValue(XValue);
		Z.setValue(ZValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		X = new EditBox(this.font, this.leftPos + 29, this.topPos + 55, 118, 18, Component.translatable("gui.craft_no_taizai.teleportation_gui.X"));
		X.setMaxLength(32767);
		guistate.put("text:X", X);
		this.addWidget(this.X);
		Z = new EditBox(this.font, this.leftPos + 29, this.topPos + 90, 118, 18, Component.translatable("gui.craft_no_taizai.teleportation_gui.Z"));
		Z.setMaxLength(32767);
		guistate.put("text:Z", Z);
		this.addWidget(this.Z);
	}
}
