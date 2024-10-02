package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class AnswerHornOfCernunnosProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String set_answer1 = "";
		double set1_continue = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 0) {
			set_answer1 = "Someone from the goddrace?";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 1) {
			set_answer1 = "Ok, I'm in. i'll do anything you want.";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 2) {
			set_answer1 = "I said i'd do anything. Now who do you want me to kill";
		}
		return set_answer1;
	}
}
