package ru.darkcraft.RPGCraft.utils;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;

import java.io.InputStream;
import java.util.ArrayList;
import java.io.*;

/**
 *
 *
 * Created with IntelliJ IDEA.
 * Date: 13.06.2012
 * Time: 16:46
 * @author KarN
 * @version 1.0
 */

public final class PermissionManager
{
    private PluginManager pluginManager;
    private ArrayList<Permission> permissions;

    public PermissionManager(PluginManager pm)
    {
        this.pluginManager = pm;
        this.permissions = new ArrayList<Permission>();
    }


    public void loadPermissions(String path)
    {
        String line;
        try
        {
            InputStream inputStream = PermissionManager.class.getResourceAsStream(path);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = bufferedReader.readLine()) != null)
            {
                permissions.add(new Permission(line));
                Log.info("Loaded permission " + line);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void registerPermissions()
    {
        for (Permission p : permissions)
        {
            pluginManager.addPermission(p);
        }
    }


}
