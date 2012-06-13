package ru.darkcraft.RPGCraft.players;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 1:24
 * To change this template use File | Settings | File Templates.
 */
public final class PlayersDB {
    private static HashMap<String,RCPlayer> players;

    public static void set(String name,RCPlayer p) {
        players.put(name,p);
    }

    public static RCPlayer get(String name) {
        return players.get(name);
    }
}
