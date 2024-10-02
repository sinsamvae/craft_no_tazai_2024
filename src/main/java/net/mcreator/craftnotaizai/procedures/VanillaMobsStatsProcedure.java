package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.animal.horse.TraderLlama;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.entity.animal.Panda;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.Dolphin;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VanillaMobsStatsProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EnderDragon) {
			if (world.getDifficulty() == Difficulty.PEACEFUL) {
				entity.getPersistentData().putDouble("BP", 290);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 200);
				entity.getPersistentData().putDouble("Mana", 90);
			} else if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 350);
				entity.getPersistentData().putDouble("strength", 60);
				entity.getPersistentData().putDouble("Spirit", 200);
				entity.getPersistentData().putDouble("Mana", 90);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 390);
				entity.getPersistentData().putDouble("strength", 100);
				entity.getPersistentData().putDouble("Spirit", 200);
				entity.getPersistentData().putDouble("Mana", 90);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 440);
				entity.getPersistentData().putDouble("strength", 150);
				entity.getPersistentData().putDouble("Spirit", 200);
				entity.getPersistentData().putDouble("Mana", 90);
			}
		}
		if (entity instanceof WitherBoss) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 450);
				entity.getPersistentData().putDouble("strength", 50);
				entity.getPersistentData().putDouble("Spirit", 300);
				entity.getPersistentData().putDouble("Mana", 100);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 480);
				entity.getPersistentData().putDouble("strength", 80);
				entity.getPersistentData().putDouble("Spirit", 300);
				entity.getPersistentData().putDouble("Mana", 100);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 570);
				entity.getPersistentData().putDouble("strength", 120);
				entity.getPersistentData().putDouble("Spirit", 300);
				entity.getPersistentData().putDouble("Mana", 150);
			}
		}
		if (entity instanceof Warden) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 576);
				entity.getPersistentData().putDouble("strength", 16);
				entity.getPersistentData().putDouble("Spirit", 500);
				entity.getPersistentData().putDouble("Mana", 60);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 630);
				entity.getPersistentData().putDouble("strength", 30);
				entity.getPersistentData().putDouble("Spirit", 500);
				entity.getPersistentData().putDouble("Mana", 100);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 695);
				entity.getPersistentData().putDouble("strength", 45);
				entity.getPersistentData().putDouble("Spirit", 500);
				entity.getPersistentData().putDouble("Mana", 150);
			}
		}
		if (entity instanceof Bee) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 13);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 1);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 13);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 1);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 14);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 1);
			}
		}
		if (entity instanceof Blaze) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 29);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 5);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 31);
				entity.getPersistentData().putDouble("strength", 6);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 5);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 34);
				entity.getPersistentData().putDouble("strength", 9);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 5);
			}
		}
		if (entity instanceof Pufferfish) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 9);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 3);
				entity.getPersistentData().putDouble("Mana", 4);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 9);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 3);
				entity.getPersistentData().putDouble("Mana", 4);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 9);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 3);
				entity.getPersistentData().putDouble("Mana", 6);
			}
		}
		if (entity instanceof CaveSpider) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 15);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 12);
				entity.getPersistentData().putDouble("Mana", 1);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 21);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 12);
				entity.getPersistentData().putDouble("Mana", 7);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 30);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 12);
				entity.getPersistentData().putDouble("Mana", 15);
			}
		}
		if (entity instanceof Dolphin) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 12.5);
				entity.getPersistentData().putDouble("strength", 2.5);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 13);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 14.5);
				entity.getPersistentData().putDouble("strength", 4.5);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Drowned) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 27.5);
				entity.getPersistentData().putDouble("strength", 2.5);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 5);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 31);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 8);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 36.5);
				entity.getPersistentData().putDouble("strength", 4.5);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 12);
			}
		}
		if (entity instanceof EnderMan) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 44.5);
				entity.getPersistentData().putDouble("strength", 4.5);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 47);
				entity.getPersistentData().putDouble("strength", 7);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 50.5);
				entity.getPersistentData().putDouble("strength", 10.5);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Fox) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 12);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 12);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 13);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Goat) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 11);
				entity.getPersistentData().putDouble("strength", 1);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 12);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 13);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof IronGolem) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 104.75);
				entity.getPersistentData().putDouble("strength", 4.75);
				entity.getPersistentData().putDouble("Spirit", 100);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 107.5);
				entity.getPersistentData().putDouble("strength", 7.5);
				entity.getPersistentData().putDouble("Spirit", 100);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 111.25);
				entity.getPersistentData().putDouble("strength", 11.25);
				entity.getPersistentData().putDouble("Spirit", 100);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Panda) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 24);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 26);
				entity.getPersistentData().putDouble("strength", 6);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 29);
				entity.getPersistentData().putDouble("strength", 9);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Piglin) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 18);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 18);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 21);
				entity.getPersistentData().putDouble("strength", 5);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof PolarBear) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 34);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 36);
				entity.getPersistentData().putDouble("strength", 6);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 39);
				entity.getPersistentData().putDouble("strength", 9);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof PolarBear) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 34);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 36);
				entity.getPersistentData().putDouble("strength", 6);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 39);
				entity.getPersistentData().putDouble("strength", 9);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Spider) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 18);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 18);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 19);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof TraderLlama) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 16);
				entity.getPersistentData().putDouble("strength", 1);
				entity.getPersistentData().putDouble("Spirit", 15);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 16);
				entity.getPersistentData().putDouble("strength", 1);
				entity.getPersistentData().putDouble("Spirit", 15);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 16);
				entity.getPersistentData().putDouble("strength", 1);
				entity.getPersistentData().putDouble("Spirit", 15);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Wolf) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 11);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 12);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 14);
				entity.getPersistentData().putDouble("strength", 6);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof ZombifiedPiglin) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 25);
				entity.getPersistentData().putDouble("strength", 5);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 28);
				entity.getPersistentData().putDouble("strength", 8);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 32);
				entity.getPersistentData().putDouble("strength", 12);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
	}
}
