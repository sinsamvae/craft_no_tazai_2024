package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FreezeShieldFalseProcedure {
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
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).FreezeShield == false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.FREEZE_SHIELD.get()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.FREEZE_SHIELD.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.FREEZE_SHIELD.get()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.FREEZE_SHIELD.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
