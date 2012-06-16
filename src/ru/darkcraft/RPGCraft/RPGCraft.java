package ru.darkcraft.RPGCraft;

import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import ru.darkcraft.RPGCraft.listeners.*;
import ru.darkcraft.RPGCraft.utils.Log;
import ru.darkcraft.RPGCraft.utils.PermissionManager;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.logging.Logger;

/**
 * Main plugin class
 * @author KarN
 * @version 1.0
 */
public final class RPGCraft extends JavaPlugin
{
    private Logger logger;
    private PluginDescriptionFile pluginDescriptionFile;
    private PermissionManager permissionManager;
    private PluginManager pluginManager;
    private Server server;

    private PlayerListener playerListener;
    private EntityListener entityListeners;
    private BlockListener blockListener;


    @Override
    public void onEnable()
    {
        new Log(getLogger(), getDescription());

        server = getServer();
        pluginManager = server.getPluginManager();

        playerListener = new PlayerListener(this);
        blockListener = new BlockListener(this);
        entityListeners = new EntityListener(this);

        permissionManager = new PermissionManager(pluginManager);
        permissionManager.loadPermissions("/permissions.yml");
        permissionManager.registerPermissions();
        pluginManager = getServer().getPluginManager();


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
        throw  new NotImplementedException();
    }
}
