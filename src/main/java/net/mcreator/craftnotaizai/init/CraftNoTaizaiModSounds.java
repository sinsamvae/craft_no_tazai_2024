
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CraftNoTaizaiModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<SoundEvent> FULLCONTER = REGISTRY.register("fullconter", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "fullconter")));
	public static final RegistryObject<SoundEvent> FULLCOUNTER_AUDIO = REGISTRY.register("fullcounter_audio", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "fullcounter_audio")));
	public static final RegistryObject<SoundEvent> REVENGECOUNTER = REGISTRY.register("revengecounter", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "revengecounter")));
	public static final RegistryObject<SoundEvent> UNSHEATHED = REGISTRY.register("unsheathed", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "unsheathed")));
	public static final RegistryObject<SoundEvent> INTOSHEATH = REGISTRY.register("intosheath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "intosheath")));
	public static final RegistryObject<SoundEvent> FAST = REGISTRY.register("fast", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "fast")));
	public static final RegistryObject<SoundEvent> SWISH = REGISTRY.register("swish", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "swish")));
	public static final RegistryObject<SoundEvent> GRAVITY = REGISTRY.register("gravity", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "gravity")));
	public static final RegistryObject<SoundEvent> CRUELSUNFLYINGTICK = REGISTRY.register("cruelsunflyingtick", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "cruelsunflyingtick")));
	public static final RegistryObject<SoundEvent> CRUELSUNHIT = REGISTRY.register("cruelsunhit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_no_taizai", "cruelsunhit")));
}
