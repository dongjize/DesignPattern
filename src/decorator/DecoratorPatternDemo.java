package decorator;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-03
 * @Time: 00:02
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape blueRectabgle = new BlueShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        System.out.println("\nRectangle of blue border");
        blueRectabgle.draw();
    }
}
