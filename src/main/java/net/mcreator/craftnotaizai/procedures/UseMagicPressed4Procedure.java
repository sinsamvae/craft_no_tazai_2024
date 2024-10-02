package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class UseMagicPressed4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ChaosKeyBindProcedure.execute(world, y, entity);
		DisasterKeybindProcedure.execute(world, y, entity);
		GroundKeyBindProcedure.execute(world, y, entity);
		CurseKeyBindProcedure.execute(world, entity);
		FullCounterKeyBindProcedure.execute(world, x, y, z, entity);
	}
}
