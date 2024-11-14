package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CloverOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double tradeNumber = 0;
		tradeNumber = Mth.nextInt(RandomSource.create(), 1, 150);
		if (tradeNumber <= 15) {
			entity.getPersistentData().putDouble("tradeCount1", 1);
		}
		if (tradeNumber >= 15 && tradeNumber <= 35) {
			entity.getPersistentData().putDouble("tradeCount1", 2);
		}
		if (tradeNumber >= 35 && tradeNumber <= 65) {
			entity.getPersistentData().putDouble("tradeCount1", 3);
		}
		if (tradeNumber >= 65 && tradeNumber <= 100) {
			entity.getPersistentData().putDouble("tradeCount1", 4);
		}
		if (tradeNumber >= 100 && tradeNumber <= 150) {
			entity.getPersistentData().putDouble("tradeCount1", 5);
		}
	}
}
