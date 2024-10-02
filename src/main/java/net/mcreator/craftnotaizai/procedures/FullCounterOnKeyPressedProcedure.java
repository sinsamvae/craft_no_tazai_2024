package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class FullCounterOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full_Counter")) {
			if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
					.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Full Counter")) {
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Full_Counter_Use == false) {
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Full_Counter_Use = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Skill Activated"), false);
				} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Full_Counter_Use == true) {
					{
						boolean _setval = false;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Full_Counter_Use = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Skill Deactivate"), false);
				}
			}
			if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
					.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Revenge Counter")) {
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).revengecounter == false) {
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.revengecounter = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Skill Activated"), false);
				} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).revengecounter == true) {
					{
						boolean _setval = false;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.revengecounter = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Skill Deactivate"), false);
				}
			}
			DivineCutsProcedure.execute(world, entity);
		}
	}
}
