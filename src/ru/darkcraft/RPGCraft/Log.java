package ru.darkcraft.RPGCraft;

import org.bukkit.plugin.PluginDescriptionFile;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a log class
 * @author KarN
 * @version 1.0
 */
public final class Log
{
    private Logger logger;
    private  PluginDescriptionFile pluginDescriptionFile;
    private static Log instance;


    public Log(Logger logger, PluginDescriptionFile pdf)
    {
        this.pluginDescriptionFile = pdf;
        this.logger = logger;
        instance = this;
    }

    private static void log(Level logLevel, String message) throws NullPointerException
    {
        if (instance == null)
            throw  new NullPointerException("Logger instance is null");
        else
        {
            String format = "[%1$s | %2$s] %3$s";
            instance.logger.log(logLevel, String.format(format, instance.pluginDescriptionFile.getName(), instance.pluginDescriptionFile.getVersion(), message));
        }
    }

    public static void info(String message) throws NullPointerException
    {
        log(Level.INFO, message);
    }

    public static void warning(String message) throws NullPointerException
    {
        log(Level.WARNING, message);
    }

    public static void fatal(String message) throws NullPointerException
    {
        log(Level.SEVERE, message);
    }


}
