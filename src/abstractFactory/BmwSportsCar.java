package abstractFactory;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:39
 */
public class BmwSportsCar extends Bmw {
    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + "-----------------------");
    }
}
