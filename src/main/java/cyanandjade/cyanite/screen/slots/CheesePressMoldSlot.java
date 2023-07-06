package cyanandjade.cyanite.screen.slots;

import cyanandjade.cyanite.items.ModItems;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class CheesePressMoldSlot extends Slot {

    public CheesePressMoldSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.getItem() == ModItems.CHEESE_WEDGE_MOLD;
    }
}
