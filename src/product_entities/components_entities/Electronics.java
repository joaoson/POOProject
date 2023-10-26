package product_entities.components_entities;

public class Electronics extends Component{

    protected static String name;
    protected static double price;

    private static int stockEletronic;

    public Electronics(String name, double price) {
        Electronics.name = name;
        Electronics.price = price;
        Electronics.stockEletronic +=1;
    }

    public Electronics() {
        Electronics.stockEletronic +=1;
    }
    public static int getStock() {
        return Electronics.stockEletronic;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
