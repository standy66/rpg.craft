package ru.darkcraft.RPGCraft.players;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 1:24
 * To change this template use File | Settings | File Templates.
 */
public final class PlayersDB {
    private static HashMap<String,PlayerWrapper> players;
    private static Object locker;

    public static void put(String name, PlayerWrapper p)
    {
        players.put(name,p);
    }

    public static PlayerWrapper get(String name)
    {
        return players.get(name);
    }

    public static void remove(String name)
    {
        players.remove(name);
    }

    public static Collection<PlayerWrapper> values()
    {
        return  players.values();
    }

    public static Object getLocker()
    {
        return locker;
    }
}
