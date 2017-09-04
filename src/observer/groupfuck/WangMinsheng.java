package observer.groupfuck;

/*
 * Description: 具体嫖客类 作为观察者存在
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 21:11
 */
public class WangMinsheng extends WhoreClient {

    public WangMinsheng(Bitch bitch) {
        this.bitch = bitch;
        this.bitch.attach(this);
    }

    public void watchAV() {
        System.out.println(WangMinsheng.class.getSimpleName() + " watched a Japanese romance action movie.");
    }

    @Override
    protected void excited() {
        System.out.println(WangMinsheng.class.getSimpleName() +
                " says: \"Haha, " + this.bitch.getName() + this.bitch.getState() + "，真骚~~\"");
    }

    @Override
    protected void fuck() {
        System.out.println(WangMinsheng.class.getSimpleName() +
                " says: \"Haha, " + this.bitch.getName() + this.bitch.getState() + "，真爽！！\"");
    }
}
