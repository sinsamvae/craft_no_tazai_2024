package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SunshinebootsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("SunShine")) {
			if (world.dayTime() % 24000 == 1000) {
				{
					double _setval = 3;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Sunshine = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (world.dayTime() % 24000 == 2000) {
				{
					double _setval = 5;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Sunshine = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (world.dayTime() % 24000 == 5723) {
				{
					double _setval = 7;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Sunshine = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (world.dayTime() % 24000 == 6000) {
				{
					double _setval = 9;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Sunshine = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (world.dayTime() % 24000 == 12542) {
				{
					double _setval = 11;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Sunshine = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
