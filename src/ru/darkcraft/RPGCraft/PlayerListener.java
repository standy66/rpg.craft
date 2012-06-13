package ru.darkcraft.RPGCraft;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/*
 * PlayerListener
 * Date: 13.06.12
 * Time: 19:29
 *
 * @author KarN
 * @version 1.0
 */
public class PlayerListener implements Listener
{
    private RPGCraft plugin;

    public PlayerListener(RPGCraft plugin)
    {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event){
       Player player = event.getPlayer();
       player.sendMessage("Welcome to server!");
    }
}