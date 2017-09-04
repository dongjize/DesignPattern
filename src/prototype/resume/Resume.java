package prototype.resume;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-04
 * @Time: 12:35
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) work.clone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String date, String company) {
        workExperience.setDate(date);
        workExperience.setCompany(company);
    }

    @Override
    public String toString() {
        return name + " " + sex + " " + age +
                "\n工作经历：" + workExperience.getDate() + " " + workExperience.getCompany();
    }

    public void display() {
        System.out.println(this.toString());
    }

    /**
     * implements deep copy
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
