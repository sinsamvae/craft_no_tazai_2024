package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class DivineSlashWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double delay = 0;
		immediatesourceentity.setNoGravity(true);
		CraftNoTaizaiMod.queueServerWork(100, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
		entity.getPersistentData().putDouble("range", 0);
		entity.getPersistentData().putDouble("sx", (entity.getX()));
		entity.getPersistentData().putDouble("sy", (entity.getY() + 1.2));
		entity.getPersistentData().putDouble("sz", (entity.getZ()));
		entity.getPersistentData().putDouble("tx",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
		entity.getPersistentData().putDouble("ty",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
		entity.getPersistentData().putDouble("tz",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
		entity.getPersistentData().putDouble("range", Math.sqrt(Math.pow(entity.getPersistentData().getDouble("sx") - entity.getPersistentData().getDouble("tx"), 2)
				+ Math.pow(entity.getPersistentData().getDouble("sy") - entity.getPersistentData().getDouble("ty"), 2) + Math.pow(entity.getPersistentData().getDouble("sz") - entity.getPersistentData().getDouble("tz"), 2)));
		entity.getPersistentData().putDouble("x+", ((entity.getPersistentData().getDouble("sx") - entity.getPersistentData().getDouble("tx")) / entity.getPersistentData().getDouble("range")));
		entity.getPersistentData().putDouble("y+", ((entity.getPersistentData().getDouble("sy") - entity.getPersistentData().getDouble("ty")) / entity.getPersistentData().getDouble("range")));
		entity.getPersistentData().putDouble("z+", ((entity.getPersistentData().getDouble("sz") - entity.getPersistentData().getDouble("tz")) / entity.getPersistentData().getDouble("range")));
		entity.getPersistentData().putDouble("size", 0);
		for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("range") * 5); index0++) {
			delay = delay + 0.5;
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				entity.getPersistentData().putDouble("size", (entity.getPersistentData().getDouble("size") + 0.05));
				entity.getPersistentData().putDouble("sx", (entity.getPersistentData().getDouble("sx") + entity.getPersistentData().getDouble("x+") * (-0.2)));
				entity.getPersistentData().putDouble("sy", (entity.getPersistentData().getDouble("sy") + entity.getPersistentData().getDouble("y+") * (-0.2)));
				entity.getPersistentData().putDouble("sz", (entity.getPersistentData().getDouble("sz") + entity.getPersistentData().getDouble("z+") * (-0.2)));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.HUNTER_WISPPARTICLE.get()), x, y, z, 4, 0.02, 0.02, 0.02, 0);
				ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
			});
		}
	}
}
