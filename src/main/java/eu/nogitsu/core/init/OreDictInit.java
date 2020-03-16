package eu.nogitsu.core.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictInit {
    public static void registerOres() {
        for(int data_id = 0; data_id < 16; data_id++) {
            OreDictionary.registerOre("carpet", new ItemStack(Blocks.CARPET, 1, data_id ) );
        }
    }
}
