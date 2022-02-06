package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.GlobalUtils;
import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NewOresItemModels extends ItemModelProvider {

    public NewOresItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GlobalUtils.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(NewOresItems.PLATINUM_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/platinum_ingot"));
        withExistingParent(NewOresItems.PLATINUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_ore"));
    }

}
