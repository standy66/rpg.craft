package ru.darkcraft.RPGCraft.stats;

import com.sun.corba.se.spi.monitoring.MonitoringFactories;

import java.util.ArrayList;

/**
 * Paste description here
 * <p/>
 * Created with IntelliJ IDEA.
 * Date: 14.06.12
 * Time: 11:50
 *
 * @author KarN
 * @version 1.0
 */
public class BaseStat
{
    private float value;
    private ArrayList<Modifier> modifiers;


    public BaseStat(float value)
    {
        modifiers = new ArrayList<Modifier>();
        this.value = value;
    }

    public BaseStat(float value, Modifier... mods)
    {
        modifiers = new ArrayList<Modifier>();
        this.value = value;

        for (Modifier m : mods)
        {
            modifiers.add(m);
        }
    }


    private void recalcMods(float dv)
    {
        for (Modifier m : modifiers)
        {
            m.getStat().setValue(m.getModifier() * dv);
        }
    }


    public float getValue()
    {
        return value;
    }

    public void setValue(float val)
    {
        recalcMods(val - this.value);
        this.value = val;
    }

    public void addValue(float dv)
    {
        recalcMods(dv);
        this.value += dv;
    }
}
