package com.ufoteam.newores.registries;

import com.ufoteam.newores.GlobalUtils;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NewOresItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlobalUtils.MODID);

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore",
            () -> new BlockItem(NewOresBlocks.PLATINUM_ORE.get(), new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(NewOresTiers.PLATINUM_ALL_TIER, 7, 3f, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(NewOresTiers.PLATINUM_ALL_TIER, 1, 0, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(NewOresTiers.PLATINUM_ALL_TIER, 5.5f, 0, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(NewOresTiers.PLATINUM_ALL_TIER, 1, 0, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(NewOresTiers.PLATINUM_ALL_TIER, 1, 0, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
