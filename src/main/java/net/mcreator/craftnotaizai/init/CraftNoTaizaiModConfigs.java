package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.craftnotaizai.configuration.RandomRaceConfigConfiguration;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

@Mod.EventBusSubscriber(modid = CraftNoTaizaiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, RandomRaceConfigConfiguration.SPEC, "Craft no taizai.toml");
		});
	}
}
