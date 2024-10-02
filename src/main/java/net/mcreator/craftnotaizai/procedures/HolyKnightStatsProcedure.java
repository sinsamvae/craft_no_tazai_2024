package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.WeinheidtAnimatedEntity;
import net.mcreator.craftnotaizai.entity.VivianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SladerAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SimonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RedKnightAnimatedEntity;
import net.mcreator.craftnotaizai.entity.JillianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HugoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GustafAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GreenKnightAnimatedEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HolyKnightStatsProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof HugoAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 38);
			entity.getPersistentData().putDouble("strength", 24);
			entity.getPersistentData().putDouble("Spirit", 14);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof JillianAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 50);
			entity.getPersistentData().putDouble("strength", 24);
			entity.getPersistentData().putDouble("Spirit", 11);
			entity.getPersistentData().putDouble("Mana", 15);
		} else if (entity instanceof SimonAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 59);
			entity.getPersistentData().putDouble("strength", 25);
			entity.getPersistentData().putDouble("Spirit", 11);
			entity.getPersistentData().putDouble("Mana", 23);
		} else if (entity instanceof WeinheidtAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 56);
			entity.getPersistentData().putDouble("strength", 24);
			entity.getPersistentData().putDouble("Spirit", 12);
			entity.getPersistentData().putDouble("Mana", 20);
		}
		if (entity instanceof SladerAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 90);
			entity.getPersistentData().putDouble("strength", 55);
			entity.getPersistentData().putDouble("Spirit", 15);
			entity.getPersistentData().putDouble("Mana", 20);
		} else if (entity instanceof VivianAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 90);
			entity.getPersistentData().putDouble("strength", 25);
			entity.getPersistentData().putDouble("Spirit", 0);
			entity.getPersistentData().putDouble("Mana", 60);
		} else if (entity instanceof GustafAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 165);
			entity.getPersistentData().putDouble("strength", 85);
			entity.getPersistentData().putDouble("Spirit", 15);
			entity.getPersistentData().putDouble("Mana", 65);
		}
		if (entity instanceof RedKnightAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 135);
			entity.getPersistentData().putDouble("strength", 45);
			entity.getPersistentData().putDouble("Spirit", 50);
			entity.getPersistentData().putDouble("Mana", 40);
		} else if (entity instanceof GreenKnightAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 95);
			entity.getPersistentData().putDouble("strength", 35);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 30);
		}
	}
}
