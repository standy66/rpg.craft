package ru.darkcraft.RPGCraft.api.tasks;

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
public class InfluenceHandlerTask extends Task
{
    @Override
    public void run()
    {
        synchronized (PlayersDB.getLocker())
        {
            for(PlayerWrapper p : PlayersDB.values())
            {
                synchronized (p)
                {
                    p.processInfluences();
                }
            }
        }
    }
}
