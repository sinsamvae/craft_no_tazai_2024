
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class AngleCureMeatItem extends Item {
	public AngleCureMeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(1.6f).alwaysEat().meat().build()));
	}
}
