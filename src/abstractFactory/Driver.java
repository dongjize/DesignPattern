package abstractFactory;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:42
 */
public class Driver {

    public static Bmw createBmwCar(String car) throws Exception {
        return (Bmw) Class.forName(car).newInstance();
    }

    public static Benz createBenzCar(String car) throws Exception {
        return (Benz) Class.forName(car).newInstance();
    }
}
