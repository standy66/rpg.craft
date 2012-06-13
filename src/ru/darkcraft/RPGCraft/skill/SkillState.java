package ru.darkcraft.RPGCraft.skill;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 0:54
 * To change this template use File | Settings | File Templates.
 */
public class SkillState {
    protected Skill skill;
    protected int upXP;
    protected int level;
    protected int xp;

    public SkillState(Skill sk) {
        skill=sk;
        level=0;
        xp=0;
    }

    public SkillState(Skill tskill, int tlevel, int txp) {
        skill=tskill;
        level=tlevel;
        xp=txp;
    }

    public void up() {
        if(skill.getMaxlevel()>level && skill.upXP(level)<=xp) {
            level++;
            xp=xp-upXP;
            upXP=skill.upXP(level);
        }
    }
}
