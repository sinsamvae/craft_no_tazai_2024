
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<CreativeModeTab> ARMOR = REGISTRY.register("armor",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.armor")).icon(() -> new ItemStack(CraftNoTaizaiModItems.GIL_THUNDER_ARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HELBRUM_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HELBRUM_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.SLADER_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.SLADER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.SLADER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_OUTFIT_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.KING_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.KING_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASOUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASOUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ARTHER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ARTHER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.DIANEOUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.DIANEOUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHOARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHOARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASDANAFORARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASDANAFORARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.KNIGHTARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.KNIGHTARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.KNIGHTARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ROYALKNIGHT_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.ROYALKNIGHT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ROYALKNIGHT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIAARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIAARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIAARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUSARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUSARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUSARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.TWIGO_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.TWIGO_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_2_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_2_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.CAIN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.CAIN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.FAIRY_HELBRAM_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.FAIRY_HELBRAM_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.BLUE_KNIGHT_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.BLUE_KNIGHT_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BLUE_KNIGHT_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HENDRICKSON_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HENDRICKSON_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.JILLIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.JILLIAN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.SIMON_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.SIMON_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.WEINHEIDT_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.WEINHEIDT_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.BOAR_HAT_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BOAR_HAT_OUTFIT_LEGGINGS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SACRED_TREASURE = REGISTRY.register("sacred_treasure",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.sacred_treasure")).icon(() -> new ItemStack(CraftNoTaizaiModItems.LOSTVAYNE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.RHITTA.get());
				tabData.accept(CraftNoTaizaiModItems.CHASTIEFOL_2.get());
				tabData.accept(CraftNoTaizaiModItems.GIDEON.get());
				tabData.accept(CraftNoTaizaiModItems.ALDAN.get());
				tabData.accept(CraftNoTaizaiModItems.LOSTVAYNE.get());
				tabData.accept(CraftNoTaizaiModItems.TWIN_BOW_HERRITT.get());
				tabData.accept(CraftNoTaizaiModItems.HEAT_FORK.get());
				tabData.accept(CraftNoTaizaiModItems.HOLY_STAFF_COURE_CHOUSE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ITEMS = REGISTRY.register("items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.items")).icon(() -> new ItemStack(CraftNoTaizaiModItems.COFFIN_OF_ETERNAL_DARKNESS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.HYPER_RECOVERY.get());
				tabData.accept(CraftNoTaizaiModItems.FOUNTAIN_OF_YOUTH.get());
				tabData.accept(CraftNoTaizaiModItems.PERFECT_CUBE_ORB.get());
				tabData.accept(CraftNoTaizaiModItems.EMPTY_NEEDLE.get());
				tabData.accept(CraftNoTaizaiModItems.GRAY_DEMON_BLOOD_NEEDLE.get());
				tabData.accept(CraftNoTaizaiModItems.NEEDLE.get());
				tabData.accept(CraftNoTaizaiModItems.MAGIC_SCROLL.get());
				tabData.accept(CraftNoTaizaiModItems.SWORD_WOLF_FANG.get());
				tabData.accept(CraftNoTaizaiModItems.COFFIN_OF_ETERNAL_DARKNESS.get());
				tabData.accept(CraftNoTaizaiModItems.FRAGMENT_OF_ETERNAL_DARKNESS.get());
				tabData.accept(CraftNoTaizaiModItems.FRAGMENT_OF_ETERNAL_DARKNESS_2.get());
				tabData.accept(CraftNoTaizaiModItems.FRAGMENT_OF_ETERNAL_DARKNESS_3.get());
				tabData.accept(CraftNoTaizaiModItems.PILLOW.get());
				tabData.accept(CraftNoTaizaiModItems.AGAVE.get());
				tabData.accept(CraftNoTaizaiModItems.CHICKEN_MATANGO_MUSH_ROOM.get());
				tabData.accept(CraftNoTaizaiModItems.GODDESS_AMBER.get());
				tabData.accept(CraftNoTaizaiModItems.GODDESS_AMBER_SHARD.get());
				tabData.accept(CraftNoTaizaiModItems.EMPTYORB.get());
				tabData.accept(CraftNoTaizaiModItems.BALORS_MAGICAL_EYE_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.HOLY_TREE_SHARD.get());
				tabData.accept(CraftNoTaizaiModItems.LUME_ORB.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WEAPONS = REGISTRY.register("weapons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.weapons")).icon(() -> new ItemStack(CraftNoTaizaiModItems.DRAGON_HANDLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.DRAGON_HANDLE.get());
				tabData.accept(CraftNoTaizaiModItems.LIZ_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.LIZ_SNEATH_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.BELL_STAFF.get());
				tabData.accept(CraftNoTaizaiModItems.WHIP.get());
				tabData.accept(CraftNoTaizaiModItems.BOW.get());
				tabData.accept(CraftNoTaizaiModItems.CURVED_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.HALBERT.get());
				tabData.accept(CraftNoTaizaiModItems.DEMON_KING_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.KATANA.get());
				tabData.accept(CraftNoTaizaiModItems.SCYTHE.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUS_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.TWIGOSWORD.get());
				tabData.accept(CraftNoTaizaiModItems.SPIRALEDLANCE.get());
				tabData.accept(CraftNoTaizaiModItems.RAPIER.get());
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.SAW_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.AXE_2.get());
				tabData.accept(CraftNoTaizaiModItems.SAW_BLADE.get());
				tabData.accept(CraftNoTaizaiModItems.LONG_AXE.get());
				tabData.accept(CraftNoTaizaiModItems.GUARD_SPEAR.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SDS_BLOCKS = REGISTRY.register("sds_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.sds_blocks")).icon(() -> new ItemStack(CraftNoTaizaiModBlocks.QUICK_SAND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModBlocks.GLOW_BLOCK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CAPITALOFTHE_DEAD_BLOCK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PURPLEFIRE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PERFECT_CUBE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BAR_DOOR.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.HAY_BALE_ROOF.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREA_GROUND.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREAWOOD.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREAFENCE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREA_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREA_WOOD_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.QUICK_SAND.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BRICK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALAVILLAGE_ROOF_1.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALAVILLAGE_STAIRES_1.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BRICK_STAIRS.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALAVILLAGE_WOOD_2.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALAVILLAGE_STARIES_2.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALAVILLAGE_WOOD_3.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALAVILLAGE_STAIRS_3.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALA_VILLAGE_FLOWER.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CAPITAL_OF_THE_DEAD_GROUND_BLOCK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CAPITAL_OF_THE_DEAD_GROUND.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SMALL_CRYSTAL.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SLEEPING_FOREST_WOOD.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SLEEPING_FOREST_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SLEEPING_FOREST_STAIR.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BLUE_BRICK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BLUE_BRICK_STAIR.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BLUE_BRICK_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BLUE_BRICK_WALL.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREES_LOG.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_KING_LOG.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_KING_LEAVE.get().asItem());
				tabData.accept(CraftNoTaizaiModItems.EMPTY_MUG.get());
				tabData.accept(CraftNoTaizaiModBlocks.BEER_MUG_BLOCK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_KING_LEAVES.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.GODDASS_ORE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_WOOD.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_FENCE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_STAIRES.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BASTE_DUNGEON_WALLS.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BASTE_DUNGEON_ROOF.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CHAOS_FLOOR.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CHAOS_WALL.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> FOODS = REGISTRY.register("foods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.foods")).icon(() -> new ItemStack(CraftNoTaizaiModItems.UNCOOKED_DUSK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.UNCOOKED_DUSK.get());
				tabData.accept(CraftNoTaizaiModItems.COOKED_DUSK_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.TENTACLES.get());
				tabData.accept(CraftNoTaizaiModItems.COOKEDTENTACLES.get());
				tabData.accept(CraftNoTaizaiModItems.APPLEPIE.get());
				tabData.accept(CraftNoTaizaiModItems.BAKE_APPLE_PIE.get());
				tabData.accept(CraftNoTaizaiModItems.TYRANT_DRAGON_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.EARTH_CRAWLER_TAIL.get());
				tabData.accept(CraftNoTaizaiModItems.ANGLE_CURE_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.COOKED_ANGLE_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.EARTH_CRAWLER_TAIL_COOKED.get());
				tabData.accept(CraftNoTaizaiModItems.TYRANT_DRAGON_COOKED_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.MINIMUM_TABLETS.get());
				tabData.accept(CraftNoTaizaiModItems.MUG_ALE.get());
				tabData.accept(CraftNoTaizaiModItems.GLOW_MUG.get());
				tabData.accept(CraftNoTaizaiModItems.BEER_MUG.get());
				tabData.accept(CraftNoTaizaiModItems.LOW_TIER_SOULS.get());
				tabData.accept(CraftNoTaizaiModItems.MID_TIER_SOULS.get());
				tabData.accept(CraftNoTaizaiModItems.HIGH_TIER_SOULS.get());
				tabData.accept(CraftNoTaizaiModItems.TROLL_EAR.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SPAWN_EGGS = REGISTRY.register("spawn_eggs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.spawn_eggs")).icon(() -> new ItemStack(CraftNoTaizaiModItems.TWIGO_ANIMATED_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.POLLEN_GARDEN_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SUNFLOWER_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MANTA_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.CHICKEN_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GECKOLIB_KRAKEN_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.RED_DEMON_GECKOLIB_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUARDIAN_1_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HAWKS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.BLACK_HOUND_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SWORD_WOLF_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DALE_ARMORED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DALE_SEC_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DALEFINAL_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ELAINE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.INSECT_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GRAY_DEMON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.EARTHSPIKE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HIDE_AND_SEEK_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.VINE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.WHALE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.INSECT_F_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.LUIGI_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TYRANT_DRAGON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MUTILATOR_RABBITS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ANGLE_CURE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DUSK_BISON_1_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_DEMON_FORM_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TROLL_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.KULUMIL_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.PUORA_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.EARTH_CRAWLER_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.CLAY_DRAGON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_DEMON_FORM_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_DEMON_FORM_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.EARTH_GOLEM_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUARDIAN_TRUE_SPIRT_SPEAR_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TWIGO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DIANE_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIA_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TAIZOO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GRIAMORE_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.CAIN_BARZAD_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.STORY_BAN_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_DEMONANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HELBREM_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_ANIMATED_2_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.FAIRY_HELBREM_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DEAD_HELBRAMANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ROYAL_GURARD_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ROYAL_GUARD_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HENDRICKSON_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.STORY_BAN_2_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DEMON_HENDRICKSON_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GRAY_DEMON_HENDRICKSON_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DUMBLEBBAS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.WEINHEIDT_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JILLIAN_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SIMON_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SLADER_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DIANE_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.KING_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODAS_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GERHEADE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DOGEDO_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_STORY_1_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ALBION_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ALBION_FAT_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TALL_ALBION_SPAWN_EGG.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CraftNoTaizaiModBlocks.EMPTY_MUG_BLOCK.get().asItem());
			tabData.accept(CraftNoTaizaiModBlocks.ALE_RED_MUG.get().asItem());
			tabData.accept(CraftNoTaizaiModBlocks.GLOW_MUG_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(CraftNoTaizaiModBlocks.KEG.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CraftNoTaizaiModItems.RISING_TORNADO_ENTITY_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.BLACK_SMITH_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.FIGHTING_AREA_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.PEFECT_CUBE_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.GRAY_DEMON_ENTITY_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.MURAMO_ANIMATED_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.BASQUIAS_GUARDIAN_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.GIGA_PICK_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.GIGA_FALL_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.GIGA_CRUSH_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.BLACK_OUT_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.SUN_FLOWER_TRUE_SPIRT_SPEAR_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.MOON_ROSE_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.HELL_GATE_RED_DEMONS_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.JUMANJU_ENTITY_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.HORN_OF_CERNUNOS_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CraftNoTaizaiModItems.JONAH_NO_JUNAN_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.WICKED_BITE_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.DEATH_THORN_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CraftNoTaizaiModItems.CARBON_STEEL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(CraftNoTaizaiModItems.DEMON_BLOOD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CraftNoTaizaiModBlocks.STAGE_ONE_AGAVE.get().asItem());
			tabData.accept(CraftNoTaizaiModItems.AGAVE_SEEDS.get());
			tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_SAPLINGS.get().asItem());
			tabData.accept(CraftNoTaizaiModBlocks.HOLY_TREE_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CraftNoTaizaiModItems.CHAOS_DIMENSION.get());
			tabData.accept(CraftNoTaizaiModItems.CURVED_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.HALBERT.get());
			tabData.accept(CraftNoTaizaiModItems.HENDRIKSON_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.DEMON_KING_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.DREYFUS_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.KATANA.get());
			tabData.accept(CraftNoTaizaiModItems.SCYTHE.get());
			tabData.accept(CraftNoTaizaiModItems.JERICHO_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.GOLGIUS_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.TWIGOSWORD.get());
			tabData.accept(CraftNoTaizaiModItems.SPIRALEDLANCE.get());
			tabData.accept(CraftNoTaizaiModItems.RAPIER.get());
			tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.HELBRUMSWORD.get());
			tabData.accept(CraftNoTaizaiModItems.SEQUENCE.get());
			tabData.accept(CraftNoTaizaiModItems.SAW_SWORD.get());
			tabData.accept(CraftNoTaizaiModItems.AXE_2.get());
			tabData.accept(CraftNoTaizaiModItems.SAW_BLADE.get());
			tabData.accept(CraftNoTaizaiModItems.LONG_AXE.get());
			tabData.accept(CraftNoTaizaiModItems.GUARD_SPEAR.get());
		}
	}
}
