package ru.darkcraft.RPGCraft;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;

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
    private PermissionManager permissionManager;

    @Override
    public void onEnable()
    {
        new Log(getLogger(), getDescription());

        permissionManager = new PermissionManager(getServer().getPluginManager());
        permissionManager.loadPermissions("/permissions.yml");
        permissionManager.registerPermissions();

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
