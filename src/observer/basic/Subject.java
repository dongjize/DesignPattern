package observer.basic;

import java.util.ArrayList;
import java.util.List;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 20:27
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
