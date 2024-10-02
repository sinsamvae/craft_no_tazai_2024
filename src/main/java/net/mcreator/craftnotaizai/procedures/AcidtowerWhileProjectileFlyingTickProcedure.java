package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class AcidtowerWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double delay = 0;
		double rep = 0;
		entity.getPersistentData().putDouble("rD", 1);
		entity.getPersistentData().putDouble("repD", 0);
		for (int index0 = 0; index0 < 70; index0++) {
			delay = delay + 0.1;
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				entity.getPersistentData().putDouble("rD", (entity.getPersistentData().getDouble("rD") + 0.1));
				for (int index1 = 0; index1 < (int) (60 * entity.getPersistentData().getDouble("rD")); index1++) {
					entity.getPersistentData().putDouble("repD", (entity.getPersistentData().getDouble("repD") + (2 * Math.PI) / (60 * entity.getPersistentData().getDouble("rD"))));
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.ACID.get()), (entity.getX() + Math.sin(entity.getPersistentData().getDouble("repD")) * entity.getPersistentData().getDouble("rD")),
								(entity.getY() + Math.sin(entity.getPersistentData().getDouble("rD"))), (entity.getZ() + Math.cos(entity.getPersistentData().getDouble("repD")) * entity.getPersistentData().getDouble("rD")), 5, 0.1, 0.1, 0.1, 0);
					ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
				}
			});
		}
	}
}
