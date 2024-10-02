package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GeckolibKrakenNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if ((world instanceof Level _lvl0 && _lvl0.isDay()) == true || (world instanceof Level _lvl1 && _lvl1.isDay()) == false) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ocean")) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("warm_ocean"))
					&& world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_ocean"))) {
				return true;
			}
		}
		return false;
	}
}
