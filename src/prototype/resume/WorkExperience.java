package prototype.resume;

/**
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-04
 * @Time: 12:36
 */
public class WorkExperience implements Cloneable{
    private String date;
    private String company;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
