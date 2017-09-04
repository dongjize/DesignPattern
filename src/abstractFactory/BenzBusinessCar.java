package abstractFactory;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:40
 */
public class BenzBusinessCar extends Benz {

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + "-----------------------");
    }
}
