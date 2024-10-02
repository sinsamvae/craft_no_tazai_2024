package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class FrezzeOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen(60);
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FREEZE)), 3);
	}
}
