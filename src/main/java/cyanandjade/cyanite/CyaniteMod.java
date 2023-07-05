package cyanandjade.cyanite;

import cyanandjade.cyanite.blocks.ModBlocks;
import cyanandjade.cyanite.items.ModItemGroup;
import cyanandjade.cyanite.items.ModItems;
import cyanandjade.cyanite.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CyaniteMod implements ModInitializer {
	public static final String MOD_ID = "cyanite";
	public static final Logger LOGGER = LoggerFactory.getLogger("Cyanite");

	@Override
	public void onInitialize() {
		LOGGER.info("Cyanite loading!");
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

	}
}