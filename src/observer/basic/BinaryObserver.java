package observer.basic;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 20:35
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
