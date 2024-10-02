package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class JackPotionEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
	}
}
