package ru.darkcraft.RPGCraft;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/*
 * Created with IntelliJ IDEA.
 * Date: 13.06.12
 * Time: 19:29
 *
 * @author KarN
 * @version 1.0
 */
public class PlayerListener implements Listener
{
   public void onPlayerLogin(PlayerLoginEvent event){
       Player player = event.getPlayer();
       player.sendMessage("Welcome to server!");
   }
}