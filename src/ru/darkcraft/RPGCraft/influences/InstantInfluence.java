package ru.darkcraft.RPGCraft.influences;

import ru.darkcraft.RPGCraft.players.EntityWrapper;

/**
 * Paste description here
 * <p/>
 * Created with IntelliJ IDEA.
 * Date: 17.06.12
 * Time: 12:41
 *
 * @author KarN
 * @version 1.0
 */
public abstract class InstantInfluence extends Influence
{
    public InstantInfluence(EntityWrapper target)
    {
        super(target, 0);
    }
}
