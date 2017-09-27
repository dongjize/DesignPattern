package flyweight.website;

/**
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-27
 * @Time: 23:14
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory f = new WebsiteFactory();

        Website fx = f.getWebsiteCategory("产品展示");
        fx.use(new User("小菜"));
        Website fy = f.getWebsiteCategory("产品展示");
        fy.use(new User("大鸟"));
        Website fz = f.getWebsiteCategory("产品展示");
        fz.use(new User("娇娇"));
        Website fl = f.getWebsiteCategory("博客");
        fl.use(new User("老顽童"));
        Website fm = f.getWebsiteCategory("博客");
        fl.use(new User("桃谷六仙"));
        Website fn = f.getWebsiteCategory("博客");
        fl.use(new User("南海鳄神"));

        System.out.println("网站分类总数为" + f.getWebsiteCount());

    }
}
