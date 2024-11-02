
package net.mcreator.craftnotaizai.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.world.inventory.MagicMenuMenu;
import net.mcreator.craftnotaizai.procedures.StoryProcedure;
import net.mcreator.craftnotaizai.procedures.SlotSwitchProcedure;
import net.mcreator.craftnotaizai.procedures.ResetMoveSelectProcedure;
import net.mcreator.craftnotaizai.procedures.OpenStatsOnKeyPressedProcedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilityslotProcedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot8Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot7Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot6Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot5Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot4Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot3Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot2Procedure;
import net.mcreator.craftnotaizai.procedures.LearnedSkillsProcedure;
import net.mcreator.craftnotaizai.procedures.LearnedDemonSkillsProcedure;
import net.mcreator.craftnotaizai.procedures.DemonKingPageProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeSlotProcedure;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicMenuButtonMessage {
	private final int buttonID, x, y, z;

	public MagicMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MagicMenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MagicMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MagicMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = MagicMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			LearnedDemonSkillsProcedure.execute(entity);
		}
		if (buttonID == 1) {

			LearnedSkillsProcedure.execute(entity);
		}
		if (buttonID == 2) {

			MagicAbilityslotProcedure.execute(entity);
		}
		if (buttonID == 3) {

			MagicAbilitySlot2Procedure.execute(entity);
		}
		if (buttonID == 4) {

			MagicAbilitySlot3Procedure.execute(entity);
		}
		if (buttonID == 5) {

			MagicAbilitySlot4Procedure.execute(entity);
		}
		if (buttonID == 6) {

			MagicAbilitySlot5Procedure.execute(entity);
		}
		if (buttonID == 7) {

			MagicAbilitySlot6Procedure.execute(entity);
		}
		if (buttonID == 8) {

			MagicAbilitySlot7Procedure.execute(entity);
		}
		if (buttonID == 9) {

			MagicAbilitySlot8Procedure.execute(entity);
		}
		if (buttonID == 10) {

			SlotSwitchProcedure.execute(entity);
		}
		if (buttonID == 11) {

			ChangeSlotProcedure.execute(entity);
		}
		if (buttonID == 12) {

			StoryProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			OpenStatsOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 14) {

			ResetMoveSelectProcedure.execute(entity);
		}
		if (buttonID == 15) {

			DemonKingPageProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(MagicMenuButtonMessage.class, MagicMenuButtonMessage::buffer, MagicMenuButtonMessage::new, MagicMenuButtonMessage::handler);
	}
}
