package ru.darkcraft.RPGCraft.stats;

/**
 * Paste description here
 * <p/>
 * Created with IntelliJ IDEA.
 * Date: 14.06.12
 * Time: 11:56
 *
 * @author KarN
 * @version 1.0
 */
public class Modifier
{
    private BaseStat stat;
    private float modifier;


    public Modifier(BaseStat stat, float modifier)
    {
        this.stat = stat;
        this.modifier = modifier;
    }


    public BaseStat getStat() {
        return stat;
    }

    public void setStat(BaseStat stat) {
        this.stat = stat;
    }

    public float getModifier() {
        return modifier;
    }

    public void setModifier(float modifier) {
        this.modifier = modifier;
    }
}
