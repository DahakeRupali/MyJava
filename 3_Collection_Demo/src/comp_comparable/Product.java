package comp_comparable;

public class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Sort by price (natural order)
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}

