public class Berries extends Fruits {
    public Berries(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public String toString() {
        return "Berries{name='" + getName() + "', quantity=" + getQuantity() + "}";
    }
}
