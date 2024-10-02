package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.EnergyArrowEntity;

public class WeinheidtOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("KiBlastTimer", (entity.getPersistentData().getDouble("KiBlastTimer") + 1));
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player || (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer) {
			entity.getPersistentData().putDouble("Distance", Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2)
					+ Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2) + Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)));
		}
		if (entity.getPersistentData().getDouble("Distance") < 13 && entity.getPersistentData().getDouble("Distance") > 8) {
			if (entity.getPersistentData().getDouble("KiBlastTimer") > 160) {
				entity.getPersistentData().putDouble("KiBlastTimer", 0);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EnergyArrowEntity(CraftNoTaizaiModEntities.ENERGY_ARROW.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 20, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
		}
	}
}
