package Main.product_entities;

public class Sedan extends Car{
    private static double finalPrice;
    private String name = "Sedan";
    private double weight = 1200;

    public Sedan(double price){
        this.finalPrice = price;
        this.price = price;
        this.chassi = random.nextInt(0,10000);
    }

    public Sedan(){
        this.price = finalPrice;
        this.chassi = random.nextInt(0,10000);
    }

}
