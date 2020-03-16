package eu.nogitsu.core.classes;

import eu.nogitsu.core.ModClass;
import eu.nogitsu.core.init.BlocksInit;
import eu.nogitsu.core.init.ItemsInit;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockClass extends Block {
    public BlockClass( String block_id ) {
        super( Material.ROCK );

        setUnlocalizedName( block_id );
        setRegistryName( block_id );

        setCreativeTab( CreativeTabs.BUILDING_BLOCKS );
        setSoundType( SoundType.STONE );

        ModClass.logger.info( "Creating Block['" + block_id + "']" );

        BlocksInit.Registered.add( this );
        ItemsInit.Registered.add( new ItemBlock( this ).setRegistryName( this.getRegistryName() ) );
    }
}
