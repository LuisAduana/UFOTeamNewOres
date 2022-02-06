package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.GlobalUtils;
import com.ufoteam.newores.datagenerators.languages.EnUs;
import com.ufoteam.newores.datagenerators.languages.EsMx;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = GlobalUtils.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {

            NewOresBlockTags blockTags = new NewOresBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new NewOresItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new NewOresBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new NewOresItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new EnUs(generator));
            generator.addProvider(new EsMx(generator));
        }
    }

}
