package product_entities.components_entities;

public class Engine extends Component{

    protected static String name;
    protected static double price;

    private static int stockEngine;
    public Engine(String name, double price) {
        Engine.name = name;
        Engine.price = price;
        Engine.stockEngine +=1;
    }

    public Engine() {
        Engine.stockEngine += 1;
    }

    public static int getStock() {
        return Engine.stockEngine;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void deductStock(int quantidade){
        Engine.stockEngine -= quantidade;
    }

}
