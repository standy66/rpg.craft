package ru.darkcraft.RPGCraft.players;

import org.bukkit.entity.LivingEntity;
import ru.darkcraft.RPGCraft.influences.Influence;

import java.util.ArrayList;

/**
 * Paste description here
 * <p/>
 * Created with IntelliJ IDEA.
 * Date: 17.06.12
 * Time: 1:51
 *
 * @author KarN
 * @version 1.0
 */
public abstract class EntityWrapper
{
    private LivingEntity entity;
    private String name;
    private ArrayList<Influence> influences;

    public EntityWrapper(LivingEntity entity)
    {
        this.entity = entity;
        this.name = entity.toString();
        influences = new ArrayList<Influence>();
    }

    public EntityWrapper(LivingEntity entity, String name)
    {
        this.name = name;
        this.entity = entity;
        influences = new ArrayList<Influence>();
    }

    public LivingEntity getEntity()
    {
        return entity;
    }

    public void addInfluence(Influence influence)
    {
        this.influences.add(influence);
    }

    public abstract void doDamage(float damage);
}
