package product_entities;

import labour_entities.Employee;
import labour_entities.Worker;
import product_entities.components_entities.Component;
import product_entities.components_entities.Electronics;
import product_entities.supplier_entities.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Montadora {

    public Montadora(String name, double saldo){
        this.name = name;
        this.saldo = saldo;
    }

    private TireSupplier tires;
    private EngineSupplier engines;
    private ElectronicsSupplier eletronics;
    private SCSupplier smallComps;

    private String name;
    private double saldo;
    private static ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Car> carros = new ArrayList<Car>();

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Car> getCarros() {
        return carros;
    }

    public void comprarPecas(int quantidade){
        
    }
    public void test(Car carro){
        if(eletronics != null){
            System.out.println(eletronics.getComponent().getStock());
            System.out.println(carro.getElectronicsCount()<eletronics.getComponent().getStock());
        }
        else{
            System.out.println("Passou");
        }
    }

    public void buyTires(int quantity){
        if(tires != null){
            if(tires.getComponent().getPrice()*quantity>saldo){
                return;
            }
            else{
                tires.buyComponent(quantity, this.saldo);
                decreaseSaldo(tires.getComponent().getPrice()*quantity);
            }
        }
    }
    public void buyElectronics(int quantity){
        if(eletronics != null){
            if(eletronics.getComponent().getPrice()*quantity>saldo){
                return;
            }
            else{
                eletronics.buyComponent(quantity, this.saldo);
                decreaseSaldo(eletronics.getComponent().getPrice()*quantity);
            }
        }
    }
    public void buySmallComp(int quantity){
        if(smallComps != null){
            if(smallComps.getComponent().getPrice()*quantity>saldo){
                return;
            }
            else{
                smallComps.buyComponent(quantity, this.saldo);
                decreaseSaldo(smallComps.getComponent().getPrice()*quantity);
            }
        }
    }
    public void buyEngine(int quantity){
        if(engines != null){
            if(engines.getComponent().getPrice()*quantity>saldo){
                return;
            }
            else{
                engines.buyComponent(quantity, this.saldo);
                decreaseSaldo(engines.getComponent().getPrice()*quantity);
            }
        }
    }

    public void makeCar(int quantity, Car carro){
        if(carro.getPrice()* quantity > saldo){
            return;
        }
        else {
            if (tires != null && eletronics != null && engines != null && smallComps != null) {
                if(tires.getComponent().getStock() > carro.getTireCount() && engines.getComponent().getStock() > carro.getEngineCount() && smallComps.getComponent().getStock() > carro.getScCompCount() && eletronics.getComponent().getStock() > carro.getElectronicsCount()) {
                    for (int i = 0; i < quantity; i++) {
                        tires.getComponent().deductStock(carro.getTireCount());
                        engines.getComponent().deductStock(carro.getEngineCount());
                        eletronics.getComponent().deductStock(carro.getElectronicsCount());
                        smallComps.getComponent().deductStock(carro.getScCompCount());

                        saldo -= carro.getPrice();
                        carros.add(carro);
                    }
                }else{
                    System.out.println("sem estoque");
                }
            }else {
                System.out.println("sem supplier");
            }
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

    public void writeEmployee(String name, String password, String login, String dateOfBirth, String gender){
        Employee employee;

        String NOME_ARQUIVO = "./src/application/funcionarios.csv";
        String SEPARADOR = ",";
        List<List<String>> tabela = new ArrayList<>();
        try
        {
            FileWriter arquivo = new FileWriter(NOME_ARQUIVO, true);

            arquivo.write("\n"+name + "," + password + "," + login + "," + dateOfBirth+ "," +gender);

            arquivo.flush();
            arquivo.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void readEmployees(){
        employees.clear();
        String NOME_ARQUIVO = "./src/application/funcionarios.csv";
        String SEPARADOR = ",";
        List<List<String>> tabela = new ArrayList<>();
        try
        { 
            
            FileReader arquivo = new FileReader(NOME_ARQUIVO);
            BufferedReader buffer = new BufferedReader(arquivo);

            String cabecalho = buffer.readLine();
            while (buffer.ready()){
                String linha = buffer.readLine();
                String[] tokens = linha.split(SEPARADOR);
                List<String> registro = Arrays.asList(tokens);
                tabela.add(registro);
                Employee funcionario = new Worker(registro.get(0),registro.get(1),registro.get(2),registro.get(3),registro.get(4));
                employees.add(funcionario);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void hireSupplier(TireSupplier tires){
        this.tires = tires;
    }
    public void hireSupplier(EngineSupplier engine){
        this.engines = engine;
    }
    public void hireSupplier(SCSupplier smallC){
        this.smallComps = smallC;
    }
    public void hireSupplier(ElectronicsSupplier eletronics){
        this.eletronics = eletronics;
    }

    public int checkStockPart(Component component){
        return component.getStock();
    }

    public TireSupplier getTires() {
        return tires;
    }

    public EngineSupplier getEngines() {
        return engines;
    }

    public ElectronicsSupplier getEletronics() {
        return eletronics;
    }

    public SCSupplier getSmallComps() {
        return smallComps;
    }

    public void decreaseSaldo(double valor) {
        this.saldo -= valor;
    }

    public static ArrayList<Employee> getEmployees() {
        return Montadora.employees;
    }
}