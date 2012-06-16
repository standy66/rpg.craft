package ru.darkcraft.RPGCraft.influences;

import ru.darkcraft.RPGCraft.players.EntityWrapper;

import java.sql.Time;

/**
 * Paste description here
 * <p/>
 * Created with IntelliJ IDEA.
 * Date: 17.06.12
 * Time: 1:50
 *
 * @author KarN
 * @version 1.0
*/
public abstract class Influence
{
    protected EntityWrapper target;
    protected long duration;
    protected long appliedTime;

    public Influence(EntityWrapper target, long duration)
    {
        this.target = target;
        this.duration = duration;
    }

    public EntityWrapper getTarget()
    {
        return target;
    }

    public long getDuration()
    {
        return duration;
    }

    public long getRemainingTime()
    {
        return appliedTime + duration - System.nanoTime();
    }

    public void apply()
    {
        target.addInfluence(this);
        appliedTime = System.nanoTime();
    }

    public abstract void cast();
}
