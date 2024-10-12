package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class HornofCernunnosOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("TextDelay") >= 5) {
			if (entity.getPersistentData().getDouble("CharacterCount") < (entity.getPersistentData().getString("MyFullText")).length()) {
				entity.getPersistentData().putDouble("CharacterCount", (entity.getPersistentData().getDouble("CharacterCount") + 1));
			} else {
				entity.getPersistentData().putDouble("CharacterCount", 0);
			}
			entity.getPersistentData().putString("DisplayText", ((entity.getPersistentData().getString("MyFullText")).substring(0, (int) entity.getPersistentData().getDouble("CharacterCount"))));
			entity.getPersistentData().putDouble("TextDelay", 0);
		} else {
			entity.getPersistentData().putDouble("TextDelay", (entity.getPersistentData().getDouble("TextDelay") + 1));
		}
	}
}
