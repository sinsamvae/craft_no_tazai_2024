
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CraftNoTaizaiModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.WHEAT, 17),

					new ItemStack(CraftNoTaizaiModItems.AGAVE_SEEDS.get(), 3), 10, 3, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.WHEAT, 27),

					new ItemStack(CraftNoTaizaiModItems.AGAVE_SEEDS.get(), 10), 10, 16, 0.05f));
		}
	}
}
