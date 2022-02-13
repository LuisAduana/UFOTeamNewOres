package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.utils.GlobalUtils;
import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class NewOresItemModels extends ItemModelProvider {

    private static final String LAYER0 = "layer0";

    public NewOresItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GlobalUtils.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(getItemPath(NewOresItems.LOGO), getGenerated(), LAYER0, getItemLocation(NewOresItems.LOGO));

        singleTexture(getItemPath(NewOresItems.PLATINUM_INGOT), getGenerated(), LAYER0, getItemLocation(NewOresItems.PLATINUM_INGOT));
        singleTexture(getItemPath(NewOresItems.PLATINUM_SWORD), getHandheld(), LAYER0, getItemLocation(NewOresItems.PLATINUM_SWORD));
        singleTexture(getItemPath(NewOresItems.PLATINUM_PICKAXE), getHandheld(), LAYER0, getItemLocation(NewOresItems.PLATINUM_PICKAXE));
        singleTexture(getItemPath(NewOresItems.PLATINUM_AXE), getHandheld(), LAYER0, getItemLocation(NewOresItems.PLATINUM_AXE));
        singleTexture(getItemPath(NewOresItems.PLATINUM_SHOVEL), getHandheld(), LAYER0, getItemLocation(NewOresItems.PLATINUM_SHOVEL));
        singleTexture(getItemPath(NewOresItems.PLATINUM_HOE), getHandheld(), LAYER0, getItemLocation(NewOresItems.PLATINUM_HOE));

        withExistingParent(getItemPath(NewOresItems.PLATINUM_ORE_ITEM), getBlockLocation(NewOresItems.PLATINUM_ORE_ITEM));
    }

    private ResourceLocation getItemLocation(RegistryObject<Item> item) {
        return modLoc("item/" + getItemPath(item));
    }

    private ResourceLocation getBlockLocation(RegistryObject<Item> item) {
        return modLoc("block/" + getItemPath(item));
    }

    private String getItemPath(RegistryObject<Item> item) {
        return item.get().getRegistryName().getPath();
    }

    private ResourceLocation getGenerated() {
        return mcLoc("item/generated");
    }

    private ResourceLocation getHandheld() {
        return mcLoc("item/handheld");
    }

}
