
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class CraftNoTaizaiModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<MobEffect> FREZZE = REGISTRY.register("frezze", () -> new FrezzeMobEffect());
	public static final RegistryObject<MobEffect> PHYSICALHUNT = REGISTRY.register("physicalhunt", () -> new PhysicalhuntMobEffect());
	public static final RegistryObject<MobEffect> NIGHTMARETELLER = REGISTRY.register("nightmareteller", () -> new NightmaretellerMobEffect());
	public static final RegistryObject<MobEffect> KING_TRUMPET = REGISTRY.register("king_trumpet", () -> new KingTrumpetMobEffect());
	public static final RegistryObject<MobEffect> PHYSICAL_HUNT_NEG = REGISTRY.register("physical_hunt_neg", () -> new PhysicalHuntNegMobEffect());
	public static final RegistryObject<MobEffect> BIND = REGISTRY.register("bind", () -> new BindMobEffect());
	public static final RegistryObject<MobEffect> PURGATORY_FLAME = REGISTRY.register("purgatory_flame", () -> new PurgatoryFlameMobEffect());
	public static final RegistryObject<MobEffect> JACK_POTION = REGISTRY.register("jack_potion", () -> new JackPotionMobEffect());
	public static final RegistryObject<MobEffect> MINIMUM_TABLETS_EFFECT = REGISTRY.register("minimum_tablets_effect", () -> new MinimumTabletsEffectMobEffect());
	public static final RegistryObject<MobEffect> FREEZE_COFFIN_POTION_EFFECT = REGISTRY.register("freeze_coffin_potion_effect", () -> new FreezeCoffinPotionEffectMobEffect());
	public static final RegistryObject<MobEffect> MANA_REGEN_EFFET = REGISTRY.register("mana_regen_effet", () -> new ManaRegenEffetMobEffect());
	public static final RegistryObject<MobEffect> POWER_AMPLIFY_EFFECT = REGISTRY.register("power_amplify_effect", () -> new PowerAmplifyEffectMobEffect());
	public static final RegistryObject<MobEffect> FOSSILIZATION_EFFECT = REGISTRY.register("fossilization_effect", () -> new FossilizationEffectMobEffect());
	public static final RegistryObject<MobEffect> NECROSIS = REGISTRY.register("necrosis", () -> new NecrosisMobEffect());
	public static final RegistryObject<MobEffect> BLACK_OUT_EFFECT = REGISTRY.register("black_out_effect", () -> new BlackOutEffectMobEffect());
	public static final RegistryObject<MobEffect> JUBAKU_ENSA_EFFECT = REGISTRY.register("jubaku_ensa_effect", () -> new JubakuEnsaEffectMobEffect());
	public static final RegistryObject<MobEffect> VENOM_TOXICY_POTION = REGISTRY.register("venom_toxicy_potion", () -> new VenomToxicyPotionMobEffect());
}
