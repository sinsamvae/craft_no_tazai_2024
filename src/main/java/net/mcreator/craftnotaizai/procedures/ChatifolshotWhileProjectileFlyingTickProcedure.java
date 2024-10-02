package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import java.util.List;
import java.util.Comparator;

public class ChatifolshotWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		double a = 0;
		double cubesize = 0;
		double sev = 0;
		double sevx = 0;
		double sevy = 0;
		double sevz = 0;
		double tedx = 0;
		double tedy = 0;
		double tedz = 0;
		double ted = 0;
		double sevx2 = 0;
		double sevy2 = 0;
		double sevz2 = 0;
		double sev2 = 0;
		if (!immediatesourceentity.isNoGravity()) {
			immediatesourceentity.setNoGravity(true);
			immediatesourceentity.getPersistentData().putDouble("boom", 0);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						immediatesourceentity.getPersistentData().putString("pname", (entityiterator.getDisplayName().getString()));
					}
				}
			}
		}
		immediatesourceentity.getPersistentData().putDouble("boom", (immediatesourceentity.getPersistentData().getDouble("boom") + 1));
		a = Mth.nextInt(RandomSource.create(), 0, 8);
		cubesize = 100;
		if (immediatesourceentity.getPersistentData().getDouble("boom") >= 20) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty()) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(cubesize / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						if ((immediatesourceentity.getPersistentData().getString("pname")).equals(entityiterator.getDisplayName().getString())) {
							sev = Math.sqrt(Math.pow(immediatesourceentity.getDeltaMovement().x(), 2) + Math.pow(immediatesourceentity.getDeltaMovement().y(), 2) + Math.pow(immediatesourceentity.getDeltaMovement().z(), 2));
							sevx = immediatesourceentity.getDeltaMovement().x() / sev;
							sevy = immediatesourceentity.getDeltaMovement().y() / sev;
							sevz = immediatesourceentity.getDeltaMovement().z() / sev;
							tedx = entityiterator.getX() - immediatesourceentity.getX();
							tedy = entityiterator.getY() - immediatesourceentity.getY();
							tedz = entityiterator.getZ() - immediatesourceentity.getZ();
							ted = Math.sqrt(Math.pow(tedx, 2) + Math.pow(tedy, 2) + Math.pow(tedz, 2));
							tedx = tedx / ted;
							tedy = tedy / ted;
							tedz = tedz / ted;
							sevx2 = a * tedx + sevx;
							sevy2 = a * tedy + sevy;
							sevz2 = a * tedz + sevz;
							sev2 = Math.sqrt(Math.pow(sevx2, 2) + Math.pow(sevy2, 2) + Math.pow(sevz2, 2));
							sevx2 = sevx2 / sev2;
							sevy2 = sevy2 / sev2;
							sevz2 = sevz2 / sev2;
							immediatesourceentity.setDeltaMovement(new Vec3((sev * sevx2), (sev * sevy2), (sev * sevz2)));
						}
					}
				}
			}
		}
	}
}
