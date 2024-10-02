package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class ChangemagicSunShineProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		{
			String _setval = "SunShine";
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "Player");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magic = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "Player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
		{
			String _setval = "";
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "Player");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.supmagic = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "Player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability1", "Cruel Sun");
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability2", "Crazy Prominence");
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability3", "The One");
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability4", "Final Prominence");
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability5", "The One Ultimate");
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability6", "");
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability7", "");
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString("Ability8", "");
	}
}
