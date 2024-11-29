package io.github.artificial720.lanjoinmessage;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.net.InetAddress;

public class PlayerJoinListener implements Listener {
    private final LanJoinMessage plugin;

    public PlayerJoinListener(LanJoinMessage plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        InetAddress playerAddress = player.getAddress().getAddress();

        // Check if player is connected from LAN IP address
        if (playerAddress != null && playerAddress.isSiteLocalAddress()) {
            FileConfiguration config = plugin.getConfig();
            String rawMessage = config.getString("lan-message");

            MiniMessage miniMessage = MiniMessage.miniMessage();
            if (rawMessage != null) {
                Component message = miniMessage.deserialize(rawMessage);
                player.sendMessage(message);
            }
        }
    }
}
