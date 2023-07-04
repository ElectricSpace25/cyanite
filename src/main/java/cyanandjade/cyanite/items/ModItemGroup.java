package cyanandjade.cyanite.items;

import cyanandjade.cyanite.CyaniteMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final RegistryKey<ItemGroup> CYANITE_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(CyaniteMod.MOD_ID, "cyanite_group"));

    public static void registerItemGroups() {
        CyaniteMod.LOGGER.info("Registering item group for Cyanite");

        Registry.register(Registries.ITEM_GROUP, CYANITE_GROUP, FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.STONE_CHEESE)) //Todo: change icon
            .displayName(Text.literal("Cyanite"))
            .build());
    }
}