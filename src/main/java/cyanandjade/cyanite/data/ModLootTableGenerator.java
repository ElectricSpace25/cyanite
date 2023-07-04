package cyanandjade.cyanite.data;

import cyanandjade.cyanite.blocks.ModBlocks;
import cyanandjade.cyanite.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHEESE_ORE, oreDrops(ModBlocks.CHEESE_ORE, ModItems.PETRIFIED_CHEESE));
        addDrop(ModBlocks.DEEPSLATE_CHEESE_ORE, oreDrops(ModBlocks.DEEPSLATE_CHEESE_ORE, ModItems.PETRIFIED_CHEESE));

        //Note: Cheese block loot table is manual
    }
}
