package com.ufoteam.newores.registries;

import com.ufoteam.newores.utils.GlobalUtils;
import com.ufoteam.newores.utils.NewOresNames;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NewOresItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlobalUtils.MODID);

    public static final RegistryObject<Item> LOGO = ITEMS.register("logo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_ORE_ITEM = ITEMS.register(NewOresNames.platinum_ore.toString(),
            () -> new BlockItem(NewOresBlocks.PLATINUM_ORE.get(), new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register(NewOresNames.platinum_ingot.toString(),
            () -> new Item(new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register(NewOresNames.platinum_nugget.toString(),
            () -> new Item(new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register(NewOresNames.platinum_sword.toString(),
            () -> new SwordItem(NewOresTiers.PLATINUM_SWORD, 3, -2.4F, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register(NewOresNames.platinum_pickaxe.toString(),
            () -> new PickaxeItem(NewOresTiers.PLATINUM_TOOL, 1, -2.8F, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register(NewOresNames.platinum_axe.toString(),
            () -> new AxeItem(NewOresTiers.PLATINUM_TOOL, 6, -3.1F, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register(NewOresNames.platinum_shovel.toString(),
            () -> new ShovelItem(NewOresTiers.PLATINUM_GENERIC, 1, -3.0F, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register(NewOresNames.platinum_hoe.toString(),
            () -> new HoeItem(NewOresTiers.PLATINUM_GENERIC, -3, 0, new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));


    public static final RegistryObject<Item> MYTHRIL_ORE_ITEM = ITEMS.register(NewOresNames.mythril_ore.toString(),
            () -> new BlockItem(NewOresBlocks.MYTHRIL_ORE.get(), new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register(NewOresNames.mythril_ingot.toString(),
            () -> new Item(new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
