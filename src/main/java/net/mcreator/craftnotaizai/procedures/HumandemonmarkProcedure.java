package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class HumandemonmarkProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).reddemonboost == true) {
			if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
					.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Demon Mark")) {
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark == false) {
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.humandemonmark = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.humandemon = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark == true) {
					{
						boolean _setval = false;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.humandemonmark = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 3;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.humandemon = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
					.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Gray Demon")) {
				if (!((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark == true)) {
					if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemonform == false) {
						{
							boolean _setval = true;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.graydemonform = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 1;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.graydemon = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemonform == true) {
						{
							boolean _setval = false;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.graydemonform = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 3;
							entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.graydemon = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Other Forms Are Active"), false);
				}
			}
		}
		if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
				.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Half Awaken")) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Half == false) {
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Half = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HalfAwaken = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Half == true) {
				{
					boolean _setval = false;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Half = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 3;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HalfAwaken = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
