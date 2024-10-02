package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class GoddassOreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.GODDESS_AMBER_SHARD.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
