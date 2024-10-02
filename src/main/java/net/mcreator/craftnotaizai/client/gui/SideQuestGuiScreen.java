package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.SideQuestGuiMenu;
import net.mcreator.craftnotaizai.procedures.SideQuestVarProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SideQuestGuiScreen extends AbstractContainerScreen<SideQuestGuiMenu> {
	private final static HashMap<String, Object> guistate = SideQuestGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SideQuestGuiScreen(SideQuestGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/side_quest_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/tab.png"), this.leftPos + 88, this.topPos + -64, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/tab.png"), this.leftPos + 88, this.topPos + -42, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/tab.png"), this.leftPos + 89, this.topPos + -21, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/side_quest.png"), this.leftPos + -98, this.topPos + -92, 0, 0, 195, 175, 195, 175);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.side_quest_gui.label_quest"), -16, -80, -1, false);
		guiGraphics.drawString(this.font,

				SideQuestVarProcedure.execute(entity), -88, -65, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
