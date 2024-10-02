
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnotaizai.procedures.JackPotionEffectStartedappliedProcedure;

public class JackPotionMobEffect extends MobEffect {
	public JackPotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		JackPotionEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
