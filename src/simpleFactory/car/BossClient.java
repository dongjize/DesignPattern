package simpleFactory.car;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 13:30
 */
public class BossClient {
    public static void main(String[] args) {
        Car benz = DriverTheFactory.createCar("benz");
        benz.setName("benz");
        benz.drive();

        Car bmw = DriverTheFactory.createCar("bmw");
        bmw.setName("bmw");
        bmw.drive();

    }
}
