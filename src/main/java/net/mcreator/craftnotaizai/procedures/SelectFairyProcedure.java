package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SelectFairyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Fairy_Clan = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = true;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Races = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = true;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hpandmanaoverlay = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = true;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fairy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
