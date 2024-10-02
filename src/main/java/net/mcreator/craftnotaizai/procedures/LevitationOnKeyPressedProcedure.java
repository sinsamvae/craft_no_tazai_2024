package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class LevitationOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fairy == true) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 10) {
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == false) {
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Levitation = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == true) {
					{
						boolean _setval = false;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Levitation = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Unlock at Level 10"), false);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemonform == true) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == false) {
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Levitation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == true) {
				{
					boolean _setval = false;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Levitation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.DEMON_WING.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.DEMON_WING.get()) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == false) {
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Levitation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == true) {
				{
					boolean _setval = false;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Levitation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).FullPowerDemonMark == true) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == false) {
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Levitation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation == true) {
				{
					boolean _setval = false;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Levitation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
