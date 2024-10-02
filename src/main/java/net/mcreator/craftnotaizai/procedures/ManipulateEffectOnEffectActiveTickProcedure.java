package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class ManipulateEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double a = 0;
		double r = 0;
		double b = 0;
		r = 1.5;
		a = Math.random() * 12;
		b = 90;
		for (int index0 = 0; index0 < 30; index0++) {
			for (int index1 = 0; index1 < 16; index1++) {
				world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WHITE.get()), (x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))), ((y + 1) - r * Math.sin(Math.toRadians(b))),
						(z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 0, 0, 0);
				b = b + 12;
			}
			b = 90;
			a = a + 12;
		}
	}
}
