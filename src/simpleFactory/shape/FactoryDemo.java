package simpleFactory.shape;
/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-08-04
 * @Time: 00:00
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
