package product_entities;

public class Sport extends Car{
    private static double finalPrice;
    private String name = "Sport";
    private double weight = 975;

    public Sport(double price){
        this.finalPrice = price;
        this.price = price;
        this.chassi = random.nextInt(0,10000);
    }

    public Sport(){
        this.price = finalPrice;
        this.chassi = random.nextInt(0,10000);
    }

}
