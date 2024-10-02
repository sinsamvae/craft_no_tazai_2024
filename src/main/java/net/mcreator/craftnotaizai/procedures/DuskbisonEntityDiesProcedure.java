package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class DuskbisonEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double drop = 0;
		double drop3 = 0;
		double drop2 = 0;
		if (entity.isOnFire()) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.COOKED_DUSK_MEAT.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.UNCOOKED_DUSK.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
