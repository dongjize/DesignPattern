package simpleFactory.car;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 13:28
 */
public class Benz extends Car {

    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------");
    }
}
