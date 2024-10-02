package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.BasquiasProjectileEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class BasquiasSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance_in_blocks = 0;
		double y_offset = 0;
		y_offset = 3;
		distance_in_blocks = 1;
		world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.BASQUIAS_PARTICLE.get()), (entity.getX() + entity.getLookAngle().x * distance_in_blocks), (entity.getY() + y_offset),
				(entity.getZ() + entity.getLookAngle().z * distance_in_blocks), 0, 0, 0);
		CraftNoTaizaiMod.queueServerWork(8, () -> {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new BasquiasProjectileEntity(CraftNoTaizaiModEntities.BASQUIAS_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack) + 1), 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		});
	}
}
