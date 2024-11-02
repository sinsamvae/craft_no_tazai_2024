package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class PurgatorySetUpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double TPX = 0;
		double Scenario = 0;
		double TPZ = 0;
		double xTP = 0;
		double yTP = 0;
		double zTP = 0;
		xTP = 0;
		yTP = 75;
		zTP = 0;
		{
			Entity _ent = entity;
			_ent.teleportTo(xTP, yTP, zTP);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(xTP, yTP, zTP, _ent.getYRot(), _ent.getXRot());
		}
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).purgatory) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "purgatory_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(xTP - 30, yTP - 11, zTP - 40), BlockPos.containing(xTP - 30, yTP - 11, zTP - 40),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			CraftNoTaizaiModVariables.MapVariables.get(world).purgatory = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
