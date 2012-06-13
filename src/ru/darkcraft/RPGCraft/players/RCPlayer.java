package ru.darkcraft.RPGCraft.players;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import ru.darkcraft.RPGCraft.skill.SkillState;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 0:54
 * To change this template use File | Settings | File Templates.
 */
public class RCPlayer {
    private Player player;
    private ArrayList<SkillState> skills;
    private int HP;
    private int maxHP;
    private int mana;
    private int maxMana;
    private int stamina;
    private int maxStamina;

    public RCPlayer(Player p) {
        this.player=p;
    }

    public void load(ConfigurationSection cfg) {
        for(String s:cfg.getConfigurationSection("skills").getKeys(false)) {

        }
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }
}
