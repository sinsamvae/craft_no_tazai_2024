package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class AnswerHornOfCernunnosNoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 0) {
			{
				double _setval = 0;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HornOfCernunnosID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 1) {
			{
				double _setval = 0;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HornOfCernunnosID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).HornOfCernunnosID == 2) {
			{
				double _setval = 0;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HornOfCernunnosID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
