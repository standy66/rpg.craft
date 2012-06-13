package ru.darkcraft.RPGCraft.skill;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 14.06.12
 * Time: 0:54
 * To change this template use File | Settings | File Templates.
 */
public interface Skill {
    public int upXP(int level);
    public int getMaxlevel();
    public class Run implements Runnable {
        @Override
        public void run() {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
