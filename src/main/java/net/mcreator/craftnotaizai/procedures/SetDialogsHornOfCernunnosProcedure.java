package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class SetDialogsHornOfCernunnosProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String set_dialong = "";
		String set_answer1 = "";
		String set_answer2 = "";
		String set_answer3 = "";
		double set1_continue = 0;
		double set2_continue = 0;
		double set3_continue = 0;
		entity.getPersistentData().putString("MyFullText", "Naka Is Gay!");
		return entity.getPersistentData().getString("MyFullText");
	}
}
