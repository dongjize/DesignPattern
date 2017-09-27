package flyweight.base;

import java.util.Hashtable;

/**
 * Description: 享元工厂，用来创建并管理flyweight对象。
 * 当用户请求一个flyweight，工厂提供一个已创建的实例，或者新创建一个（如果不存在）
 *
 * @Author: dong
 * @Date: 2017-09-27
 * @Time: 23:00
 */
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return (Flyweight) flyweights.get(key);
    }
}
