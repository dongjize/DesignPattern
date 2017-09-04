package factoryMethod;

/*
 * Description: abstract product
 *
 * @Author: dong
 * @Date: 2017-08-15
 * @Time: 14:04
 */
public abstract class Car {
    protected String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
