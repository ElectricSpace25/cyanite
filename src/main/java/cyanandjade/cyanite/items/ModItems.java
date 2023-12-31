package cyanandjade.cyanite.items;

import cyanandjade.cyanite.CyaniteMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //Items
    public static final Item PETRIFIED_CHEESE = registerItem("petrified_cheese", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_CHEESE = registerItem("molten_cheese", new Item(new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings()));
    public static final Item CHEESE_WEDGE_MOLD = registerItem("cheese_wedge_mold", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CyaniteMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.CYANITE_GROUP, PETRIFIED_CHEESE);
        addToItemGroup(ModItemGroup.CYANITE_GROUP, MOLTEN_CHEESE);
        addToItemGroup(ModItemGroup.CYANITE_GROUP, CHEESE);
        addToItemGroup(ModItemGroup.CYANITE_GROUP, CHEESE_WEDGE_MOLD);

    }

    public static void addToItemGroup (RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
    }

    public static void registerModItems() {
        CyaniteMod.LOGGER.info("Registering mod items for Cyanite");
        addItemsToItemGroup();
    }
}
