package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class KamiChigiriProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getX() * 0), (entity.getZ() * 1.5), (entity.getY() * 0)));
	}
}
