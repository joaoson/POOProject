package product_entities.components_entities;

public abstract class Component {
    private static double finalPrice;
    protected static String name;
    protected double price;
    protected static int stock;

    public Component(String nome, double price) {
        name = nome;
        finalPrice = price;
        this.price = price;
        stock += 1;
    }

    public Component() {
        this.price = finalPrice;
        stock += 1;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getStock() {
        return stock;
    }
}
