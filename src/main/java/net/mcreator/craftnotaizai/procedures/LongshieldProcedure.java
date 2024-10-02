package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class LongshieldProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double wallWidth = 0;
		double wallHeight = 0;
		double wallLength = 0;
		wallHeight = 3;
		for (int index0 = 0; index0 < 30; index0++) {
			for (int index1 = 0; index1 < 16; index1++) {
				world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.PERFECTSHELLPARTICLE.get()), x, (y + wallHeight), z, 0, 0, 0);
			}
		}
	}
}
