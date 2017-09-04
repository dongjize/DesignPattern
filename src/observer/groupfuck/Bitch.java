package observer.groupfuck;

import java.util.ArrayList;
import java.util.List;

/*
 * Description: 婊子类 作为被观察者
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 21:07
 */
public class Bitch {
    private List<WhoreClient> whoreClients = new ArrayList<>();
    private String state;
    private String name;

    public Bitch() {
    }

    public Bitch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(whoreClients);
    }

    private void notifyObservers(List<WhoreClient> observers) {
        switch (getState()) {
            case "脱下了衣服":
                for (WhoreClient observer : observers) {
                    observer.excited();
                }
                break;
            case "帮我吹喇叭":
                for (WhoreClient observer : observers) {
                    observer.fuck();
                }
                break;
            case "老汉推车":
                for (WhoreClient observer : observers) {
                    observer.fuck();
                }
                break;
        }

    }

    public void attach(WhoreClient whoreClient) {
        this.whoreClients.add(whoreClient);
    }

    public void detach(WhoreClient whoreClient) {
        this.whoreClients.remove(whoreClient);
    }
}
