package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BeasrkModeRemoveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).berserk == 3) {
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength / 2.1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Spirit / 2.1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Spirit = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack / 2.1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaAttack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.berserk = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftNoTaizaiModItems.DEMON_CLAW.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftNoTaizaiModItems.DEMON_AXE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftNoTaizaiModItems.DEMON_WING.get())) : false)) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.DEMON_AXE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.DEMON_WING.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.DEMON_CLAW.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemon == 3) {
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength / 2.2;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Spirit / 2.2;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Spirit = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack / 2.2;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaAttack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.graydemon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fullpowerDemonMark == 3) {
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength / 2.5;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Spirit / 2.5;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Spirit = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack / 2.5;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaAttack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fullpowerDemonMark = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
