package prototype.football;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-04
 * @Time: 13:31
 */
public class Performance implements Cloneable {
    private int goal;
    private int assist;
    private int ability;

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
