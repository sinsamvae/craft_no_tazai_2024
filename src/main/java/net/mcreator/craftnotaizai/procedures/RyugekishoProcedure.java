package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;

public class RyugekishoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String oldblock = "";
		String ryugekisho = "";
		String block = "";
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Ryugekisho == true) {
			int horizontalRadiusSphere = (int) 10 - 1;
			int verticalRadiusSphere = (int) 10 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							ryugekisho = "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
							if (y + i >= entity.getY()) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							}
							if (y + i < entity.getY()) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftNoTaizaiModBlocks.QUICK_SAND.get().defaultBlockState(), 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putString("ryugekisho", block);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					}
				}
			}
		}
	}
}
