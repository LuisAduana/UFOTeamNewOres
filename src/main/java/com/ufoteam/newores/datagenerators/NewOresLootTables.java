package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.registries.NewOresBlocks;
import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.data.DataGenerator;

public class NewOresLootTables extends BaseLootTableProvider {

    public NewOresLootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        lootTables.put(NewOresBlocks.PLATINUM_ORE.get(), createSimpleLootBlock(NewOresBlocks.PLATINUM_ORE.get(), NewOresItems.PLATINUM_ORE_ITEM.get()));
        lootTables.put(NewOresBlocks.MYTHRIL_ORE.get(), createSimpleLootBlock(NewOresBlocks.MYTHRIL_ORE.get(), NewOresItems.MYTHRIL_ORE_ITEM.get()));
    }
}
