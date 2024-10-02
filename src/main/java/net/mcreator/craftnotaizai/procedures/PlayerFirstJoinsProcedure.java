package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.world.inventory.DemonClanMenu;
import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.configuration.RandomRaceConfigConfiguration;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@Mod.EventBusSubscriber
public class PlayerFirstJoinsProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double RandomRace = 0;
		{
			double _setval = entity.getX();
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.joinX = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getY();
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.joinY = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getZ();
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.joinZ = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).PlayerFirstJoins == 0) {
			if (RandomRaceConfigConfiguration.RANDOM_RACE.get()) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("DemonClan");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new DemonClanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MagicScroll = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.power_percentage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SlotSwitch = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.learn_skills = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.damage_indicator = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = new ItemStack(CraftNoTaizaiModItems.DRAGON_HANDLE.get());
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelect = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = new ItemStack(CraftNoTaizaiModItems.DRAGON_HANDLE.get());
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.learn_skill = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Story0";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Story = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				RandomRace = Mth.nextInt(RandomSource.create(), 1, 4);
				if (RandomRace == 1) {
					{
						double _setval = 1;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Demon_Clan = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.demon = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.hpandmanaoverlay = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Races = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomRace == 2) {
					{
						double _setval = 1;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Human_Clan = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.human = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.hpandmanaoverlay = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Races = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomRace == 3) {
					{
						double _setval = 1;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Fairy_Clan = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Races = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.hpandmanaoverlay = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fairy = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomRace == 4) {
					{
						double _setval = 1;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GaintRace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.hpandmanaoverlay = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.gaint = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Races = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MagicScroll = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.power_percentage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SlotSwitch = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.learn_skills = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.damage_indicator = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = new ItemStack(CraftNoTaizaiModItems.DRAGON_HANDLE.get());
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelect = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = new ItemStack(CraftNoTaizaiModItems.DRAGON_HANDLE.get());
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.learn_skill = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Story0";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Story = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
