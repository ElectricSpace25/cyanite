package cyanandjade.cyanite.blocks;

import cyanandjade.cyanite.CyaniteMod;
import cyanandjade.cyanite.items.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block CHEESE_ORE = registerBlock("cheese_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create()
                    .strength(3.0f, 3.0f)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM),
                    UniformIntProvider.create(0, 2)),
                    ModItemGroup.CYANITE_GROUP);

    public static final Block DEEPSLATE_CHEESE_ORE = registerBlock("deepslate_cheese_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create()
                    .strength(4.5f, 3.0f)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM),
                    UniformIntProvider.create(0, 2)),
                    ModItemGroup.CYANITE_GROUP);

    public static final Block CHEESE_BLOCK = registerBlock("cheese_block",
            new Block(FabricBlockSettings.create()
                    .strength(1.0f)
                    .mapColor(MapColor.YELLOW)
                    .sounds(BlockSoundGroup.NETHER_STEM)),
                    ModItemGroup.CYANITE_GROUP);

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(CyaniteMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(CyaniteMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        CyaniteMod.LOGGER.info("Registering ModBlocks for Cyanite");
    }
}
