package ru.darkcraft.RPGCraft;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;

import java.awt.*;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main plugin class
 * @author KarN
 * @version 1.0
 */
public class RPGCraft extends JavaPlugin
{
    private Logger logger;
    private PluginDescriptionFile pluginDescriptionFile;

    @Override
    public void onEnable()
    {
        new Log(getLogger(), getDescription());
        Log.info("Plugin is enabled");

    }

    @Override
    public void onDisable()
    {
        Log.info("Plugin is disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {


        return true;
    }




}
