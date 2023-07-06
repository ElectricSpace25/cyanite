package cyanandjade.cyanite;

import cyanandjade.cyanite.screen.CheesePressScreen;
import cyanandjade.cyanite.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class CyaniteModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.CHEESE_PRESS_SCREEN_HANDLER, CheesePressScreen::new);
    }
}
