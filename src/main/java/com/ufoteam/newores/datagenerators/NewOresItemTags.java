package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.GlobalUtils;
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
                .add(NewOresItems.PLATINUM_ORE_ITEM.get());
    }

    @Override
    public String getName() {
        return "NewOres Tags";
    }
}
