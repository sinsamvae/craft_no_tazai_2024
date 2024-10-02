
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnotaizai.procedures.FrezzeOnEffectActiveTickProcedure;

public class FrezzeMobEffect extends MobEffect {
	public FrezzeMobEffect() {
		super(MobEffectCategory.HARMFUL, -10027009);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FrezzeOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
