package decorator;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-02
 * @Time: 23:57
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
