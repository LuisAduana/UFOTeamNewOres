package com.ufoteam.newores.datagenerators;

import com.ufoteam.newores.registries.NewOresItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class NewOresRecipes extends RecipeProvider {

    private static final String HAS_PLATINUM_INGOT = "has_platinum_ingot";

    public NewOresRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_SWORD.get())
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" # ")
                .define('X', NewOresItems.PLATINUM_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy(HAS_PLATINUM_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', NewOresItems.PLATINUM_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy(HAS_PLATINUM_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', NewOresItems.PLATINUM_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy(HAS_PLATINUM_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', NewOresItems.PLATINUM_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy(HAS_PLATINUM_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', NewOresItems.PLATINUM_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy(HAS_PLATINUM_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(NewOresItems.PLATINUM_NUGGET.get(), 9)
                .requires(NewOresItems.PLATINUM_INGOT.get())
                .unlockedBy(HAS_PLATINUM_INGOT, InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_INGOT.get()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(NewOresItems.PLATINUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', NewOresItems.PLATINUM_NUGGET.get())
                .unlockedBy("has_platinum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(NewOresItems.PLATINUM_NUGGET.get()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NewOresItems.PLATINUM_ORE_ITEM.get()),
                NewOresItems.PLATINUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(NewOresItems.PLATINUM_ORE_ITEM.get()))
                .save(pFinishedRecipeConsumer, "platinum_ingot_from_platinum_ore");
    }



}
