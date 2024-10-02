package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.Comparator;

public class HunterWispCanUseRangedItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double distance = 0;
		double range = 0;
		double speed = 0;
		range = 15;
		speed = 2;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((range * 2) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (((Entity) world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), (range * 2), (range * 2), (range * 2)), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) == entityiterator) {
					if (!(entityiterator == entity || entityiterator == immediatesourceentity)) {
						distance = Math.pow(entityiterator.getX() - immediatesourceentity.getX(), speed) + Math.pow(entityiterator.getY() - immediatesourceentity.getY(), speed) + Math.pow(entityiterator.getZ() - immediatesourceentity.getZ(), speed);
						immediatesourceentity.setDeltaMovement(
								new Vec3(((entityiterator.getX() - immediatesourceentity.getX()) / distance), ((entityiterator.getY() - immediatesourceentity.getY()) / distance), ((entityiterator.getZ() - immediatesourceentity.getZ()) / distance)));
					}
				}
			}
		}
	}
}
