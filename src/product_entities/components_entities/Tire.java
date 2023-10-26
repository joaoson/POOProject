package product_entities.components_entities;

public class Tire extends Component{
    protected static String name;
    protected static double price;

    private static int stockTire;
    public Tire(String name, double price) {
        Tire.name = name;
        Tire.price = price;
        Tire.stockTire +=1;
    }

    public Tire() {
        Tire.stockTire +=1;
    }

    public static int getStock() {
        return Tire.stockTire;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
