package io.github.artificial720.lanjoinmessage;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LanJoinMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(this), this);
        getLogger().info("The Lan Join Message Plugin has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("The Lan Join Message Plugin has been disabled");
    }
}
