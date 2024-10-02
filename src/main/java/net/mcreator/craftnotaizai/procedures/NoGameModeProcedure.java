package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.Mule;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Donkey;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.animal.camel.Camel;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NoGameModeProcedure {
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
		if (entity instanceof Allay) {
			entity.getPersistentData().putDouble("BP", 20);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 20);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Axolotl) {
			entity.getPersistentData().putDouble("BP", 16);
			entity.getPersistentData().putDouble("strength", 2);
			entity.getPersistentData().putDouble("Spirit", 14);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Bat) {
			entity.getPersistentData().putDouble("BP", 6);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 6);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Parrot) {
			entity.getPersistentData().putDouble("BP", 30);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Camel) {
			entity.getPersistentData().putDouble("BP", 32);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 32);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Cat) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Chicken) {
			entity.getPersistentData().putDouble("BP", 4);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 4);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Cod) {
			entity.getPersistentData().putDouble("BP", 3);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 3);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Cow) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Donkey) {
			entity.getPersistentData().putDouble("BP", 30);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Frog) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Frog) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof GlowSquid) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Horse) {
			entity.getPersistentData().putDouble("BP", 30);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof MushroomCow) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Mule) {
			entity.getPersistentData().putDouble("BP", 30);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Ocelot) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Parrot) {
			entity.getPersistentData().putDouble("BP", 6);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 6);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Pig) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Rabbit) {
			entity.getPersistentData().putDouble("BP", 3);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 3);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Salmon) {
			entity.getPersistentData().putDouble("BP", 3);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 3);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Sheep) {
			entity.getPersistentData().putDouble("BP", 8);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 8);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof SkeletonHorse) {
			entity.getPersistentData().putDouble("BP", 15);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 15);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Sniffer) {
			entity.getPersistentData().putDouble("BP", 14);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 14);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Sniffer) {
			entity.getPersistentData().putDouble("BP", 14);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 14);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof SnowGolem) {
			entity.getPersistentData().putDouble("BP", 7);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 4);
			entity.getPersistentData().putDouble("Mana", 3);
		}
		if (entity instanceof Squid) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Strider) {
			entity.getPersistentData().putDouble("BP", 20);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 20);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Tadpole) {
			entity.getPersistentData().putDouble("BP", 6);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 6);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof TropicalFish) {
			entity.getPersistentData().putDouble("BP", 3);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 3);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Turtle) {
			entity.getPersistentData().putDouble("BP", 30);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof Villager) {
			entity.getPersistentData().putDouble("BP", 20);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 20);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof WanderingTrader) {
			entity.getPersistentData().putDouble("BP", 20);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 20);
			entity.getPersistentData().putDouble("Mana", 0);
		}
	}
}
