package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.utils.GlobalUtils;
import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NewOresItemTags extends ItemTagsProvider {

    public NewOresItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, GlobalUtils.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(NewOresItems.PLATINUM_ORE_ITEM.get())
                .add(NewOresItems.MYTHRIL_ORE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(NewOresItems.PLATINUM_INGOT.get())
                .add(NewOresItems.MYTHRIL_INGOT.get());

    }

}
