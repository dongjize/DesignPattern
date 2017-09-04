package decorator;

/*
 * Description: 
 *
 * @Author: dong
 * @Date: 2017-09-02
 * @Time: 23:57
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
