package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class TeleportButtonProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		String x = "";
		String y = "";
		String z = "";
		x = guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "";
		y = guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "";
		z = guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "";
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("tp @s" + " " + x + " " + y + " " + z));
			}
		}
	}
}
