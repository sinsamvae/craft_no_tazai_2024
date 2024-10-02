
package net.mcreator.craftnotaizai.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.procedures.OverlayShowProcedure;
import net.mcreator.craftnotaizai.procedures.Manabar90Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar80Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar70Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar60Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar50Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar40Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar30Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar20Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar10Procedure;
import net.mcreator.craftnotaizai.procedures.Manabar100Procedure;
import net.mcreator.craftnotaizai.procedures.ManaReturnProcedure;
import net.mcreator.craftnotaizai.procedures.HumanimageProcedure;
import net.mcreator.craftnotaizai.procedures.HpbarprograssProcedure;
import net.mcreator.craftnotaizai.procedures.Hpbar90Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar80Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar70Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar60Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar50Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar40Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar30Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar20Procedure;
import net.mcreator.craftnotaizai.procedures.Hpbar100iProcedure;
import net.mcreator.craftnotaizai.procedures.HealthVarProcedure;
import net.mcreator.craftnotaizai.procedures.GetXPProcedure;
import net.mcreator.craftnotaizai.procedures.GetLevelProcedure;
import net.mcreator.craftnotaizai.procedures.GaintimageProcedure;
import net.mcreator.craftnotaizai.procedures.FairyimageProcedure;
import net.mcreator.craftnotaizai.procedures.DemonimageProcedure;
import net.mcreator.craftnotaizai.procedures.BPProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class OverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (OverlayShowProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpandmanabar.png"), -4, -4, 0, 0, 170, 55, 170, 55);

			if (FairyimageProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/fairy2.png"), 9, 12, 0, 0, 25, 25, 25, 25);
			}
			if (HumanimageProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/human.png"), 9, 12, 0, 0, 25, 25, 25, 25);
			}
			if (GaintimageProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/human.png"), 9, 12, 0, 0, 25, 25, 25, 25);
			}
			if (DemonimageProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/demon.png"), 9, 12, 0, 0, 25, 25, 25, 25);
			}
			if (HpbarprograssProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar1.png"), -5, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar2.png"), -5, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar30Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar3.png"), -6, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar40Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar4.png"), -7, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar50Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar5.png"), -8, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar60Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar6.png"), -9, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar70Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar7.png"), -10, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar80Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar8.png"), -11, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar90Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar9.png"), -12, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Hpbar100iProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/hpbar10.png"), -6, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar1.png"), -4, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar2.png"), -5, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar30Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar3.png"), -6, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar40Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar4.png"), -7, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar50Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar5.png"), -8, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar60Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar6.png"), -9, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar70Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar7.png"), -10, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar80Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar8.png"), -11, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar90Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/manabar9.png"), -10, -3, 0, 0, 170, 55, 170, 55);
			}
			if (Manabar100Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/fullhpandmanabar-removebg-preview.png"), -6, -3, 0, 0, 170, 55, 170, 55);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetXPProcedure.execute(entity), 101, 40, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetLevelProcedure.execute(entity), 37, 39, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					HealthVarProcedure.execute(entity), 65, 18, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ManaReturnProcedure.execute(entity), 65, 28, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					BPProcedure.execute(entity), 55, 4, -16768013, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
