package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class PhysicalCloneEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("CloneDMG", 0);
		entity.getPersistentData().putDouble("CloneHealth", 0);
	}
}
