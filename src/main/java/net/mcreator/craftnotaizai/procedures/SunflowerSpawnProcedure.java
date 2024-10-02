package net.mcreator.craftnotaizai.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.SunflowerEntity;
import net.mcreator.craftnotaizai.entity.SnowflowerbeamProjectileEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SunflowerSpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		double r = 0;
		double b = 0;
		double s = 0;
		double c = 0;
		double i = 0;
		if (entity instanceof SunflowerEntity) {
			CraftNoTaizaiMod.queueServerWork(8, () -> {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new SnowflowerbeamProjectileEntity(CraftNoTaizaiModEntities.SNOWFLOWERBEAM_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, (float) entity.getPersistentData().getDouble("sunflower"), 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			});
			entity.getPersistentData().putDouble("kill", 30);
			entity.getPersistentData().putDouble("kllr", (entity.getYRot()));
			entity.getPersistentData().putDouble("klla", (entity.getXRot()));
			entity.getPersistentData().putDouble("kllx", x);
			entity.getPersistentData().putDouble("klly", y);
			entity.getPersistentData().putDouble("kllz", z);
			r = 1;
			s = 2;
			a = entity.getYRot();
			b = entity.getXRot();
			c = 0;
			for (int index0 = 0; index0 < 90; index0++) {
				world.addParticle(ParticleTypes.END_ROD,
						(x - (r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a)) + s * Math.cos(Math.toRadians(c)) * Math.cos(Math.toRadians(b - 90)) * Math.sin(Math.toRadians(a))
								+ s * Math.sin(Math.toRadians(c)) * Math.sin(Math.toRadians(a - 90)))),
						((y + 1) - (r * Math.sin(Math.toRadians(b)) + s * Math.cos(Math.toRadians(c)) * Math.sin(Math.toRadians(b - 90)))), (z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))
								+ s * Math.cos(Math.toRadians(c)) * Math.cos(Math.toRadians(b - 90)) * Math.cos(Math.toRadians(a)) + s * Math.sin(Math.toRadians(c)) * Math.cos(Math.toRadians(a - 90))),
						0, 0, 0);
				c = c + 6;
			}
			c = 0;
			i = 50;
		}
	}
}
