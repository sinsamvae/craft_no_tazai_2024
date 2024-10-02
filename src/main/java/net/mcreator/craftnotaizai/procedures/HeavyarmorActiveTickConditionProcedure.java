package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class HeavyarmorActiveTickConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftNoTaizaiMod.queueServerWork(20, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.LIGHTNING.get()), x, y, z, 1, 0.1, 1.2, 0.1, 0.1);
		});
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 5, false, false));
	}
}
