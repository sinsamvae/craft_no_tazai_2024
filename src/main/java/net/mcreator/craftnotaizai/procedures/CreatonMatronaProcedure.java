package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

import java.util.List;
import java.util.Comparator;

public class CreatonMatronaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String oldblock = "";
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("CreationMatrona")) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).rCoolDown < 1) {
				if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).selectmove).equals("Ryugekisho")) {
					if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 5) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 45) {
							{
								double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana - 45;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.mana = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Ryugekisho == false) {
								{
									boolean _setval = true;
									entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Ryugekisho = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
							if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Ryugekisho == true) {
								RyugekishoProcedure.execute(world, x, y, z, entity);
							}
							{
								double _setval = 60;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.rCoolDown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Not Enough Mana 45 Needed"), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Unlocks At Level 5"), false);
					}
				}
				if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).selectmove).equals("Daichi no Kiba")) {
					if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 10) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana >= 150) {
							{
								double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).mana - 150;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.mana = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator)) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)),
												(float) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack + 2));
									}
								}
							}
							int horizontalRadiusSphere = (int) 5 - 1;
							int verticalRadiusSphere = (int) 5 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if (y + i < entity.getY()) {
												if (world instanceof ServerLevel _level) {
													Entity entityToSpawn = CraftNoTaizaiModEntities.EARTHSPIKE.get().spawn(_level, BlockPos.containing(x + xi, y + i + 1, z + zi), MobSpawnType.MOB_SUMMONED);
													if (entityToSpawn != null) {
														entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
													}
												}
											}
										}
									}
								}
							}
							{
								double _setval = 95;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.rCoolDown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Not Enough Mana 150 Needed"), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Unlocks At Level 10"), false);
					}
				}
				if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).selectmove).equals("Heavy Metal")) {
					if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 20) {
						if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).heavy_metal == false) {
							{
								double _setval = 1;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.heavy_meta = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = true;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.heavy_metal = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).heavy_metal == true) {
							{
								double _setval = 3;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.heavy_meta = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.heavy_metal = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Unlocks At Level 20"), false);
					}
				}
			}
		}
	}
}
