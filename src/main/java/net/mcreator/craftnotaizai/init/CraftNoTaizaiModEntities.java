
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<EntityType<RisingMeteorEntity>> RISING_METEOR = register("rising_meteor", EntityType.Builder.<RisingMeteorEntity>of(RisingMeteorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RisingMeteorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PollenGardenEntity>> POLLEN_GARDEN = register("pollen_garden", EntityType.Builder.<PollenGardenEntity>of(PollenGardenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PollenGardenEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<RisingTornadoEntityEntity>> RISING_TORNADO_ENTITY = register("rising_tornado_entity",
			EntityType.Builder.<RisingTornadoEntityEntity>of(RisingTornadoEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RisingTornadoEntityEntity::new)

					.sized(0f, 0f));
	public static final RegistryObject<EntityType<SunflowerEntity>> SUNFLOWER = register("sunflower",
			EntityType.Builder.<SunflowerEntity>of(SunflowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SunflowerEntity::new).fireImmune().sized(1.7f, 2f));
	public static final RegistryObject<EntityType<MantaEntity>> MANTA = register("manta",
			EntityType.Builder.<MantaEntity>of(MantaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MantaEntity::new)

					.sized(3f, 0.65f));
	public static final RegistryObject<EntityType<ChickenEntity>> CHICKEN = register("chicken",
			EntityType.Builder.<ChickenEntity>of(ChickenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChickenEntity::new)

					.sized(2.5f, 4.5f));
	public static final RegistryObject<EntityType<GeckolibKrakenEntity>> GECKOLIB_KRAKEN = register("geckolib_kraken",
			EntityType.Builder.<GeckolibKrakenEntity>of(GeckolibKrakenEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeckolibKrakenEntity::new)

					.sized(2f, 7f));
	public static final RegistryObject<EntityType<RedDemonGeckolibEntity>> RED_DEMON_GECKOLIB = register("red_demon_geckolib",
			EntityType.Builder.<RedDemonGeckolibEntity>of(RedDemonGeckolibEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedDemonGeckolibEntity::new)

					.sized(2.5f, 4.6f));
	public static final RegistryObject<EntityType<Guardian1Entity>> GUARDIAN_1 = register("guardian_1",
			EntityType.Builder.<Guardian1Entity>of(Guardian1Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Guardian1Entity::new).fireImmune().sized(2f, 5f));
	public static final RegistryObject<EntityType<HawksEntity>> HAWKS = register("hawks",
			EntityType.Builder.<HawksEntity>of(HawksEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HawksEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<BlackHoundEntity>> BLACK_HOUND = register("black_hound",
			EntityType.Builder.<BlackHoundEntity>of(BlackHoundEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackHoundEntity::new)

					.sized(1.4f, 1.6f));
	public static final RegistryObject<EntityType<SwordWolfEntity>> SWORD_WOLF = register("sword_wolf",
			EntityType.Builder.<SwordWolfEntity>of(SwordWolfEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwordWolfEntity::new)

					.sized(1.5f, 1.8f));
	public static final RegistryObject<EntityType<DaleArmoredEntity>> DALE_ARMORED = register("dale_armored",
			EntityType.Builder.<DaleArmoredEntity>of(DaleArmoredEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaleArmoredEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<DaleSecEntity>> DALE_SEC = register("dale_sec",
			EntityType.Builder.<DaleSecEntity>of(DaleSecEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaleSecEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<DalefinalEntity>> DALEFINAL = register("dalefinal",
			EntityType.Builder.<DalefinalEntity>of(DalefinalEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DalefinalEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<ElaineEntity>> ELAINE = register("elaine",
			EntityType.Builder.<ElaineEntity>of(ElaineEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ElaineEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackSmithEntity>> BLACK_SMITH = register("black_smith",
			EntityType.Builder.<BlackSmithEntity>of(BlackSmithEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackSmithEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InsectEntity>> INSECT = register("insect",
			EntityType.Builder.<InsectEntity>of(InsectEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InsectEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<BlazeProjectileEntity>> BLAZE_PROJECTILE = register("blaze_projectile", EntityType.Builder.<BlazeProjectileEntity>of(BlazeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlazeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ManpuunoGekirinProjectileEntity>> MANPUUNO_GEKIRIN_PROJECTILE = register("manpuuno_gekirin_projectile",
			EntityType.Builder.<ManpuunoGekirinProjectileEntity>of(ManpuunoGekirinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ManpuunoGekirinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoyokazenoGekirinProjectileEntity>> SOYOKAZENO_GEKIRIN_PROJECTILE = register("soyokazeno_gekirin_projectile",
			EntityType.Builder.<SoyokazenoGekirinProjectileEntity>of(SoyokazenoGekirinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SoyokazenoGekirinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellBlazeProjectileEntity>> HELL_BLAZE_PROJECTILE = register("hell_blaze_projectile", EntityType.Builder.<HellBlazeProjectileEntity>of(HellBlazeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HellBlazeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellblazeOmegaProjectileEntity>> HELLBLAZE_OMEGA_PROJECTILE = register("hellblaze_omega_projectile",
			EntityType.Builder.<HellblazeOmegaProjectileEntity>of(HellblazeOmegaProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(HellblazeOmegaProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RockRushProjectileEntity>> ROCK_RUSH_PROJECTILE = register("rock_rush_projectile", EntityType.Builder.<RockRushProjectileEntity>of(RockRushProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RockRushProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AcidtowerProjectileEntity>> ACIDTOWER_PROJECTILE = register("acidtower_projectile", EntityType.Builder.<AcidtowerProjectileEntity>of(AcidtowerProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(AcidtowerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EvilhoundProjectileEntity>> EVILHOUND_PROJECTILE = register("evilhound_projectile", EntityType.Builder.<EvilhoundProjectileEntity>of(EvilhoundProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EvilhoundProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WhirlShockProjectileEntity>> WHIRL_SHOCK_PROJECTILE = register("whirl_shock_projectile", EntityType.Builder.<WhirlShockProjectileEntity>of(WhirlShockProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WhirlShockProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BreakthroughProjectileEntity>> BREAKTHROUGH_PROJECTILE = register("breakthrough_projectile", EntityType.Builder.<BreakthroughProjectileEntity>of(BreakthroughProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BreakthroughProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightningbeastProjectileEntity>> LIGHTNINGBEAST_PROJECTILE = register("lightningbeast_projectile",
			EntityType.Builder.<LightningbeastProjectileEntity>of(LightningbeastProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(LightningbeastProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EmbraceoftheThunderGodProjectileEntity>> EMBRACEOFTHE_THUNDER_GOD_PROJECTILE = register("embraceofthe_thunder_god_projectile",
			EntityType.Builder.<EmbraceoftheThunderGodProjectileEntity>of(EmbraceoftheThunderGodProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EmbraceoftheThunderGodProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBulletsProjectileEntity>> ICE_BULLETS_PROJECTILE = register("ice_bullets_projectile", EntityType.Builder.<IceBulletsProjectileEntity>of(IceBulletsProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IceBulletsProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FreezeShieldProjectileEntity>> FREEZE_SHIELD_PROJECTILE = register("freeze_shield_projectile", EntityType.Builder.<FreezeShieldProjectileEntity>of(FreezeShieldProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FreezeShieldProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KillerIcebergProjectileEntity>> KILLER_ICEBERG_PROJECTILE = register("killer_iceberg_projectile",
			EntityType.Builder.<KillerIcebergProjectileEntity>of(KillerIcebergProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KillerIcebergProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DriftBombProjectileEntity>> DRIFT_BOMB_PROJECTILE = register("drift_bomb_projectile", EntityType.Builder.<DriftBombProjectileEntity>of(DriftBombProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DriftBombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BrilliantDetonationProjectileEntity>> BRILLIANT_DETONATION_PROJECTILE = register("brilliant_detonation_projectile",
			EntityType.Builder.<BrilliantDetonationProjectileEntity>of(BrilliantDetonationProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BrilliantDetonationProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HunterWispProjectileEntity>> HUNTER_WISP_PROJECTILE = register("hunter_wisp_projectile", EntityType.Builder.<HunterWispProjectileEntity>of(HunterWispProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HunterWispProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<JethammerProjectileEntity>> JETHAMMER_PROJECTILE = register("jethammer_projectile", EntityType.Builder.<JethammerProjectileEntity>of(JethammerProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(JethammerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SnowflowerbeamProjectileEntity>> SNOWFLOWERBEAM_PROJECTILE = register("snowflowerbeam_projectile",
			EntityType.Builder.<SnowflowerbeamProjectileEntity>of(SnowflowerbeamProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SnowflowerbeamProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RakanProjectileEntity>> RAKAN_PROJECTILE = register("rakan_projectile", EntityType.Builder.<RakanProjectileEntity>of(RakanProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RakanProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CondensePowerProjectileEntity>> CONDENSE_POWER_PROJECTILE = register("condense_power_projectile",
			EntityType.Builder.<CondensePowerProjectileEntity>of(CondensePowerProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CondensePowerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FossProjectileEntity>> FOSS_PROJECTILE = register("foss_projectile",
			EntityType.Builder.<FossProjectileEntity>of(FossProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FossProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BanishingKillProjectileEntity>> BANISHING_KILL_PROJECTILE = register("banishing_kill_projectile",
			EntityType.Builder.<BanishingKillProjectileEntity>of(BanishingKillProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BanishingKillProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FakeBallProjectileEntity>> FAKE_BALL_PROJECTILE = register("fake_ball_projectile", EntityType.Builder.<FakeBallProjectileEntity>of(FakeBallProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FakeBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExterminateRayProjectileEntity>> EXTERMINATE_RAY_PROJECTILE = register("exterminate_ray_projectile",
			EntityType.Builder.<ExterminateRayProjectileEntity>of(ExterminateRayProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ExterminateRayProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PurgatoryVenomProjectileEntity>> PURGATORY_VENOM_PROJECTILE = register("purgatory_venom_projectile",
			EntityType.Builder.<PurgatoryVenomProjectileEntity>of(PurgatoryVenomProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PurgatoryVenomProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KillSwitchProjectileEntity>> KILL_SWITCH_PROJECTILE = register("kill_switch_projectile", EntityType.Builder.<KillSwitchProjectileEntity>of(KillSwitchProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KillSwitchProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CruelSunProjectileEntity>> CRUEL_SUN_PROJECTILE = register("cruel_sun_projectile", EntityType.Builder.<CruelSunProjectileEntity>of(CruelSunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CruelSunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrayDemonEntity>> GRAY_DEMON = register("gray_demon",
			EntityType.Builder.<GrayDemonEntity>of(GrayDemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrayDemonEntity::new)

					.sized(1.6f, 1.8f));
	public static final RegistryObject<EntityType<EarthspikeEntity>> EARTHSPIKE = register("earthspike", EntityType.Builder.<EarthspikeEntity>of(EarthspikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(EarthspikeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DaichiNoKibaEntity>> DAICHI_NO_KIBA = register("daichi_no_kiba",
			EntityType.Builder.<DaichiNoKibaEntity>of(DaichiNoKibaEntity::new, MobCategory.MISC).setCustomClientFactory(DaichiNoKibaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HideAndSeekEntity>> HIDE_AND_SEEK = register("hide_and_seek",
			EntityType.Builder.<HideAndSeekEntity>of(HideAndSeekEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HideAndSeekEntity::new)

					.sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<VineEntity>> VINE = register("vine",
			EntityType.Builder.<VineEntity>of(VineEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VineEntity::new)

					.sized(0.6f, 6f));
	public static final RegistryObject<EntityType<WhaleEntity>> WHALE = register("whale",
			EntityType.Builder.<WhaleEntity>of(WhaleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhaleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FrozenBreathEntity>> FROZEN_BREATH = register("frozen_breath",
			EntityType.Builder.<FrozenBreathEntity>of(FrozenBreathEntity::new, MobCategory.MISC).setCustomClientFactory(FrozenBreathEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NoroiNoKoeEntity>> NOROI_NO_KOE = register("noroi_no_koe",
			EntityType.Builder.<NoroiNoKoeEntity>of(NoroiNoKoeEntity::new, MobCategory.MISC).setCustomClientFactory(NoroiNoKoeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DespairVenomEntity>> DESPAIR_VENOM = register("despair_venom",
			EntityType.Builder.<DespairVenomEntity>of(DespairVenomEntity::new, MobCategory.MISC).setCustomClientFactory(DespairVenomEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SmallTowerEntity>> SMALL_TOWER = register("small_tower", EntityType.Builder.<SmallTowerEntity>of(SmallTowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(SmallTowerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MediumTowerEntity>> MEDIUM_TOWER = register("medium_tower", EntityType.Builder.<MediumTowerEntity>of(MediumTowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MediumTowerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LargeTowerEntity>> LARGE_TOWER = register("large_tower",
			EntityType.Builder.<LargeTowerEntity>of(LargeTowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LargeTowerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InsectFEntity>> INSECT_F = register("insect_f",
			EntityType.Builder.<InsectFEntity>of(InsectFEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InsectFEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ChatifolshotEntity>> CHATIFOLSHOT = register("chatifolshot",
			EntityType.Builder.<ChatifolshotEntity>of(ChatifolshotEntity::new, MobCategory.MISC).setCustomClientFactory(ChatifolshotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrazyProminenceEntity>> CRAZY_PROMINENCE = register("crazy_prominence", EntityType.Builder.<CrazyProminenceEntity>of(CrazyProminenceEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CrazyProminenceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FightingAreaEntity>> FIGHTING_AREA = register("fighting_area", EntityType.Builder.<FightingAreaEntity>of(FightingAreaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FightingAreaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FinalProminenceEntity>> FINAL_PROMINENCE = register("final_prominence", EntityType.Builder.<FinalProminenceEntity>of(FinalProminenceEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FinalProminenceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LuigiEntity>> LUIGI = register("luigi",
			EntityType.Builder.<LuigiEntity>of(LuigiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LuigiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TyrantDragonEntity>> TYRANT_DRAGON = register("tyrant_dragon",
			EntityType.Builder.<TyrantDragonEntity>of(TyrantDragonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TyrantDragonEntity::new)

					.sized(2.7f, 3f));
	public static final RegistryObject<EntityType<MutilatorRabbitsEntity>> MUTILATOR_RABBITS = register("mutilator_rabbits",
			EntityType.Builder.<MutilatorRabbitsEntity>of(MutilatorRabbitsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MutilatorRabbitsEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<JonahNoJunanEntity>> JONAH_NO_JUNAN = register("jonah_no_junan",
			EntityType.Builder.<JonahNoJunanEntity>of(JonahNoJunanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(85).setUpdateInterval(3).setCustomClientFactory(JonahNoJunanEntity::new)

					.sized(2.4f, 2f));
	public static final RegistryObject<EntityType<AngleCureEntity>> ANGLE_CURE = register("angle_cure",
			EntityType.Builder.<AngleCureEntity>of(AngleCureEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngleCureEntity::new)

					.sized(1.7f, 1.7f));
	public static final RegistryObject<EntityType<DuskBison1Entity>> DUSK_BISON_1 = register("dusk_bison_1",
			EntityType.Builder.<DuskBison1Entity>of(DuskBison1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DuskBison1Entity::new)

					.sized(2.1f, 2.9f));
	public static final RegistryObject<EntityType<WindShotProjectileEntity>> WIND_SHOT_PROJECTILE = register("wind_shot_projectile", EntityType.Builder.<WindShotProjectileEntity>of(WindShotProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WindShotProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WindShot2Entity>> WIND_SHOT_2 = register("wind_shot_2",
			EntityType.Builder.<WindShot2Entity>of(WindShot2Entity::new, MobCategory.MISC).setCustomClientFactory(WindShot2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Windshot3Entity>> WINDSHOT_3 = register("windshot_3",
			EntityType.Builder.<Windshot3Entity>of(Windshot3Entity::new, MobCategory.MISC).setCustomClientFactory(Windshot3Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AuraBurstEntity>> AURA_BURST = register("aura_burst",
			EntityType.Builder.<AuraBurstEntity>of(AuraBurstEntity::new, MobCategory.MISC).setCustomClientFactory(AuraBurstEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BulletSquallEntity>> BULLET_SQUALL = register("bullet_squall", EntityType.Builder.<BulletSquallEntity>of(BulletSquallEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BulletSquallEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JerichoDemonFormEntity>> JERICHO_DEMON_FORM = register("jericho_demon_form",
			EntityType.Builder.<JerichoDemonFormEntity>of(JerichoDemonFormEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JerichoDemonFormEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<TrollEntity>> TROLL = register("troll",
			EntityType.Builder.<TrollEntity>of(TrollEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrollEntity::new)

					.sized(1.1f, 3f));
	public static final RegistryObject<EntityType<KulumilEntity>> KULUMIL = register("kulumil",
			EntityType.Builder.<KulumilEntity>of(KulumilEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KulumilEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PuoraEntity>> PUORA = register("puora",
			EntityType.Builder.<PuoraEntity>of(PuoraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PuoraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EarthCrawlerEntity>> EARTH_CRAWLER = register("earth_crawler",
			EntityType.Builder.<EarthCrawlerEntity>of(EarthCrawlerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthCrawlerEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<ChainExplosionV2Entity>> CHAIN_EXPLOSION_V_2 = register("chain_explosion_v_2", EntityType.Builder.<ChainExplosionV2Entity>of(ChainExplosionV2Entity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChainExplosionV2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PefectCubeEntity>> PEFECT_CUBE = register("pefect_cube",
			EntityType.Builder.<PefectCubeEntity>of(PefectCubeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PefectCubeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClayDragonEntity>> CLAY_DRAGON = register("clay_dragon",
			EntityType.Builder.<ClayDragonEntity>of(ClayDragonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClayDragonEntity::new)

					.sized(1.3f, 1.8f));
	public static final RegistryObject<EntityType<MuramoDemonFormEntity>> MURAMO_DEMON_FORM = register("muramo_demon_form",
			EntityType.Builder.<MuramoDemonFormEntity>of(MuramoDemonFormEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuramoDemonFormEntity::new)

					.sized(1.1f, 3f));
	public static final RegistryObject<EntityType<AndreDemonFormEntity>> ANDRE_DEMON_FORM = register("andre_demon_form",
			EntityType.Builder.<AndreDemonFormEntity>of(AndreDemonFormEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AndreDemonFormEntity::new)

					.sized(1.3f, 3f));
	public static final RegistryObject<EntityType<EnergyArrowEntity>> ENERGY_ARROW = register("energy_arrow",
			EntityType.Builder.<EnergyArrowEntity>of(EnergyArrowEntity::new, MobCategory.MISC).setCustomClientFactory(EnergyArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AcidTwowerMobEntity>> ACID_TWOWER_MOB = register("acid_twower_mob", EntityType.Builder.<AcidTwowerMobEntity>of(AcidTwowerMobEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AcidTwowerMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeadEndEntity>> DEAD_END = register("dead_end",
			EntityType.Builder.<DeadEndEntity>of(DeadEndEntity::new, MobCategory.MISC).setCustomClientFactory(DeadEndEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthGolemEntity>> EARTH_GOLEM = register("earth_golem",
			EntityType.Builder.<EarthGolemEntity>of(EarthGolemEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthGolemEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PainEditionEntity>> PAIN_EDITION = register("pain_edition",
			EntityType.Builder.<PainEditionEntity>of(PainEditionEntity::new, MobCategory.MISC).setCustomClientFactory(PainEditionEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PainEdition2Entity>> PAIN_EDITION_2 = register("pain_edition_2",
			EntityType.Builder.<PainEdition2Entity>of(PainEdition2Entity::new, MobCategory.MISC).setCustomClientFactory(PainEdition2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PainEdition3Entity>> PAIN_EDITION_3 = register("pain_edition_3",
			EntityType.Builder.<PainEdition3Entity>of(PainEdition3Entity::new, MobCategory.MISC).setCustomClientFactory(PainEdition3Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArrowShotProjectileEntity>> ARROW_SHOT_PROJECTILE = register("arrow_shot_projectile", EntityType.Builder.<ArrowShotProjectileEntity>of(ArrowShotProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ArrowShotProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PhysicalCloneEntity>> PHYSICAL_CLONE = register("physical_clone",
			EntityType.Builder.<PhysicalCloneEntity>of(PhysicalCloneEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhysicalCloneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HellFireBirdEntity>> HELL_FIRE_BIRD = register("hell_fire_bird",
			EntityType.Builder.<HellFireBirdEntity>of(HellFireBirdEntity::new, MobCategory.MISC).setCustomClientFactory(HellFireBirdEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AshDragonEntity>> ASH_DRAGON = register("ash_dragon",
			EntityType.Builder.<AshDragonEntity>of(AshDragonEntity::new, MobCategory.MISC).setCustomClientFactory(AshDragonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BusterIceEntity>> BUSTER_ICE = register("buster_ice",
			EntityType.Builder.<BusterIceEntity>of(BusterIceEntity::new, MobCategory.MISC).setCustomClientFactory(BusterIceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChastiefolTrueSpirtSpearEntity>> CHASTIEFOL_TRUE_SPIRT_SPEAR = register("chastiefol_true_spirt_spear",
			EntityType.Builder.<ChastiefolTrueSpirtSpearEntity>of(ChastiefolTrueSpirtSpearEntity::new, MobCategory.MISC).setCustomClientFactory(ChastiefolTrueSpirtSpearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GuardianTrueSpirtSpearEntity>> GUARDIAN_TRUE_SPIRT_SPEAR = register("guardian_true_spirt_spear",
			EntityType.Builder.<GuardianTrueSpirtSpearEntity>of(GuardianTrueSpirtSpearEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GuardianTrueSpirtSpearEntity::new).fireImmune().sized(2f, 5f));
	public static final RegistryObject<EntityType<HellBlaze2Entity>> HELL_BLAZE_2 = register("hell_blaze_2",
			EntityType.Builder.<HellBlaze2Entity>of(HellBlaze2Entity::new, MobCategory.MISC).setCustomClientFactory(HellBlaze2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LetThereBeLightEntity>> LET_THERE_BE_LIGHT = register("let_there_be_light", EntityType.Builder.<LetThereBeLightEntity>of(LetThereBeLightEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LetThereBeLightEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<InfernoIncantationEntity>> INFERNO_INCANTATION = register("inferno_incantation", EntityType.Builder.<InfernoIncantationEntity>of(InfernoIncantationEntity::new, MobCategory.MISC)
			.setCustomClientFactory(InfernoIncantationEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TwigoAnimatedEntity>> TWIGO_ANIMATED = register("twigo_animated",
			EntityType.Builder.<TwigoAnimatedEntity>of(TwigoAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwigoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrayDemonEntityEntity>> GRAY_DEMON_ENTITY = register("gray_demon_entity",
			EntityType.Builder.<GrayDemonEntityEntity>of(GrayDemonEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrayDemonEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GilThunderAnimatedEntity>> GIL_THUNDER_ANIMATED = register("gil_thunder_animated",
			EntityType.Builder.<GilThunderAnimatedEntity>of(GilThunderAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GilThunderAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GolgiusAnimatedEntity>> GOLGIUS_ANIMATED = register("golgius_animated",
			EntityType.Builder.<GolgiusAnimatedEntity>of(GolgiusAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GolgiusAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DianeAnimatedEntity>> DIANE_ANIMATED = register("diane_animated",
			EntityType.Builder.<DianeAnimatedEntity>of(DianeAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DianeAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RuinAnimatedEntity>> RUIN_ANIMATED = register("ruin_animated",
			EntityType.Builder.<RuinAnimatedEntity>of(RuinAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RuinAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FriesiaAnimatedEntity>> FRIESIA_ANIMATED = register("friesia_animated",
			EntityType.Builder.<FriesiaAnimatedEntity>of(FriesiaAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriesiaAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GuilaAnimatedEntity>> GUILA_ANIMATED = register("guila_animated",
			EntityType.Builder.<GuilaAnimatedEntity>of(GuilaAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GuilaAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TaizooAnimatedEntity>> TAIZOO_ANIMATED = register("taizoo_animated",
			EntityType.Builder.<TaizooAnimatedEntity>of(TaizooAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TaizooAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GriamoreAnimatedEntity>> GRIAMORE_ANIMATED = register("griamore_animated",
			EntityType.Builder.<GriamoreAnimatedEntity>of(GriamoreAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GriamoreAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HowzerAnimatedEntity>> HOWZER_ANIMATED = register("howzer_animated",
			EntityType.Builder.<HowzerAnimatedEntity>of(HowzerAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HowzerAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CainBarzadAnimatedEntity>> CAIN_BARZAD_ANIMATED = register("cain_barzad_animated",
			EntityType.Builder.<CainBarzadAnimatedEntity>of(CainBarzadAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CainBarzadAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryBanAnimatedEntity>> STORY_BAN_ANIMATED = register("story_ban_animated",
			EntityType.Builder.<StoryBanAnimatedEntity>of(StoryBanAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StoryBanAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JerichoAnimatedEntity>> JERICHO_ANIMATED = register("jericho_animated",
			EntityType.Builder.<JerichoAnimatedEntity>of(JerichoAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JerichoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GuilaDemonanimatedEntity>> GUILA_DEMONANIMATED = register("guila_demonanimated",
			EntityType.Builder.<GuilaDemonanimatedEntity>of(GuilaDemonanimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GuilaDemonanimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HelbremAnimatedEntity>> HELBREM_ANIMATED = register("helbrem_animated",
			EntityType.Builder.<HelbremAnimatedEntity>of(HelbremAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HelbremAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GilThunderAnimated2Entity>> GIL_THUNDER_ANIMATED_2 = register("gil_thunder_animated_2",
			EntityType.Builder.<GilThunderAnimated2Entity>of(GilThunderAnimated2Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GilThunderAnimated2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RedKnightAnimatedEntity>> RED_KNIGHT_ANIMATED = register("red_knight_animated",
			EntityType.Builder.<RedKnightAnimatedEntity>of(RedKnightAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedKnightAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreenKnightAnimatedEntity>> GREEN_KNIGHT_ANIMATED = register("green_knight_animated",
			EntityType.Builder.<GreenKnightAnimatedEntity>of(GreenKnightAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenKnightAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DreyfusAnimatedEntity>> DREYFUS_ANIMATED = register("dreyfus_animated",
			EntityType.Builder.<DreyfusAnimatedEntity>of(DreyfusAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DreyfusAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FairyHelbremAnimatedEntity>> FAIRY_HELBREM_ANIMATED = register("fairy_helbrem_animated",
			EntityType.Builder.<FairyHelbremAnimatedEntity>of(FairyHelbremAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(FairyHelbremAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeadHelbramanimatedEntity>> DEAD_HELBRAMANIMATED = register("dead_helbramanimated",
			EntityType.Builder.<DeadHelbramanimatedEntity>of(DeadHelbramanimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeadHelbramanimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VivianAnimatedEntity>> VIVIAN_ANIMATED = register("vivian_animated",
			EntityType.Builder.<VivianAnimatedEntity>of(VivianAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VivianAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoyalGurardAnimatedEntity>> ROYAL_GURARD_ANIMATED = register("royal_gurard_animated",
			EntityType.Builder.<RoyalGurardAnimatedEntity>of(RoyalGurardAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoyalGurardAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoyalGuardAnimatedEntity>> ROYAL_GUARD_ANIMATED = register("royal_guard_animated",
			EntityType.Builder.<RoyalGuardAnimatedEntity>of(RoyalGuardAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoyalGuardAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoldierAnimatedEntity>> SOLDIER_ANIMATED = register("soldier_animated",
			EntityType.Builder.<SoldierAnimatedEntity>of(SoldierAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoldierAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HendricksonAnimatedEntity>> HENDRICKSON_ANIMATED = register("hendrickson_animated",
			EntityType.Builder.<HendricksonAnimatedEntity>of(HendricksonAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HendricksonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryBan2AnimatedEntity>> STORY_BAN_2_ANIMATED = register("story_ban_2_animated",
			EntityType.Builder.<StoryBan2AnimatedEntity>of(StoryBan2AnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StoryBan2AnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ParadaAnimatedEntity>> PARADA_ANIMATED = register("parada_animated",
			EntityType.Builder.<ParadaAnimatedEntity>of(ParadaAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParadaAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DemonHendricksonAnimatedEntity>> DEMON_HENDRICKSON_ANIMATED = register("demon_hendrickson_animated",
			EntityType.Builder.<DemonHendricksonAnimatedEntity>of(DemonHendricksonAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(DemonHendricksonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrayDemonHendricksonAnimatedEntity>> GRAY_DEMON_HENDRICKSON_ANIMATED = register("gray_demon_hendrickson_animated",
			EntityType.Builder.<GrayDemonHendricksonAnimatedEntity>of(GrayDemonHendricksonAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GrayDemonHendricksonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AndreAnimatedEntity>> ANDRE_ANIMATED = register("andre_animated",
			EntityType.Builder.<AndreAnimatedEntity>of(AndreAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AndreAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MuramoAnimatedEntity>> MURAMO_ANIMATED = register("muramo_animated",
			EntityType.Builder.<MuramoAnimatedEntity>of(MuramoAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuramoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DumblebbasAnimatedEntity>> DUMBLEBBAS_ANIMATED = register("dumblebbas_animated",
			EntityType.Builder.<DumblebbasAnimatedEntity>of(DumblebbasAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DumblebbasAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WeinheidtAnimatedEntity>> WEINHEIDT_ANIMATED = register("weinheidt_animated",
			EntityType.Builder.<WeinheidtAnimatedEntity>of(WeinheidtAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeinheidtAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HugoAnimatedEntity>> HUGO_ANIMATED = register("hugo_animated",
			EntityType.Builder.<HugoAnimatedEntity>of(HugoAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HugoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JillianAnimatedEntity>> JILLIAN_ANIMATED = register("jillian_animated",
			EntityType.Builder.<JillianAnimatedEntity>of(JillianAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JillianAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SimonAnimatedEntity>> SIMON_ANIMATED = register("simon_animated",
			EntityType.Builder.<SimonAnimatedEntity>of(SimonAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SimonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BanBossAnimatedEntity>> BAN_BOSS_ANIMATED = register("ban_boss_animated",
			EntityType.Builder.<BanBossAnimatedEntity>of(BanBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SladerAnimatedEntity>> SLADER_ANIMATED = register("slader_animated",
			EntityType.Builder.<SladerAnimatedEntity>of(SladerAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SladerAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GustafAnimatedEntity>> GUSTAF_ANIMATED = register("gustaf_animated",
			EntityType.Builder.<GustafAnimatedEntity>of(GustafAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GustafAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DianeBossAnimatedEntity>> DIANE_BOSS_ANIMATED = register("diane_boss_animated",
			EntityType.Builder.<DianeBossAnimatedEntity>of(DianeBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DianeBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GowtherBossAnimatedEntity>> GOWTHER_BOSS_ANIMATED = register("gowther_boss_animated",
			EntityType.Builder.<GowtherBossAnimatedEntity>of(GowtherBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GowtherBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KingBossAnimatedEntity>> KING_BOSS_ANIMATED = register("king_boss_animated",
			EntityType.Builder.<KingBossAnimatedEntity>of(KingBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KingBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeliodasBossAnimatedEntity>> MELIODAS_BOSS_ANIMATED = register("meliodas_boss_animated",
			EntityType.Builder.<MeliodasBossAnimatedEntity>of(MeliodasBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MeliodasBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MerlinBossAnimatedEntity>> MERLIN_BOSS_ANIMATED = register("merlin_boss_animated",
			EntityType.Builder.<MerlinBossAnimatedEntity>of(MerlinBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MerlinBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WickedBiteEntity>> WICKED_BITE = register("wicked_bite", EntityType.Builder.<WickedBiteEntity>of(WickedBiteEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(WickedBiteEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KamichigiriProjectileEntity>> KAMICHIGIRI_PROJECTILE = register("kamichigiri_projectile", EntityType.Builder.<KamichigiriProjectileEntity>of(KamichigiriProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KamichigiriProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DeathThornEntity>> DEATH_THORN = register("death_thorn", EntityType.Builder.<DeathThornEntity>of(DeathThornEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(DeathThornEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BasquiasGuardianEntity>> BASQUIAS_GUARDIAN = register("basquias_guardian", EntityType.Builder.<BasquiasGuardianEntity>of(BasquiasGuardianEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BasquiasGuardianEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DivineSlashEntity>> DIVINE_SLASH = register("divine_slash",
			EntityType.Builder.<DivineSlashEntity>of(DivineSlashEntity::new, MobCategory.MISC).setCustomClientFactory(DivineSlashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArrowEntity>> ARROW = register("arrow",
			EntityType.Builder.<ArrowEntity>of(ArrowEntity::new, MobCategory.MISC).setCustomClientFactory(ArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GigaPickEntity>> GIGA_PICK = register("giga_pick",
			EntityType.Builder.<GigaPickEntity>of(GigaPickEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GigaPickEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GigaFallEntity>> GIGA_FALL = register("giga_fall",
			EntityType.Builder.<GigaFallEntity>of(GigaFallEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GigaFallEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GigaCrushEntity>> GIGA_CRUSH = register("giga_crush", EntityType.Builder.<GigaCrushEntity>of(GigaCrushEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(GigaCrushEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackOutEntity>> BLACK_OUT = register("black_out",
			EntityType.Builder.<BlackOutEntity>of(BlackOutEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackOutEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FurkuuSutonEntity>> FURKUU_SUTON = register("furkuu_suton",
			EntityType.Builder.<FurkuuSutonEntity>of(FurkuuSutonEntity::new, MobCategory.MISC).setCustomClientFactory(FurkuuSutonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackOutProjectileEntity>> BLACK_OUT_PROJECTILE = register("black_out_projectile", EntityType.Builder.<BlackOutProjectileEntity>of(BlackOutProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlackOutProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SunFlowerTrueSpirtSpearEntity>> SUN_FLOWER_TRUE_SPIRT_SPEAR = register("sun_flower_true_spirt_spear",
			EntityType.Builder.<SunFlowerTrueSpirtSpearEntity>of(SunFlowerTrueSpirtSpearEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SunFlowerTrueSpirtSpearEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MoonRoseEntity>> MOON_ROSE = register("moon_rose",
			EntityType.Builder.<MoonRoseEntity>of(MoonRoseEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoonRoseEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BasquiasProjectileEntity>> BASQUIAS_PROJECTILE = register("basquias_projectile", EntityType.Builder.<BasquiasProjectileEntity>of(BasquiasProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BasquiasProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FiveLostProjectileEntity>> FIVE_LOST_PROJECTILE = register("five_lost_projectile", EntityType.Builder.<FiveLostProjectileEntity>of(FiveLostProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FiveLostProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellGateRedDemonsEntity>> HELL_GATE_RED_DEMONS = register("hell_gate_red_demons",
			EntityType.Builder.<HellGateRedDemonsEntity>of(HellGateRedDemonsEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HellGateRedDemonsEntity::new)

					.sized(2.5f, 4.6f));
	public static final RegistryObject<EntityType<JumanjuEntityEntity>> JUMANJU_ENTITY = register("jumanju_entity", EntityType.Builder.<JumanjuEntityEntity>of(JumanjuEntityEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JumanjuEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CocoonOfDarknessEntity>> COCOON_OF_DARKNESS = register("cocoon_of_darkness", EntityType.Builder.<CocoonOfDarknessEntity>of(CocoonOfDarknessEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CocoonOfDarknessEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GerheadeEntity>> GERHEADE = register("gerheade",
			EntityType.Builder.<GerheadeEntity>of(GerheadeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GerheadeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ServantEntity>> SERVANT = register("servant",
			EntityType.Builder.<ServantEntity>of(ServantEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ServantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MarmasEntity>> MARMAS = register("marmas",
			EntityType.Builder.<MarmasEntity>of(MarmasEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarmasEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AealHealEntity>> AEAL_HEAL = register("aeal_heal",
			EntityType.Builder.<AealHealEntity>of(AealHealEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AealHealEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuperSlashEntity>> SUPER_SLASH = register("super_slash",
			EntityType.Builder.<SuperSlashEntity>of(SuperSlashEntity::new, MobCategory.MISC).setCustomClientFactory(SuperSlashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HornOfCernunosEntity>> HORN_OF_CERNUNOS = register("horn_of_cernunos",
			EntityType.Builder.<HornOfCernunosEntity>of(HornOfCernunosEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HornOfCernunosEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpiralHailEntity>> SPIRAL_HAIL = register("spiral_hail",
			EntityType.Builder.<SpiralHailEntity>of(SpiralHailEntity::new, MobCategory.MISC).setCustomClientFactory(SpiralHailEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IncreaseProjectileEntity>> INCREASE_PROJECTILE = register("increase_projectile", EntityType.Builder.<IncreaseProjectileEntity>of(IncreaseProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IncreaseProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DogedoEntity>> DOGEDO = register("dogedo",
			EntityType.Builder.<DogedoEntity>of(DogedoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DogedoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GowtherStory1Entity>> GOWTHER_STORY_1 = register("gowther_story_1",
			EntityType.Builder.<GowtherStory1Entity>of(GowtherStory1Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GowtherStory1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AlbionEntity>> ALBION = register("albion",
			EntityType.Builder.<AlbionEntity>of(AlbionEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbionEntity::new)

					.sized(0.8f, 2.5f));
	public static final RegistryObject<EntityType<CannonEntity>> CANNON = register("cannon",
			EntityType.Builder.<CannonEntity>of(CannonEntity::new, MobCategory.MISC).setCustomClientFactory(CannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AlbionFatEntity>> ALBION_FAT = register("albion_fat",
			EntityType.Builder.<AlbionFatEntity>of(AlbionFatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbionFatEntity::new)

					.sized(0.8f, 2.5f));
	public static final RegistryObject<EntityType<TallAlbionEntity>> TALL_ALBION = register("tall_albion",
			EntityType.Builder.<TallAlbionEntity>of(TallAlbionEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TallAlbionEntity::new)

					.sized(0.8f, 2.3f));
	public static final RegistryObject<EntityType<AlbionTallEntity>> ALBION_TALL = register("albion_tall",
			EntityType.Builder.<AlbionTallEntity>of(AlbionTallEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbionTallEntity::new)

					.sized(0.8f, 2.3f));
	public static final RegistryObject<EntityType<GoddessBlessEntityEntity>> GODDESS_BLESS_ENTITY = register("goddess_bless_entity", EntityType.Builder.<GoddessBlessEntityEntity>of(GoddessBlessEntityEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoddessBlessEntityEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RisingMeteorEntity.init();
			PollenGardenEntity.init();
			RisingTornadoEntityEntity.init();
			SunflowerEntity.init();
			MantaEntity.init();
			ChickenEntity.init();
			GeckolibKrakenEntity.init();
			RedDemonGeckolibEntity.init();
			Guardian1Entity.init();
			HawksEntity.init();
			BlackHoundEntity.init();
			SwordWolfEntity.init();
			DaleArmoredEntity.init();
			DaleSecEntity.init();
			DalefinalEntity.init();
			ElaineEntity.init();
			BlackSmithEntity.init();
			InsectEntity.init();
			GrayDemonEntity.init();
			EarthspikeEntity.init();
			HideAndSeekEntity.init();
			VineEntity.init();
			WhaleEntity.init();
			SmallTowerEntity.init();
			MediumTowerEntity.init();
			LargeTowerEntity.init();
			InsectFEntity.init();
			FightingAreaEntity.init();
			LuigiEntity.init();
			TyrantDragonEntity.init();
			MutilatorRabbitsEntity.init();
			JonahNoJunanEntity.init();
			AngleCureEntity.init();
			DuskBison1Entity.init();
			BulletSquallEntity.init();
			JerichoDemonFormEntity.init();
			TrollEntity.init();
			KulumilEntity.init();
			PuoraEntity.init();
			EarthCrawlerEntity.init();
			ChainExplosionV2Entity.init();
			PefectCubeEntity.init();
			ClayDragonEntity.init();
			MuramoDemonFormEntity.init();
			AndreDemonFormEntity.init();
			AcidTwowerMobEntity.init();
			EarthGolemEntity.init();
			PhysicalCloneEntity.init();
			GuardianTrueSpirtSpearEntity.init();
			TwigoAnimatedEntity.init();
			GrayDemonEntityEntity.init();
			GilThunderAnimatedEntity.init();
			GolgiusAnimatedEntity.init();
			DianeAnimatedEntity.init();
			RuinAnimatedEntity.init();
			FriesiaAnimatedEntity.init();
			GuilaAnimatedEntity.init();
			TaizooAnimatedEntity.init();
			GriamoreAnimatedEntity.init();
			HowzerAnimatedEntity.init();
			CainBarzadAnimatedEntity.init();
			StoryBanAnimatedEntity.init();
			JerichoAnimatedEntity.init();
			GuilaDemonanimatedEntity.init();
			HelbremAnimatedEntity.init();
			GilThunderAnimated2Entity.init();
			RedKnightAnimatedEntity.init();
			GreenKnightAnimatedEntity.init();
			DreyfusAnimatedEntity.init();
			FairyHelbremAnimatedEntity.init();
			DeadHelbramanimatedEntity.init();
			VivianAnimatedEntity.init();
			RoyalGurardAnimatedEntity.init();
			RoyalGuardAnimatedEntity.init();
			SoldierAnimatedEntity.init();
			HendricksonAnimatedEntity.init();
			StoryBan2AnimatedEntity.init();
			ParadaAnimatedEntity.init();
			DemonHendricksonAnimatedEntity.init();
			GrayDemonHendricksonAnimatedEntity.init();
			AndreAnimatedEntity.init();
			MuramoAnimatedEntity.init();
			DumblebbasAnimatedEntity.init();
			WeinheidtAnimatedEntity.init();
			HugoAnimatedEntity.init();
			JillianAnimatedEntity.init();
			SimonAnimatedEntity.init();
			BanBossAnimatedEntity.init();
			SladerAnimatedEntity.init();
			GustafAnimatedEntity.init();
			DianeBossAnimatedEntity.init();
			GowtherBossAnimatedEntity.init();
			KingBossAnimatedEntity.init();
			MeliodasBossAnimatedEntity.init();
			MerlinBossAnimatedEntity.init();
			WickedBiteEntity.init();
			DeathThornEntity.init();
			BasquiasGuardianEntity.init();
			GigaPickEntity.init();
			GigaFallEntity.init();
			GigaCrushEntity.init();
			BlackOutEntity.init();
			SunFlowerTrueSpirtSpearEntity.init();
			MoonRoseEntity.init();
			HellGateRedDemonsEntity.init();
			JumanjuEntityEntity.init();
			CocoonOfDarknessEntity.init();
			GerheadeEntity.init();
			ServantEntity.init();
			MarmasEntity.init();
			AealHealEntity.init();
			HornOfCernunosEntity.init();
			DogedoEntity.init();
			GowtherStory1Entity.init();
			AlbionEntity.init();
			AlbionFatEntity.init();
			TallAlbionEntity.init();
			AlbionTallEntity.init();
			GoddessBlessEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RISING_METEOR.get(), RisingMeteorEntity.createAttributes().build());
		event.put(POLLEN_GARDEN.get(), PollenGardenEntity.createAttributes().build());
		event.put(RISING_TORNADO_ENTITY.get(), RisingTornadoEntityEntity.createAttributes().build());
		event.put(SUNFLOWER.get(), SunflowerEntity.createAttributes().build());
		event.put(MANTA.get(), MantaEntity.createAttributes().build());
		event.put(CHICKEN.get(), ChickenEntity.createAttributes().build());
		event.put(GECKOLIB_KRAKEN.get(), GeckolibKrakenEntity.createAttributes().build());
		event.put(RED_DEMON_GECKOLIB.get(), RedDemonGeckolibEntity.createAttributes().build());
		event.put(GUARDIAN_1.get(), Guardian1Entity.createAttributes().build());
		event.put(HAWKS.get(), HawksEntity.createAttributes().build());
		event.put(BLACK_HOUND.get(), BlackHoundEntity.createAttributes().build());
		event.put(SWORD_WOLF.get(), SwordWolfEntity.createAttributes().build());
		event.put(DALE_ARMORED.get(), DaleArmoredEntity.createAttributes().build());
		event.put(DALE_SEC.get(), DaleSecEntity.createAttributes().build());
		event.put(DALEFINAL.get(), DalefinalEntity.createAttributes().build());
		event.put(ELAINE.get(), ElaineEntity.createAttributes().build());
		event.put(BLACK_SMITH.get(), BlackSmithEntity.createAttributes().build());
		event.put(INSECT.get(), InsectEntity.createAttributes().build());
		event.put(GRAY_DEMON.get(), GrayDemonEntity.createAttributes().build());
		event.put(EARTHSPIKE.get(), EarthspikeEntity.createAttributes().build());
		event.put(HIDE_AND_SEEK.get(), HideAndSeekEntity.createAttributes().build());
		event.put(VINE.get(), VineEntity.createAttributes().build());
		event.put(WHALE.get(), WhaleEntity.createAttributes().build());
		event.put(SMALL_TOWER.get(), SmallTowerEntity.createAttributes().build());
		event.put(MEDIUM_TOWER.get(), MediumTowerEntity.createAttributes().build());
		event.put(LARGE_TOWER.get(), LargeTowerEntity.createAttributes().build());
		event.put(INSECT_F.get(), InsectFEntity.createAttributes().build());
		event.put(FIGHTING_AREA.get(), FightingAreaEntity.createAttributes().build());
		event.put(LUIGI.get(), LuigiEntity.createAttributes().build());
		event.put(TYRANT_DRAGON.get(), TyrantDragonEntity.createAttributes().build());
		event.put(MUTILATOR_RABBITS.get(), MutilatorRabbitsEntity.createAttributes().build());
		event.put(JONAH_NO_JUNAN.get(), JonahNoJunanEntity.createAttributes().build());
		event.put(ANGLE_CURE.get(), AngleCureEntity.createAttributes().build());
		event.put(DUSK_BISON_1.get(), DuskBison1Entity.createAttributes().build());
		event.put(BULLET_SQUALL.get(), BulletSquallEntity.createAttributes().build());
		event.put(JERICHO_DEMON_FORM.get(), JerichoDemonFormEntity.createAttributes().build());
		event.put(TROLL.get(), TrollEntity.createAttributes().build());
		event.put(KULUMIL.get(), KulumilEntity.createAttributes().build());
		event.put(PUORA.get(), PuoraEntity.createAttributes().build());
		event.put(EARTH_CRAWLER.get(), EarthCrawlerEntity.createAttributes().build());
		event.put(CHAIN_EXPLOSION_V_2.get(), ChainExplosionV2Entity.createAttributes().build());
		event.put(PEFECT_CUBE.get(), PefectCubeEntity.createAttributes().build());
		event.put(CLAY_DRAGON.get(), ClayDragonEntity.createAttributes().build());
		event.put(MURAMO_DEMON_FORM.get(), MuramoDemonFormEntity.createAttributes().build());
		event.put(ANDRE_DEMON_FORM.get(), AndreDemonFormEntity.createAttributes().build());
		event.put(ACID_TWOWER_MOB.get(), AcidTwowerMobEntity.createAttributes().build());
		event.put(EARTH_GOLEM.get(), EarthGolemEntity.createAttributes().build());
		event.put(PHYSICAL_CLONE.get(), PhysicalCloneEntity.createAttributes().build());
		event.put(GUARDIAN_TRUE_SPIRT_SPEAR.get(), GuardianTrueSpirtSpearEntity.createAttributes().build());
		event.put(TWIGO_ANIMATED.get(), TwigoAnimatedEntity.createAttributes().build());
		event.put(GRAY_DEMON_ENTITY.get(), GrayDemonEntityEntity.createAttributes().build());
		event.put(GIL_THUNDER_ANIMATED.get(), GilThunderAnimatedEntity.createAttributes().build());
		event.put(GOLGIUS_ANIMATED.get(), GolgiusAnimatedEntity.createAttributes().build());
		event.put(DIANE_ANIMATED.get(), DianeAnimatedEntity.createAttributes().build());
		event.put(RUIN_ANIMATED.get(), RuinAnimatedEntity.createAttributes().build());
		event.put(FRIESIA_ANIMATED.get(), FriesiaAnimatedEntity.createAttributes().build());
		event.put(GUILA_ANIMATED.get(), GuilaAnimatedEntity.createAttributes().build());
		event.put(TAIZOO_ANIMATED.get(), TaizooAnimatedEntity.createAttributes().build());
		event.put(GRIAMORE_ANIMATED.get(), GriamoreAnimatedEntity.createAttributes().build());
		event.put(HOWZER_ANIMATED.get(), HowzerAnimatedEntity.createAttributes().build());
		event.put(CAIN_BARZAD_ANIMATED.get(), CainBarzadAnimatedEntity.createAttributes().build());
		event.put(STORY_BAN_ANIMATED.get(), StoryBanAnimatedEntity.createAttributes().build());
		event.put(JERICHO_ANIMATED.get(), JerichoAnimatedEntity.createAttributes().build());
		event.put(GUILA_DEMONANIMATED.get(), GuilaDemonanimatedEntity.createAttributes().build());
		event.put(HELBREM_ANIMATED.get(), HelbremAnimatedEntity.createAttributes().build());
		event.put(GIL_THUNDER_ANIMATED_2.get(), GilThunderAnimated2Entity.createAttributes().build());
		event.put(RED_KNIGHT_ANIMATED.get(), RedKnightAnimatedEntity.createAttributes().build());
		event.put(GREEN_KNIGHT_ANIMATED.get(), GreenKnightAnimatedEntity.createAttributes().build());
		event.put(DREYFUS_ANIMATED.get(), DreyfusAnimatedEntity.createAttributes().build());
		event.put(FAIRY_HELBREM_ANIMATED.get(), FairyHelbremAnimatedEntity.createAttributes().build());
		event.put(DEAD_HELBRAMANIMATED.get(), DeadHelbramanimatedEntity.createAttributes().build());
		event.put(VIVIAN_ANIMATED.get(), VivianAnimatedEntity.createAttributes().build());
		event.put(ROYAL_GURARD_ANIMATED.get(), RoyalGurardAnimatedEntity.createAttributes().build());
		event.put(ROYAL_GUARD_ANIMATED.get(), RoyalGuardAnimatedEntity.createAttributes().build());
		event.put(SOLDIER_ANIMATED.get(), SoldierAnimatedEntity.createAttributes().build());
		event.put(HENDRICKSON_ANIMATED.get(), HendricksonAnimatedEntity.createAttributes().build());
		event.put(STORY_BAN_2_ANIMATED.get(), StoryBan2AnimatedEntity.createAttributes().build());
		event.put(PARADA_ANIMATED.get(), ParadaAnimatedEntity.createAttributes().build());
		event.put(DEMON_HENDRICKSON_ANIMATED.get(), DemonHendricksonAnimatedEntity.createAttributes().build());
		event.put(GRAY_DEMON_HENDRICKSON_ANIMATED.get(), GrayDemonHendricksonAnimatedEntity.createAttributes().build());
		event.put(ANDRE_ANIMATED.get(), AndreAnimatedEntity.createAttributes().build());
		event.put(MURAMO_ANIMATED.get(), MuramoAnimatedEntity.createAttributes().build());
		event.put(DUMBLEBBAS_ANIMATED.get(), DumblebbasAnimatedEntity.createAttributes().build());
		event.put(WEINHEIDT_ANIMATED.get(), WeinheidtAnimatedEntity.createAttributes().build());
		event.put(HUGO_ANIMATED.get(), HugoAnimatedEntity.createAttributes().build());
		event.put(JILLIAN_ANIMATED.get(), JillianAnimatedEntity.createAttributes().build());
		event.put(SIMON_ANIMATED.get(), SimonAnimatedEntity.createAttributes().build());
		event.put(BAN_BOSS_ANIMATED.get(), BanBossAnimatedEntity.createAttributes().build());
		event.put(SLADER_ANIMATED.get(), SladerAnimatedEntity.createAttributes().build());
		event.put(GUSTAF_ANIMATED.get(), GustafAnimatedEntity.createAttributes().build());
		event.put(DIANE_BOSS_ANIMATED.get(), DianeBossAnimatedEntity.createAttributes().build());
		event.put(GOWTHER_BOSS_ANIMATED.get(), GowtherBossAnimatedEntity.createAttributes().build());
		event.put(KING_BOSS_ANIMATED.get(), KingBossAnimatedEntity.createAttributes().build());
		event.put(MELIODAS_BOSS_ANIMATED.get(), MeliodasBossAnimatedEntity.createAttributes().build());
		event.put(MERLIN_BOSS_ANIMATED.get(), MerlinBossAnimatedEntity.createAttributes().build());
		event.put(WICKED_BITE.get(), WickedBiteEntity.createAttributes().build());
		event.put(DEATH_THORN.get(), DeathThornEntity.createAttributes().build());
		event.put(BASQUIAS_GUARDIAN.get(), BasquiasGuardianEntity.createAttributes().build());
		event.put(GIGA_PICK.get(), GigaPickEntity.createAttributes().build());
		event.put(GIGA_FALL.get(), GigaFallEntity.createAttributes().build());
		event.put(GIGA_CRUSH.get(), GigaCrushEntity.createAttributes().build());
		event.put(BLACK_OUT.get(), BlackOutEntity.createAttributes().build());
		event.put(SUN_FLOWER_TRUE_SPIRT_SPEAR.get(), SunFlowerTrueSpirtSpearEntity.createAttributes().build());
		event.put(MOON_ROSE.get(), MoonRoseEntity.createAttributes().build());
		event.put(HELL_GATE_RED_DEMONS.get(), HellGateRedDemonsEntity.createAttributes().build());
		event.put(JUMANJU_ENTITY.get(), JumanjuEntityEntity.createAttributes().build());
		event.put(COCOON_OF_DARKNESS.get(), CocoonOfDarknessEntity.createAttributes().build());
		event.put(GERHEADE.get(), GerheadeEntity.createAttributes().build());
		event.put(SERVANT.get(), ServantEntity.createAttributes().build());
		event.put(MARMAS.get(), MarmasEntity.createAttributes().build());
		event.put(AEAL_HEAL.get(), AealHealEntity.createAttributes().build());
		event.put(HORN_OF_CERNUNOS.get(), HornOfCernunosEntity.createAttributes().build());
		event.put(DOGEDO.get(), DogedoEntity.createAttributes().build());
		event.put(GOWTHER_STORY_1.get(), GowtherStory1Entity.createAttributes().build());
		event.put(ALBION.get(), AlbionEntity.createAttributes().build());
		event.put(ALBION_FAT.get(), AlbionFatEntity.createAttributes().build());
		event.put(TALL_ALBION.get(), TallAlbionEntity.createAttributes().build());
		event.put(ALBION_TALL.get(), AlbionTallEntity.createAttributes().build());
		event.put(GODDESS_BLESS_ENTITY.get(), GoddessBlessEntityEntity.createAttributes().build());
	}
}
