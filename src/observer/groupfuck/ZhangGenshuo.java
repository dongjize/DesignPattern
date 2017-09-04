package observer.groupfuck;

/*
 * Description: 具体嫖客类 作为观察者存在
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 21:26
 */
public class ZhangGenshuo extends WhoreClient {

    public ZhangGenshuo(Bitch bitch) {
        this.bitch = bitch;
        this.bitch.attach(this);
    }

    public void swellDick() {
        System.out.println(ZhangGenshuo.class.getSimpleName() + "'s dick reaches 20cm from 2cm!!");
    }

    @Override
    protected void excited() {
        System.out.println(ZhangGenshuo.class.getSimpleName() +
                " says: \"Haha, " + this.bitch.getName() + this.bitch.getState() + "，真骚~~\"");
    }

    @Override
    protected void fuck() {
        System.out.println(ZhangGenshuo.class.getSimpleName() +
                " says: \"Haha, " + this.bitch.getName() + this.bitch.getState() + "，真爽！！\"");
    }
}
