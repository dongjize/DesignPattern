package factoryMethod;

/*
 * Description: Concrete factory
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:06
 */
public class BenzDriver implements Driver {

    @Override
    public Car createCar() {
        return new Benz();
    }
}
