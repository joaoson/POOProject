package product_entities;

public class SUV extends Car{
    private static double finalPrice;
    private String name = "Sport";
    private double weight = 975;

    protected int scCompCount = 50;
    protected int electronicsCount = 60;

    public SUV(double price){
        this.finalPrice = price;
        this.price = price;
        this.chassi = random.nextInt(0,10000);
    }

    public SUV(){
        this.price = finalPrice;
        this.chassi = random.nextInt(0,10000);
    }

}
