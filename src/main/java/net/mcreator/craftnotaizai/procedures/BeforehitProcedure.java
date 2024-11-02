package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BeforehitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, double amount) {
		execute(null, world, damagesource, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, double amount) {
		if (damagesource == null || entity == null)
			return;
		ItemStack weapon = ItemStack.EMPTY;
		double dmg = 0;
		double armor = 0;
		double current_health = 0;
		double health_reduction = 0;
		double armour = 0;
		double n = 0;
		double damage = 0;
		double night1 = 0;
		double stage = 0;
		double night2 = 0;
		double day2 = 0;
		double day1 = 0;
		dmg = amount;
		if (event != null && event.isCancelable()) {
			event.setCanceled(true);
		} else if (event != null && event.hasResult()) {
			event.setResult(Event.Result.DENY);
		}
		if (entity.getPersistentData().getBoolean("hit")) {
			entity.getPersistentData().putBoolean("hit", false);
			dmg = dmg + entity.getPersistentData().getDouble("deal");
		}
		armor = entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0;
		dmg = dmg * (200 / (200 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Spirit));
		dmg = dmg * (200 / (200 + entity.getPersistentData().getDouble("Spirit")));
		dmg = dmg * (25 / (25 + armor));
		if (entity instanceof Player) {
			current_health = (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 20;
			current_health = current_health * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth;
			current_health = current_health - dmg;
			current_health = current_health / (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth;
			current_health = current_health * 20;
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).demon == true && Math.floor(current_health) <= 1) {
				n = Mth.nextInt(RandomSource.create(), 1, 100);
				if (n <= 5) {
					if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Purgatory) {
						current_health = 0.1;
						if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
							ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:purgatory"));
							if (_player.level().dimension() == destinationType)
								return;
							ServerLevel nextLevel = _player.server.getLevel(destinationType);
							if (nextLevel != null) {
								_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
								_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
								_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
								for (MobEffectInstance _effectinstance : _player.getActiveEffects())
									_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
								_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.GIDEON.get()
					&& damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg")))) {
				dmg = dmg * 0.4;
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.ALDAN.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.ALDAN.get())
					&& !(entity instanceof Player _plrCldCheck16 && _plrCldCheck16.getCooldowns().isOnCooldown(CraftNoTaizaiModItems.ALDAN.get())) && Math.floor(current_health) <= 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 3, false, false));
				current_health = 0.1;
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(CraftNoTaizaiModItems.ALDAN.get(), 24000);
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).immortality == true && Math.floor(current_health) <= 0
					&& !(entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get()))) {
				current_health = 0.1;
			}
			if (entity.getPersistentData().getBoolean("infinity") == true && Math.floor(current_health) <= 0) {
				current_health = 0.1;
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).infinity_use == true && Math.floor(current_health) <= 0) {
				current_health = 0.1;
			}
			if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(CraftNoTaizaiModMobEffects.PHYSICAL_HUNT_NEG.get())) {
				dmg = dmg * 1.8;
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).PhysicalHuntlogic == true) {
				dmg = dmg * 0.5;
			}
			if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(CraftNoTaizaiModMobEffects.KING_TRUMPET.get())) {
				dmg = dmg * 1.1;
			}
			if (entity instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(CraftNoTaizaiModMobEffects.NIGHTMARETELLER.get())) {
				dmg = dmg * 1.3;
			}
			if (entity instanceof LivingEntity _livEnt24 && _livEnt24.isBlocking() && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.FREEZE_SHIELD.get()) {
				dmg = dmg * 0.8;
			}
			if (entity instanceof LivingEntity _livEnt27 && _livEnt27.isBlocking() && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.PILLOW.get()) {
				dmg = dmg * 0.9;
			}
			if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("SunShine")) {
				day1 = 0;
				day2 = 12040;
				night1 = 12542;
				night2 = 23000;
				if (world.dayTime() % 24000 >= day1 && world.dayTime() % 24000 <= day2) {
					dmg = dmg * 0.5;
				} else if (world.dayTime() % 24000 >= night1 && world.dayTime() % 24000 <= night2) {
					dmg = dmg * 1.5;
				}
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.PEACE_AMULET_CHESTPLATE.get()) {
				dmg = dmg * 0.9;
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) current_health);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - dmg));
		}
	}
}
