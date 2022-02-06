package com.ufoteam.newores.oregeneration;

import com.ufoteam.newores.GlobalUtils;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GlobalUtils.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreEvents {

    @SubscribeEvent
    public static void biomeLoading(BiomeLoadingEvent event) {
        switch (event.getCategory()) {
            case NETHER, THEEND -> {}
            default -> {
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OreGeneration.ORE_PLATINUM_PLACEMENT);
            }
        }
    }

}
