package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MagicScoll11Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String skill = "";
		skill = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_skill).getOrCreateTag()
				.getString(("learn_skill" + new java.text.DecimalFormat("##").format(11 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).SlotSwitch)));
		if ((skill).equals("")) {
			skill = "LOCKED";
		}
		return skill;
	}
}