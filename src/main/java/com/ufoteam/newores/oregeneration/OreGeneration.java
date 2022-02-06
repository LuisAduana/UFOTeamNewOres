package com.ufoteam.newores.oregeneration;

import com.ufoteam.newores.registries.NewOresBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OreGeneration {

    public static final List<OreConfiguration.TargetBlockState> ORE_PLATINIUM_TARGET_LIST = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, NewOresBlocks.PLATINIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, NewOresBlocks.PLATINIUM_ORE.get().defaultBlockState())
    );

    public static final ConfiguredFeature<?, ?> ORE_PLATINIUM = FeatureUtils.register(
            "ore_platinium", Feature.ORE.configured(new OreConfiguration(ORE_PLATINIUM_TARGET_LIST, 13)));

    public static final PlacedFeature ORE_PLATINIUM_PLACEMENT = PlacementUtils.register(
            "ore_platinium_placement", ORE_PLATINIUM.placed(
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80)))));

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

}
