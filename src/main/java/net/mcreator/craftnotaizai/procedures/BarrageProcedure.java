package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class BarrageProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double delay = 0;
		for (int index0 = 0; index0 < 18; index0++) {
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3, 100, false, false));
			});
			delay = delay + 1.6;
		}
	}
}
