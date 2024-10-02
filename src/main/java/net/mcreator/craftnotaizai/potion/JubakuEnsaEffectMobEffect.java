
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnotaizai.procedures.JubakuEnsaEffectOnEffectActiveTickProcedure;
import net.mcreator.craftnotaizai.procedures.JubakuEnsaEffectEffectStartedappliedProcedure;

public class JubakuEnsaEffectMobEffect extends MobEffect {
	public JubakuEnsaEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		JubakuEnsaEffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		JubakuEnsaEffectOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
