package factoryMethod;

/**
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:09
 */
public class BossClient {
    public static void main(String[] args) {
        Driver benzDriver = new BenzDriver();
        Benz benz = (Benz) benzDriver.createCar();
        benz.drive();
        Driver bmwDriver = new BmwDriver();
        Bmw bmw = (Bmw) bmwDriver.createCar();
        bmw.drive();

    }
}
