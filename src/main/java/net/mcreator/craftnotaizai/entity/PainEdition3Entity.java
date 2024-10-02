
package net.mcreator.craftnotaizai.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.craftnotaizai.procedures.PainEdition3WhileProjectileFlyingTickProcedure;
import net.mcreator.craftnotaizai.procedures.KillSwitchProjectileHitsLivingEntityProcedure;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class PainEdition3Entity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public PainEdition3Entity(PlayMessages.SpawnEntity packet, Level world) {
		super(CraftNoTaizaiModEntities.PAIN_EDITION_3.get(), world);
	}

	public PainEdition3Entity(EntityType<? extends PainEdition3Entity> type, Level world) {
		super(type, world);
	}

	public PainEdition3Entity(EntityType<? extends PainEdition3Entity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public PainEdition3Entity(EntityType<? extends PainEdition3Entity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		KillSwitchProjectileHitsLivingEntityProcedure.execute(this.level(), entityHitResult.getEntity(), this);
	}

	@Override
	public void tick() {
		super.tick();
		PainEdition3WhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this.getOwner(), this);
		if (this.inGround)
			this.discard();
	}

	public static PainEdition3Entity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 5, 5);
	}

	public static PainEdition3Entity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1f, 5, 5);
	}

	public static PainEdition3Entity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		PainEdition3Entity entityarrow = new PainEdition3Entity(CraftNoTaizaiModEntities.PAIN_EDITION_3.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static PainEdition3Entity shoot(LivingEntity entity, LivingEntity target) {
		PainEdition3Entity entityarrow = new PainEdition3Entity(CraftNoTaizaiModEntities.PAIN_EDITION_3.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
