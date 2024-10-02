package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetDemonMagicProcedure {
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
		double RandomMagic = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Demon_Clan == 2) {
			{
				double _setval = 3;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Demon_Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			RandomMagic = Mth.nextInt(RandomSource.create(), 1, 95);
			if (RandomMagic <= 60) {
				{
					String _setval = "HellBlaze";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 60 && RandomMagic <= 80) {
				{
					String _setval = "Invasion";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Doll";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Race = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 80 && RandomMagic <= 90) {
				{
					String _setval = "Full_Counter";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 90 && RandomMagic <= 95) {
				{
					String _setval = "Hellblaze_Fullcounter";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
