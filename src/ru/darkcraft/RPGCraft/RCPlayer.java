package ru.darkcraft.RPGCraft;

import org.bukkit.configuration.ConfigurationSection;
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
    private ArrayList<SkillState> skills;
    public int hp;
    public int maxhp;
    public int mana;
    public int maxmana;
    public int stamina;
    public int maxstamina;

    public RCPlayer(ConfigurationSection cfg) {
        for(String s:cfg.getConfigurationSection("skills").getKeys(false)) {

        }
    }


}
