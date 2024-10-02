package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.IceBulletsProjectileEntity;

public class BlueKnightEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double hit = 0;
		entity.getPersistentData().putDouble("KiBlastTimer", (entity.getPersistentData().getDouble("KiBlastTimer") + 1));
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player || (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer) {
			entity.getPersistentData().putDouble("Distance", Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2)
					+ Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2) + Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)));
		}
		if (entity.getPersistentData().getDouble("Distance") < 13 && entity.getPersistentData().getDouble("Distance") > 8) {
			if (entity.getPersistentData().getDouble("KiBlastTimer") > 160) {
				entity.getPersistentData().putDouble("KiBlastTimer", 0);
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new IceBulletsProjectileEntity(CraftNoTaizaiModEntities.ICE_BULLETS_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack + 35), 1);
					_entityToSpawn.setPos((entity.getX()), (entity.getY()), (entity.getZ()));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 5, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new IceBulletsProjectileEntity(CraftNoTaizaiModEntities.ICE_BULLETS_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack + 35), 1);
					_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.6), (entity.getZ()));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 5, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new IceBulletsProjectileEntity(CraftNoTaizaiModEntities.ICE_BULLETS_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack + 35), 1);
					_entityToSpawn.setPos((entity.getX()), (entity.getY()), (entity.getZ() + 1.6));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 5, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new IceBulletsProjectileEntity(CraftNoTaizaiModEntities.ICE_BULLETS_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack + 35), 1);
					_entityToSpawn.setPos((entity.getX() + 1.6), (entity.getY()), (entity.getZ()));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 5, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
	}
}
