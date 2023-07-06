package cyanandjade.cyanite.data;

import cyanandjade.cyanite.blocks.ModBlocks;
import cyanandjade.cyanite.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHEESE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_CHEESE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHEESE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHEESE_PRESS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PETRIFIED_CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTEN_CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE , Models.GENERATED);
    }
}
