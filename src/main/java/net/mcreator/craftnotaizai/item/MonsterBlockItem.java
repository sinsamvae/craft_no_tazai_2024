
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MonsterBlockItem extends Item {
	public MonsterBlockItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
