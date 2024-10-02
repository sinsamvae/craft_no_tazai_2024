package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.HumanClanMenu;
import net.mcreator.craftnotaizai.network.HumanClanButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HumanClanScreen extends AbstractContainerScreen<HumanClanMenu> {
	private final static HashMap<String, Object> guistate = HumanClanMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_overarrow;
	ImageButton imagebutton_overarrow2;
	ImageButton imagebutton_select;

	public HumanClanScreen(HumanClanMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/human_clan.png");

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

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/orvmenu.png"), this.leftPos + -108, this.topPos + -104, 0, 0, 196, 186, 196, 186);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/deadly-sins-retribution-tier-list-12-removebg-preview.png"), this.leftPos + -90, this.topPos + -76, 0, 0, 42, 42, 42, 42);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/humanbar.png"), this.leftPos + -43, this.topPos + -86, 0, 0, 115, 33, 115, 33);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/13903025e1f60ee6711c42900368b533da068b25da39a3ee5e6b4b0d3255bfef95601890afd80709da39a3ee5e6b4b0d3255bfef95601890afd80709c58f8eb180a04ede88a426bcd54c2e35.png"),
				this.leftPos + -20, this.topPos + -80, 0, 0, 76, 23, 76, 23);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.human_clan.label_stats"), -81, -36, -65485, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.human_clan.label_30_health"), -84, -25, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.human_clan.label_50_strength"), -85, -11, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.human_clan.label_40_spirit"), -84, 4, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.human_clan.label_15_magic_damage"), -84, 19, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.human_clan.label_magic"), -83, 33, -65485, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.human_clan.label_random_200_to_500"), -84, 46, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_overarrow = new ImageButton(this.leftPos + -123, this.topPos + -14, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new HumanClanButtonMessage(0, x, y, z));
				HumanClanButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overarrow", imagebutton_overarrow);
		this.addRenderableWidget(imagebutton_overarrow);
		imagebutton_overarrow2 = new ImageButton(this.leftPos + 87, this.topPos + -14, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow2.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new HumanClanButtonMessage(1, x, y, z));
				HumanClanButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overarrow2", imagebutton_overarrow2);
		this.addRenderableWidget(imagebutton_overarrow2);
		imagebutton_select = new ImageButton(this.leftPos + -35, this.topPos + 83, 48, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_select.png"), 48, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new HumanClanButtonMessage(2, x, y, z));
				HumanClanButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_select", imagebutton_select);
		this.addRenderableWidget(imagebutton_select);
	}
}