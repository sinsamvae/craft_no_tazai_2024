package net.mcreator.craftnotaizai.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		CraftNoTaizaiMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.level = original.level;
			clone.xp = original.xp;
			clone.TP = original.TP;
			clone.health = original.health;
			clone.maxhealth = original.maxhealth;
			clone.strength = original.strength;
			clone.Spirit = original.Spirit;
			clone.mana = original.mana;
			clone.maxmana = original.maxmana;
			clone.Demon_Clan = original.Demon_Clan;
			clone.ManaAttack = original.ManaAttack;
			clone.Full_Counter_Use = original.Full_Counter_Use;
			clone.PlayerFirstJoins = original.PlayerFirstJoins;
			clone.Race = original.Race;
			clone.Human_Clan = original.Human_Clan;
			clone.Fairy_Clan = original.Fairy_Clan;
			clone.GaintRace = original.GaintRace;
			clone.PurgatoryFire = original.PurgatoryFire;
			clone.demon = original.demon;
			clone.human = original.human;
			clone.fairy = original.fairy;
			clone.gaint = original.gaint;
			clone.creation = original.creation;
			clone.heavy_metal = original.heavy_metal;
			clone.heavy_meta = original.heavy_meta;
			clone.lightningarmor = original.lightningarmor;
			clone.heavy_armor = original.heavy_armor;
			clone.FreezeShield = original.FreezeShield;
			clone.Transparency_Use = original.Transparency_Use;
			clone.StatusPromotion = original.StatusPromotion;
			clone.chastiefol = original.chastiefol;
			clone.chastifol = original.chastifol;
			clone.snatch = original.snatch;
			clone.PhysicalHunt = original.PhysicalHunt;
			clone.PhysicalHuntlogic = original.PhysicalHuntlogic;
			clone.magic = original.magic;
			clone.revengecounter = original.revengecounter;
			clone.PurgeAttack = original.PurgeAttack;
			clone.zerosign = original.zerosign;
			clone.storeddmg = original.storeddmg;
			clone.infinity_use = original.infinity_use;
			clone.Invasion = original.Invasion;
			clone.nighmareteller = original.nighmareteller;
			clone.BreakerOff = original.BreakerOff;
			clone.demoneyes = original.demoneyes;
			clone.DemonMark = original.DemonMark;
			clone.DemonMark1 = original.DemonMark1;
			clone.berserk = original.berserk;
			clone.berserkmode = original.berserkmode;
			clone.Chaos = original.Chaos;
			clone.chaos = original.chaos;
			clone.rCoolDown = original.rCoolDown;
			clone.regeneration = original.regeneration;
			clone.StoryMode = original.StoryMode;
			clone.PerfectShell = original.PerfectShell;
			clone.LongShield = original.LongShield;
			clone.Death = original.Death;
			clone.BP = original.BP;
			clone.immortality = original.immortality;
			clone.sunshine = original.sunshine;
			clone.Sunshine = original.Sunshine;
			clone.skill = original.skill;
			clone.playerjoins = original.playerjoins;
			clone.immortalityplayer = original.immortalityplayer;
			clone.forwardfly = original.forwardfly;
			clone.playerlocking = original.playerlocking;
			clone.lokckedenity = original.lokckedenity;
			clone.ty200 = original.ty200;
			clone.autoregen = original.autoregen;
			clone.skills = original.skills;
			clone.range = original.range;
			clone.lock_on = original.lock_on;
			clone.target_lock = original.target_lock;
			clone.hpandmanaoverlay = original.hpandmanaoverlay;
			clone.creationmatrona = original.creationmatrona;
			clone.reddemonblood = original.reddemonblood;
			clone.humandemon = original.humandemon;
			clone.graydemonblood = original.graydemonblood;
			clone.Ryugekisho = original.Ryugekisho;
			clone.humandemonmark = original.humandemonmark;
			clone.graydemonform = original.graydemonform;
			clone.graydemon = original.graydemon;
			clone.arkelizebeth = original.arkelizebeth;
			clone.AbsoluteCanel = original.AbsoluteCanel;
			clone.berserkswitch = original.berserkswitch;
			clone.killroyale = original.killroyale;
			clone.redKill = original.redKill;
			clone.blueKill = original.blueKill;
			clone.InsectManipulation = original.InsectManipulation;
			clone.mana_regen = original.mana_regen;
			clone.charging = original.charging;
			clone.mana_timer = original.mana_timer;
			clone.Levitation = original.Levitation;
			clone.magicaleye = original.magicaleye;
			clone.WPressed = original.WPressed;
			clone.mana_amount = original.mana_amount;
			clone.playerBP = original.playerBP;
			clone.playerStr = original.playerStr;
			clone.PlayerDex = original.PlayerDex;
			clone.PlayerMaxMana = original.PlayerMaxMana;
			clone.Races = original.Races;
			clone.mana_drain = original.mana_drain;
			clone.attack_cd = original.attack_cd;
			clone.TPAmount = original.TPAmount;
			clone.TPSwitchAmount = original.TPSwitchAmount;
			clone.supmagic = original.supmagic;
			clone.Manipulate = original.Manipulate;
			clone.HalfAwaken = original.HalfAwaken;
			clone.Half = original.Half;
			clone.GravityTen = original.GravityTen;
			clone.HyperGravity = original.HyperGravity;
			clone.slot = original.slot;
			clone.AbilitySelect = original.AbilitySelect;
			clone.Move = original.Move;
			clone.SlotSwitch = original.SlotSwitch;
			clone.SlotLogic = original.SlotLogic;
			clone.setmoves = original.setmoves;
			clone.Agility = original.Agility;
			clone.Slot1 = original.Slot1;
			clone.Slot2 = original.Slot2;
			clone.Slot3 = original.Slot3;
			clone.reddemonmark = original.reddemonmark;
			clone.SpacePressed = original.SpacePressed;
			clone.learn_skill = original.learn_skill;
			clone.increaseSphere = original.increaseSphere;
			clone.increasessphere = original.increasessphere;
			clone.power_percentage = original.power_percentage;
			clone.damage_indicator = original.damage_indicator;
			clone.reddemonboost = original.reddemonboost;
			clone.side_quest = original.side_quest;
			clone.regen = original.regen;
			clone.Story = original.Story;
			clone.purgatoryFlame = original.purgatoryFlame;
			clone.JackCD = original.JackCD;
			clone.CDJack = original.CDJack;
			clone.LostVayne = original.LostVayne;
			clone.the_one = original.the_one;
			clone.theone = original.theone;
			clone.combostar = original.combostar;
			clone.combostarcounter = original.combostarcounter;
			clone.TheOneUltimate = original.TheOneUltimate;
			clone.TheOneUltimateNumber = original.TheOneUltimateNumber;
			clone.combostartick = original.combostartick;
			clone.capitalofthedeadX = original.capitalofthedeadX;
			clone.capitalofthedeadY = original.capitalofthedeadY;
			clone.capitalofthedeadZ = original.capitalofthedeadZ;
			clone.hit = original.hit;
			clone.TrickStarX = original.TrickStarX;
			clone.TrickStarY = original.TrickStarY;
			clone.TrickStarZ = original.TrickStarZ;
			clone.TrickStarVX = original.TrickStarVX;
			clone.TrickStarVY = original.TrickStarVY;
			clone.TrickStarVZ = original.TrickStarVZ;
			clone.fullsize = original.fullsize;
			clone.FullSize = original.FullSize;
			clone.CriticalOver = original.CriticalOver;
			clone.criticalover = original.criticalover;
			clone.Rhitta = original.Rhitta;
			clone.rhittatick = original.rhittatick;
			clone.TrickStarYaw = original.TrickStarYaw;
			clone.physical_full_counter = original.physical_full_counter;
			clone.FullPowerDemonMark = original.FullPowerDemonMark;
			clone.fullpowerDemonMark = original.fullpowerDemonMark;
			clone.nutritionalvalue = original.nutritionalvalue;
			clone.teleplortionX = original.teleplortionX;
			clone.teleplortionY = original.teleplortionY;
			clone.teleplortionZ = original.teleplortionZ;
			clone.MagicScroll = original.MagicScroll;
			clone.learn_skills = original.learn_skills;
			clone.learned_spells = original.learned_spells;
			clone.spells = original.spells;
			clone.yggdra_cloth = original.yggdra_cloth;
			clone.Yggdra_Cloth = original.Yggdra_Cloth;
			clone.True_Spirt_From = original.True_Spirt_From;
			clone.true_spirit_spear = original.true_spirit_spear;
			clone.mana_regen_effect = original.mana_regen_effect;
			clone.DiaLogID = original.DiaLogID;
			clone.HornOfCernunnosID = original.HornOfCernunnosID;
			clone.hard_protection = original.hard_protection;
			clone.Hard_Protection = original.Hard_Protection;
			clone.demon_blood = original.demon_blood;
			clone.demon_skill = original.demon_skill;
			clone.learn_demon_skills = original.learn_demon_skills;
			clone.aqua_dress = original.aqua_dress;
			clone.gravity_sound = original.gravity_sound;
			clone.Healing_Area = original.Healing_Area;
			clone.healing_area = original.healing_area;
			clone.healing_area_timer = original.healing_area_timer;
			clone.GoddessBless = original.GoddessBless;
			clone.goddessbless = original.goddessbless;
			clone.render = original.render;
			clone.food_tick = original.food_tick;
			clone.passive_regen = original.passive_regen;
			clone.chastifol_item = original.chastifol_item;
			clone.joinX = original.joinX;
			clone.joinY = original.joinY;
			clone.joinZ = original.joinZ;
			clone.yggdrasil_armor = original.yggdrasil_armor;
			clone.yggdrasilarmor = original.yggdrasilarmor;
			clone.MagicDetection = original.MagicDetection;
			clone.fire_protection = original.fire_protection;
			clone.EmeraldOcto = original.EmeraldOcto;
			clone.Emerald_Octo = original.Emerald_Octo;
			clone.drole_eye = original.drole_eye;
			clone.Moon_Rose = original.Moon_Rose;
			clone.fox_hunt = original.fox_hunt;
			clone.JubakuEnsaX = original.JubakuEnsaX;
			clone.JubakuEnsaY = original.JubakuEnsaY;
			clone.JubakuEnsaZ = original.JubakuEnsaZ;
			clone.JubakuEnsaTick = original.JubakuEnsaTick;
			clone.JubakuEnsa = original.JubakuEnsa;
			clone.God = original.God;
			if (!event.isWasDeath()) {
				clone.jumbvar = original.jumbvar;
				clone.Gloxinia = original.Gloxinia;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "craft_no_taizai_worldvars";
		public boolean zerotime = false;
		public double Sunshinee = 0;
		public boolean immortalityworld = false;
		public boolean radmonRace = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			zerotime = nbt.getBoolean("zerotime");
			Sunshinee = nbt.getDouble("Sunshinee");
			immortalityworld = nbt.getBoolean("immortalityworld");
			radmonRace = nbt.getBoolean("radmonRace");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("zerotime", zerotime);
			nbt.putDouble("Sunshinee", Sunshinee);
			nbt.putBoolean("immortalityworld", immortalityworld);
			nbt.putBoolean("radmonRace", radmonRace);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "craft_no_taizai_mapvars";
		public boolean fairyking = false;
		public double PlayerFacing = 0;
		public double fairy_king = 0;
		public boolean choas = false;
		public boolean purplefire = false;
		public boolean fariykingtree = false;
		public String fairykingtreecoords = "\"\"";
		public boolean courechouse = false;
		public boolean Gideon = false;
		public boolean TwinBowHerritt = false;
		public boolean Aldan = false;
		public boolean MobHP = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			fairyking = nbt.getBoolean("fairyking");
			PlayerFacing = nbt.getDouble("PlayerFacing");
			fairy_king = nbt.getDouble("fairy_king");
			choas = nbt.getBoolean("choas");
			purplefire = nbt.getBoolean("purplefire");
			fariykingtree = nbt.getBoolean("fariykingtree");
			fairykingtreecoords = nbt.getString("fairykingtreecoords");
			courechouse = nbt.getBoolean("courechouse");
			Gideon = nbt.getBoolean("Gideon");
			TwinBowHerritt = nbt.getBoolean("TwinBowHerritt");
			Aldan = nbt.getBoolean("Aldan");
			MobHP = nbt.getBoolean("MobHP");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("fairyking", fairyking);
			nbt.putDouble("PlayerFacing", PlayerFacing);
			nbt.putDouble("fairy_king", fairy_king);
			nbt.putBoolean("choas", choas);
			nbt.putBoolean("purplefire", purplefire);
			nbt.putBoolean("fariykingtree", fariykingtree);
			nbt.putString("fairykingtreecoords", fairykingtreecoords);
			nbt.putBoolean("courechouse", courechouse);
			nbt.putBoolean("Gideon", Gideon);
			nbt.putBoolean("TwinBowHerritt", TwinBowHerritt);
			nbt.putBoolean("Aldan", Aldan);
			nbt.putBoolean("MobHP", MobHP);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("craft_no_taizai", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double level = 1.0;
		public double xp = 0;
		public double TP = 0;
		public double health = 0;
		public double maxhealth = 15.0;
		public double strength = 0;
		public double Spirit = 0;
		public double mana = 0;
		public double maxmana = 0;
		public double Demon_Clan = 0;
		public double ManaAttack = 0;
		public boolean Full_Counter_Use = false;
		public double PlayerFirstJoins = 0;
		public String Race = "\"\"";
		public double Human_Clan = 0;
		public double Fairy_Clan = 0;
		public double GaintRace = 0;
		public boolean PurgatoryFire = false;
		public boolean demon = false;
		public boolean human = false;
		public boolean fairy = false;
		public boolean gaint = false;
		public boolean creation = false;
		public boolean heavy_metal = false;
		public double heavy_meta = 0;
		public boolean lightningarmor = false;
		public double heavy_armor = 0;
		public boolean FreezeShield = false;
		public boolean Transparency_Use = false;
		public boolean StatusPromotion = false;
		public boolean chastiefol = false;
		public String chastifol = "\"\"";
		public boolean snatch = false;
		public double PhysicalHunt = 0;
		public boolean PhysicalHuntlogic = false;
		public String magic = "\"\"";
		public boolean revengecounter = false;
		public boolean PurgeAttack = false;
		public boolean zerosign = false;
		public double storeddmg = 0;
		public boolean infinity_use = false;
		public boolean Invasion = false;
		public boolean nighmareteller = false;
		public boolean BreakerOff = false;
		public double demoneyes = 0;
		public boolean DemonMark = false;
		public double DemonMark1 = 0;
		public double berserk = 0;
		public boolean berserkmode = false;
		public boolean Chaos = false;
		public double chaos = 0;
		public double rCoolDown = 0;
		public boolean regeneration = false;
		public double StoryMode = 0;
		public boolean PerfectShell = false;
		public boolean LongShield = false;
		public boolean Death = false;
		public double BP = 0;
		public boolean immortality = false;
		public boolean sunshine = false;
		public double Sunshine = 0;
		public double skill = 0;
		public boolean playerjoins = false;
		public boolean immortalityplayer = false;
		public boolean forwardfly = false;
		public boolean playerlocking = false;
		public String lokckedenity = "\"\"";
		public boolean ty200 = false;
		public boolean autoregen = false;
		public String skills = "\"\"";
		public double range = 0;
		public boolean jumbvar = false;
		public boolean lock_on = false;
		public String target_lock = "\"\"";
		public boolean hpandmanaoverlay = false;
		public boolean creationmatrona = false;
		public boolean reddemonblood = false;
		public double humandemon = 0;
		public boolean graydemonblood = false;
		public boolean Ryugekisho = false;
		public boolean humandemonmark = false;
		public boolean graydemonform = false;
		public double graydemon = 0;
		public boolean arkelizebeth = false;
		public boolean AbsoluteCanel = false;
		public boolean berserkswitch = false;
		public double killroyale = 0;
		public double redKill = 0;
		public double blueKill = 0;
		public boolean InsectManipulation = false;
		public double mana_regen = 0;
		public boolean charging = false;
		public double mana_timer = 0;
		public boolean Levitation = false;
		public boolean magicaleye = false;
		public boolean WPressed = false;
		public double mana_amount = 0;
		public String playerBP = "\"\"";
		public String playerStr = "\"\"";
		public String PlayerDex = "\"\"";
		public String PlayerMaxMana = "\"\"";
		public boolean Races = false;
		public double mana_drain = 0;
		public double attack_cd = 0;
		public double TPAmount = 0;
		public double TPSwitchAmount = 0;
		public String supmagic = "\"\"";
		public boolean Manipulate = false;
		public double HalfAwaken = 0;
		public boolean Half = false;
		public boolean GravityTen = false;
		public boolean HyperGravity = false;
		public double slot = 0;
		public ItemStack AbilitySelect = ItemStack.EMPTY;
		public double Move = 0;
		public double SlotSwitch = 0;
		public boolean SlotLogic = false;
		public boolean setmoves = false;
		public double Agility = 0;
		public boolean Slot1 = false;
		public boolean Slot2 = false;
		public boolean Slot3 = false;
		public boolean reddemonmark = false;
		public boolean SpacePressed = false;
		public ItemStack learn_skill = ItemStack.EMPTY;
		public boolean increaseSphere = false;
		public double increasessphere = 0;
		public double power_percentage = 0;
		public boolean damage_indicator = false;
		public boolean reddemonboost = false;
		public String side_quest = "\"\"";
		public double regen = 0;
		public String Story = "\"\"";
		public boolean purgatoryFlame = false;
		public double JackCD = 0;
		public double CDJack = 0;
		public double LostVayne = 0;
		public boolean the_one = false;
		public double theone = 0;
		public boolean combostar = false;
		public double combostarcounter = 0;
		public boolean TheOneUltimate = false;
		public double TheOneUltimateNumber = 0;
		public double combostartick = 0;
		public double capitalofthedeadX = 0;
		public double capitalofthedeadY = 0;
		public double capitalofthedeadZ = 0;
		public double hit = 0;
		public double TrickStarX = 0;
		public double TrickStarY = 0;
		public double TrickStarZ = 0;
		public double TrickStarVX = 0;
		public double TrickStarVY = 0;
		public double TrickStarVZ = 0;
		public double fullsize = 0;
		public boolean FullSize = false;
		public boolean CriticalOver = false;
		public double criticalover = 0;
		public double Rhitta = 0;
		public double rhittatick = 0;
		public double TrickStarYaw = 0;
		public boolean physical_full_counter = false;
		public boolean FullPowerDemonMark = false;
		public double fullpowerDemonMark = 0;
		public double nutritionalvalue = 0;
		public double teleplortionX = 0;
		public double teleplortionY = 0;
		public double teleplortionZ = 0;
		public double MagicScroll = 0;
		public boolean learn_skills = false;
		public double learned_spells = 0;
		public double spells = 0;
		public boolean yggdra_cloth = false;
		public double Yggdra_Cloth = 0;
		public boolean True_Spirt_From = false;
		public double true_spirit_spear = 0;
		public double mana_regen_effect = 0;
		public double DiaLogID = 0;
		public double HornOfCernunnosID = 0;
		public boolean hard_protection = false;
		public double Hard_Protection = 0;
		public double demon_blood = 0;
		public ItemStack demon_skill = ItemStack.EMPTY;
		public boolean learn_demon_skills = false;
		public boolean aqua_dress = false;
		public double gravity_sound = 0;
		public boolean Healing_Area = false;
		public double healing_area = 0;
		public double healing_area_timer = 0;
		public boolean GoddessBless = false;
		public double goddessbless = 0;
		public boolean render = false;
		public double food_tick = 0;
		public double passive_regen = 0;
		public ItemStack chastifol_item = ItemStack.EMPTY;
		public double joinX = 0;
		public double joinY = 0;
		public double joinZ = 0;
		public boolean Gloxinia = false;
		public boolean yggdrasil_armor = false;
		public double yggdrasilarmor = 0;
		public boolean MagicDetection = false;
		public boolean fire_protection = false;
		public double EmeraldOcto = 0;
		public boolean Emerald_Octo = false;
		public boolean drole_eye = false;
		public double Moon_Rose = 0;
		public double fox_hunt = 0;
		public double JubakuEnsaX = 0;
		public double JubakuEnsaY = 0;
		public double JubakuEnsaZ = 0;
		public double JubakuEnsaTick = 0;
		public boolean JubakuEnsa = false;
		public boolean God = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("level", level);
			nbt.putDouble("xp", xp);
			nbt.putDouble("TP", TP);
			nbt.putDouble("health", health);
			nbt.putDouble("maxhealth", maxhealth);
			nbt.putDouble("strength", strength);
			nbt.putDouble("Spirit", Spirit);
			nbt.putDouble("mana", mana);
			nbt.putDouble("maxmana", maxmana);
			nbt.putDouble("Demon_Clan", Demon_Clan);
			nbt.putDouble("ManaAttack", ManaAttack);
			nbt.putBoolean("Full_Counter_Use", Full_Counter_Use);
			nbt.putDouble("PlayerFirstJoins", PlayerFirstJoins);
			nbt.putString("Race", Race);
			nbt.putDouble("Human_Clan", Human_Clan);
			nbt.putDouble("Fairy_Clan", Fairy_Clan);
			nbt.putDouble("GaintRace", GaintRace);
			nbt.putBoolean("PurgatoryFire", PurgatoryFire);
			nbt.putBoolean("demon", demon);
			nbt.putBoolean("human", human);
			nbt.putBoolean("fairy", fairy);
			nbt.putBoolean("gaint", gaint);
			nbt.putBoolean("creation", creation);
			nbt.putBoolean("heavy_metal", heavy_metal);
			nbt.putDouble("heavy_meta", heavy_meta);
			nbt.putBoolean("lightningarmor", lightningarmor);
			nbt.putDouble("heavy_armor", heavy_armor);
			nbt.putBoolean("FreezeShield", FreezeShield);
			nbt.putBoolean("Transparency_Use", Transparency_Use);
			nbt.putBoolean("StatusPromotion", StatusPromotion);
			nbt.putBoolean("chastiefol", chastiefol);
			nbt.putString("chastifol", chastifol);
			nbt.putBoolean("snatch", snatch);
			nbt.putDouble("PhysicalHunt", PhysicalHunt);
			nbt.putBoolean("PhysicalHuntlogic", PhysicalHuntlogic);
			nbt.putString("magic", magic);
			nbt.putBoolean("revengecounter", revengecounter);
			nbt.putBoolean("PurgeAttack", PurgeAttack);
			nbt.putBoolean("zerosign", zerosign);
			nbt.putDouble("storeddmg", storeddmg);
			nbt.putBoolean("infinity_use", infinity_use);
			nbt.putBoolean("Invasion", Invasion);
			nbt.putBoolean("nighmareteller", nighmareteller);
			nbt.putBoolean("BreakerOff", BreakerOff);
			nbt.putDouble("demoneyes", demoneyes);
			nbt.putBoolean("DemonMark", DemonMark);
			nbt.putDouble("DemonMark1", DemonMark1);
			nbt.putDouble("berserk", berserk);
			nbt.putBoolean("berserkmode", berserkmode);
			nbt.putBoolean("Chaos", Chaos);
			nbt.putDouble("chaos", chaos);
			nbt.putDouble("rCoolDown", rCoolDown);
			nbt.putBoolean("regeneration", regeneration);
			nbt.putDouble("StoryMode", StoryMode);
			nbt.putBoolean("PerfectShell", PerfectShell);
			nbt.putBoolean("LongShield", LongShield);
			nbt.putBoolean("Death", Death);
			nbt.putDouble("BP", BP);
			nbt.putBoolean("immortality", immortality);
			nbt.putBoolean("sunshine", sunshine);
			nbt.putDouble("Sunshine", Sunshine);
			nbt.putDouble("skill", skill);
			nbt.putBoolean("playerjoins", playerjoins);
			nbt.putBoolean("immortalityplayer", immortalityplayer);
			nbt.putBoolean("forwardfly", forwardfly);
			nbt.putBoolean("playerlocking", playerlocking);
			nbt.putString("lokckedenity", lokckedenity);
			nbt.putBoolean("ty200", ty200);
			nbt.putBoolean("autoregen", autoregen);
			nbt.putString("skills", skills);
			nbt.putDouble("range", range);
			nbt.putBoolean("jumbvar", jumbvar);
			nbt.putBoolean("lock_on", lock_on);
			nbt.putString("target_lock", target_lock);
			nbt.putBoolean("hpandmanaoverlay", hpandmanaoverlay);
			nbt.putBoolean("creationmatrona", creationmatrona);
			nbt.putBoolean("reddemonblood", reddemonblood);
			nbt.putDouble("humandemon", humandemon);
			nbt.putBoolean("graydemonblood", graydemonblood);
			nbt.putBoolean("Ryugekisho", Ryugekisho);
			nbt.putBoolean("humandemonmark", humandemonmark);
			nbt.putBoolean("graydemonform", graydemonform);
			nbt.putDouble("graydemon", graydemon);
			nbt.putBoolean("arkelizebeth", arkelizebeth);
			nbt.putBoolean("AbsoluteCanel", AbsoluteCanel);
			nbt.putBoolean("berserkswitch", berserkswitch);
			nbt.putDouble("killroyale", killroyale);
			nbt.putDouble("redKill", redKill);
			nbt.putDouble("blueKill", blueKill);
			nbt.putBoolean("InsectManipulation", InsectManipulation);
			nbt.putDouble("mana_regen", mana_regen);
			nbt.putBoolean("charging", charging);
			nbt.putDouble("mana_timer", mana_timer);
			nbt.putBoolean("Levitation", Levitation);
			nbt.putBoolean("magicaleye", magicaleye);
			nbt.putBoolean("WPressed", WPressed);
			nbt.putDouble("mana_amount", mana_amount);
			nbt.putString("playerBP", playerBP);
			nbt.putString("playerStr", playerStr);
			nbt.putString("PlayerDex", PlayerDex);
			nbt.putString("PlayerMaxMana", PlayerMaxMana);
			nbt.putBoolean("Races", Races);
			nbt.putDouble("mana_drain", mana_drain);
			nbt.putDouble("attack_cd", attack_cd);
			nbt.putDouble("TPAmount", TPAmount);
			nbt.putDouble("TPSwitchAmount", TPSwitchAmount);
			nbt.putString("supmagic", supmagic);
			nbt.putBoolean("Manipulate", Manipulate);
			nbt.putDouble("HalfAwaken", HalfAwaken);
			nbt.putBoolean("Half", Half);
			nbt.putBoolean("GravityTen", GravityTen);
			nbt.putBoolean("HyperGravity", HyperGravity);
			nbt.putDouble("slot", slot);
			nbt.put("AbilitySelect", AbilitySelect.save(new CompoundTag()));
			nbt.putDouble("Move", Move);
			nbt.putDouble("SlotSwitch", SlotSwitch);
			nbt.putBoolean("SlotLogic", SlotLogic);
			nbt.putBoolean("setmoves", setmoves);
			nbt.putDouble("Agility", Agility);
			nbt.putBoolean("Slot1", Slot1);
			nbt.putBoolean("Slot2", Slot2);
			nbt.putBoolean("Slot3", Slot3);
			nbt.putBoolean("reddemonmark", reddemonmark);
			nbt.putBoolean("SpacePressed", SpacePressed);
			nbt.put("learn_skill", learn_skill.save(new CompoundTag()));
			nbt.putBoolean("increaseSphere", increaseSphere);
			nbt.putDouble("increasessphere", increasessphere);
			nbt.putDouble("power_percentage", power_percentage);
			nbt.putBoolean("damage_indicator", damage_indicator);
			nbt.putBoolean("reddemonboost", reddemonboost);
			nbt.putString("side_quest", side_quest);
			nbt.putDouble("regen", regen);
			nbt.putString("Story", Story);
			nbt.putBoolean("purgatoryFlame", purgatoryFlame);
			nbt.putDouble("JackCD", JackCD);
			nbt.putDouble("CDJack", CDJack);
			nbt.putDouble("LostVayne", LostVayne);
			nbt.putBoolean("the_one", the_one);
			nbt.putDouble("theone", theone);
			nbt.putBoolean("combostar", combostar);
			nbt.putDouble("combostarcounter", combostarcounter);
			nbt.putBoolean("TheOneUltimate", TheOneUltimate);
			nbt.putDouble("TheOneUltimateNumber", TheOneUltimateNumber);
			nbt.putDouble("combostartick", combostartick);
			nbt.putDouble("capitalofthedeadX", capitalofthedeadX);
			nbt.putDouble("capitalofthedeadY", capitalofthedeadY);
			nbt.putDouble("capitalofthedeadZ", capitalofthedeadZ);
			nbt.putDouble("hit", hit);
			nbt.putDouble("TrickStarX", TrickStarX);
			nbt.putDouble("TrickStarY", TrickStarY);
			nbt.putDouble("TrickStarZ", TrickStarZ);
			nbt.putDouble("TrickStarVX", TrickStarVX);
			nbt.putDouble("TrickStarVY", TrickStarVY);
			nbt.putDouble("TrickStarVZ", TrickStarVZ);
			nbt.putDouble("fullsize", fullsize);
			nbt.putBoolean("FullSize", FullSize);
			nbt.putBoolean("CriticalOver", CriticalOver);
			nbt.putDouble("criticalover", criticalover);
			nbt.putDouble("Rhitta", Rhitta);
			nbt.putDouble("rhittatick", rhittatick);
			nbt.putDouble("TrickStarYaw", TrickStarYaw);
			nbt.putBoolean("physical_full_counter", physical_full_counter);
			nbt.putBoolean("FullPowerDemonMark", FullPowerDemonMark);
			nbt.putDouble("fullpowerDemonMark", fullpowerDemonMark);
			nbt.putDouble("nutritionalvalue", nutritionalvalue);
			nbt.putDouble("teleplortionX", teleplortionX);
			nbt.putDouble("teleplortionY", teleplortionY);
			nbt.putDouble("teleplortionZ", teleplortionZ);
			nbt.putDouble("MagicScroll", MagicScroll);
			nbt.putBoolean("learn_skills", learn_skills);
			nbt.putDouble("learned_spells", learned_spells);
			nbt.putDouble("spells", spells);
			nbt.putBoolean("yggdra_cloth", yggdra_cloth);
			nbt.putDouble("Yggdra_Cloth", Yggdra_Cloth);
			nbt.putBoolean("True_Spirt_From", True_Spirt_From);
			nbt.putDouble("true_spirit_spear", true_spirit_spear);
			nbt.putDouble("mana_regen_effect", mana_regen_effect);
			nbt.putDouble("DiaLogID", DiaLogID);
			nbt.putDouble("HornOfCernunnosID", HornOfCernunnosID);
			nbt.putBoolean("hard_protection", hard_protection);
			nbt.putDouble("Hard_Protection", Hard_Protection);
			nbt.putDouble("demon_blood", demon_blood);
			nbt.put("demon_skill", demon_skill.save(new CompoundTag()));
			nbt.putBoolean("learn_demon_skills", learn_demon_skills);
			nbt.putBoolean("aqua_dress", aqua_dress);
			nbt.putDouble("gravity_sound", gravity_sound);
			nbt.putBoolean("Healing_Area", Healing_Area);
			nbt.putDouble("healing_area", healing_area);
			nbt.putDouble("healing_area_timer", healing_area_timer);
			nbt.putBoolean("GoddessBless", GoddessBless);
			nbt.putDouble("goddessbless", goddessbless);
			nbt.putBoolean("render", render);
			nbt.putDouble("food_tick", food_tick);
			nbt.putDouble("passive_regen", passive_regen);
			nbt.put("chastifol_item", chastifol_item.save(new CompoundTag()));
			nbt.putDouble("joinX", joinX);
			nbt.putDouble("joinY", joinY);
			nbt.putDouble("joinZ", joinZ);
			nbt.putBoolean("Gloxinia", Gloxinia);
			nbt.putBoolean("yggdrasil_armor", yggdrasil_armor);
			nbt.putDouble("yggdrasilarmor", yggdrasilarmor);
			nbt.putBoolean("MagicDetection", MagicDetection);
			nbt.putBoolean("fire_protection", fire_protection);
			nbt.putDouble("EmeraldOcto", EmeraldOcto);
			nbt.putBoolean("Emerald_Octo", Emerald_Octo);
			nbt.putBoolean("drole_eye", drole_eye);
			nbt.putDouble("Moon_Rose", Moon_Rose);
			nbt.putDouble("fox_hunt", fox_hunt);
			nbt.putDouble("JubakuEnsaX", JubakuEnsaX);
			nbt.putDouble("JubakuEnsaY", JubakuEnsaY);
			nbt.putDouble("JubakuEnsaZ", JubakuEnsaZ);
			nbt.putDouble("JubakuEnsaTick", JubakuEnsaTick);
			nbt.putBoolean("JubakuEnsa", JubakuEnsa);
			nbt.putBoolean("God", God);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			level = nbt.getDouble("level");
			xp = nbt.getDouble("xp");
			TP = nbt.getDouble("TP");
			health = nbt.getDouble("health");
			maxhealth = nbt.getDouble("maxhealth");
			strength = nbt.getDouble("strength");
			Spirit = nbt.getDouble("Spirit");
			mana = nbt.getDouble("mana");
			maxmana = nbt.getDouble("maxmana");
			Demon_Clan = nbt.getDouble("Demon_Clan");
			ManaAttack = nbt.getDouble("ManaAttack");
			Full_Counter_Use = nbt.getBoolean("Full_Counter_Use");
			PlayerFirstJoins = nbt.getDouble("PlayerFirstJoins");
			Race = nbt.getString("Race");
			Human_Clan = nbt.getDouble("Human_Clan");
			Fairy_Clan = nbt.getDouble("Fairy_Clan");
			GaintRace = nbt.getDouble("GaintRace");
			PurgatoryFire = nbt.getBoolean("PurgatoryFire");
			demon = nbt.getBoolean("demon");
			human = nbt.getBoolean("human");
			fairy = nbt.getBoolean("fairy");
			gaint = nbt.getBoolean("gaint");
			creation = nbt.getBoolean("creation");
			heavy_metal = nbt.getBoolean("heavy_metal");
			heavy_meta = nbt.getDouble("heavy_meta");
			lightningarmor = nbt.getBoolean("lightningarmor");
			heavy_armor = nbt.getDouble("heavy_armor");
			FreezeShield = nbt.getBoolean("FreezeShield");
			Transparency_Use = nbt.getBoolean("Transparency_Use");
			StatusPromotion = nbt.getBoolean("StatusPromotion");
			chastiefol = nbt.getBoolean("chastiefol");
			chastifol = nbt.getString("chastifol");
			snatch = nbt.getBoolean("snatch");
			PhysicalHunt = nbt.getDouble("PhysicalHunt");
			PhysicalHuntlogic = nbt.getBoolean("PhysicalHuntlogic");
			magic = nbt.getString("magic");
			revengecounter = nbt.getBoolean("revengecounter");
			PurgeAttack = nbt.getBoolean("PurgeAttack");
			zerosign = nbt.getBoolean("zerosign");
			storeddmg = nbt.getDouble("storeddmg");
			infinity_use = nbt.getBoolean("infinity_use");
			Invasion = nbt.getBoolean("Invasion");
			nighmareteller = nbt.getBoolean("nighmareteller");
			BreakerOff = nbt.getBoolean("BreakerOff");
			demoneyes = nbt.getDouble("demoneyes");
			DemonMark = nbt.getBoolean("DemonMark");
			DemonMark1 = nbt.getDouble("DemonMark1");
			berserk = nbt.getDouble("berserk");
			berserkmode = nbt.getBoolean("berserkmode");
			Chaos = nbt.getBoolean("Chaos");
			chaos = nbt.getDouble("chaos");
			rCoolDown = nbt.getDouble("rCoolDown");
			regeneration = nbt.getBoolean("regeneration");
			StoryMode = nbt.getDouble("StoryMode");
			PerfectShell = nbt.getBoolean("PerfectShell");
			LongShield = nbt.getBoolean("LongShield");
			Death = nbt.getBoolean("Death");
			BP = nbt.getDouble("BP");
			immortality = nbt.getBoolean("immortality");
			sunshine = nbt.getBoolean("sunshine");
			Sunshine = nbt.getDouble("Sunshine");
			skill = nbt.getDouble("skill");
			playerjoins = nbt.getBoolean("playerjoins");
			immortalityplayer = nbt.getBoolean("immortalityplayer");
			forwardfly = nbt.getBoolean("forwardfly");
			playerlocking = nbt.getBoolean("playerlocking");
			lokckedenity = nbt.getString("lokckedenity");
			ty200 = nbt.getBoolean("ty200");
			autoregen = nbt.getBoolean("autoregen");
			skills = nbt.getString("skills");
			range = nbt.getDouble("range");
			jumbvar = nbt.getBoolean("jumbvar");
			lock_on = nbt.getBoolean("lock_on");
			target_lock = nbt.getString("target_lock");
			hpandmanaoverlay = nbt.getBoolean("hpandmanaoverlay");
			creationmatrona = nbt.getBoolean("creationmatrona");
			reddemonblood = nbt.getBoolean("reddemonblood");
			humandemon = nbt.getDouble("humandemon");
			graydemonblood = nbt.getBoolean("graydemonblood");
			Ryugekisho = nbt.getBoolean("Ryugekisho");
			humandemonmark = nbt.getBoolean("humandemonmark");
			graydemonform = nbt.getBoolean("graydemonform");
			graydemon = nbt.getDouble("graydemon");
			arkelizebeth = nbt.getBoolean("arkelizebeth");
			AbsoluteCanel = nbt.getBoolean("AbsoluteCanel");
			berserkswitch = nbt.getBoolean("berserkswitch");
			killroyale = nbt.getDouble("killroyale");
			redKill = nbt.getDouble("redKill");
			blueKill = nbt.getDouble("blueKill");
			InsectManipulation = nbt.getBoolean("InsectManipulation");
			mana_regen = nbt.getDouble("mana_regen");
			charging = nbt.getBoolean("charging");
			mana_timer = nbt.getDouble("mana_timer");
			Levitation = nbt.getBoolean("Levitation");
			magicaleye = nbt.getBoolean("magicaleye");
			WPressed = nbt.getBoolean("WPressed");
			mana_amount = nbt.getDouble("mana_amount");
			playerBP = nbt.getString("playerBP");
			playerStr = nbt.getString("playerStr");
			PlayerDex = nbt.getString("PlayerDex");
			PlayerMaxMana = nbt.getString("PlayerMaxMana");
			Races = nbt.getBoolean("Races");
			mana_drain = nbt.getDouble("mana_drain");
			attack_cd = nbt.getDouble("attack_cd");
			TPAmount = nbt.getDouble("TPAmount");
			TPSwitchAmount = nbt.getDouble("TPSwitchAmount");
			supmagic = nbt.getString("supmagic");
			Manipulate = nbt.getBoolean("Manipulate");
			HalfAwaken = nbt.getDouble("HalfAwaken");
			Half = nbt.getBoolean("Half");
			GravityTen = nbt.getBoolean("GravityTen");
			HyperGravity = nbt.getBoolean("HyperGravity");
			slot = nbt.getDouble("slot");
			AbilitySelect = ItemStack.of(nbt.getCompound("AbilitySelect"));
			Move = nbt.getDouble("Move");
			SlotSwitch = nbt.getDouble("SlotSwitch");
			SlotLogic = nbt.getBoolean("SlotLogic");
			setmoves = nbt.getBoolean("setmoves");
			Agility = nbt.getDouble("Agility");
			Slot1 = nbt.getBoolean("Slot1");
			Slot2 = nbt.getBoolean("Slot2");
			Slot3 = nbt.getBoolean("Slot3");
			reddemonmark = nbt.getBoolean("reddemonmark");
			SpacePressed = nbt.getBoolean("SpacePressed");
			learn_skill = ItemStack.of(nbt.getCompound("learn_skill"));
			increaseSphere = nbt.getBoolean("increaseSphere");
			increasessphere = nbt.getDouble("increasessphere");
			power_percentage = nbt.getDouble("power_percentage");
			damage_indicator = nbt.getBoolean("damage_indicator");
			reddemonboost = nbt.getBoolean("reddemonboost");
			side_quest = nbt.getString("side_quest");
			regen = nbt.getDouble("regen");
			Story = nbt.getString("Story");
			purgatoryFlame = nbt.getBoolean("purgatoryFlame");
			JackCD = nbt.getDouble("JackCD");
			CDJack = nbt.getDouble("CDJack");
			LostVayne = nbt.getDouble("LostVayne");
			the_one = nbt.getBoolean("the_one");
			theone = nbt.getDouble("theone");
			combostar = nbt.getBoolean("combostar");
			combostarcounter = nbt.getDouble("combostarcounter");
			TheOneUltimate = nbt.getBoolean("TheOneUltimate");
			TheOneUltimateNumber = nbt.getDouble("TheOneUltimateNumber");
			combostartick = nbt.getDouble("combostartick");
			capitalofthedeadX = nbt.getDouble("capitalofthedeadX");
			capitalofthedeadY = nbt.getDouble("capitalofthedeadY");
			capitalofthedeadZ = nbt.getDouble("capitalofthedeadZ");
			hit = nbt.getDouble("hit");
			TrickStarX = nbt.getDouble("TrickStarX");
			TrickStarY = nbt.getDouble("TrickStarY");
			TrickStarZ = nbt.getDouble("TrickStarZ");
			TrickStarVX = nbt.getDouble("TrickStarVX");
			TrickStarVY = nbt.getDouble("TrickStarVY");
			TrickStarVZ = nbt.getDouble("TrickStarVZ");
			fullsize = nbt.getDouble("fullsize");
			FullSize = nbt.getBoolean("FullSize");
			CriticalOver = nbt.getBoolean("CriticalOver");
			criticalover = nbt.getDouble("criticalover");
			Rhitta = nbt.getDouble("Rhitta");
			rhittatick = nbt.getDouble("rhittatick");
			TrickStarYaw = nbt.getDouble("TrickStarYaw");
			physical_full_counter = nbt.getBoolean("physical_full_counter");
			FullPowerDemonMark = nbt.getBoolean("FullPowerDemonMark");
			fullpowerDemonMark = nbt.getDouble("fullpowerDemonMark");
			nutritionalvalue = nbt.getDouble("nutritionalvalue");
			teleplortionX = nbt.getDouble("teleplortionX");
			teleplortionY = nbt.getDouble("teleplortionY");
			teleplortionZ = nbt.getDouble("teleplortionZ");
			MagicScroll = nbt.getDouble("MagicScroll");
			learn_skills = nbt.getBoolean("learn_skills");
			learned_spells = nbt.getDouble("learned_spells");
			spells = nbt.getDouble("spells");
			yggdra_cloth = nbt.getBoolean("yggdra_cloth");
			Yggdra_Cloth = nbt.getDouble("Yggdra_Cloth");
			True_Spirt_From = nbt.getBoolean("True_Spirt_From");
			true_spirit_spear = nbt.getDouble("true_spirit_spear");
			mana_regen_effect = nbt.getDouble("mana_regen_effect");
			DiaLogID = nbt.getDouble("DiaLogID");
			HornOfCernunnosID = nbt.getDouble("HornOfCernunnosID");
			hard_protection = nbt.getBoolean("hard_protection");
			Hard_Protection = nbt.getDouble("Hard_Protection");
			demon_blood = nbt.getDouble("demon_blood");
			demon_skill = ItemStack.of(nbt.getCompound("demon_skill"));
			learn_demon_skills = nbt.getBoolean("learn_demon_skills");
			aqua_dress = nbt.getBoolean("aqua_dress");
			gravity_sound = nbt.getDouble("gravity_sound");
			Healing_Area = nbt.getBoolean("Healing_Area");
			healing_area = nbt.getDouble("healing_area");
			healing_area_timer = nbt.getDouble("healing_area_timer");
			GoddessBless = nbt.getBoolean("GoddessBless");
			goddessbless = nbt.getDouble("goddessbless");
			render = nbt.getBoolean("render");
			food_tick = nbt.getDouble("food_tick");
			passive_regen = nbt.getDouble("passive_regen");
			chastifol_item = ItemStack.of(nbt.getCompound("chastifol_item"));
			joinX = nbt.getDouble("joinX");
			joinY = nbt.getDouble("joinY");
			joinZ = nbt.getDouble("joinZ");
			Gloxinia = nbt.getBoolean("Gloxinia");
			yggdrasil_armor = nbt.getBoolean("yggdrasil_armor");
			yggdrasilarmor = nbt.getDouble("yggdrasilarmor");
			MagicDetection = nbt.getBoolean("MagicDetection");
			fire_protection = nbt.getBoolean("fire_protection");
			EmeraldOcto = nbt.getDouble("EmeraldOcto");
			Emerald_Octo = nbt.getBoolean("Emerald_Octo");
			drole_eye = nbt.getBoolean("drole_eye");
			Moon_Rose = nbt.getDouble("Moon_Rose");
			fox_hunt = nbt.getDouble("fox_hunt");
			JubakuEnsaX = nbt.getDouble("JubakuEnsaX");
			JubakuEnsaY = nbt.getDouble("JubakuEnsaY");
			JubakuEnsaZ = nbt.getDouble("JubakuEnsaZ");
			JubakuEnsaTick = nbt.getDouble("JubakuEnsaTick");
			JubakuEnsa = nbt.getBoolean("JubakuEnsa");
			God = nbt.getBoolean("God");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.level = message.data.level;
					variables.xp = message.data.xp;
					variables.TP = message.data.TP;
					variables.health = message.data.health;
					variables.maxhealth = message.data.maxhealth;
					variables.strength = message.data.strength;
					variables.Spirit = message.data.Spirit;
					variables.mana = message.data.mana;
					variables.maxmana = message.data.maxmana;
					variables.Demon_Clan = message.data.Demon_Clan;
					variables.ManaAttack = message.data.ManaAttack;
					variables.Full_Counter_Use = message.data.Full_Counter_Use;
					variables.PlayerFirstJoins = message.data.PlayerFirstJoins;
					variables.Race = message.data.Race;
					variables.Human_Clan = message.data.Human_Clan;
					variables.Fairy_Clan = message.data.Fairy_Clan;
					variables.GaintRace = message.data.GaintRace;
					variables.PurgatoryFire = message.data.PurgatoryFire;
					variables.demon = message.data.demon;
					variables.human = message.data.human;
					variables.fairy = message.data.fairy;
					variables.gaint = message.data.gaint;
					variables.creation = message.data.creation;
					variables.heavy_metal = message.data.heavy_metal;
					variables.heavy_meta = message.data.heavy_meta;
					variables.lightningarmor = message.data.lightningarmor;
					variables.heavy_armor = message.data.heavy_armor;
					variables.FreezeShield = message.data.FreezeShield;
					variables.Transparency_Use = message.data.Transparency_Use;
					variables.StatusPromotion = message.data.StatusPromotion;
					variables.chastiefol = message.data.chastiefol;
					variables.chastifol = message.data.chastifol;
					variables.snatch = message.data.snatch;
					variables.PhysicalHunt = message.data.PhysicalHunt;
					variables.PhysicalHuntlogic = message.data.PhysicalHuntlogic;
					variables.magic = message.data.magic;
					variables.revengecounter = message.data.revengecounter;
					variables.PurgeAttack = message.data.PurgeAttack;
					variables.zerosign = message.data.zerosign;
					variables.storeddmg = message.data.storeddmg;
					variables.infinity_use = message.data.infinity_use;
					variables.Invasion = message.data.Invasion;
					variables.nighmareteller = message.data.nighmareteller;
					variables.BreakerOff = message.data.BreakerOff;
					variables.demoneyes = message.data.demoneyes;
					variables.DemonMark = message.data.DemonMark;
					variables.DemonMark1 = message.data.DemonMark1;
					variables.berserk = message.data.berserk;
					variables.berserkmode = message.data.berserkmode;
					variables.Chaos = message.data.Chaos;
					variables.chaos = message.data.chaos;
					variables.rCoolDown = message.data.rCoolDown;
					variables.regeneration = message.data.regeneration;
					variables.StoryMode = message.data.StoryMode;
					variables.PerfectShell = message.data.PerfectShell;
					variables.LongShield = message.data.LongShield;
					variables.Death = message.data.Death;
					variables.BP = message.data.BP;
					variables.immortality = message.data.immortality;
					variables.sunshine = message.data.sunshine;
					variables.Sunshine = message.data.Sunshine;
					variables.skill = message.data.skill;
					variables.playerjoins = message.data.playerjoins;
					variables.immortalityplayer = message.data.immortalityplayer;
					variables.forwardfly = message.data.forwardfly;
					variables.playerlocking = message.data.playerlocking;
					variables.lokckedenity = message.data.lokckedenity;
					variables.ty200 = message.data.ty200;
					variables.autoregen = message.data.autoregen;
					variables.skills = message.data.skills;
					variables.range = message.data.range;
					variables.jumbvar = message.data.jumbvar;
					variables.lock_on = message.data.lock_on;
					variables.target_lock = message.data.target_lock;
					variables.hpandmanaoverlay = message.data.hpandmanaoverlay;
					variables.creationmatrona = message.data.creationmatrona;
					variables.reddemonblood = message.data.reddemonblood;
					variables.humandemon = message.data.humandemon;
					variables.graydemonblood = message.data.graydemonblood;
					variables.Ryugekisho = message.data.Ryugekisho;
					variables.humandemonmark = message.data.humandemonmark;
					variables.graydemonform = message.data.graydemonform;
					variables.graydemon = message.data.graydemon;
					variables.arkelizebeth = message.data.arkelizebeth;
					variables.AbsoluteCanel = message.data.AbsoluteCanel;
					variables.berserkswitch = message.data.berserkswitch;
					variables.killroyale = message.data.killroyale;
					variables.redKill = message.data.redKill;
					variables.blueKill = message.data.blueKill;
					variables.InsectManipulation = message.data.InsectManipulation;
					variables.mana_regen = message.data.mana_regen;
					variables.charging = message.data.charging;
					variables.mana_timer = message.data.mana_timer;
					variables.Levitation = message.data.Levitation;
					variables.magicaleye = message.data.magicaleye;
					variables.WPressed = message.data.WPressed;
					variables.mana_amount = message.data.mana_amount;
					variables.playerBP = message.data.playerBP;
					variables.playerStr = message.data.playerStr;
					variables.PlayerDex = message.data.PlayerDex;
					variables.PlayerMaxMana = message.data.PlayerMaxMana;
					variables.Races = message.data.Races;
					variables.mana_drain = message.data.mana_drain;
					variables.attack_cd = message.data.attack_cd;
					variables.TPAmount = message.data.TPAmount;
					variables.TPSwitchAmount = message.data.TPSwitchAmount;
					variables.supmagic = message.data.supmagic;
					variables.Manipulate = message.data.Manipulate;
					variables.HalfAwaken = message.data.HalfAwaken;
					variables.Half = message.data.Half;
					variables.GravityTen = message.data.GravityTen;
					variables.HyperGravity = message.data.HyperGravity;
					variables.slot = message.data.slot;
					variables.AbilitySelect = message.data.AbilitySelect;
					variables.Move = message.data.Move;
					variables.SlotSwitch = message.data.SlotSwitch;
					variables.SlotLogic = message.data.SlotLogic;
					variables.setmoves = message.data.setmoves;
					variables.Agility = message.data.Agility;
					variables.Slot1 = message.data.Slot1;
					variables.Slot2 = message.data.Slot2;
					variables.Slot3 = message.data.Slot3;
					variables.reddemonmark = message.data.reddemonmark;
					variables.SpacePressed = message.data.SpacePressed;
					variables.learn_skill = message.data.learn_skill;
					variables.increaseSphere = message.data.increaseSphere;
					variables.increasessphere = message.data.increasessphere;
					variables.power_percentage = message.data.power_percentage;
					variables.damage_indicator = message.data.damage_indicator;
					variables.reddemonboost = message.data.reddemonboost;
					variables.side_quest = message.data.side_quest;
					variables.regen = message.data.regen;
					variables.Story = message.data.Story;
					variables.purgatoryFlame = message.data.purgatoryFlame;
					variables.JackCD = message.data.JackCD;
					variables.CDJack = message.data.CDJack;
					variables.LostVayne = message.data.LostVayne;
					variables.the_one = message.data.the_one;
					variables.theone = message.data.theone;
					variables.combostar = message.data.combostar;
					variables.combostarcounter = message.data.combostarcounter;
					variables.TheOneUltimate = message.data.TheOneUltimate;
					variables.TheOneUltimateNumber = message.data.TheOneUltimateNumber;
					variables.combostartick = message.data.combostartick;
					variables.capitalofthedeadX = message.data.capitalofthedeadX;
					variables.capitalofthedeadY = message.data.capitalofthedeadY;
					variables.capitalofthedeadZ = message.data.capitalofthedeadZ;
					variables.hit = message.data.hit;
					variables.TrickStarX = message.data.TrickStarX;
					variables.TrickStarY = message.data.TrickStarY;
					variables.TrickStarZ = message.data.TrickStarZ;
					variables.TrickStarVX = message.data.TrickStarVX;
					variables.TrickStarVY = message.data.TrickStarVY;
					variables.TrickStarVZ = message.data.TrickStarVZ;
					variables.fullsize = message.data.fullsize;
					variables.FullSize = message.data.FullSize;
					variables.CriticalOver = message.data.CriticalOver;
					variables.criticalover = message.data.criticalover;
					variables.Rhitta = message.data.Rhitta;
					variables.rhittatick = message.data.rhittatick;
					variables.TrickStarYaw = message.data.TrickStarYaw;
					variables.physical_full_counter = message.data.physical_full_counter;
					variables.FullPowerDemonMark = message.data.FullPowerDemonMark;
					variables.fullpowerDemonMark = message.data.fullpowerDemonMark;
					variables.nutritionalvalue = message.data.nutritionalvalue;
					variables.teleplortionX = message.data.teleplortionX;
					variables.teleplortionY = message.data.teleplortionY;
					variables.teleplortionZ = message.data.teleplortionZ;
					variables.MagicScroll = message.data.MagicScroll;
					variables.learn_skills = message.data.learn_skills;
					variables.learned_spells = message.data.learned_spells;
					variables.spells = message.data.spells;
					variables.yggdra_cloth = message.data.yggdra_cloth;
					variables.Yggdra_Cloth = message.data.Yggdra_Cloth;
					variables.True_Spirt_From = message.data.True_Spirt_From;
					variables.true_spirit_spear = message.data.true_spirit_spear;
					variables.mana_regen_effect = message.data.mana_regen_effect;
					variables.DiaLogID = message.data.DiaLogID;
					variables.HornOfCernunnosID = message.data.HornOfCernunnosID;
					variables.hard_protection = message.data.hard_protection;
					variables.Hard_Protection = message.data.Hard_Protection;
					variables.demon_blood = message.data.demon_blood;
					variables.demon_skill = message.data.demon_skill;
					variables.learn_demon_skills = message.data.learn_demon_skills;
					variables.aqua_dress = message.data.aqua_dress;
					variables.gravity_sound = message.data.gravity_sound;
					variables.Healing_Area = message.data.Healing_Area;
					variables.healing_area = message.data.healing_area;
					variables.healing_area_timer = message.data.healing_area_timer;
					variables.GoddessBless = message.data.GoddessBless;
					variables.goddessbless = message.data.goddessbless;
					variables.render = message.data.render;
					variables.food_tick = message.data.food_tick;
					variables.passive_regen = message.data.passive_regen;
					variables.chastifol_item = message.data.chastifol_item;
					variables.joinX = message.data.joinX;
					variables.joinY = message.data.joinY;
					variables.joinZ = message.data.joinZ;
					variables.Gloxinia = message.data.Gloxinia;
					variables.yggdrasil_armor = message.data.yggdrasil_armor;
					variables.yggdrasilarmor = message.data.yggdrasilarmor;
					variables.MagicDetection = message.data.MagicDetection;
					variables.fire_protection = message.data.fire_protection;
					variables.EmeraldOcto = message.data.EmeraldOcto;
					variables.Emerald_Octo = message.data.Emerald_Octo;
					variables.drole_eye = message.data.drole_eye;
					variables.Moon_Rose = message.data.Moon_Rose;
					variables.fox_hunt = message.data.fox_hunt;
					variables.JubakuEnsaX = message.data.JubakuEnsaX;
					variables.JubakuEnsaY = message.data.JubakuEnsaY;
					variables.JubakuEnsaZ = message.data.JubakuEnsaZ;
					variables.JubakuEnsaTick = message.data.JubakuEnsaTick;
					variables.JubakuEnsa = message.data.JubakuEnsa;
					variables.God = message.data.God;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
