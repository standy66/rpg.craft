package ru.darkcraft.RPGCraft.api.tasks;

import ru.darkcraft.RPGCraft.RPGCraft;
import ru.darkcraft.RPGCraft.players.EntityWrapper;
import ru.darkcraft.RPGCraft.players.PlayerWrapper;
import ru.darkcraft.RPGCraft.players.PlayersDB;

/**
 * Paste description here
 * <p/>
 * Created with IntelliJ IDEA.
 * Date: 17.06.12
 * Time: 13:03
 *
 * @author KarN
 * @version 1.0
 */
//TODO: Rewrite with using living entities, not players
public class InfluenceHandlerTask extends Task
{
    private RPGCraft plugin;

    public InfluenceHandlerTask(RPGCraft plugin)
    {
        this.plugin = plugin;
    }


    @Override
    public void run()
    {
        synchronized (PlayersDB.getLocker())
        {
            for(EntityWrapper p : PlayersDB.values())
            {
                synchronized (p)
                {
                    p.processInfluences();
                }
            }
        }
    }
}
