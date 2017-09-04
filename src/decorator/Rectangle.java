package decorator;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-02
 * @Time: 23:56
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
