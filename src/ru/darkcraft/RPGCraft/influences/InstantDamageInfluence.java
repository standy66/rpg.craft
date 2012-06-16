package ru.darkcraft.RPGCraft.influences;

import ru.darkcraft.RPGCraft.players.EntityWrapper;

/**
 * Paste description here
 * <p/>
 * Created with IntelliJ IDEA.
 * Date: 17.06.12
 * Time: 1:58
 *
 * @author KarN
 * @version 1.0
 */
public class InstantDamageInfluence extends Influence
{
    private float damage;

    public InstantDamageInfluence(EntityWrapper target, float damage)
    {
        super(target, 0);
        this.damage = damage;
    }

    @Override
    public void cast()
    {
        target.doDamage(damage);
    }
}
