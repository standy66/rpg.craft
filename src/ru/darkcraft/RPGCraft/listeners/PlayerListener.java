package ru.darkcraft.RPGCraft.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import ru.darkcraft.RPGCraft.RPGCraft;
import ru.darkcraft.RPGCraft.players.PlayerWrapper;
import ru.darkcraft.RPGCraft.players.PlayersDB;

/*
 * PlayerListener
 * Date: 13.06.12
 * Time: 19:29
 *
 * @author KarN
 * @version 1.0
 */
public final class PlayerListener extends BaseListener
{
    public PlayerListener(RPGCraft plugin)
    {
        super(plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        PlayersDB.put(player.getName(), new PlayerWrapper(player));
        player.sendMessage("Welcome to server!");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event)
    {
        Player player = event.getPlayer();
        PlayersDB.remove(player.getName());
    }
}