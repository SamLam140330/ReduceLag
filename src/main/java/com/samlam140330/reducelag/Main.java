package com.samlam140330.reducelag;

import com.samlam140330.reducelag.proxy.CommonProxy;
import com.samlam140330.reducelag.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLTENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
	{
		
    }
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
    
	@EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		
	}
}