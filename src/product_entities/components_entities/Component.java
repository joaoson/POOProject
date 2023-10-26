package product_entities.components_entities;

import product_entities.supplier_entities.EngineSupplier;

public abstract class Component {
    protected static String name;
    protected static double price;
    protected static int stock;

    public static int getStock(){
        return stock;
    }
}
