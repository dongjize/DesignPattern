package composite.company;

import java.util.ArrayList;
import java.util.List;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-09
 * @Time: 00:14
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    protected void add(Company c) {
        children.add(c);
    }

    @Override
    protected void remove(Company c) {
        children.remove(c);
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
        for (Company component : children) {
            component.display(depth + 2);
        }
    }

    @Override
    protected void lineOfDuty() {
        for (Company component : children) {
            component.lineOfDuty();
        }
    }
}
