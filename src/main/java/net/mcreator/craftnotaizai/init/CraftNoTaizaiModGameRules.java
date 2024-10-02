
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> IMMORTAL = GameRules.register("immortal", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
}
