package cyanandjade.cyanite.blocks.entity;

import cyanandjade.cyanite.CyaniteMod;
import cyanandjade.cyanite.blocks.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<CheesePressBlockEntity> CHEESE_PRESS;

    public static void registerBlockEntities() {
        CHEESE_PRESS = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(CyaniteMod.MOD_ID, "cheese_press"),
                FabricBlockEntityTypeBuilder.create(CheesePressBlockEntity::new,
                        ModBlocks.CHEESE_PRESS).build());
        CyaniteMod.LOGGER.info("Registering ModBlockEntities for Cyanite");
    }
}
