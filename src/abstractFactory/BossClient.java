package abstractFactory;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:46
 */
public class BossClient {
    public static void main(String[] args) throws Exception {
        Benz benzSportsCar = Driver.createBenzCar(BenzSportsCar.class.getName());
        Benz benzBusinessCar = Driver.createBenzCar(BenzBusinessCar.class.getName());
        Bmw bmwSportsCar = Driver.createBmwCar(BmwSportsCar.class.getName());
        Bmw bmwBusinessCar = Driver.createBmwCar(BmwBusinessCar.class.getName());
        benzSportsCar.drive();
        benzBusinessCar.drive();
        bmwSportsCar.drive();
        bmwBusinessCar.drive();
    }
}
