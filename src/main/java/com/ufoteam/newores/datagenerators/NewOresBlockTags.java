package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.utils.GlobalUtils;
import com.ufoteam.newores.registries.NewOresBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NewOresBlockTags extends BlockTagsProvider {

    public NewOresBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, GlobalUtils.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(NewOresBlocks.PLATINUM_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(NewOresBlocks.PLATINUM_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(NewOresBlocks.PLATINUM_ORE.get());
    }

}
