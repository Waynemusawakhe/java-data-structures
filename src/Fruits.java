public abstract class Fruits implements Comparable<Fruits> {
    private String name;
    private int quantity;

    public Fruits(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " (quantity: " + quantity + ")";
    }

    @Override
    public int compareTo(Fruits other) {
        return Integer.compare(this.quantity, other.quantity);
    }
    
}
