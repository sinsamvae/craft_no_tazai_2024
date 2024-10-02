package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class SunflowerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double height = 0;
		if (!(null == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null))) {
			entity.getPersistentData().putDouble("sunflower", (Math.ceil(
					0.45 * ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack)
					+ 5));
		}
		CraftNoTaizaiMod.queueServerWork(30, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
