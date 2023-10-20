package product_entities.supplier_entities;
import product_entities.components_entities.Component;;
import product_entities.components_entities.SmallComponents;

public class SCSupplier extends Supplier{

    private Component smallComp;
    public SCSupplier(String nameComponent, double priceComponent) {
        smallComp = new SmallComponents(nameComponent,priceComponent);
    }

    public double buyComponent(int quantity, double saldo){
        if(saldo < quantity*smallComp.getPrice()){
            return 0;
        }else {
            for (int i = 0; i < quantity; i++) {
                Component smallComp = new SmallComponents();
            }
            return smallComp.getPrice()*quantity;
        }
    }
}