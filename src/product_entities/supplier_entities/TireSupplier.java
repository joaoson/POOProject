package product_entities.supplier_entities;

import product_entities.components_entities.Component;
import product_entities.components_entities.Tire;

public class TireSupplier {
    private Component tire;
    public TireSupplier(String nameComponent, double priceComponent) {
        tire = new Tire(nameComponent,priceComponent);
    }

    public double buyComponent(int quantity, double saldo){
        if(saldo < quantity*tire.getPrice()){
            return 0;
        }else {
            for (int i = 0; i < quantity; i++) {
                Component tire = new Tire();
            }
            return tire.getPrice()*quantity;
        }
    }

}
