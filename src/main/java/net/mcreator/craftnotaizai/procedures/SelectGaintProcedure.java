package net.mcreator.craftnotaizai.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SelectGaintProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ScaleTypes.HEIGHT.getScaleData(entity).setTargetScale((float) ScaleOperations.MULTIPLY.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 3));
		ScaleTypes.WIDTH.getScaleData(entity).setTargetScale((float) ScaleOperations.MULTIPLY.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 3));
		{
			double _setval = 1;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.GaintRace = _setval;
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
				capability.gaint = _setval;
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
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
