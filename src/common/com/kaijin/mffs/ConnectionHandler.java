package com.kaijin.mffs;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class ConnectionHandler implements IConnectionHandler
{
    @Override
    public void onConnect(NetworkManager network)
    {
        MessageManager.getInstance().registerChannel(network, new PacketHandler(), "KIJNMFFS");
    }

    @Override
    public void onLogin(NetworkManager network, Packet1Login login)
    {
        
    }

    @Override
    public void onDisconnect(NetworkManager network, String message,Object[] args)
    {
        
    }
}
