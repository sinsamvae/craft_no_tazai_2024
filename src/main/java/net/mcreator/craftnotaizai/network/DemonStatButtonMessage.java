
package net.mcreator.craftnotaizai.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.world.inventory.DemonStatMenu;
import net.mcreator.craftnotaizai.procedures.TpmanaProcedure;
import net.mcreator.craftnotaizai.procedures.TpSwitchAmountProcedure;
import net.mcreator.craftnotaizai.procedures.TPStrProcedure;
import net.mcreator.craftnotaizai.procedures.TPHpProcedure;
import net.mcreator.craftnotaizai.procedures.TPAgilityProcedure;
import net.mcreator.craftnotaizai.procedures.StoryProcedure;
import net.mcreator.craftnotaizai.procedures.OpenMagicMenuProcedure;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DemonStatButtonMessage {
	private final int buttonID, x, y, z;

	public DemonStatButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DemonStatButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DemonStatButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DemonStatButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = DemonStatMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TPStrProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TPHpProcedure.execute(entity);
		}
		if (buttonID == 2) {

			TpmanaProcedure.execute(entity);
		}
		if (buttonID == 3) {

			TpSwitchAmountProcedure.execute(entity);
		}
		if (buttonID == 4) {

			TPAgilityProcedure.execute(entity);
		}
		if (buttonID == 5) {

			OpenMagicMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			StoryProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(DemonStatButtonMessage.class, DemonStatButtonMessage::buffer, DemonStatButtonMessage::new, DemonStatButtonMessage::handler);
	}
}
