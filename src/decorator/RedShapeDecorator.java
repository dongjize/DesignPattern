package decorator;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-02
 * @Time: 23:58
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Border color: Red");
    }

}
