package net.thefallequinox.swordartistry.items;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thefallequinox.swordartistry.SwordArtistry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SwordArtistry.MOD_ID);

    // Skill Scrolls
    public static final RegistryObject<Item> BACKSLICE = ITEMS.register("backslice",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.ARTISTRY_GROUP)));

    public static final RegistryObject<Item> ENDBLOW = ITEMS.register("endblow",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.ARTISTRY_GROUP)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
