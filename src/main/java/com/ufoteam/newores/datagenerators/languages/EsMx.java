package com.ufoteam.newores.datagenerators.languages;

import com.ufoteam.newores.GlobalUtils;
import com.ufoteam.newores.registries.NewOresBlocks;
import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EsMx  extends LanguageProvider {

    public EsMx(DataGenerator generator) {
        super(generator, GlobalUtils.MODID, "es_mx");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + GlobalUtils.MODID, "NewOres Mod");
        add(NewOresItems.PLATINUM_INGOT.get(), "Lingote de Platino");
        add(NewOresBlocks.PLATINUM_ORE.get(), "Mineral de Platino");
    }
}
