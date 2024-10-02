package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class HornOfCernunnosAnswerOneButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double set1_continue = 0;
		String set_dialong = "";
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 0) {
			{
				double _setval = 1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HornOfCernunnosID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 1) {
			{
				double _setval = 2;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HornOfCernunnosID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 2) {
			{
				String _setval = "test";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.side_quest = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
