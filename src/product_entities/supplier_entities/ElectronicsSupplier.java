package product_entities.supplier_entities;

import product_entities.components_entities.Component;
import product_entities.components_entities.Electronics;

public class ElectronicsSupplier extends Supplier{
    private Electronics electronic;
    public ElectronicsSupplier(String nameComponent, double priceComponent) {
        electronic = new Electronics(nameComponent,priceComponent);
    }

    public double buyComponent(int quantity, double saldo){
        if(saldo < quantity*electronic.getPrice()){
            return 0;
        }else {
            for (int i = 0; i < quantity; i++) {
                Electronics Electronic = new Electronics();
            }
            return electronic.getPrice()*quantity;
        }
    }

    public Electronics getComponent() {
        return electronic;
    }
}
