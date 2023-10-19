package product_entities;

import labour_entities.Employee;
import labour_entities.Worker;

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

    private String name;
    private double saldo;
    private ArrayList<Employee> employees = new ArrayList<>();
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

}
