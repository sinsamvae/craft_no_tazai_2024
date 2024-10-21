package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.DuskBison1Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DuskBisionAttackProcedure {
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
		double Xpar = 0;
		double Ypar = 0;
		double Zpar = 0;
		double Range = 0;
		if (sourceentity instanceof DuskBison1Entity) {
			entity.setDeltaMovement(new Vec3((entity.getX() * 0), (entity.getY() * 1.5), (entity.getZ() * 0)));
		}
	}
}
