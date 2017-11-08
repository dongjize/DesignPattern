package simpleFactory.car;

/**
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 13:29
 */
public class DriverTheFactory {
    public static Car createCar(String car) {
        Car c = null;

        // brute force
        if ("Benz".equalsIgnoreCase(car))
            c = new Benz();
        else if ("Bmw".equalsIgnoreCase(car))
            c = new Bmw();
        return c;
    }
}
