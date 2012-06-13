package ru.darkcraft.RPGCraft.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import ru.darkcraft.RPGCraft.RPGCraft;
import ru.darkcraft.RPGCraft.players.PlayersDB;
import ru.darkcraft.RPGCraft.players.RCPlayer;

/*
 * PlayerListener
 * Date: 13.06.12
 * Time: 19:29
 *
 * @author KarN
 * @version 1.0
 */
public class PlayerListener extends BaseListener
{
    public PlayerListener(RPGCraft plugin)
    {
        super(plugin);
    }

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event){
        Player player=event.getPlayer();
        PlayersDB.set(player.getName(),new RCPlayer(player));
        player.sendMessage("Welcome to server!");
    }
}