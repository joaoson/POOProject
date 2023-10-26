package product_entities.supplier_entities;

import product_entities.components_entities.Component;

public abstract class Supplier {

    public abstract double buyComponent(int quantity, double saldo);

    public abstract Component getComponent();

}
