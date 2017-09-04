package prototype.football;

import sun.misc.Perf;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-04
 * @Time: 12:59
 */
public class FootballPlayer implements Cloneable {
    private String name;
    private int age;
    private String nationality;
    private Club club;
    private Performance performance;

    public FootballPlayer(String name) {
        this.name = name;
        this.club = new Club();
        this.performance = new Performance();
    }

    private FootballPlayer(Club club, Performance performance) throws CloneNotSupportedException {
        this.club = (Club) club.clone();
        this.performance = (Performance) performance.clone();
    }

    public void setPersonalInfo(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void setClub(String name, String country) {
        club.setName(name);
        club.setCountry(country);
    }

    public void setPerformance(int goal, int assist, int ability) {
        performance.setGoal(goal);
        performance.setAssist(assist);
        performance.setAbility(ability);
    }

    /**
     * Call private constructors to clone Club. Clone Club and Performance before assigning other primitive fields.
     * Eventually, return an Object produced by deep copy.
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        FootballPlayer obj = new FootballPlayer(this.club, this.performance);
        obj.name = this.name;
        obj.age = this.age;
        obj.nationality = this.nationality;
        return obj;
    }

    public void display() {
        System.out.println(name + " " + age + " " + nationality +
                "\nClub: " + club.getName() + " " + club.getCountry() +
                "\nPerformance: goals: " + performance.getGoal() + " assists: " + performance.getAssist() +
                " ability: " + performance.getAbility());
    }
}
