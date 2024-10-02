package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VanillaMobsStats2Procedure {
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
		if (entity instanceof Creeper) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 45);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 22);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 66);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 43);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 87);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 64);
			}
		}
		if (entity instanceof ElderGuardian) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 87);
				entity.getPersistentData().putDouble("strength", 5);
				entity.getPersistentData().putDouble("Spirit", 80);
				entity.getPersistentData().putDouble("Mana", 2);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 90);
				entity.getPersistentData().putDouble("strength", 8);
				entity.getPersistentData().putDouble("Spirit", 80);
				entity.getPersistentData().putDouble("Mana", 2);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 95);
				entity.getPersistentData().putDouble("strength", 12);
				entity.getPersistentData().putDouble("Spirit", 80);
				entity.getPersistentData().putDouble("Mana", 3);
			}
		}
		if (entity instanceof Endermite) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 10);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 10);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 11);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Evoker) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 48);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 24);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 48);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 24);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 48);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 24);
			}
		}
		if (entity instanceof Ghast) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 19);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 9);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 27);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 17);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 35);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 10);
				entity.getPersistentData().putDouble("Mana", 25);
			}
		}
		if (entity instanceof Guardian) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 36);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 4);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 38);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 6);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 42);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 9);
			}
		}
		if (entity instanceof Hoglin) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 45);
				entity.getPersistentData().putDouble("strength", 5);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 48);
				entity.getPersistentData().putDouble("strength", 8);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 52);
				entity.getPersistentData().putDouble("strength", 12);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Husk) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 45);
				entity.getPersistentData().putDouble("strength", 5);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 48);
				entity.getPersistentData().putDouble("strength", 8);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 52);
				entity.getPersistentData().putDouble("strength", 12);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof MagmaCube) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 20);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 22);
				entity.getPersistentData().putDouble("strength", 6);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 25);
				entity.getPersistentData().putDouble("strength", 9);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Phantom) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 22);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 22);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 23);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof PiglinBrute) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 57);
				entity.getPersistentData().putDouble("strength", 7);
				entity.getPersistentData().putDouble("Spirit", 50);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 63);
				entity.getPersistentData().putDouble("strength", 13);
				entity.getPersistentData().putDouble("Spirit", 50);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 69);
				entity.getPersistentData().putDouble("strength", 19);
				entity.getPersistentData().putDouble("Spirit", 50);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Pillager) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 27);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 28);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 28);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Ravager) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 113);
				entity.getPersistentData().putDouble("strength", 7);
				entity.getPersistentData().putDouble("Spirit", 100);
				entity.getPersistentData().putDouble("Mana", 6);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 118);
				entity.getPersistentData().putDouble("strength", 12);
				entity.getPersistentData().putDouble("Spirit", 100);
				entity.getPersistentData().putDouble("Mana", 6);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 124);
				entity.getPersistentData().putDouble("strength", 18);
				entity.getPersistentData().putDouble("Spirit", 100);
				entity.getPersistentData().putDouble("Mana", 6);
			}
		}
		if (entity instanceof Shulker) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 34);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 4);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 34);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 4);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 34);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 30);
				entity.getPersistentData().putDouble("Mana", 4);
			}
		}
		if (entity instanceof Silverfish) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 9);
				entity.getPersistentData().putDouble("strength", 1);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 9);
				entity.getPersistentData().putDouble("strength", 1);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 9.5);
				entity.getPersistentData().putDouble("strength", 1.5);
				entity.getPersistentData().putDouble("Spirit", 8);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Skeleton) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 24);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 2);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 25);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 2);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 27);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 3);
			}
		}
		if (entity instanceof Slime) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 19);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 20);
				entity.getPersistentData().putDouble("strength", 4);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 22);
				entity.getPersistentData().putDouble("strength", 6);
				entity.getPersistentData().putDouble("Spirit", 16);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Stray) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 52);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 30);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 52);
				entity.getPersistentData().putDouble("strength", 2);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 30);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 53);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 30);
			}
		}
		if (entity instanceof Vex) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 19.5);
				entity.getPersistentData().putDouble("strength", 5.5);
				entity.getPersistentData().putDouble("Spirit", 14);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 21);
				entity.getPersistentData().putDouble("strength", 9);
				entity.getPersistentData().putDouble("Spirit", 14);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 25.5);
				entity.getPersistentData().putDouble("strength", 13.5);
				entity.getPersistentData().putDouble("Spirit", 15);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Vindicator) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 31.5);
				entity.getPersistentData().putDouble("strength", 7.5);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 37);
				entity.getPersistentData().putDouble("strength", 13);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 43.5);
				entity.getPersistentData().putDouble("strength", 19.5);
				entity.getPersistentData().putDouble("Spirit", 24);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof Witch) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 32);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 26);
				entity.getPersistentData().putDouble("Mana", 6);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 32);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 26);
				entity.getPersistentData().putDouble("Mana", 6);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 32);
				entity.getPersistentData().putDouble("strength", 0);
				entity.getPersistentData().putDouble("Spirit", 26);
				entity.getPersistentData().putDouble("Mana", 6);
			}
		}
		if (entity instanceof WitherSkeleton) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 35);
				entity.getPersistentData().putDouble("strength", 5);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 10);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 38);
				entity.getPersistentData().putDouble("strength", 8);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 10);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 42);
				entity.getPersistentData().putDouble("strength", 12);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 10);
			}
		}
		if (entity instanceof Zoglin) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 43);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 43);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 52);
				entity.getPersistentData().putDouble("strength", 12);
				entity.getPersistentData().putDouble("Spirit", 40);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
		if (entity instanceof ZombieVillager) {
			if (world.getDifficulty() == Difficulty.EASY) {
				entity.getPersistentData().putDouble("BP", 22.5);
				entity.getPersistentData().putDouble("strength", 2.5);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				entity.getPersistentData().putDouble("BP", 23);
				entity.getPersistentData().putDouble("strength", 3);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				entity.getPersistentData().putDouble("BP", 24.5);
				entity.getPersistentData().putDouble("strength", 4.5);
				entity.getPersistentData().putDouble("Spirit", 20);
				entity.getPersistentData().putDouble("Mana", 0);
			}
		}
	}
}
