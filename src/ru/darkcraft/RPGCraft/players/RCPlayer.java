package ru.darkcraft.RPGCraft.players;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import ru.darkcraft.RPGCraft.skill.SkillState;
import ru.darkcraft.RPGCraft.stats.HPStat;
import ru.darkcraft.RPGCraft.stats.MPStat;
import ru.darkcraft.RPGCraft.stats.Modifier;
import ru.darkcraft.RPGCraft.stats.StaminaStat;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 0:54
 * To change this template use File | Settings | File Templates.
 */
public final class RCPlayer {
    private Player player;
    private ArrayList<SkillState> skills;
    private float HP;
    private HPStat maxHP;
    private float mana;
    private MPStat maxMana;
    private float stamina;
    private StaminaStat maxStamina;

    public RCPlayer(Player p)
    {
        this.player = p;
        maxHP = new HPStat(20);
        maxMana = new MPStat(20);
        maxStamina = new StaminaStat(20, new Modifier(maxHP, 0.1f));
    }

    public void load(ConfigurationSection cfg)
    {
        for(String s:cfg.getConfigurationSection("skills").getKeys(false)) {

        }
    }


    public float getHP()
    {
        return HP;
    }

    public void setHP(float HP)
    {
        this.HP = HP;
    }

    public float getMana()
    {
        return mana;
    }


    public void setMana(float mana)
    {
        this.mana = mana;
    }


    public float getStamina()
    {
        return stamina;
    }

    public void setStamina(float stamina)
    {
        this.stamina = stamina;
    }


    public float getMaxHP()
    {
        return maxHP.getValue();
    }

    public void setMaxHP(float maxHP)
    {
        this.maxHP.setValue(maxHP);
    }


    public float getMaxMana()
    {
        return maxMana.getValue();
    }

    public void setMaxMana(float maxMana)
    {
        this.maxMana.setValue(maxMana);
    }


    public float getMaxStamina()
    {
        return maxStamina.getValue();
    }

    public void setMaxStamina(float maxStamina)
    {
        this.maxStamina.setValue(maxStamina);
    }
}
