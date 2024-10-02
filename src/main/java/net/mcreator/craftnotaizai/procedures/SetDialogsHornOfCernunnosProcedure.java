package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SetDialogsHornOfCernunnosProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String set_dialong = "";
		String set_answer1 = "";
		String set_answer2 = "";
		String set_answer3 = "";
		double set1_continue = 0;
		double set2_continue = 0;
		double set3_continue = 0;
		set_dialong = set_dialong;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 0) {
			set_dialong = "Who Are You?";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 1) {
			set_dialong = "Well shall give you mission.";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 2) {
			set_dialong = "At present, he's known by this name Seven Deadly Sins Dragon Sin, Meliodas";
		}
		return set_dialong;
	}
}
