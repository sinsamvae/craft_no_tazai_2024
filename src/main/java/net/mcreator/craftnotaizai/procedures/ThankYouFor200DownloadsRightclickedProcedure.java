package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class ThankYouFor200DownloadsRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7u" + "Thank you guys so much for 200 downloads")), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7u" + "You recived 10 TP")), false);
		{
			double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TP + 10;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TP = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.THANK_YOU_FOR_200_DOWNLOADS.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
