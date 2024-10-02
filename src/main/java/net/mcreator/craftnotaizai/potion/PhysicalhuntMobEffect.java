
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PhysicalhuntMobEffect extends MobEffect {
	public PhysicalhuntMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
