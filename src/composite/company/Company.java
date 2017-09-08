package composite.company;

/*
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-09
 * @Time: 00:08
 */
public abstract class Company {

    public Company(String name) {
        this.name = name;
    }

    protected String name;

    protected abstract void add(Company c);

    protected abstract void remove(Company c);

    protected abstract void display(int depth);

    /**
     * perform duties of the specific department
     */
    protected abstract void lineOfDuty();
}
