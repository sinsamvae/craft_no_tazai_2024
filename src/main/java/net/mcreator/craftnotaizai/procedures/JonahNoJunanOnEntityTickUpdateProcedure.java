package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.entity.WhaleEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.List;
import java.util.Comparator;

public class JonahNoJunanOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		double ran = 0;
		if (!(null == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null))) {
			entity.getPersistentData().putDouble("jonahDMG",
					(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack));
		}
		CraftNoTaizaiMod.queueServerWork(100, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
			entity.getPersistentData().putDouble("jonahDMG", 0);
		});
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof WhaleEntity)) {
					if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
				}
			}
		}
	}
}
