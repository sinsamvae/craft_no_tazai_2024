package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.configuration.RandomRaceConfigConfiguration;

import java.util.List;
import java.util.Comparator;

public class FairyHelbremEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story22")) {
			if (!(entity instanceof Player)) {
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(65 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player && !(entityiterator == entity)) {
							{
								double _setval = (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).xp
										+ (Math.ceil(sourceentity.getPersistentData().getDouble("level")) * 0.5 + 590) * ((double) RandomRaceConfigConfiguration.XP_AMOUNT.get() / 10);
								sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.xp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							{
								String _setval = "Story23";
								sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Story = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					}
				}
			}
		}
	}
}
