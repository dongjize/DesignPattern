package flyweight.website;

/**
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-27
 * @Time: 23:11
 */
public class ConcreteWebsite extends Website {

    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
