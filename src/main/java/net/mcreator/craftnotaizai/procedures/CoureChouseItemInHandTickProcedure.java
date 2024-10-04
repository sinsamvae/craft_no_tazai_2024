package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.craftnotaizai.item.CoureChouseItem;

public class CoureChouseItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() instanceof CoureChouseItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "idle");
	}
}
