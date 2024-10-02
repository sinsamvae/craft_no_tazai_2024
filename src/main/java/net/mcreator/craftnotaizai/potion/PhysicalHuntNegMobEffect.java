
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PhysicalHuntNegMobEffect extends MobEffect {
	public PhysicalHuntNegMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
