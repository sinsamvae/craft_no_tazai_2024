package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class LuminosityRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftNoTaizaiModItems.LUMINOSITY.get())) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.LUMINOSITY.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CraftNoTaizaiModItems.CHASTIEFOL_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
