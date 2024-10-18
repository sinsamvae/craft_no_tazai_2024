package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class UseMagicPressed3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SpellsKeybindProcedure.execute(world, x, y, z, entity);
		TempestBindOnKeyPressedProcedure.execute(world, entity);
		IceFangBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		AcidkeyPressProcedure.execute(world, x, y, z, entity);
		HellBlazeOnKeyPressProcedure.execute(world, entity);
		MiracleWindKeyPressProcedure.execute(world, x, y, z, entity);
		BlazeBindOnKeyPressedProcedure.execute(entity);
		InfinityBindOnKeyPressedProcedure.execute(world, entity);
		CreationbindOnKeyPressedProcedure.execute(world, entity);
		FullCounterOnKeyPressedProcedure.execute(world, entity);
		SnatchBindOnKeyPressedProcedure.execute(world, entity);
		InvasionBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		SunshinekeypressProcedure.execute(world, entity);
		DisasterBindOnKeyPressedProcedure.execute(entity);
		GrayDemonMoveProcedure.execute(world, x, y, z, entity);
		DemonRegenMoveProcedure.execute(entity);
		ComboStarKeybindProcedure.execute(entity);
		TrickStarKeyBindProcedure.execute(world, entity);
		FullSizeKeybindProcedure.execute(entity);
		CriticalOverKeybindProcedure.execute(world, x, y, z, entity);
		TrueSpirtSpearKeybindProcedure.execute(entity);
		HellBlazeKeybindProcedure.execute(entity);
	}
}
