package com.ufoteam.newores.registries;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class NewOresTiers {

    public static final ForgeTier PLATINUM_SWORD_TIER = new ForgeTier(3, 250, 1f, 0, 0, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(NewOresItems.PLATINUM_INGOT.get()));
    public static final ForgeTier PLATINUM_AXE_TIER = new ForgeTier(3, 250, 1f, 0, 0, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(NewOresItems.PLATINUM_INGOT.get()));
    public static final ForgeTier PLATINUM_ALL_TIER = new ForgeTier(3, 250, 1f, 0, 0, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(NewOresItems.PLATINUM_INGOT.get()));
}
