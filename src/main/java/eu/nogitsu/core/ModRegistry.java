package eu.nogitsu.core;

import eu.nogitsu.core.classes.BlockClass;
import eu.nogitsu.core.init.BlocksInit;
import eu.nogitsu.core.init.ItemsInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ModRegistry {
    @SubscribeEvent
    public static void onItemRegister( Register< Item > event ) {
        ModClass.logger.info( "Registering items (" + ItemsInit.Registered.size() + " to register)" );
        event.getRegistry().registerAll( ItemsInit.Registered.toArray( new Item[0] ) );
    }

    @SubscribeEvent
    public static void onBlockRegister( Register< Block > event ) {
        ModClass.logger.info( "Registering blocks (" + BlocksInit.Registered.size() + " to register)" );
        event.getRegistry().registerAll( BlocksInit.Registered.toArray( new BlockClass[0] ) );
    }

    @SubscribeEvent
    public static void onModelRegister( ModelRegistryEvent event ) {
        for ( Item item : ItemsInit.Registered ) {
           ModClass.proxy.registerItemRenderer( item );
        }

        for ( Block block : BlocksInit.Registered ) {
            ModClass.proxy.registerItemRenderer( Item.getItemFromBlock( block ) );
        }
    }
}
