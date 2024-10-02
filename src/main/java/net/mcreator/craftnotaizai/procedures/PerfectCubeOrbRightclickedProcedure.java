package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;

public class PerfectCubeOrbRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String oldblock = "";
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(CraftNoTaizaiModItems.PERFECT_CUBE_ORB.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		int horizontalRadiusSphere = (int) 20 - 1;
		int verticalRadiusSphere = (int) 20 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						oldblock = (("" + world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).replace("Block{", "")).replace("}", "");
						if (y + i >= entity.getY()) {
							world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						}
						if (y + i < entity.getY()) {
							world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftNoTaizaiModBlocks.PERFECT_CUBE.get().defaultBlockState(), 3);
						}
						if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 18) {
							world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftNoTaizaiModBlocks.PERFECT_CUBE.get().defaultBlockState(), 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putString("old_block", oldblock);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
		}
	}
}
