package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class PhysicalCloneOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(null == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null))) {
			entity.setCustomName(Component.literal(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getDisplayName().getString())));
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 1) {
				entity.getPersistentData().putDouble("CloneDMG", Math
						.ceil(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength
								/ 2));
				entity.getPersistentData().putDouble("CloneHealth", Math.ceil(
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth
								/ 2));
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 2) {
				entity.getPersistentData().putDouble("CloneDMG", Math
						.ceil(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength
								/ 4));
				entity.getPersistentData().putDouble("CloneHealth", Math.ceil(
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth
								/ 4));
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 3) {
				entity.getPersistentData().putDouble("CloneDMG", Math
						.ceil(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength
								/ 6));
				entity.getPersistentData().putDouble("CloneHealth", Math.ceil(
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth
								/ 6));
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 4) {
				entity.getPersistentData().putDouble("CloneDMG", Math
						.ceil(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength
								/ 8));
				entity.getPersistentData().putDouble("CloneHealth", Math.ceil(
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth
								/ 8));
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 5) {
				entity.getPersistentData().putDouble("CloneDMG", Math
						.ceil(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength
								/ 10));
				entity.getPersistentData().putDouble("CloneHealth", Math.ceil(
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth
								/ 10));
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 6) {
				entity.getPersistentData().putDouble("CloneDMG", Math
						.ceil(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength
								/ 12));
				entity.getPersistentData().putDouble("CloneHealth", Math.ceil(
						((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth
								/ 12));
			}
		}
	}
}
