public class Apple extends Fruits {
    public Apple(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public String toString() {
        return "Apple{name='" + getName() + "', quantity=" + getQuantity() + "}";
    }
}