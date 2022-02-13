package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class NewOresRecipes extends RecipeProvider {

    public NewOresRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_SWORD.get())
                .pattern(" x ").pattern(" x ").pattern(" y ")
                .define('x', NewOresItems.PLATINUM_INGOT.get())
                .define('y', Items.STICK)
                .unlockedBy("has_platinum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_PICKAXE.get())
                .pattern("xxx").pattern(" y ").pattern(" y ")
                .define('x', NewOresItems.PLATINUM_INGOT.get())
                .define('y', Items.STICK)
                .unlockedBy("has_platinum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NewOresItems.PLATINUM_ORE_ITEM.get()),
                NewOresItems.PLATINUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(NewOresItems.PLATINUM_ORE_ITEM.get()))
                .save(pFinishedRecipeConsumer, "platinum_ingot_from_platinum_ore");
    }

}
