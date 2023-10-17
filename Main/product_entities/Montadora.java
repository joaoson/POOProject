package Main.product_entities;

import Main.labour_entities.Employee;

import java.util.ArrayList;

public class Montadora {

    public Montadora(String name,double saldo){
        this.name = name;
        this.saldo = saldo;
    }

    private String name;
    private double saldo;
    private ArrayList<Employee> employees;
    private ArrayList<Car> carros = new ArrayList<Car>();

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Car> getCarros() {
        return carros;
    }

    public void comprarPecas(int quantidade){
        
    }

    public void makeCar(int quantity, Car carro){
        if(carro.getPrice()* quantity > saldo){
            return;
        }
        for (int i = 0; i < quantity; i++) {
            saldo -= carro.getPrice();
            carros.add(carro);
        }
    }

    public void sellCar(int quantity){
        if(quantity > carros.size()){
            return;
        }
        for(int i = quantity - 1; i >= 0; i--) {
            saldo += carros.get(i).getPrice();
            carros.remove(carros.get(i));
        }
    }

    public void writeEmployee(){
        Employee employee;


    }
}
