package cyanandjade.cyanite.screen;

import cyanandjade.cyanite.CyaniteMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CheesePressScreen extends HandledScreen<CheesePressScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(CyaniteMod.MOD_ID, "textures/gui/cheese_press_gui.png");

    public CheesePressScreen(CheesePressScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = backgroundWidth - textRenderer.getWidth(title) - 16;
    }

    //This might be mega sketchy
    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        context.drawTexture(TEXTURE, this.x, this.y, 0, 0, backgroundWidth, backgroundHeight);

        //Progress arrow
        if (handler.isCrafting()) {
            context.drawTexture(TEXTURE, x + 79, y + 34, 176, 14, handler.getScaledProgress(), 16);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
