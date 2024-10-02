package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.TyrantDragonEntity;
import net.mcreator.craftnotaizai.entity.TrollEntity;
import net.mcreator.craftnotaizai.entity.SwordWolfEntity;
import net.mcreator.craftnotaizai.entity.SoldierAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RoyalGurardAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RoyalGuardAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;
import net.mcreator.craftnotaizai.entity.PuoraEntity;
import net.mcreator.craftnotaizai.entity.ParadaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MutilatorRabbitsEntity;
import net.mcreator.craftnotaizai.entity.MuramoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.MuramoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MantaEntity;
import net.mcreator.craftnotaizai.entity.KulumilEntity;
import net.mcreator.craftnotaizai.entity.HideAndSeekEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;
import net.mcreator.craftnotaizai.entity.GeckolibKrakenEntity;
import net.mcreator.craftnotaizai.entity.EarthCrawlerEntity;
import net.mcreator.craftnotaizai.entity.DuskBison1Entity;
import net.mcreator.craftnotaizai.entity.DumblebbasAnimatedEntity;
import net.mcreator.craftnotaizai.entity.ClayDragonEntity;
import net.mcreator.craftnotaizai.entity.ChickenEntity;
import net.mcreator.craftnotaizai.entity.BlackHoundEntity;
import net.mcreator.craftnotaizai.entity.AngleCureEntity;
import net.mcreator.craftnotaizai.entity.AndreDemonFormEntity;
import net.mcreator.craftnotaizai.entity.AndreAnimatedEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MagicalCreaturesStatsProcedure {
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
		if (entity instanceof MantaEntity) {
			entity.getPersistentData().putDouble("BP", 5);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 0);
			entity.getPersistentData().putDouble("Mana", 5);
		} else if (entity instanceof RoyalGurardAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 7);
			entity.getPersistentData().putDouble("Spirit", 3);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof RoyalGuardAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 10);
			entity.getPersistentData().putDouble("strength", 8);
			entity.getPersistentData().putDouble("Spirit", 2);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof HideAndSeekEntity) {
			entity.getPersistentData().putDouble("BP", 4);
			entity.getPersistentData().putDouble("strength", 0);
			entity.getPersistentData().putDouble("Spirit", 4);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof KulumilEntity) {
			entity.getPersistentData().putDouble("BP", 8);
			entity.getPersistentData().putDouble("BP", 3);
			entity.getPersistentData().putDouble("strength", 1);
			entity.getPersistentData().putDouble("Mana", 4);
		} else if (entity instanceof PuoraEntity) {
			entity.getPersistentData().putDouble("BP", 8);
			entity.getPersistentData().putDouble("strength", 3);
			entity.getPersistentData().putDouble("Spirit", 1);
			entity.getPersistentData().putDouble("Mana", 4);
		}
		if (entity instanceof ChickenEntity) {
			entity.getPersistentData().putDouble("BP", 17);
			entity.getPersistentData().putDouble("strength", 8);
			entity.getPersistentData().putDouble("Spirit", 4);
			entity.getPersistentData().putDouble("Mana", 5);
		} else if (entity instanceof GeckolibKrakenEntity) {
			entity.getPersistentData().putDouble("BP", 17);
			entity.getPersistentData().putDouble("strength", 13);
			entity.getPersistentData().putDouble("Spirit", 4);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof MutilatorRabbitsEntity) {
			entity.getPersistentData().putDouble("BP", 17);
			entity.getPersistentData().putDouble("strength", 10);
			entity.getPersistentData().putDouble("Spirit", 7);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof MuramoAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 18);
			entity.getPersistentData().putDouble("strength", 12);
			entity.getPersistentData().putDouble("Spirit", 6);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof AndreAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 18);
			entity.getPersistentData().putDouble("strength", 12);
			entity.getPersistentData().putDouble("Spirit", 6);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof ParadaAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 16);
			entity.getPersistentData().putDouble("strength", 11);
			entity.getPersistentData().putDouble("Spirit", 5);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof SoldierAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 15);
			entity.getPersistentData().putDouble("strength", 10);
			entity.getPersistentData().putDouble("Spirit", 5);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof DumblebbasAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 42);
			entity.getPersistentData().putDouble("strength", 12);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 20);
		} else if (entity instanceof SwordWolfEntity) {
			entity.getPersistentData().putDouble("BP", 30);
			entity.getPersistentData().putDouble("strength", 20);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof AngleCureEntity) {
			entity.getPersistentData().putDouble("BP", 37);
			entity.getPersistentData().putDouble("strength", 16);
			entity.getPersistentData().putDouble("Spirit", 11);
			entity.getPersistentData().putDouble("Mana", 10);
		} else if (entity instanceof DuskBison1Entity) {
			entity.getPersistentData().putDouble("BP", 35);
			entity.getPersistentData().putDouble("strength", 22);
			entity.getPersistentData().putDouble("Spirit", 13);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof BlackHoundEntity) {
			entity.getPersistentData().putDouble("BP", 30);
			entity.getPersistentData().putDouble("strength", 16);
			entity.getPersistentData().putDouble("Spirit", 14);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof TyrantDragonEntity) {
			entity.getPersistentData().putDouble("BP", 200);
			entity.getPersistentData().putDouble("strength", 95);
			entity.getPersistentData().putDouble("Spirit", 15);
			entity.getPersistentData().putDouble("Mana", 90);
		} else if (entity instanceof TrollEntity) {
			entity.getPersistentData().putDouble("BP", 100);
			entity.getPersistentData().putDouble("strength", 85);
			entity.getPersistentData().putDouble("Spirit", 15);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof EarthCrawlerEntity) {
			entity.getPersistentData().putDouble("BP", 90);
			entity.getPersistentData().putDouble("strength", 75);
			entity.getPersistentData().putDouble("Spirit", 15);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof ClayDragonEntity) {
			entity.getPersistentData().putDouble("BP", 95);
			entity.getPersistentData().putDouble("strength", 80);
			entity.getPersistentData().putDouble("Spirit", 15);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof RedDemonGeckolibEntity) {
			entity.getPersistentData().putDouble("BP", 535);
			entity.getPersistentData().putDouble("strength", 170);
			entity.getPersistentData().putDouble("Spirit", 200);
			entity.getPersistentData().putDouble("Mana", 165);
		} else if (entity instanceof MuramoDemonFormEntity) {
			entity.getPersistentData().putDouble("BP", 315);
			entity.getPersistentData().putDouble("strength", 145);
			entity.getPersistentData().putDouble("Spirit", 170);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof AndreDemonFormEntity) {
			entity.getPersistentData().putDouble("BP", 320);
			entity.getPersistentData().putDouble("strength", 140);
			entity.getPersistentData().putDouble("Spirit", 180);
			entity.getPersistentData().putDouble("Mana", 0);
		}
		if (entity instanceof GrayDemonEntityEntity) {
			entity.getPersistentData().putDouble("BP", 880);
			entity.getPersistentData().putDouble("strength", 340);
			entity.getPersistentData().putDouble("Spirit", 210);
			entity.getPersistentData().putDouble("Mana", 330);
		}
	}
}
