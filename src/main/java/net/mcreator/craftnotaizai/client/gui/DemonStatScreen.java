package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.DemonStatMenu;
import net.mcreator.craftnotaizai.procedures.UCVarProcedure;
import net.mcreator.craftnotaizai.procedures.TPProcedure;
import net.mcreator.craftnotaizai.procedures.StrvarProcedure;
import net.mcreator.craftnotaizai.procedures.RaceVarProcedure;
import net.mcreator.craftnotaizai.procedures.PowerPercentageProcedure;
import net.mcreator.craftnotaizai.procedures.ManavarProcedure;
import net.mcreator.craftnotaizai.procedures.ManapowerProcedure;
import net.mcreator.craftnotaizai.procedures.MagicVarProcedure;
import net.mcreator.craftnotaizai.procedures.HumanimageProcedure;
import net.mcreator.craftnotaizai.procedures.HpvarProcedure;
import net.mcreator.craftnotaizai.procedures.GetXPProcedure;
import net.mcreator.craftnotaizai.procedures.GetLevelProcedure;
import net.mcreator.craftnotaizai.procedures.GaintimageProcedure;
import net.mcreator.craftnotaizai.procedures.FairyimageProcedure;
import net.mcreator.craftnotaizai.procedures.DisplaynameProcedure;
import net.mcreator.craftnotaizai.procedures.DemonimageProcedure;
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
	ImageButton imagebutton_demon;
	ImageButton imagebutton_fairy2;
	ImageButton imagebutton_human;
	ImageButton imagebutton_statplusbutton;
	ImageButton imagebutton_statplusbutton1;
	ImageButton imagebutton_statplusbutton2;
	ImageButton imagebutton_statplusbutton3;
	ImageButton imagebutton_statplusbutton4;
	ImageButton imagebutton_storybook2;
	ImageButton imagebutton_magicorb;
	ImageButton imagebutton_overarrow2;
	ImageButton imagebutton_overarrow;

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
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 86 && mouseX < leftPos + 110 && mouseY > topPos + -25 && mouseY < topPos + -1)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.demon_stat.tooltip_skills"), mouseX, mouseY);
		if (mouseX > leftPos + 86 && mouseX < leftPos + 110 && mouseY > topPos + -49 && mouseY < topPos + -25)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.demon_stat.tooltip_story"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/tab.png"), this.leftPos + 85, this.topPos + -29, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/tab.png"), this.leftPos + 85, this.topPos + -50, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/orvmenu.png"), this.leftPos + -103, this.topPos + -93, 0, 0, 196, 186, 196, 186);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/lostvayne.png"), this.leftPos + -241, this.topPos + -151, 0, 0, 575, 575, 575, 575);

		if (GaintimageProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/image_1.png"), this.leftPos + 31, this.topPos + 24, 0, 0, 50, 50, 50, 50);
		}
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

				RaceVarProcedure.execute(entity), -93, -58, -1, false);
		guiGraphics.drawString(this.font,

				GetXPProcedure.execute(entity), 19, -68, -1, false);
		guiGraphics.drawString(this.font,

				GetLevelProcedure.execute(entity), 19, -81, -1, false);
		guiGraphics.drawString(this.font,

				ManavarProcedure.execute(entity), -79, 47, -1, false);
		guiGraphics.drawString(this.font,

				StrvarProcedure.execute(entity), -80, -7, -1, false);
		guiGraphics.drawString(this.font,

				HpvarProcedure.execute(entity), -80, 11, -1, false);
		guiGraphics.drawString(this.font,

				TPProcedure.execute(entity), 18, -56, -1, false);
		guiGraphics.drawString(this.font,

				MagicVarProcedure.execute(entity), -93, -40, -1, false);
		guiGraphics.drawString(this.font,

				DisplaynameProcedure.execute(entity), -94, -74, -1, false);
		guiGraphics.drawString(this.font,

				UCVarProcedure.execute(entity), -26, 72, -1, false);
		guiGraphics.drawString(this.font,

				AgilityVarProcedure.execute(entity), -80, 30, -1, false);
		guiGraphics.drawString(this.font,

				PowerPercentageProcedure.execute(entity), -64, -100, -1, false);
		guiGraphics.drawString(this.font,

				ManapowerProcedure.execute(entity), -79, 58, -1, false);
		if (CommandmentReturnProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					CommandmentVarProcedure.execute(entity), -94, -24, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_demon = new ImageButton(this.leftPos + 30, this.topPos + 24, 50, 50, 0, 0, 50, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_demon.png"), 50, 100, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (DemonimageProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_demon", imagebutton_demon);
		this.addRenderableWidget(imagebutton_demon);
		imagebutton_fairy2 = new ImageButton(this.leftPos + 31, this.topPos + 25, 50, 50, 0, 0, 50, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_fairy2.png"), 50, 100, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (FairyimageProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_fairy2", imagebutton_fairy2);
		this.addRenderableWidget(imagebutton_fairy2);
		imagebutton_human = new ImageButton(this.leftPos + 30, this.topPos + 24, 50, 50, 0, 0, 50, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_human.png"), 50, 100, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (HumanimageProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_human", imagebutton_human);
		this.addRenderableWidget(imagebutton_human);
		imagebutton_statplusbutton = new ImageButton(this.leftPos + -94, this.topPos + -9, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(3, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton", imagebutton_statplusbutton);
		this.addRenderableWidget(imagebutton_statplusbutton);
		imagebutton_statplusbutton1 = new ImageButton(this.leftPos + -94, this.topPos + 9, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton1.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(4, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton1", imagebutton_statplusbutton1);
		this.addRenderableWidget(imagebutton_statplusbutton1);
		imagebutton_statplusbutton2 = new ImageButton(this.leftPos + -94, this.topPos + 45, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton2.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(5, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton2", imagebutton_statplusbutton2);
		this.addRenderableWidget(imagebutton_statplusbutton2);
		imagebutton_statplusbutton3 = new ImageButton(this.leftPos + -40, this.topPos + 70, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton3.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(6, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton3", imagebutton_statplusbutton3);
		this.addRenderableWidget(imagebutton_statplusbutton3);
		imagebutton_statplusbutton4 = new ImageButton(this.leftPos + -94, this.topPos + 27, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton4.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(7, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_statplusbutton4", imagebutton_statplusbutton4);
		this.addRenderableWidget(imagebutton_statplusbutton4);
		imagebutton_storybook2 = new ImageButton(this.leftPos + 87, this.topPos + -48, 15, 15, 0, 0, 15, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_storybook2.png"), 15, 30, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(8, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_storybook2", imagebutton_storybook2);
		this.addRenderableWidget(imagebutton_storybook2);
		imagebutton_magicorb = new ImageButton(this.leftPos + 88, this.topPos + -27, 15, 15, 0, 0, 15, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_magicorb.png"), 15, 30, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(9, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_magicorb", imagebutton_magicorb);
		this.addRenderableWidget(imagebutton_magicorb);
		imagebutton_overarrow2 = new ImageButton(this.leftPos + 60, this.topPos + -104, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow2.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(10, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overarrow2", imagebutton_overarrow2);
		this.addRenderableWidget(imagebutton_overarrow2);
		imagebutton_overarrow = new ImageButton(this.leftPos + -83, this.topPos + -104, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonStatButtonMessage(11, x, y, z));
				DemonStatButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overarrow", imagebutton_overarrow);
		this.addRenderableWidget(imagebutton_overarrow);
	}
}
