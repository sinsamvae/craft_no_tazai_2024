package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEnchantments;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class ArkHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack weapon = ItemStack.EMPTY;
		double damage = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(CraftNoTaizaiModEnchantments.ARK.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(CraftNoTaizaiModEnchantments.ARK.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg")))),
					(float) ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack + 3));
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(CraftNoTaizaiModEnchantments.ARK.get())) {
					_enchantments.remove(CraftNoTaizaiModEnchantments.ARK.get());
					EnchantmentHelper.setEnchantments(_enchantments, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
				}
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(CraftNoTaizaiModEnchantments.ARK.get())) {
					_enchantments.remove(CraftNoTaizaiModEnchantments.ARK.get());
					EnchantmentHelper.setEnchantments(_enchantments, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
				}
			}
		}
	}
}
