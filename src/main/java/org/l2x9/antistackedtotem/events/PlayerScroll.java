package org.l2x9.antistackedtotem.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerScroll implements Listener {
    @EventHandler
    public void onScroll(PlayerItemHeldEvent event) {
        for (ItemStack itemStack : event.getPlayer().getInventory().getContents()) {
            if (itemStack != null) {
                if (itemStack.getType() == Material.TOTEM) {
                    if (itemStack.getAmount() > itemStack.getMaxStackSize()) {
                        itemStack.setAmount(itemStack.getMaxStackSize());
                    }
                }
            }
        }
    }
}