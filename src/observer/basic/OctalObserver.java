package observer.basic;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 20:38
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
