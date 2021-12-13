package com.ufoteam.newores;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MainNewOres.MODID)
public class MainNewOres {

    public static final String MODID = "newores";
    private static final Logger LOGGER = LogManager.getLogger();

    public MainNewOres() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }

}
