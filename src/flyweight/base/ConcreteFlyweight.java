package flyweight.base;

/**
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-27
 * @Time: 22:59
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体Flyweight: " + extrinsicState);
    }
}
