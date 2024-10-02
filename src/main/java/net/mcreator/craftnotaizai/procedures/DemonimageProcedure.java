package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class DemonimageProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).demon == false) {
			return false;
		}
		return true;
	}
}
