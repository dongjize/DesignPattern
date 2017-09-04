package singleton;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-03
 * @Time: 22:31
 */
public class SingletonDemo {

}

class ClassicSingleton {

    private static ClassicSingleton INSTANCE = null;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassicSingleton();
        }
        return INSTANCE;
    }
}

class SynchronizedSingleton {
    private static SynchronizedSingleton INSTANCE = null;

    private SynchronizedSingleton() {
    }

    /**
     * Double-checked locking
     *
     * the getInstance() method only needs to be synchronized the first time it is called
     * @return
     */
    public static SynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (SynchronizedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SynchronizedSingleton();
                }
            }
        }
        return INSTANCE;
    }
}