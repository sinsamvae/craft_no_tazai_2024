package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class TalaVillageFlowerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.FLOWERPETALSPARTICLES.get()), (x + 0.5), y, (z + 0.5), 2, (-0.2), 0.4, 0.2, 0.1);
		world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 1);
	}
}
