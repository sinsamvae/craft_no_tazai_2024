package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.DemonStatMenu;
import net.mcreator.craftnotaizai.procedures.UCVarProcedure;
import net.mcreator.craftnotaizai.procedures.TPProcedure;
import net.mcreator.craftnotaizai.procedures.StrvarProcedure;
import net.mcreator.craftnotaizai.procedures.ReturnEnitiyProcedure;
import net.mcreator.craftnotaizai.procedures.RaceVarProcedure;
import net.mcreator.craftnotaizai.procedures.ManavarProcedure;
import net.mcreator.craftnotaizai.procedures.ManapowerProcedure;
import net.mcreator.craftnotaizai.procedures.MagicVarProcedure;
import net.mcreator.craftnotaizai.procedures.HpvarProcedure;
import net.mcreator.craftnotaizai.procedures.GetXPProcedure;
import net.mcreator.craftnotaizai.procedures.GetLevelProcedure;
import net.mcreator.craftnotaizai.procedures.DisplaynameProcedure;
import net.mcreator.craftnotaizai.procedures.CommandmentVarProcedure;
import net.mcreator.craftnotaizai.procedures.CommandmentReturnProcedure;
import net.mcreator.craftnotaizai.procedures.AgilityVarProcedure;
import net.mcreator.craftnotaizai.network.DemonStatButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DemonStatScreen extends AbstractContainerScreen<DemonStatMenu> {
	private final static HashMap<String, Object> guistate = DemonStatMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_statplusbutton;
	ImageButton imagebutton_statplusbutton1;
	ImageButton imagebutton_statplusbutton2;
	ImageButton imagebutton_statplusbutton3;
	ImageButton imagebutton_statplusbutton4;
	ImageButton imagebutton_magicorb;
	ImageButton imagebutton_storybook2;

	public DemonStatScreen(DemonStatMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/demon_stat.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnEnitiyProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 54, this.topPos + 24, 35, 0f + (float) Math.atan((this.leftPos + 54 - mouseX) / 40.0), (float) Math.atan((this.topPos + -25 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 103 && mouseX < leftPos + 127 && mouseY > topPos + -90 && mouseY < topPos + -66)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.demon_stat.tooltip_skills"), mouseX, mouseY);
		if (mouseX > leftPos + 103 && mouseX < leftPos + 127 && mouseY > topPos + -114 && mouseY < topPos + -90)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.demon_stat.tooltip_story"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/gui.png"), this.leftPos + -93, this.topPos + -104, 0, 0, 196, 186, 196, 186);

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

				RaceVarProcedure.execute(entity), -93, -92, -1, false);
		guiGraphics.drawString(this.font,

				GetXPProcedure.execute(entity), 41, -92, -1, false);
		guiGraphics.drawString(this.font,

				GetLevelProcedure.execute(entity), 40, -104, -1, false);
		guiGraphics.drawString(this.font,

				ManavarProcedure.execute(entity), -79, 16, -1, false);
		guiGraphics.drawString(this.font,

				StrvarProcedure.execute(entity), -79, -28, -1, false);
		guiGraphics.drawString(this.font,

				HpvarProcedure.execute(entity), -79, -13, -1, false);
		guiGraphics.drawString(this.font,

				TPProcedure.execute(entity), 41, -80, -1, false);
		guiGraphics.drawString(this.font,

				MagicVarProcedure.execute(entity), -93, -80, -1, false);
		guiGraphics.drawString(this.font,

				DisplaynameProcedure.execute(entity), -93, -104, -1, false);
		guiGraphics.drawString(this.font,

				UCVarProcedure.execute(entity), -4, 70, -1, false);
		guiGraphics.drawString(this.font,

				AgilityVarProcedure.execute(entity), -80, 2, -1, false);
		guiGraphics.drawString(this.font,

				ManapowerProcedure.execute(entity), -80, 27, -1, false);
		if (CommandmentReturnProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					CommandmentVarProcedure.execute(entity), -93, -67, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_statplusbutton = new ImageButton(this.leftPos + -93, this.topPos + -30, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(0, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton", imagebutton_statplusbutton);
		this.addRenderableWidget(imagebutton_statplusbutton);
		imagebutton_statplusbutton1 = new ImageButton(this.leftPos + -93, this.topPos + -15, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton1.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(1, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton1", imagebutton_statplusbutton1);
		this.addRenderableWidget(imagebutton_statplusbutton1);
		imagebutton_statplusbutton2 = new ImageButton(this.leftPos + -93, this.topPos + 14, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton2.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(2, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton2", imagebutton_statplusbutton2);
		this.addRenderableWidget(imagebutton_statplusbutton2);
		imagebutton_statplusbutton3 = new ImageButton(this.leftPos + -17, this.topPos + 68, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton3.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(3, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton3", imagebutton_statplusbutton3);
		this.addRenderableWidget(imagebutton_statplusbutton3);
		imagebutton_statplusbutton4 = new ImageButton(this.leftPos + -93, this.topPos + 0, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton4.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(4, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton4", imagebutton_statplusbutton4);
		this.addRenderableWidget(imagebutton_statplusbutton4);
		imagebutton_magicorb = new ImageButton(this.leftPos + 103, this.topPos + -89, 15, 15, 0, 0, 15, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_magicorb.png"), 15, 30, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(5, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_magicorb", imagebutton_magicorb);
		this.addRenderableWidget(imagebutton_magicorb);
		imagebutton_storybook2 = new ImageButton(this.leftPos + 103, this.topPos + -104, 15, 15, 0, 0, 15, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_storybook2.png"), 15, 30, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(6, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_storybook2", imagebutton_storybook2);
		this.addRenderableWidget(imagebutton_storybook2);
	}
}
