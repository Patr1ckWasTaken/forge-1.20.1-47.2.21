package net.patrick.bestmod.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.patrick.bestmod.BestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, BestMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = Items.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
