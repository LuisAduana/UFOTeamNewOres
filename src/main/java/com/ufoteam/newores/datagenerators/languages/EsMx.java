package com.ufoteam.newores.datagenerators.languages;

import com.ufoteam.newores.utils.GlobalUtils;
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
        add(NewOresItems.PLATINUM_NUGGET.get(), "Pepita de Platino");
        add(NewOresBlocks.PLATINUM_ORE.get(), "Mineral de Platino");
        add(NewOresItems.PLATINUM_SWORD.get(), "Espada de Platino");
        add(NewOresItems.PLATINUM_PICKAXE.get(), "Pico de Platino");
        add(NewOresItems.PLATINUM_AXE.get(), "Hacha de Platino");
        add(NewOresItems.PLATINUM_SHOVEL.get(), "Pala de Platino");
        add(NewOresItems.PLATINUM_HOE.get(), "Hazada de Platino");

        add(NewOresItems.MYTHRIL_ORE_ITEM.get(), "Mineral de Mythril");
        add(NewOresItems.MYTHRIL_INGOT.get(), "Lingote de Mythril");
    }
}
