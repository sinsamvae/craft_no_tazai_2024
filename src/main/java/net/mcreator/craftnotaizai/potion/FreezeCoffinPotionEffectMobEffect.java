
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnotaizai.procedures.FreezeCoffinPotionEffectOnEffectActiveTickProcedure;

public class FreezeCoffinPotionEffectMobEffect extends MobEffect {
	public FreezeCoffinPotionEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FreezeCoffinPotionEffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
