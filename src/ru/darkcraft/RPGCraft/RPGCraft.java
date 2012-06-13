package ru.darkcraft.RPGCraft;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main plugin class
 * User: KarN
 * Date: 13.06.12
 * Time: 14:03
 * @author KarN
 * @version 1.0
 *
 */
public class RPGCraft extends JavaPlugin {

    private Logger logger;
    private PluginDescriptionFile pluginDescriptionFile;


    @Override
    public void onEnable() {
        pluginDescriptionFile = getDescription();
        logger = this.getLogger();
        logger.log(Level.INFO,  pluginDescriptionFile.getName() + " " + pluginDescriptionFile.getVersion() + " is now enabled");

    }

    @Override
    public void onDisable() {

        logger.log(Level.INFO,  pluginDescriptionFile.getName() + " " + pluginDescriptionFile.getVersion() + " is now enabled");

    }

}
