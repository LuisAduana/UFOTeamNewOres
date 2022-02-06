package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.GlobalUtils;
import com.ufoteam.newores.registries.NewOresBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NewOresBlockStates extends BlockStateProvider {

    public NewOresBlockStates(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, GlobalUtils.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(NewOresBlocks.PLATINUM_ORE.get());
    }

}
