package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class PerfectShellProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double r = 0;
		double a = 0;
		double b = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).PerfectShell == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5,
						(int) (Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack) + 1), false, false));
			r = 1.5;
			a = Math.random() * 12;
			b = 90;
			for (int index0 = 0; index0 < 30; index0++) {
				for (int index1 = 0; index1 < 16; index1++) {
					world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.PERFECTSHELLPARTICLE.get()), (x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))), ((y + 1) - r * Math.sin(Math.toRadians(b))),
							(z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 0, 0, 0);
					b = b + 12;
				}
				b = 90;
				a = a + 12;
			}
			{
				final Vec3 _center = new Vec3(x, (y + 1), z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.setDeltaMovement(new Vec3(((-1.5) * entityiterator.getDeltaMovement().x()), ((-1.5) * entityiterator.getDeltaMovement().y()), ((-1.5) * entityiterator.getDeltaMovement().z())));
					}
				}
			}
		}
	}
}
