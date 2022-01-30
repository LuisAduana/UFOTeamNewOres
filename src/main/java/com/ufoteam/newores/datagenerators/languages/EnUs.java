package com.ufoteam.newores.datagenerators.languages;

import com.ufoteam.newores.GlobalUtils;
import com.ufoteam.newores.registries.NewOresBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import org.openjdk.nashorn.internal.objects.Global;

public class EnUs extends LanguageProvider {

    public EnUs(DataGenerator generator) {
        super(generator, GlobalUtils.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + GlobalUtils.MODID, "NewOres Mod");
        add(NewOresBlocks.PLATINIUM_ORE.get(), "Platinium Ore");
    }
}
