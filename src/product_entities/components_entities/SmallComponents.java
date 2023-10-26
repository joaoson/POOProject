package product_entities.components_entities;

public class SmallComponents extends Component{

    protected static String name;
    protected static double price;

    private static int stockSC;
    public SmallComponents(String name, double price) {
        SmallComponents.name = name;
        SmallComponents.price = price;
        SmallComponents.stockSC +=1;
    }

    public SmallComponents() {
        SmallComponents.stockSC +=1;
    }

    public static int getStock() {
        return SmallComponents.stockSC;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
