package composite.country;

import java.util.ArrayList;
import java.util.List;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-09
 * @Time: 00:48
 */
public class ConcreteRegion extends AdministrativeRegion {

    private List<AdministrativeRegion> regionList;

    public ConcreteRegion(int id, String name) {
        super(id, name);
        regionList = new ArrayList<>();
    }

    @Override
    protected void add(AdministrativeRegion region) {
        regionList.add(region);
    }

    @Override
    protected void remove(AdministrativeRegion region) {
        regionList.remove(region);
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(toString());
        System.out.println(sb.toString());
        for (AdministrativeRegion region : regionList) {
            region.display(depth + 2);
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + population;
    }
}
