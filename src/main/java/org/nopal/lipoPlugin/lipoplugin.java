package org.nopal.lipoPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class lipoplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello");
    }

    @Override
    public void onDisable() {
        getLogger().info("Bye");
    }
}
