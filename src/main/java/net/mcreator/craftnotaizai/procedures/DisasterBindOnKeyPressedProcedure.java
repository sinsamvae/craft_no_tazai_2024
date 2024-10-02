package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.CondensePowerProjectileEntity;

public class DisasterBindOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Disaster")) {
			if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
					.getDouble(("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1))) < 1) {
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).rCoolDown < 1) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Status Promotion")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).StatusPromotion == false) {
							{
								boolean _setval = true;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StatusPromotion = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Skill Activated"), false);
						} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).StatusPromotion == true) {
							{
								boolean _setval = false;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StatusPromotion = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Skill Deactivate"), false);
						}
					}
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Condense Power")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 15) {
							if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 85
									+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount) {
								{
									double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana
											- (85 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount);
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.mana = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new CondensePowerProjectileEntity(CraftNoTaizaiModEntities.CONDENSE_POWER_PROJECTILE.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity,
												(float) (Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack) + 2), 1);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
								((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().putDouble(
										("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1)),
										45);
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\u00A7c" + "Not Enought Mana: "
											+ new java.text.DecimalFormat("##")
													.format(Math.ceil((85 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
															- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
											+ " More mana to perform this action ")), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Unlocks At Level 15"), false);
						}
					}
				}
			}
		}
	}
}
