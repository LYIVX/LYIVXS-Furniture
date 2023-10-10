
package net.mcreator.lsfurniture.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.lsfurniture.world.inventory.FurnitureDecorationsMenu;
import net.mcreator.lsfurniture.procedures.OpenWoodMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenTeddysMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenMetalMenuProcedure;
import net.mcreator.lsfurniture.procedures.OpenChiselMenuProcedure;
import net.mcreator.lsfurniture.procedures.GiveGuideBookProcedure;
import net.mcreator.lsfurniture.LsFurnitureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FurnitureDecorationsButtonMessage {
	private final int buttonID, x, y, z;

	public FurnitureDecorationsButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public FurnitureDecorationsButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(FurnitureDecorationsButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(FurnitureDecorationsButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = FurnitureDecorationsMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GiveGuideBookProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			OpenChiselMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenChiselMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenWoodMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenWoodMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenMetalMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenMetalMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OpenTeddysMenuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			OpenTeddysMenuProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		LsFurnitureMod.addNetworkMessage(FurnitureDecorationsButtonMessage.class, FurnitureDecorationsButtonMessage::buffer, FurnitureDecorationsButtonMessage::new, FurnitureDecorationsButtonMessage::handler);
	}
}
