package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.LightningbeastProjectileEntity;
import net.mcreator.craftnotaizai.entity.EmbraceoftheThunderGodProjectileEntity;

public class ThunderboltbindOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double delay = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).rCoolDown < 1) {
			if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
					.getDouble(("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1))) < 1) {
				if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Thunderbolt")) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Purge of the Thunder Emperor")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 30
								+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount) {
							{
								double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana
										- (30 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount);
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.mana = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							PurgeoftheThunderEmperorProcedure.execute(world, entity);
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().putDouble(
									("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1)), 30);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7c" + "Not Enought Mana: "
										+ new java.text.DecimalFormat("##")
												.format(Math.ceil((30 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
														- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
										+ " More mana to perform this action ")), true);
						}
					}
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Lightning Beast")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 10) {
							if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 75
									+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount) {
								{
									double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana
											- (75 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount);
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
												AbstractArrow entityToSpawn = new LightningbeastProjectileEntity(CraftNoTaizaiModEntities.LIGHTNINGBEAST_PROJECTILE.get(), level);
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
													.format(Math.ceil((75 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
															- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
											+ " More mana to perform this action ")), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Unlocks At Level 10"), false);
						}
					}
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Iron Hammer of the Thunder Emperor")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 20) {
							if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 145
									+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount) {
								{
									double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana
											- (145 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount);
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.mana = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								IronHammeroftheThunderEmperorProcedure.execute(world, x, y, z, entity);
								((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().putDouble(
										("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1)),
										65);
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\u00A7c" + "Not Enought Mana: "
											+ new java.text.DecimalFormat("##")
													.format(Math.ceil((145 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
															- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
											+ " More mana to perform this action ")), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Unlocks At Level 20"), false);
						}
					}
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Thunder Scream Strike")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 25) {
							if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 165
									+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount) {
								{
									double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana
											- (165 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount);
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.mana = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								ThunderScreamStrikeProcedure.execute(world, x, y, z, entity);
								((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().putDouble(
										("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1)),
										80);
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\u00A7c" + "Not Enought Mana: "
											+ new java.text.DecimalFormat("##")
													.format(Math.ceil((165 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
															- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
											+ " More mana to perform this action ")), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7c" + "Not Enought Mana: "
										+ new java.text.DecimalFormat("##")
												.format(Math.ceil((165 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
														- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
										+ " More mana to perform this action ")), true);
						}
					}
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Heavy Armor")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 35) {
							if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).lightningarmor == false) {
								{
									double _setval = 1;
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.heavy_armor = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = true;
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.lightningarmor = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).lightningarmor == true) {
								{
									double _setval = 3;
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.heavy_armor = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = false;
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.lightningarmor = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Unlocks At Level 35"), false);
						}
					}
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Embrace of the Thunder God")) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 200
								+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount) {
							{
								double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana
										- (200 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount);
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
											AbstractArrow entityToSpawn = new EmbraceoftheThunderGodProjectileEntity(CraftNoTaizaiModEntities.EMBRACEOFTHE_THUNDER_GOD_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity,
											(float) (Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack) + 5), 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 3.5, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().putDouble(
									("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1)), 95);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7c" + "Not Enought Mana: "
										+ new java.text.DecimalFormat("##")
												.format(Math.ceil((200 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
														- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
										+ " More mana to perform this action ")), true);
						}
					}
				}
			}
		}
	}
}
