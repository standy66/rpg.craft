package ru.darkcraft.RPGCraft.skill;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 1:07
 * To change this template use File | Settings | File Templates.
 */
public class SkillDB
{
    private HashMap<String, Skill> skills;

    public Skill get(String name)
    {
        return skills.get(name);
    }

    public void put(String name, Skill skill)
    {
        skills.put(name,skill);
    }
}
