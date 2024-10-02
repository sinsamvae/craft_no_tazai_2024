package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class PowerPercentageProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String powerpercentage = "";
		powerpercentage = "Power Percentage: " + "100%";
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage == 1) {
			powerpercentage = "Power Percentage: " + "100%";
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage == 2) {
			powerpercentage = "Power Percentage: " + "75%";
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage == 3) {
			powerpercentage = "Power Percentage: " + "50%";
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage == 4) {
			powerpercentage = "Power Percentage: " + "25%";
		}
		return powerpercentage;
	}
}
