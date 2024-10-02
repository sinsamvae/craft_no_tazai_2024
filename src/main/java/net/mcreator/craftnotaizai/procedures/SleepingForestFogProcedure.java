package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SleepingForestFogProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("craft_no_taizai:sleeping_forest"))) {
		}
	}
}
