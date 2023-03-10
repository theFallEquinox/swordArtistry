package net.thefallequinox.swordartistry.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup ARTISTRY_GROUP = new ItemGroup("swordArtistryTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.BACKSLICE.get());
        }
    };

}
