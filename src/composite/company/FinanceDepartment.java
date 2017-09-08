package composite.company;


/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-09
 * @Time: 00:22
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    protected void add(Company c) {

    }

    @Override
    protected void remove(Company c) {

    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }

    @Override
    protected void lineOfDuty() {
        System.out.println(name + " 公司财务收支管理");

    }
}
