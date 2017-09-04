package factoryMethod;

/*
 * Description: Concrete factory
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:08
 */
public class BmwDriver implements Driver {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
