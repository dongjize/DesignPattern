package observer.basic;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-14
 * @Time: 20:31
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
