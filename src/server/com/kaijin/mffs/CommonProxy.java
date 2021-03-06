package com.kaijin.mffs;

import java.io.File;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import com.kaijin.mffs.*;

public class CommonProxy
{
    public static void load()
    {

    }

    public static Configuration getConfiguration()
    {
        return new Configuration(new File("config/ModularForceFieldSystem.cfg"));
    }

    public static World PacketHandlerGetWorld(NetworkManager network)
    {
        //server side needs to grab the world entity
        return ((NetServerHandler)network.getNetHandler()).getPlayerEntity().worldObj;
    }
    
    public static boolean isClient(World world)
    {
        return false;
    }

    public static boolean isServer()
    {
        return true;
    }

    public static void sendPacketToPlayer(String playerName, Packet250CustomPayload packet)
    {
        ModLoader.getMinecraftServerInstance().configManager.sendPacketToPlayer(playerName, packet);
    }

    public static void sendPacketToServer(Packet250CustomPayload packet)
    {
        // ModLoader.sendPacket(packet);
    }
}
