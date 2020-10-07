package org.l2x9.antistackedtotem.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClick implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        for (ItemStack stack : event.getInventory().getContents()) {
            if (stack != null) {
                if (stack.getType() == Material.TOTEM) {
                    if (stack.getAmount() > stack.getMaxStackSize()) {
                        stack.setAmount(stack.getMaxStackSize());
                    }
                }
            }
        }
    }
}
