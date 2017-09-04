package observer.groupfuck;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 21:20
 */
public class FuckTest {
    public static void main(String[] args) {
        Bitch fengjie = new Bitch();
        WangMinsheng wangminsheng = new WangMinsheng(fengjie);
        ZhangGenshuo zhanggenshuo = new ZhangGenshuo(fengjie);
        wangminsheng.watchAV();
        zhanggenshuo.swellDick();
        fengjie.setName("罗玉凤");
        fengjie.setState("脱下了衣服");
        fengjie.setState("帮我吹喇叭");

        fengjie.detach(zhanggenshuo);
        fengjie.setState("老汉推车");
        fengjie.attach(zhanggenshuo);
        fengjie.setState("老汉推车");
    }
}
