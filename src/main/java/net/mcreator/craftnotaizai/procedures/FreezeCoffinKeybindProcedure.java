package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.List;
import java.util.Comparator;

public class FreezeCoffinKeybindProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean can_set = false;
		double check = 0;
		double rep = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).rCoolDown < 1) {
			if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
					.getDouble(("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1))) < 1) {
				if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
						.getString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move))).equals("Freeze Coffin")) {
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
						entity.getPersistentData().putDouble("range", 0.5);
						for (int index0 = 0; index0 < 40; index0++) {
							rep = rep + 0.3;
							CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
								entity.getPersistentData().putDouble("range", (entity.getPersistentData().getDouble("range") + 0.1));
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.FREEZE_COFFIN.get()), (entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range")),
											(entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range")), (entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range")), 5, 0.3, 0.3, 0.3,
											0.1);
								{
									final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range")),
											(entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range")), (entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range")));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (!(entity == entityiterator || entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb
												|| (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
												|| (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) || new Object() {
													public boolean checkGamemode(Entity _ent) {
														if (_ent instanceof ServerPlayer _serverPlayer) {
															return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
														} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
															return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
																	&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
														}
														return false;
													}
												}.checkGamemode(entityiterator) || new Object() {
													public boolean checkGamemode(Entity _ent) {
														if (_ent instanceof ServerPlayer _serverPlayer) {
															return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
														} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
															return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
																	&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
														}
														return false;
													}
												}.checkGamemode(entityiterator))) {
											entityiterator.hurt(
													new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg"))),
															entity),
													(float) (Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack) + 1));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.FREEZE_COFFIN_POTION_EFFECT.get(), 120, 1));
										}
									}
								}
							});
						}
						((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().putDouble(
								("cooldown" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move + 1)), 35);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(
									Component.literal(("\u00A7c" + "Not Enought Mana: "
											+ new java.text.DecimalFormat("##")
													.format(Math.ceil((45 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana_amount)
															- (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana))
											+ " More mana to perform this action ")),
									true);
					}
				}
			}
		}
	}
}
