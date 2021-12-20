package com.ufoteam.newores.registries;

import com.ufoteam.newores.GlobalUtils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NewOresItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlobalUtils.MODID);

    /**
     * Item ores
     */
    public static final RegistryObject<Item> PLATINIUM_ORE_ITEM = ITEMS.register("platinium_ore", () -> new BlockItem(NewOresBlocks.PLATINIUM_ORE.get(), new Item.Properties().tab(GlobalUtils.NEWORES_TAB)));
}
