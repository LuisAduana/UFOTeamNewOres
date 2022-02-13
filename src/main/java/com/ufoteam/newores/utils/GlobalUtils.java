package com.ufoteam.newores.utils;

import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GlobalUtils {
    public static final String MODID = "newores";
    public static final CreativeModeTab NEWORES_TAB = new CreativeModeTab(GlobalUtils.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(NewOresItems.LOGO.get());
        }
    };

    public static ResourceLocation resloc(String param) {
        return new ResourceLocation(GlobalUtils.MODID, param);
    }
}
