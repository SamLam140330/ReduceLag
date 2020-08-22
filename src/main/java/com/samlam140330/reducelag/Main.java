package com.samlam140330.reducelag;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.samlam140330.reducelag.commands.KillEntities;
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
	public static final Logger logger = LogManager.getLogger(Reference.NAME);
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLTENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
	{
		logger.info("Start Loading FMLPreInitializationEvent");
		logger.info("Finish Loading FMLPreInitializationEvent");
    }
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		logger.info("Start Loading FMLInitializationEvent");
		logger.info("Finish Loading FMLInitializationEvent");
    }
    
	@EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		logger.info("Start Loading FMLPostInitializationEvent");
		logger.info("Finish Loading FMLPostInitializationEvent");
    }

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new KillEntities());
	}
}