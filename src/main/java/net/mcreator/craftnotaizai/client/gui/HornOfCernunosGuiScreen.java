package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.HornOfCernunosGuiMenu;
import net.mcreator.craftnotaizai.procedures.ShowHornOfCernunnosProcedure;
import net.mcreator.craftnotaizai.procedures.SetDialogsHornOfCernunnosProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HornOfCernunosGuiScreen extends AbstractContainerScreen<HornOfCernunosGuiMenu> {
	private final static HashMap<String, Object> guistate = HornOfCernunosGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public HornOfCernunosGuiScreen(HornOfCernunosGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/horn_of_cernunos_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ShowHornOfCernunnosProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -149, this.topPos + 25, 30, 0f, 0, livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/black.png"), this.leftPos + -527, this.topPos + -374, 0, 0, 1920, 1080, 1920, 1080);

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
		guiGraphics.drawString(this.font,

				SetDialogsHornOfCernunnosProcedure.execute(entity), -57, -22, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
