
package net.mcreator.craftnotaizai.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.craftnotaizai.procedures.SetstrengthcommandProcedure;
import net.mcreator.craftnotaizai.procedures.SethealthcommandProcedure;
import net.mcreator.craftnotaizai.procedures.SetdexcommandProcedure;
import net.mcreator.craftnotaizai.procedures.SetSpeedCommandProcedure;
import net.mcreator.craftnotaizai.procedures.SetMaxManaProcedure;
import net.mcreator.craftnotaizai.procedures.MagicdmgprocedureProcedure;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SetStatCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("set_stat").requires(s -> s.hasPermission(1))
				.then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Max_Health").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SethealthcommandProcedure.execute(arguments);
					return 0;
				})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Strength").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetstrengthcommandProcedure.execute(arguments);
					return 0;
				})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Spirt").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetdexcommandProcedure.execute(arguments);
					return 0;
				})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Speed").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetSpeedCommandProcedure.execute(arguments);
					return 0;
				})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Max_Mana").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetMaxManaProcedure.execute(arguments);
					return 0;
				})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Magic_Damage").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					MagicdmgprocedureProcedure.execute(arguments);
					return 0;
				})))));
	}
}
