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

    protected int tireCount = 5;
    protected int scCompCount;
    protected int engineCount = 1;
    protected int electronicsCount;

    protected Random random = new Random();

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

    public int getTireCount() {
        return tireCount;
    }

    public int getScCompCount() {
        return scCompCount;
    }

    public int getEngineCount() {
        return engineCount;
    }

    public int getElectronicsCount() {
        return electronicsCount;
    }
}
