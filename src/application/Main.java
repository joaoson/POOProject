package application;

import product_entities.*;
import product_entities.supplier_entities.ElectronicsSupplier;
import product_entities.supplier_entities.EngineSupplier;
import product_entities.supplier_entities.SCSupplier;
import product_entities.supplier_entities.TireSupplier;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends JFrame {


    public static void main(String[] args) {
        List<String> data = Main.readValues();
        Montadora montadora = new Montadora(data.get(0),Double.parseDouble(data.get(1)));
        montadora.readEmployees();
        montadora.makeCar(20,new SUV(200));
        montadora.makeCar(10,new Sedan(100));
        montadora.makeCar(10,new Sport(300));
        montadora.sellCar(10);
        montadora.sellCar(10);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        String NOME_ARQUIVO = "./src/application/funcionarios.csv";
        String SEPARADOR = ",";
        try
        {
            FileReader arquivo = new FileReader(NOME_ARQUIVO);
            BufferedReader buffer = new BufferedReader(arquivo);

            String cabecalho = buffer.readLine();
            while (buffer.ready()){
                String linha = buffer.readLine();
                String[] tokens = linha.split(SEPARADOR);
                System.out.println(Arrays.toString(tokens));
                List<String> registro = Arrays.asList(tokens);
                tabela.add(registro);
            }
            System.out.println(arquivo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

    public Main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel4 = new JLabel();
        jButton1 = new JButton();
        jLabel5 = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jTextField2 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Digite sua senha:");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to ManagerPro");

        jLabel2.setText("The Software responsible for managing all areas of your Car Manufacturing Company ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite o seu Login:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(104, 104, 104)
                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean loggedinManager = false;
        boolean loggedinWorker = false;
        boolean wrongPassword = false;
        for (List<String> tabela1 : tabela) {
             if(jTextField1.getText().equals(tabela1.get(2)) && jTextField2.getText().equals(tabela1.get(1)) && (tabela1.get(5).equals("CEO") || tabela1.get(5).equals("Manager")) ){
                loggedinManager = true;
            } else if (jTextField1.getText().equals(tabela1.get(2)) && jTextField2.getText().equals(tabela1.get(1)) && tabela1.get(5).equals("Worker")){
                 loggedinWorker = true;
            } else if (jTextField1.getText().equals(tabela1.get(2))){
                wrongPassword = true;
            }
        }
        if(loggedinManager == true){
            MainInterface loggedinManagerInt = new MainInterface();
            loggedinManagerInt.show();
            dispose();
        } else if (loggedinWorker == true) {
            
        } else if (wrongPassword == true) {
            JOptionPane.showMessageDialog(this,
                    "Incorrect password, please try again.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "User not registered, please try using different login credentials",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static List<String> readValues(){
        String NOME_ARQUIVO = "./src/application/montadoraData.csv";
        String SEPARADOR = ",";
        try
        {
            FileReader arquivo = new FileReader(NOME_ARQUIVO);
            BufferedReader buffer = new BufferedReader(arquivo);

            String Data = buffer.readLine();
            String[] tokens = Data.split(SEPARADOR);
            List<String> registro = Arrays.asList(tokens);

            System.out.println(registro);
            return registro;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private static List<List<String>> tabela = new ArrayList<>();
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField jTextField1;
    private JTextField jTextField2;
    // End of variables declaration

}
