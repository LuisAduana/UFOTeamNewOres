package com.ufoteam.newores.registries;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class NewOresTiers {
    public static final ForgeTier PLATINUM_SWORD = new ForgeTier(2, 100, 6.0F, 3F, 14, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(NewOresItems.PLATINUM_INGOT.get()));
    public static final ForgeTier PLATINUM_TOOL = new ForgeTier(2, 350, 6.0F, 3F, 14, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(NewOresItems.PLATINUM_INGOT.get()));
    public static final ForgeTier PLATINUM_GENERIC = new ForgeTier(2, 280, 6.0F, 3F, 14, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(NewOresItems.PLATINUM_INGOT.get()));

}
