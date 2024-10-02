package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GideonToolInHandTickProcedure {
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
		boolean manaboost = false;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).GaintRace == 4) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.GIDEON.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.GIDEON.get()) {
				if (entity.getPersistentData().getBoolean("gideon") == false) {
					{
						double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack * 1.5;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ManaAttack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					entity.getPersistentData().putBoolean("gideon", true);
				}
			} else if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.GIDEON.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.GIDEON.get())) {
				if (entity.getPersistentData().getBoolean("gideon") == true) {
					{
						double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack / 1.5;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ManaAttack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					entity.getPersistentData().putBoolean("gideon", false);
				}
			}
		}
	}
}
