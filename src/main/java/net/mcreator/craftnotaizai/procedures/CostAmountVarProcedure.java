package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class CostAmountVarProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double cost_amount = 0;
		return "Cost Amount: " + new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("cost_amount"));
	}
}
