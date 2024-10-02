package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.item.BowItem;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.ArrowEntity;

public class BowRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack nbt = ItemStack.EMPTY;
		double damage = 0;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.ARROW)) : false) {
			if (itemstack.getItem() instanceof BowItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "shot");
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new ArrowEntity(CraftNoTaizaiModEntities.ARROW.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 1);
				_entityToSpawn.setPos((entity.getX() + entity.getLookAngle().x), (entity.getY() + entity.getLookAngle().y + 1.8), (entity.getZ() + entity.getLookAngle().z));
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(CraftNoTaizaiModItems.BOW.get(), 25);
			new ItemStack(Items.ARROW).shrink(1);
		}
	}
}
