package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class PowerIncreaseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage == 1) {
			{
				double _setval = 2;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power_percentage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack * 3) / 4;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaAttack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Agility * 3) / 4;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength * 3) / 4;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage == 2) {
			{
				double _setval = 3;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power_percentage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack * 3.4) / 5.1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaAttack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Agility * 3.4) / 5.1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength * 3.4) / 5.1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage == 3) {
			{
				double _setval = 4;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power_percentage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack * 3.5) / 7;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaAttack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Agility * 3.5) / 7;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Agility = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength * 3.5) / 7;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
