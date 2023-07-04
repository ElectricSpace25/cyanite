package cyanandjade.cyanite.data;

import cyanandjade.cyanite.blocks.ModBlocks;
import cyanandjade.cyanite.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.PETRIFIED_CHEESE, ModBlocks.CHEESE_ORE), RecipeCategory.FOOD, ModItems.MOLTEN_CHEESE, 0.35f, 200, "molten_cheese");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CHEESE, RecipeCategory.FOOD, ModBlocks.CHEESE_BLOCK);
    }
}
