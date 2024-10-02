package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class ChangegaintProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Human_Clan == 4 || ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Demon_Clan == 4 || ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "Player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Fairy_Clan == 4) {
			{
				double _setval = 4;
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
					capability.GaintRace = _setval;
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
				String _setval = "Giant";
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
					capability.Race = _setval;
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
				boolean _setval = true;
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
					capability.gaint = _setval;
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
				boolean _setval = false;
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
					capability.demon = _setval;
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
				boolean _setval = false;
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
					capability.human = _setval;
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
				boolean _setval = false;
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
					capability.fairy = _setval;
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
			ResetMoveSlotsProcedure.execute(arguments, entity);
			ResetSpellsSlotsProcedure.execute(arguments, entity);
		}
	}
}
