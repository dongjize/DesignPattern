package factoryMethod;

/*
 * Description: concrete product
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:08
 */
public class Bmw extends Car {

    public Bmw() {
        this.name = "bmw";
    }

    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------");
    }
}
