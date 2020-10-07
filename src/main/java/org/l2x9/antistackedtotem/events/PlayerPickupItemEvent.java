package org.l2x9.antistackedtotem.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerPickupItemEvent implements Listener {
    @EventHandler
    public void onPickUp(EntityPickupItemEvent event) {
        ItemStack itemStack = event.getItem().getItemStack();
        if (itemStack.getType() == Material.TOTEM) {
            if (itemStack.getAmount() > itemStack.getMaxStackSize()) {
                itemStack.setAmount(itemStack.getMaxStackSize());
            }
        }
    }
}
