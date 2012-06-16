package ru.darkcraft.RPGCraft.skills;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 0:54
 * To change this template use File | Settings | File Templates.
 */
public final class SkillState
{
    protected Skill skill;
    protected int upXP;
    protected int level;
    protected int xp;

    public SkillState(Skill sk)
    {
        skill = sk;
        level = 0;
        xp = 0;
    }

    public SkillState(Skill skill, int level, int xp)
    {
        this.skill = skill;
        this.level = level;
        this.xp = xp;
    }

    public void up()
    {
        if(skill.getMaxlevel() > level && skill.upXP(level) <= xp)
        {
            level++;
            xp -= upXP;
            upXP = skill.upXP(level);
        }
    }
}
