package com.ufoteam.newores;

import com.ufoteam.newores.registries.NewOresBlocks;
import com.ufoteam.newores.registries.NewOresItems;
import com.ufoteam.newores.utils.GlobalUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GlobalUtils.MODID)
public class MainNewOres {

    private static final Logger LOGGER = LogManager.getLogger();

    public MainNewOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);

        NewOresBlocks.BLOCKS.register(eventBus);
        NewOresItems.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

}
