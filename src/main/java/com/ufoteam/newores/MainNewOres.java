package com.ufoteam.newores;

import com.ufoteam.newores.registries.NewOresBlocks;
import com.ufoteam.newores.registries.NewOresItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GlobalUtils.MODID)
public class MainNewOres {

    private static final Logger LOGGER = LogManager.getLogger();

    public MainNewOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        NewOresBlocks.BLOCKS.register(eventBus);
        NewOresItems.ITEMS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
