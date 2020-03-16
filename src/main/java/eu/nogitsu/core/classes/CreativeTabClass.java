package eu.nogitsu.core.classes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabClass extends CreativeTabs {
    private ItemStack item;

    public CreativeTabClass( String label, Item item ) {
        super( label );

        this.item = new ItemStack( item );
    }

    @Override
    public ItemStack getTabIconItem() {
        return this.item;
    }
}
