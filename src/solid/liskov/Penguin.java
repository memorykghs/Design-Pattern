package solid.liskov;

/**
 * @author memorykghs
 * @date 2024/12/14
 */
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin can't fly.");
    }

    public void swim() {
        System.out.println("Penguins swim.");
    }
}
