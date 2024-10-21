package org.nopal.lipoPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.nopal.lipoPlugin.Commands.Hello;

public final class LipoPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello");
        getCommand("test").setExecutor(new Hello(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("Bye");
    }

    public static LipoPlugin getInstance() {
        return getPlugin(LipoPlugin.class);
    }
}
