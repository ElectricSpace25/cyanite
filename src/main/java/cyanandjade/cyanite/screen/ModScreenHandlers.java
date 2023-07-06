package cyanandjade.cyanite.screen;

import cyanandjade.cyanite.CyaniteMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<CheesePressScreenHandler> CHEESE_PRESS_SCREEN_HANDLER = new ScreenHandlerType<>(CheesePressScreenHandler::new, FeatureFlags.VANILLA_FEATURES);;

    public static void registerAllScreenHandlers() {
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(CyaniteMod.MOD_ID, "cheese_press"), CHEESE_PRESS_SCREEN_HANDLER);
    }
}
