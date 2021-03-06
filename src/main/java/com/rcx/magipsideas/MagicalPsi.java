package com.rcx.magipsideas;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.rcx.magipsideas.MagicalPsi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rcx.magipsideas.proxy.CommonProxy;

@Mod(modid = MagicalPsi.MOD_ID, name = MagicalPsi.MOD_NAME, version = MagicalPsi.VERSION, dependencies = MagicalPsi.DEPENDENCIES)
public class MagicalPsi {

	public static final String MOD_ID = "magipsideas";
	public static final String MOD_NAME = "Magical Psideas model replacer";
	public static final String VERSION = "1.0";
	public static final String DEPENDENCIES = "required-after:psi";

	public static final String COMMON_PROXY = "com.rcx.magipsideas.proxy.CommonProxy";
	public static final String CLIENT_PROXY = "com.rcx.magipsideas.proxy.ClientProxy";
	
	public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
	
	@SidedProxy(serverSide = COMMON_PROXY, clientSide = CLIENT_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.replacePsiAssets();
	}
}

