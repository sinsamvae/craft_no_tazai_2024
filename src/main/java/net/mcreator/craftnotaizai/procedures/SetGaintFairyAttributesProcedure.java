package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetGaintFairyAttributesProcedure {
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
		CraftNoTaizaiMod.queueServerWork(1, () -> {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).GaintRace == 1) {
				{
					double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.health = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 5, 7) * 5;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxhealth = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 9, 13) * 5;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.strength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 9, 13) * 5;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Spirit = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 0, 2) * 5;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ManaAttack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mana_regen = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TPAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TPSwitchAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Giant";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Race = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 2;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GaintRace = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		});
	}
}
