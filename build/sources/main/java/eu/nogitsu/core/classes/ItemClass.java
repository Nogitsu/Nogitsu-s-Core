package eu.nogitsu.core.classes;

import eu.nogitsu.core.ModClass;
import eu.nogitsu.core.init.ItemsInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemClass extends Item {
    public ItemClass( String item_id ) {
        setCreativeTab( CreativeTabs.MISC );

        setUnlocalizedName( item_id );
        setRegistryName( item_id );

        ModClass.logger.info( "Creating Item['" + item_id + "']" );

        ItemsInit.Registered.add( this );
    }
}
