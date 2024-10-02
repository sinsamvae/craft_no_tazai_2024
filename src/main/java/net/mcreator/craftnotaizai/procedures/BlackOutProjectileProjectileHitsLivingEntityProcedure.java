package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

public class BlackOutProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double x = 0;
		double z = 0;
		double yaw = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.BLACK_OUT_EFFECT.get(), 1200, 1, false, false));
		x = entity.getX();
		z = entity.getZ();
		yaw = entity.getYRot() + 180;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("summon craft_no_taizai:black_out " + x + " ~ " + z + " {Rotation:[" + yaw + "f,0f]}"));
			}
		}
		if (immediatesourceentity.getPersistentData().getBoolean("deflected") == true) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
					(float) ((immediatesourceentity instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) * 1.5));
		}
	}
}
