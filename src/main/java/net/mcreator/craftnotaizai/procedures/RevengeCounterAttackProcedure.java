package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RevengeCounterAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double damage = 0;
		if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).revengecounter == true) {
			entity.getPersistentData().putBoolean("hit", true);
			damage = (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).storeddmg * 0.1;
			entity.getPersistentData().putDouble("deal", damage);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Skill Deactivate"), false);
		}
		{
			boolean _setval = false;
			sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.revengecounter = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
		{
			double _setval = 0;
			sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.storeddmg = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
	}
}
