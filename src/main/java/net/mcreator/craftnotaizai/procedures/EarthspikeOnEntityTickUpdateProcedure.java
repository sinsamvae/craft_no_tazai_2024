package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class EarthspikeOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftNoTaizaiMod.queueServerWork(125, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
