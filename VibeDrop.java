package com.vibecraft;

import org.bukkit.plugin.java.JavaPlugin;

public class VibeDrop extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("VibeDrop plugin has been enabled!");
        saveDefaultConfig(); // Załaduj domyślny config
        getServer().getPluginManager().registerEvents(new DropListener(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("VibeDrop plugin has been disabled!");
    }
}
