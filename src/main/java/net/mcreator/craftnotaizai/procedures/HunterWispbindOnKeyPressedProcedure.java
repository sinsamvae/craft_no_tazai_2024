package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.HunterWispProjectileEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.List;
import java.util.Comparator;

public class HunterWispbindOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double r = 0;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Hunter Wisp")) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).rCoolDown < 1) {
				if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
						.getDouble(("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1))) < 1) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Hunter Wisp")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 45
								+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount) {
							{
								double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana
										- (45 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount);
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.mana = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator.getPersistentData().getDouble("homingtarget") == 1) {
										entityiterator.getPersistentData().putDouble("homingtarget", 0);
									}
								}
							}
							r = 1;
							for (int index0 = 0; index0 < 20; index0++) {
								if (!world
										.getEntitiesOfClass(Mob.class,
												AABB.ofSize(new Vec3((entity.getX() + r * entity.getLookAngle().x), (entity.getY() + 1.5 + r * entity.getLookAngle().y), (entity.getZ() + r * entity.getLookAngle().z)), 0.5, 0.5, 0.5), e -> true)
										.isEmpty()) {
									((Entity) world
											.getEntitiesOfClass(Mob.class,
													AABB.ofSize(new Vec3((entity.getX() + r * entity.getLookAngle().x), (entity.getY() + 1.5 + r * entity.getLookAngle().y), (entity.getZ() + r * entity.getLookAngle().z)), 0.5, 0.5, 0.5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf((entity.getX() + r * entity.getLookAngle().x), (entity.getY() + 1.5 + r * entity.getLookAngle().y), (entity.getZ() + r * entity.getLookAngle().z))).findFirst().orElse(null))
											.getPersistentData().putDouble("homingtarget", 1);
									if (((Entity) world
											.getEntitiesOfClass(Mob.class,
													AABB.ofSize(new Vec3((entity.getX() + r * entity.getLookAngle().x), (entity.getY() + 1.5 + r * entity.getLookAngle().y), (entity.getZ() + r * entity.getLookAngle().z)), 0.5, 0.5, 0.5), e -> true)
											.stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf((entity.getX() + r * entity.getLookAngle().x), (entity.getY() + 1.5 + r * entity.getLookAngle().y), (entity.getZ() + r * entity.getLookAngle().z))).findFirst()
											.orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 1, false, false));
									break;
								}
								r = r + 1;
							}
							CraftNoTaizaiMod.queueServerWork(5, () -> {
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new HunterWispProjectileEntity(CraftNoTaizaiModEntities.HUNTER_WISP_PROJECTILE.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity,
												(float) (Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack) + 1), 1);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
							});
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().putDouble(
									("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1)), 30);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7c" + "Not Enought Mana: "
										+ new java.text.DecimalFormat("##")
												.format(Math.ceil((45 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
														- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
										+ " More mana to perform this action ")), true);
						}
					}
				}
			}
		}
	}
}
