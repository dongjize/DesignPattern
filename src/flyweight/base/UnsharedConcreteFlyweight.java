package flyweight.base;

/**
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-27
 * @Time: 23:00
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight: " + extrinsicState);
    }
}
