package decorator;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-03
 * @Time: 00:09
 */
public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Border color: Blue");
    }
}
