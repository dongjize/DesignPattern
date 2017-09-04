package observer.basic;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 20:40
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
