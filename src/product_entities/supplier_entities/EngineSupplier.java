package product_entities.supplier_entities;

import product_entities.components_entities.Component;
import product_entities.components_entities.*;

public class EngineSupplier extends Supplier{

    private Engine engine;
    public EngineSupplier(String nameComponent, double priceComponent) {
        engine = new Engine(nameComponent,priceComponent);
    }

    public double buyComponent(int quantity, double saldo){
        if(saldo < quantity*engine.getPrice()){
            return 0;
        }else {
            for (int i = 0; i < quantity; i++) {
                Engine engine = new Engine();
            }
            return engine.getPrice()*quantity;
        }
    }
    public Engine getComponent() {
        return engine;
    }

}
