package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.PhysicalCloneEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PhysicalCloneSpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PhysicalCloneEntity && !((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) == entity.getPersistentData().getDouble("CloneHealth"))) {
			CraftNoTaizaiMod.queueServerWork(40, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue());
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue((entity.getPersistentData().getDouble("CloneHealth")));
			});
		}
	}
}
