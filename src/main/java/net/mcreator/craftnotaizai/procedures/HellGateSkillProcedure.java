package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.HellGateRedDemonsEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.Comparator;

public class HellGateSkillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double distance_in_blocks = 0;
		double y_offset = 0;
		y_offset = 3;
		distance_in_blocks = 1;
		world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.HELL_GATE_PARTICLES.get()), (entity.getX() + entity.getLookAngle().x * distance_in_blocks), (entity.getY() + y_offset),
				(entity.getZ() + entity.getLookAngle().z * distance_in_blocks), 0, 0, 0);
		if (!(!world.getEntitiesOfClass(HellGateRedDemonsEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty())) {
			CraftNoTaizaiMod.queueServerWork(8, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.HELL_GATE_RED_DEMONS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (((Entity) world.getEntitiesOfClass(HellGateRedDemonsEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
					_toTame.tame(_owner);
			});
		}
	}
}
