package factoryMethod;

/**
 * Description: concrete product
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:07
 */
public class Benz extends Car {
    public Benz() {
        this.name = "benz";
    }

    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------");
    }
}
