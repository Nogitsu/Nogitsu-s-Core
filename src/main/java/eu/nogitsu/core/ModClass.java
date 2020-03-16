package eu.nogitsu.core;

import eu.nogitsu.core.init.OreDictInit;
import eu.nogitsu.core.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = ModClass.MODID,
        useMetadata = true
)

public class ModClass
{
    public static final String MODID = "nogitsu's_core";

    public static Logger logger;

    @SidedProxy(
            clientSide = "eu.nogitsu.core.proxy.ClientProxy",
            serverSide = "eu.nogitsu.core.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit( FMLPreInitializationEvent event )
    {
        logger = event.getModLog();
        logger.info( "PreInit" );
    }

    @EventHandler
    public void init( FMLInitializationEvent event )
    {
        logger.info( "Init" );

        OreDictInit.registerOres();
        proxy.render();
    }

    @EventHandler
    public void postInit( FMLPostInitializationEvent event ) {
        logger.info( "PostInit" );
    }
}
