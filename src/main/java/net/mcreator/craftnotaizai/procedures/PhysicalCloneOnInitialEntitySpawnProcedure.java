package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.entity.PhysicalCloneEntity;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class PhysicalCloneOnInitialEntitySpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PhysicalCloneEntity && !(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1000 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player && (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftNoTaizaiModItems.LOSTVAYNE.get())) : false)) {
						if (entity instanceof TamableAnimal _toTame && entityiterator instanceof Player _owner)
							_toTame.tame(_owner);
					}
				}
			}
		}
	}
}
