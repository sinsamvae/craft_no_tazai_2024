
package net.mcreator.craftnotaizai.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.procedures.RhittaReturnProcedure;
import net.mcreator.craftnotaizai.procedures.RhittaCountProcedure;
import net.mcreator.craftnotaizai.procedures.LostVayneVarProcedure;
import net.mcreator.craftnotaizai.procedures.LostVayneOverlayProcedure;
import net.mcreator.craftnotaizai.procedures.DisplayComboStarHitProcedure;
import net.mcreator.craftnotaizai.procedures.ComboStarVarProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ComboStarHitOverlay {
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
		if (true) {
			if (DisplayComboStarHitProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ComboStarVarProcedure.execute(entity), 5, h - 16, -1, false);
			if (LostVayneOverlayProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						LostVayneVarProcedure.execute(entity), 5, h - 16, -1, false);
			if (RhittaReturnProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						RhittaCountProcedure.execute(entity), 5, h - 16, -1, false);
		}
	}
}
