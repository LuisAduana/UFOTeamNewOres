package com.ufoteam.newores.registries;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class NewOresTiers {
    public static final ForgeTier PLATINUM_TIER = new ForgeTier(3, 300, 1f, 0, 0, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(NewOresItems.PLATINUM_INGOT.get()));
}
