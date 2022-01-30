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
        withExistingParent(NewOresItems.PLATINIUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/platinium_ore"));
    }

}
