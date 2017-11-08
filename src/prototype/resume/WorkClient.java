package prototype.resume;

/**
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-04
 * @Time: 12:43
 */
public class WorkClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xx公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2004", "yy企业");

        Resume c = (Resume) a.clone();
        c.setWorkExperience("1998-2003", "zz企业");

        a.display();
        b.display();
        c.display();
    }
}
