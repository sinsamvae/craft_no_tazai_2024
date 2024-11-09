package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class SunflowerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double height = 0;
		CraftNoTaizaiMod.queueServerWork(30, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
