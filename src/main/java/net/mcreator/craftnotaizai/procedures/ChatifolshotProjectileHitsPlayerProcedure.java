package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class ChatifolshotProjectileHitsPlayerProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		if (!(entity == sourceentity)) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
