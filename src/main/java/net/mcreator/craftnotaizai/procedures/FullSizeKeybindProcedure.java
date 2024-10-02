package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class FullSizeKeybindProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full Size")) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).rCoolDown < 1) {
				if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
						.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Full Size")) {
					if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).FullSize == false) {
						{
							boolean _setval = true;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.FullSize = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 1;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fullsize = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).FullSize == true) {
						{
							boolean _setval = false;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.FullSize = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 3;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fullsize = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}
