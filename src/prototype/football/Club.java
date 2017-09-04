package prototype.football;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-04
 * @Time: 13:00
 */
public class Club implements Cloneable {
    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
