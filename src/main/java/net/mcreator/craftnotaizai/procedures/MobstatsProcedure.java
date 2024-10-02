package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.TwigoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.TaizooAnimatedEntity;
import net.mcreator.craftnotaizai.entity.StoryBanAnimatedEntity;
import net.mcreator.craftnotaizai.entity.StoryBan2AnimatedEntity;
import net.mcreator.craftnotaizai.entity.RuinAnimatedEntity;
import net.mcreator.craftnotaizai.entity.JerichoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.JerichoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HowzerAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HelbremAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GuilaDemonanimatedEntity;
import net.mcreator.craftnotaizai.entity.GuilaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GriamoreAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonHendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GolgiusAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GilThunderAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GilThunderAnimated2Entity;
import net.mcreator.craftnotaizai.entity.FriesiaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.FairyHelbremAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DreyfusAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DianeAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DemonHendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DeadHelbramanimatedEntity;
import net.mcreator.craftnotaizai.entity.DalefinalEntity;
import net.mcreator.craftnotaizai.entity.DaleSecEntity;
import net.mcreator.craftnotaizai.entity.DaleArmoredEntity;
import net.mcreator.craftnotaizai.entity.CainBarzadAnimatedEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MobstatsProcedure {
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
		if (entity instanceof TwigoAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 75);
			entity.getPersistentData().putDouble("strength", 25);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 20);
		} else if (entity instanceof GilThunderAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 95);
			entity.getPersistentData().putDouble("strength", 35);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 30);
		} else if (entity instanceof GolgiusAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 115);
			entity.getPersistentData().putDouble("strength", 45);
			entity.getPersistentData().putDouble("Spirit", 30);
			entity.getPersistentData().putDouble("Mana", 40);
		} else if (entity instanceof DianeAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 165);
			entity.getPersistentData().putDouble("strength", 65);
			entity.getPersistentData().putDouble("Spirit", 40);
			entity.getPersistentData().putDouble("Mana", 60);
		}
		if (entity instanceof FriesiaAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 165);
			entity.getPersistentData().putDouble("strength", 65);
			entity.getPersistentData().putDouble("Spirit", 40);
			entity.getPersistentData().putDouble("Mana", 60);
		} else if (entity instanceof RuinAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 185);
			entity.getPersistentData().putDouble("strength", 75);
			entity.getPersistentData().putDouble("Spirit", 40);
			entity.getPersistentData().putDouble("Mana", 70);
		} else if (entity instanceof GuilaAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 235);
			entity.getPersistentData().putDouble("strength", 85);
			entity.getPersistentData().putDouble("Spirit", 70);
			entity.getPersistentData().putDouble("Mana", 80);
		} else if (entity instanceof TaizooAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 25);
			entity.getPersistentData().putDouble("strength", 15);
			entity.getPersistentData().putDouble("Spirit", 10);
			entity.getPersistentData().putDouble("Mana", 0);
		} else if (entity instanceof GriamoreAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 245);
			entity.getPersistentData().putDouble("strength", 95);
			entity.getPersistentData().putDouble("Spirit", 60);
			entity.getPersistentData().putDouble("Mana", 80);
		}
		if (entity instanceof HowzerAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 325);
			entity.getPersistentData().putDouble("strength", 115);
			entity.getPersistentData().putDouble("Spirit", 100);
			entity.getPersistentData().putDouble("Mana", 110);
		}
		if (entity instanceof CainBarzadAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 325);
			entity.getPersistentData().putDouble("strength", 115);
			entity.getPersistentData().putDouble("Spirit", 100);
			entity.getPersistentData().putDouble("Mana", 110);
		} else if (entity instanceof StoryBanAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 345);
			entity.getPersistentData().putDouble("strength", 125);
			entity.getPersistentData().putDouble("Spirit", 100);
			entity.getPersistentData().putDouble("Mana", 120);
		} else if (entity instanceof JerichoAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 390);
			entity.getPersistentData().putDouble("strength", 135);
			entity.getPersistentData().putDouble("Spirit", 120);
			entity.getPersistentData().putDouble("Mana", 130);
		} else if (entity instanceof GuilaDemonanimatedEntity) {
			entity.getPersistentData().putDouble("BP", 405);
			entity.getPersistentData().putDouble("strength", 145);
			entity.getPersistentData().putDouble("Spirit", 120);
			entity.getPersistentData().putDouble("Mana", 140);
		}
		if (entity instanceof HelbremAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 425);
			entity.getPersistentData().putDouble("strength", 155);
			entity.getPersistentData().putDouble("Spirit", 120);
			entity.getPersistentData().putDouble("Mana", 150);
		} else if (entity instanceof DaleArmoredEntity) {
			entity.getPersistentData().putDouble("BP", 445);
			entity.getPersistentData().putDouble("strength", 165);
			entity.getPersistentData().putDouble("Spirit", 120);
			entity.getPersistentData().putDouble("Mana", 160);
		} else if (entity instanceof DaleSecEntity) {
			entity.getPersistentData().putDouble("BP", 455);
			entity.getPersistentData().putDouble("strength", 170);
			entity.getPersistentData().putDouble("Spirit", 120);
			entity.getPersistentData().putDouble("Mana", 165);
		} else if (entity instanceof DalefinalEntity) {
			entity.getPersistentData().putDouble("BP", 465);
			entity.getPersistentData().putDouble("strength", 175);
			entity.getPersistentData().putDouble("Spirit", 120);
			entity.getPersistentData().putDouble("Mana", 170);
		}
		if (entity instanceof FairyHelbremAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 495);
			entity.getPersistentData().putDouble("strength", 185);
			entity.getPersistentData().putDouble("Spirit", 130);
			entity.getPersistentData().putDouble("Mana", 180);
		} else if (entity instanceof DreyfusAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 515);
			entity.getPersistentData().putDouble("strength", 195);
			entity.getPersistentData().putDouble("Spirit", 130);
			entity.getPersistentData().putDouble("Mana", 190);
		} else if (entity instanceof GilThunderAnimated2Entity) {
			entity.getPersistentData().putDouble("BP", 555);
			entity.getPersistentData().putDouble("strength", 215);
			entity.getPersistentData().putDouble("Spirit", 130);
			entity.getPersistentData().putDouble("Mana", 210);
		} else if (entity instanceof HendricksonAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 575);
			entity.getPersistentData().putDouble("strength", 225);
			entity.getPersistentData().putDouble("Spirit", 130);
			entity.getPersistentData().putDouble("Mana", 220);
		}
		if (entity instanceof JerichoDemonFormEntity) {
			entity.getPersistentData().putDouble("BP", 595);
			entity.getPersistentData().putDouble("strength", 235);
			entity.getPersistentData().putDouble("Spirit", 130);
			entity.getPersistentData().putDouble("Mana", 230);
		} else if (entity instanceof DeadHelbramanimatedEntity) {
			entity.getPersistentData().putDouble("BP", 625);
			entity.getPersistentData().putDouble("strength", 245);
			entity.getPersistentData().putDouble("Spirit", 140);
			entity.getPersistentData().putDouble("Mana", 240);
		} else if (entity instanceof StoryBan2AnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 645);
			entity.getPersistentData().putDouble("strength", 255);
			entity.getPersistentData().putDouble("Spirit", 140);
			entity.getPersistentData().putDouble("Mana", 250);
		} else if (entity instanceof DemonHendricksonAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 675);
			entity.getPersistentData().putDouble("strength", 265);
			entity.getPersistentData().putDouble("Spirit", 150);
			entity.getPersistentData().putDouble("Mana", 260);
		} else if (entity instanceof GrayDemonHendricksonAnimatedEntity) {
			entity.getPersistentData().putDouble("BP", 705);
			entity.getPersistentData().putDouble("strength", 280);
			entity.getPersistentData().putDouble("Spirit", 150);
			entity.getPersistentData().putDouble("Mana", 275);
		}
	}
}
