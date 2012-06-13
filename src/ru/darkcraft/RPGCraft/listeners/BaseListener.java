package ru.darkcraft.RPGCraft.listeners;

import org.bukkit.event.Listener;
import ru.darkcraft.RPGCraft.RPGCraft;

/**
 * BaseListener
 *
 * Created with IntelliJ IDEA.
 * Date: 14.06.12
 * Time: 0:05
 *
 * @author KarN
 * @version 1.0
 */
public class BaseListener implements Listener
{
    protected RPGCraft plugin;


    public BaseListener(RPGCraft plugin)
    {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
}
