package net.mcreator.craftnotaizai.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class RandomRaceConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> RANDOM_RACE;
	public static final ForgeConfigSpec.ConfigValue<Double> TP_AMOUNT;
	public static final ForgeConfigSpec.ConfigValue<Double> XP_AMOUNT;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_REGEN;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_DRAIN_ONE;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_DRAIN_TWO;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_DRAIN_THREE;
	public static final ForgeConfigSpec.ConfigValue<Double> SPEED;
	static {
		BUILDER.push("random_race");
		RANDOM_RACE = BUILDER.comment("gives random race when you join world").define("random_race", true);
		TP_AMOUNT = BUILDER.comment("change the amount of tp you get when level up").define("Tp_Gain", (double) 10);
		XP_AMOUNT = BUILDER.comment("this changes the amount of xp you get from mobs").define("Xp_Gain", (double) 10);
		MANA_REGEN = BUILDER.comment("this change the amount you get from mana regen").define("mana_regen", (double) 0.04);
		MANA_DRAIN_ONE = BUILDER.comment("this is for first forms/skills that drain mana").define("mana_drain_one", (double) 0.09);
		MANA_DRAIN_TWO = BUILDER.define("mana_drain_two", (double) 0.13);
		MANA_DRAIN_THREE = BUILDER.define("mana_drain_three", (double) 0.15);
		SPEED = BUILDER.define("Speed", (double) 100);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
