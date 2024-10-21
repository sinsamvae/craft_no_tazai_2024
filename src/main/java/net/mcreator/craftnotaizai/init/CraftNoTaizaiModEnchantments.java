
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.craftnotaizai.enchantment.EnchantmentHellblazeEnchantment;
import net.mcreator.craftnotaizai.enchantment.ArkEnchantment;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CraftNoTaizaiModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<Enchantment> ARK = REGISTRY.register("ark", () -> new ArkEnchantment());
	public static final RegistryObject<Enchantment> ENCHANTMENT_HELLBLAZE = REGISTRY.register("enchantment_hellblaze", () -> new EnchantmentHellblazeEnchantment());
}
