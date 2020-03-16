package eu.nogitsu.core.proxy;

import eu.nogitsu.core.ModClass;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer( Item item, int meta, String variant )
    {
        ModelLoader.setCustomModelResourceLocation( item, meta, new ModelResourceLocation( item.getRegistryName(), variant ) );
        ModClass.logger.info( "RegisteringNewModel['" + item.getRegistryName() + "#" + variant + "']" );
    }

    @Override
    public void registerItemRenderer( Item item )
    {
        ModelLoader.setCustomModelResourceLocation( item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory" ) );
        ModClass.logger.info( "RegisteringNewModel['" + item.getRegistryName() + "#inventory']" );
    }

    @Override
    public void render()
    {

    }
}