package product_entities;

import labour_entities.Employee;
import labour_entities.Worker;
import product_entities.components_entities.Component;
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
        updateMontadoraSuppliers();
        System.out.println(Montadora.getEletronics());
        updateMontadoraVariables();
    }

    private static TireSupplier tires;
    private static EngineSupplier engines;
    private static ElectronicsSupplier eletronics;
    private static SCSupplier smallComps;

    private static String name;
    private static double saldo;
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
    public static boolean buyTires(int quantity){
        if(tires != null){
            if(tires.getComponent().getPrice()*quantity>saldo){
                return false;
            }
            else{
                tires.buyComponent(quantity, Montadora.saldo);
                decreaseSaldo(tires.getComponent().getPrice()*quantity);
                updateMontadoraVariables();
                return true;
            }
        }
        return false;
    }
    public static boolean buyElectronics(int quantity){
        if(eletronics != null){
            if(eletronics.getComponent().getPrice()*quantity>saldo){
                return false;
            }
            else{
                eletronics.buyComponent(quantity, Montadora.saldo);
                decreaseSaldo(eletronics.getComponent().getPrice()*quantity);
                updateMontadoraVariables();
                return true;
            }
        }
        return false;
    }
    public static boolean buySmallComp(int quantity){
        if(smallComps != null){
            if(smallComps.getComponent().getPrice()*quantity>saldo){
                return false;
            }
            else{
                smallComps.buyComponent(quantity, Montadora.saldo);
                decreaseSaldo(smallComps.getComponent().getPrice()*quantity);
                updateMontadoraVariables();
                return true;
            }
        }
        return false;
    }
    public static boolean buyEngine(int quantity){
        if(engines != null){
            if(engines.getComponent().getPrice()*quantity>saldo){
                return false;
            }
            else{
                engines.buyComponent(quantity, Montadora.saldo);
                decreaseSaldo(engines.getComponent().getPrice()*quantity);
                updateMontadoraVariables();
                return true;
            }
        }
        return false;
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
                        updateMontadoraVariables();
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
            updateMontadoraVariables();
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

    public static void readEmployees(){
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

    public static void hireSupplier(TireSupplier tires){
        Montadora.tires = tires;
    }
    public static void hireSupplier(EngineSupplier engine){Montadora.engines = engine;}
    public static void hireSupplier(SCSupplier smallC){
        Montadora.smallComps = smallC;
    }
    public static void hireSupplier(ElectronicsSupplier eletronics){
        Montadora.eletronics = eletronics;
    }

    public int checkStockPart(Component component){
        return component.getStock();
    }

    public static TireSupplier getTires() {
        return Montadora.tires;
    }

    public static EngineSupplier getEngines() {
        return Montadora.engines;
    }

    public static ElectronicsSupplier getEletronics() {
        return Montadora.eletronics;
    }

    public static SCSupplier getSmallComps() {
        return Montadora.smallComps;
    }

    public static void decreaseSaldo(double valor) {
        Montadora.saldo -= valor;
    }

    public static ArrayList<Employee> getEmployees() {
        return Montadora.employees;
    }

    public static String getName() {
        return Montadora.name;
    }

    public static void updateMontadoraVariables(){

        String NOME_ARQUIVO = "./src/application/montadoraData.csv";
        String SEPARADOR = ",";
        try
        {
            FileWriter arquivo = new FileWriter(NOME_ARQUIVO);

            arquivo.write(Montadora.name + "," + Montadora.saldo );

            arquivo.flush();
            arquivo.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void updateMontadoraSuppliers(){

        String NOME_ARQUIVO = "./src/application/suppliers.csv";
        String SEPARADOR = ",";
        try
        {
            FileReader arquivo = new FileReader(NOME_ARQUIVO);
            BufferedReader buffer = new BufferedReader(arquivo);
            List<String> values = new ArrayList<>();
            List<String> names = new ArrayList<>();

            String cabecalho = buffer.readLine();
            String[] tokens1 = cabecalho.split(SEPARADOR);
            names = Arrays.asList(tokens1);
            while (buffer.ready()){
                String linha = buffer.readLine();
                String[] tokens = linha.split(SEPARADOR);
                values = Arrays.asList(tokens);


            }
            hireSupplier(new ElectronicsSupplier(names.get(0),Integer.valueOf(values.get(0))));
            hireSupplier(new EngineSupplier(names.get(1),Integer.valueOf(values.get(1))));
            hireSupplier(new TireSupplier(names.get(2),Integer.valueOf(values.get(2))));
            hireSupplier(new SCSupplier(names.get(3),Integer.valueOf(values.get(3))));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}