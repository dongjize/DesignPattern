package composite.country;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-09
 * @Time: 00:43
 */
public abstract class AdministrativeRegion {

    protected int id;
    protected String name;
    protected int population;
    protected String leader;

    public AdministrativeRegion(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected abstract void add(AdministrativeRegion region);

    protected abstract void remove(AdministrativeRegion region);

    protected abstract void display(int depth);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}
