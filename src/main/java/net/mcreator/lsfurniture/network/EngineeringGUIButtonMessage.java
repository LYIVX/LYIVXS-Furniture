
package net.mcreator.lsfurniture.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.lsfurniture.world.inventory.EngineeringGUIMenu;
import net.mcreator.lsfurniture.procedures.OpenWeaveryGUIProcedure;
import net.mcreator.lsfurniture.procedures.OpenMetalurgyGUIProcedure;
import net.mcreator.lsfurniture.procedures.OpenMasonryGUIProcedure;
import net.mcreator.lsfurniture.procedures.OpenGlassblowerGUIProcedure;
import net.mcreator.lsfurniture.procedures.OpenEngineeringGUIProcedure;
import net.mcreator.lsfurniture.procedures.OpenCarpentryGUIProcedure;
import net.mcreator.lsfurniture.LsFurnitureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EngineeringGUIButtonMessage {
	private final int buttonID, x, y, z;

	public EngineeringGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public EngineeringGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(EngineeringGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(EngineeringGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		Level world = entity.level;
		HashMap guistate = EngineeringGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenCarpentryGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenMetalurgyGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenWeaveryGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenMasonryGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenCarpentryGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenMasonryGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenMetalurgyGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OpenWeaveryGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			OpenEngineeringGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			OpenGlassblowerGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			OpenGlassblowerGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			OpenEngineeringGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		LsFurnitureMod.addNetworkMessage(EngineeringGUIButtonMessage.class, EngineeringGUIButtonMessage::buffer, EngineeringGUIButtonMessage::new, EngineeringGUIButtonMessage::handler);
	}
}
