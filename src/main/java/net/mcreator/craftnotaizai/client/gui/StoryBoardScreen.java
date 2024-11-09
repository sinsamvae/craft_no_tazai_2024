package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.StoryBoardMenu;
import net.mcreator.craftnotaizai.procedures.Stroy32Procedure;
import net.mcreator.craftnotaizai.procedures.Story9Procedure;
import net.mcreator.craftnotaizai.procedures.Story8Procedure;
import net.mcreator.craftnotaizai.procedures.Story7Procedure;
import net.mcreator.craftnotaizai.procedures.Story6Procedure;
import net.mcreator.craftnotaizai.procedures.Story5Procedure;
import net.mcreator.craftnotaizai.procedures.Story4Procedure;
import net.mcreator.craftnotaizai.procedures.Story3Procedure;
import net.mcreator.craftnotaizai.procedures.Story36Procedure;
import net.mcreator.craftnotaizai.procedures.Story35Procedure;
import net.mcreator.craftnotaizai.procedures.Story34Procedure;
import net.mcreator.craftnotaizai.procedures.Story33Procedure;
import net.mcreator.craftnotaizai.procedures.Story31Procedure;
import net.mcreator.craftnotaizai.procedures.Story30Procedure;
import net.mcreator.craftnotaizai.procedures.Story2Procedure;
import net.mcreator.craftnotaizai.procedures.Story29Procedure;
import net.mcreator.craftnotaizai.procedures.Story28Procedure;
import net.mcreator.craftnotaizai.procedures.Story27Procedure;
import net.mcreator.craftnotaizai.procedures.Story26Procedure;
import net.mcreator.craftnotaizai.procedures.Story25Procedure;
import net.mcreator.craftnotaizai.procedures.Story24Procedure;
import net.mcreator.craftnotaizai.procedures.Story23Procedure;
import net.mcreator.craftnotaizai.procedures.Story22Procedure;
import net.mcreator.craftnotaizai.procedures.Story21Procedure;
import net.mcreator.craftnotaizai.procedures.Story20Procedure;
import net.mcreator.craftnotaizai.procedures.Story1Procedure;
import net.mcreator.craftnotaizai.procedures.Story19Procedure;
import net.mcreator.craftnotaizai.procedures.Story18Procedure;
import net.mcreator.craftnotaizai.procedures.Story17Procedure;
import net.mcreator.craftnotaizai.procedures.Story16Procedure;
import net.mcreator.craftnotaizai.procedures.Story15Procedure;
import net.mcreator.craftnotaizai.procedures.Story14Procedure;
import net.mcreator.craftnotaizai.procedures.Story13Procedure;
import net.mcreator.craftnotaizai.procedures.Story12Procedure;
import net.mcreator.craftnotaizai.procedures.Story11Procedure;
import net.mcreator.craftnotaizai.procedures.Story10Procedure;
import net.mcreator.craftnotaizai.procedures.Start2Procedure;
import net.mcreator.craftnotaizai.procedures.RoylekillcountProcedure;
import net.mcreator.craftnotaizai.procedures.RedDemonKillProcedure;
import net.mcreator.craftnotaizai.procedures.KillGiantVarProcedure;
import net.mcreator.craftnotaizai.procedures.GrayDemonKillProcedure;
import net.mcreator.craftnotaizai.network.StoryBoardButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StoryBoardScreen extends AbstractContainerScreen<StoryBoardMenu> {
	private final static HashMap<String, Object> guistate = StoryBoardMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_magicorb;
	ImageButton imagebutton_scroll;
	ImageButton imagebutton_startbutton;

	public StoryBoardScreen(StoryBoardMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/story_board.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 237 && mouseX < leftPos + 261 && mouseY > topPos + 16 && mouseY < topPos + 40)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.story_board.tooltip_stats"), mouseX, mouseY);
		if (mouseX > leftPos + 237 && mouseX < leftPos + 261 && mouseY > topPos + -8 && mouseY < topPos + 16)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.story_board.tooltip_skills"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/story_gui.png"), this.leftPos + -65, this.topPos + 1, 0, 0, 302, 167, 302, 167);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_start"), 77, 132, -1, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_this_is_a_tale_of_ancient_times"), -54, 12, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_human_and_nonhuman_worlds_were"), -52, 27, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_when_the_holy_knights_defended_t"), -54, 41, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_their_magical_powers_they_were"), -55, 54, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_respected_but_among_them_a_grou"), -56, 71, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_this_is_a_tale_of_ancient_times1"), -55, 79, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_holy_knights_they_were_known_t"), -55, 92, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_this_is_a_tale_of_ancient_times2"), 9, 92, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_land_as_the_seven_deadly_sin"), 0, 109, -16777216, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_twigo"), -55, 61, -13369345, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_seven_deadly_sins"), -53, 12, -16711681, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_youve_met_elizabeth_young_girl"), -55, 26, -16777216, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_seven_deadly_sins"), -54, 40, -16777216, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep2_the_sin_in_the_sleeping_fore"), -54, 12, -16711681, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_go_to_the_sleeping_forest_biome"), -55, 61, -13369345, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_after_the_fight_with_twigo"), -53, 25, -16777216, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_other_memebers_of_the_seven"), -54, 41, -16777216, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep4_a_little_girls_dream"), -54, 12, -16711681, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_dinae_joins_the_mission_to_free"), -53, 26, -16777216, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_baste_dungeon_but_the_group_is"), -52, 41, -16777216, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_set_on_crushing_the_whole_town_a"), -53, 54, -16777216, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_gilthunder"), -55, 68, -16711681, false);
		if (Story4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep5"), -54, 12, -16711681, false);
		if (Story4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_golgiu_tries_to_seize_the_sword"), -56, 35, -16777216, false);
		if (Story4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect"), -55, 61, -16711681, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep5_part_2_even_if_you_should_d"), -54, 12, -16711681, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_sound_of_a_mysterious_bell"), -57, 26, -16777216, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_each_other"), -55, 40, -16777216, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_diane"), -55, 53, -16711681, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_6_part_1the_poem_of_beginnin"), -54, 12, -16711681, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_must_fight_the_holy_knights_frie"), -56, 26, -16777216, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_proceed_to_the_dungeon"), -56, 41, -16777216, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_ruin"), -55, 53, -16711681, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_6_part_2"), -52, 12, -16711681, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_must_fight_the_holy_knights_frie1"), -56, 25, -16777216, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_proceed_to_the_dungeon1"), -56, 40, -16777216, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty"), -54, 54, -16711681, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_7_part_1a_touching_reunion"), -53, 12, -16711681, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty1"), -55, 26, -16777216, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_grizzlys_sins_of_sloth"), -57, 41, -16777216, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_locate_capital_of_the_dead"), -55, 55, -16711681, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_8the_fearsome_pursuer"), -55, 12, -16711681, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_holy_knight_guila_follows_you_to"), -56, 25, -16777216, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_capital_of_the_dead"), -56, 41, -16777216, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_guila"), -54, 55, -16711681, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10"), -55, 12, -16711681, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_upon_learning_the_fighting_festi"), -56, 26, -16777216, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_gideon_you_decide_to_participat"), -56, 40, -16777216, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_howzer_and_griamore"), -55, 53, -16777216, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_all_vaizel_fighting_festi"), -56, 67, -13369345, false);
		if (Story11Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty2"), -55, 12, -16711681, false);
		if (Story11Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_roun_1"), -58, 35, -16777216, false);
		if (Story11Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_taizoo"), -56, 52, -16711681, false);
		if (Story12Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty3"), -55, 12, -16724788, false);
		if (Story12Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_next_challanger_griamore_appears"), -57, 35, -16777216, false);
		if (Story12Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_griamore"), -55, 52, -16711681, false);
		if (Story13Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10the_vaizel_fighting_festiv"), -55, 12, -16724788, false);
		if (Story13Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_thrid_round"), -56, 37, -16777216, false);
		if (Story13Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_howzer"), -56, 53, -16711681, false);
		if (Story14Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10the_vaizel_fighting_festiv1"), -54, 12, -16737895, false);
		if (Story14Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_four_round_challanger_cainbarzad"), -56, 36, -16777216, false);
		if (Story14Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_cain_barzad"), -56, 55, -16711681, false);
		if (Story15Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10the_vaizel_fighting_festiv2"), -55, 12, -16711681, false);
		if (Story15Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_fith_round_challanger_ban_appear"), -55, 27, -16777216, false);
		if (Story15Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_ban"), -56, 55, -16711681, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_11"), -54, 11, -16737895, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_during_the_last_match_of_the_fes"), -56, 25, -16777216, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_out_in_pandemonium_when_a_group"), -56, 40, -16777216, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_have_they_come_for"), -55, 54, -16777216, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_jericho"), -55, 68, -16711681, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_12_bloodcurdling_canon_part"), -54, 12, -16737895, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_during_the_last_match_of_the_fes1"), -56, 26, -16777216, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_out_in_pandemonium_when_a_group1"), -56, 46, -16777216, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_have_they_come_for1"), -55, 54, -16777216, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect1"), -56, 67, -16711681, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_12_bloodcurdling_canon_part1"), -55, 12, -16737895, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_during_the_last_match_of_the_fes2"), -55, 27, -16777216, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_out_in_pandemonium_when_a_group2"), -57, 40, -16777216, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_have_they_come_for2"), -55, 58, -16777216, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_armord_helbram"), -57, 70, -16711681, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_1415_unholy_knight"), -55, 12, -16737895, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_new_search_for_the_remaining"), -55, 26, -16777216, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_holy_knight_helbram_dispatch"), -56, 39, -16777216, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_armor_giant"), -54, 54, -16777216, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_armor_giant"), -55, 68, -16711681, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_1617the_first_sacrifice"), -54, 11, -16724788, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_when_elizabeth_is_kidnapped"), -56, 26, -16777216, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_capital"), -57, 44, -16777216, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_15_royale_gurard"), -55, 68, -16711681, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					RoylekillcountProcedure.execute(entity), -56, 83, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_18_even_if_it_costs_me_my_li"), -54, 12, -16724788, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_has_a_brush_with_dealth_wh"), -55, 27, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_howzer_and_guila_are_forced_into"), -55, 42, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_formidable_magical_powers"), -54, 55, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_dreyfus"), -57, 71, -16711681, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep"), -54, 12, -16724788, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_king_recalls_how_he_met_diane_70"), -57, 26, -16777216, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_evvent_that_occurred_between_him"), -56, 42, -16777216, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_promise_did_these_once_good_frie"), -55, 57, -16777216, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_helbram"), -56, 70, -16711681, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_23_the_courage_charm"), -55, 12, -16724788, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_in_order_to_take_elizabeth_back"), -56, 26, -16777216, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_arthur_to_fight_a_fierce_battle"), -57, 41, -16777216, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_and_gilthunder"), -55, 60, -16777216, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_hendrickson_and_gilthunde"), -56, 75, -16711681, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_21"), -54, 12, -16724788, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_appearance_of_merlin_crushes"), -56, 27, -16777216, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_meliodas_is_reunited_with_elizab"), -56, 43, -16777216, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_kill_someone_in_order_to_resurre"), -57, 58, -16777216, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_corrupted_jericho"), -56, 76, -16711681, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_i_can_do_for_you"), -54, 12, -16724788, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_meliodas_loses_elizabeth_again"), -61, 26, -16777216, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_he_has_to_kill_in_order_to_save"), -59, 41, -16777216, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_and_company_battle_the_new"), -53, 56, -16777216, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_ban_and_helbram"), -54, 74, -16711681, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_22_what_i_can_do_for_you"), -53, 12, -16724788, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_meliodas_loses_elizabeth_again1"), -60, 25, -16777216, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_he_has_to_kill_in_order_to_save1"), -58, 40, -16777216, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_and_company_battle_the_new1"), -55, 57, -16777216, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_ban_and_helbram1"), -56, 73, -16711681, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_23_descent_into_despair"), -54, 12, -16737895, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_discoveries_that_give_him_the_ul"), -56, 48, -16777216, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_bloodred_form_hendrickso"), -57, 78, -16711681, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_chased_by_the_seven_deadly_sins"), -56, 28, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep24_the_heroes"), -54, 12, -16711681, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_when_it_seems_the_seven_deadly_s"), -57, 26, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_will_be_defeated_by_hendrickson"), 130, 27, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_hendricksons_overwhelming_power"), -57, 42, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_power_returns"), -55, 62, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_gray_demon"), -54, 73, -16711681, false);
		if (Story29Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_end"), -59, 11, -16711681, false);
		if (Story29Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_obtain_coffin_of_eternal_darknes"), -56, 70, -13369345, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_revival_of_the_demon_clan"), -57, 12, -16711681, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_as_the_kingdom_begins_to_rebuild"), -58, 26, -16777216, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_king_honors_the_seven_deadly"), -60, 39, -16777216, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_with_a_medal_ceremoney"), -58, 54, -16777216, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_dogedo"), -56, 73, -13369345, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_existence_proof"), -56, 11, -16711681, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_with_fraudrins_manipulation_of"), -56, 27, -16777216, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ten_commandments_return_to_the_p"), -56, 40, -16777216, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_follows_ban_to_the_fairy_kings"), -57, 56, -16777216, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_gowther"), -56, 73, -13369345, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_3the_scared_treasure_lostvay"), -57, 11, -16711681, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_confronts_gowther_after_he"), -58, 26, -16777216, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_zeals_memories_with_the_return"), -56, 40, -16777216, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_threats_descend_upon_allied_clan"), -56, 57, -16777216, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_albion"), -56, 72, -13369345, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_3the_scared_treasure_lostvay1"), -57, 12, -16711681, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_king_struggles_to_fend_off_the_g"), -57, 26, -16777216, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_destory_the_fairy_kings_forest"), -58, 41, -16777216, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_commandments_appears_before_meli"), -58, 57, -16777216, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_tall_albion"), -56, 85, -13369345, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_go_to_the_fairy_king_forest_biom"), -57, 71, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_5_overwhelming_violence"), -57, 12, -16711681, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_fairies_reconcile_their_diff"), -58, 26, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_leaves_the_forest_meanwhile_me"), -59, 41, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_overwhelmed_by_the_sheer_power_o"), -57, 57, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_galand"), -56, 75, -13369345, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_6_the_chief_holy_knight_aton"), -57, 11, -16711681, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_hendrickson_thought_to_have_bee"), -57, 25, -16777216, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_against_meliodas_aids_gilthunde"), -59, 40, -16777216, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_against_a_powerful_gray_demon"), -59, 58, -16777216, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat"), -56, 76, -13369345, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					RedDemonKillProcedure.execute(entity), -56, 95, -13369345, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GrayDemonKillProcedure.execute(entity), -56, 108, -13369345, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_7_where_memories_lead"), -57, 12, -16711681, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_an_injured_diane_awakens_having"), -60, 26, -16777216, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_comrades_with_her_memories_fadi"), -59, 41, -16777216, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_megadoza_home_of_the_giant_clan"), -57, 58, -16777216, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_15_giants"), -56, 75, -13369345, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					KillGiantVarProcedure.execute(entity), -56, 94, -13369345, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_magicorb = new ImageButton(this.leftPos + 237, this.topPos + 0, 15, 15, 0, 0, 15, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_magicorb.png"), 15, 30, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new StoryBoardButtonMessage(0, x, y, z));
				StoryBoardButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_magicorb", imagebutton_magicorb);
		this.addRenderableWidget(imagebutton_magicorb);
		imagebutton_scroll = new ImageButton(this.leftPos + 237, this.topPos + 16, 15, 15, 0, 0, 15, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_scroll.png"), 15, 30, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new StoryBoardButtonMessage(1, x, y, z));
				StoryBoardButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_scroll", imagebutton_scroll);
		this.addRenderableWidget(imagebutton_scroll);
		imagebutton_startbutton = new ImageButton(this.leftPos + 58, this.topPos + 128, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_startbutton.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new StoryBoardButtonMessage(2, x, y, z));
				StoryBoardButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_startbutton", imagebutton_startbutton);
		this.addRenderableWidget(imagebutton_startbutton);
	}
}
