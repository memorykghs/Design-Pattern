/**
 * @author memorykghs
 * @date 2024/11/14
 */
public class SingleResponsibility {
    public static class BreadBakery {
        public void bake() {}
        public void getFlour() {}
    }

    public static class CustomerService {
        public void checkout() {}
        public void wrapped() {}
    }

    public static class Cleaning {
        public void washMold() {}
    }
}
