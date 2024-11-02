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
public class PlayerHasCommandmentProcedure {
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
		boolean can_set = false;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Selflessness")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Selflessness = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Pacifism")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Pacifism = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Patience")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Patience = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Repose")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Repose = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Purity")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Purity = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Reticence")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Reticence = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Faith")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Faith = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Truth")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Truth = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Piety")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Love = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Love")) {
			CraftNoTaizaiModVariables.MapVariables.get(world).Piety = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
		can_set = true;
	}
}
