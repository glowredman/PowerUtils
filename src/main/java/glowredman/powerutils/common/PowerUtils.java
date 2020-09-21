package glowredman.powerutils.common;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(acceptedMinecraftVersions = "1.12.2", dependencies = "required-after:ic2; required-after:redstoneflux;", modid = PowerUtils.MODID, name = PowerUtils.MODNAME, version = PowerUtils.MODVERSION)
public class PowerUtils {
	
	public static final String MODID = "powerutils";
	public static final String MODNAME = "Power Utils";
	public static final String MODVERSION = "1.0";
	public static final Side SIDE = FMLCommonHandler.instance().getEffectiveSide();
	
	@SidedProxy(clientSide = "glowredman.powerutils.client.ClientProxy", serverSide = "glowredman.powerutils.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static PowerUtils instance = new PowerUtils();
	
	public static Logger logger;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
	}
