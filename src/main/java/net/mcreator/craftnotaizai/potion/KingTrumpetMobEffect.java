
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnotaizai.procedures.KingTrumpetEffectStartedappliedProcedure;
import net.mcreator.craftnotaizai.procedures.KingTrumpetEffectExpiresProcedure;

public class KingTrumpetMobEffect extends MobEffect {
	public KingTrumpetMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407668);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		KingTrumpetEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		KingTrumpetEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
