package org.l2x9.antistackedtotem;

import org.bukkit.plugin.java.JavaPlugin;
import org.l2x9.antistackedtotem.events.InventoryOpen;
import org.l2x9.antistackedtotem.events.PlayerPickupItemEvent;
import org.l2x9.antistackedtotem.events.PlayerScroll;

public final class AntiStackedTotem extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new InventoryOpen(), this);
        getServer().getPluginManager().registerEvents(new PlayerPickupItemEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerScroll(), this);
    }
}
