package product_entities;

import product_entities.components_entities.Component;

import java.util.ArrayList;
import java.util.Random;

public abstract class Car {

    protected String name;
    protected static double price;
    protected double weight;
    protected String color;
    protected int chassi;

    protected Component components;
    protected Random random = new Random();
    //protected ArrayList<Components> components;

    public String getName(){return name;}

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getChassi() {
        return chassi;
    }

    //public ArrayList<Components> getComponents() {
    //    return components;
    //}
}
