package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FullCounterRemoveMagicEffectsProcedure {
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
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Full_Counter_Use == true) {
			if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftNoTaizaiModMobEffects.FREZZE.get()) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftNoTaizaiModMobEffects.BLACK_OUT_EFFECT.get())
					|| entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftNoTaizaiModMobEffects.NECROSIS.get())
					|| entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(CraftNoTaizaiModMobEffects.FREEZE_COFFIN_POTION_EFFECT.get())
					|| entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(CraftNoTaizaiModMobEffects.BIND.get())) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftNoTaizaiModMobEffects.FREZZE.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftNoTaizaiModMobEffects.FREEZE_COFFIN_POTION_EFFECT.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftNoTaizaiModMobEffects.BIND.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftNoTaizaiModMobEffects.BLACK_OUT_EFFECT.get());
			}
		}
	}
}
