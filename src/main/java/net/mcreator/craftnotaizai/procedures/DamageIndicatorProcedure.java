package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class DamageIndicatorProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = BoolArgumentType.getBool(arguments, "name");
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.damage_indicator = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
