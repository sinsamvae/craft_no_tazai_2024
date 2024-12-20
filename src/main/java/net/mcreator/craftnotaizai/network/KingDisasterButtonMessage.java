
package net.mcreator.craftnotaizai.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.world.inventory.KingDisasterMenu;
import net.mcreator.craftnotaizai.procedures.ResetMoveSelectProcedure;
import net.mcreator.craftnotaizai.procedures.DisasterButton8Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterButton7Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterButton6Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterButton4Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterButton3Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterButton2Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterButton1Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterButtom5Procedure;
import net.mcreator.craftnotaizai.procedures.ChangeSlotProcedure;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KingDisasterButtonMessage {
	private final int buttonID, x, y, z;

	public KingDisasterButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public KingDisasterButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(KingDisasterButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(KingDisasterButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = KingDisasterMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			DisasterButton1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			DisasterButton2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			DisasterButton3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			DisasterButton4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			DisasterButtom5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			DisasterButton6Procedure.execute(entity);
		}
		if (buttonID == 6) {

			DisasterButton7Procedure.execute(entity);
		}
		if (buttonID == 7) {

			DisasterButton8Procedure.execute(entity);
		}
		if (buttonID == 8) {

			ChangeSlotProcedure.execute(entity);
		}
		if (buttonID == 9) {

			ResetMoveSelectProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(KingDisasterButtonMessage.class, KingDisasterButtonMessage::buffer, KingDisasterButtonMessage::new, KingDisasterButtonMessage::handler);
	}
}
