package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class PhysicalhuntEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 6;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PhysicalHunt = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
