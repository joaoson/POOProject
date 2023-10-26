package application;

import product_entities.Car;
import product_entities.Montadora;
import product_entities.SUV;
import product_entities.Sedan;
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
        Montadora montadora = new Montadora("Renault",200000);
        montadora.makeCar(20,new SUV(200));
        montadora.sellCar(10);
        montadora.sellCar(10);

        montadora.hireSupplier(new ElectronicsSupplier("Electronic",200));
        montadora.hireSupplier(new SCSupplier("SmallComp",200));
        montadora.hireSupplier(new TireSupplier("TireSupplier",200));
        montadora.hireSupplier(new EngineSupplier("EngineSupplier",200));

        double compra6 = montadora.getEletronics().buyComponent(20,50000);
        montadora.test(new SUV(200));
        montadora.makeCar(2,new SUV(200));


        montadora.writeEmployee("Joao Ricardo","1234","JoaoRic","19/10/2001","Homem");
        montadora.readEmployees();

        montadora.hireSupplier(new TireSupplier("pneu",20));
        montadora.hireSupplier(new EngineSupplier("motor",200));
        double compra = montadora.getTires().buyComponent(20,50000);
        double compra2 = montadora.getEngines().buyComponent(30,50000);

        System.out.println(montadora.getSaldo());
        montadora.decreaseSaldo(compra);
        montadora.decreaseSaldo(compra2);
        System.out.println(montadora.getSaldo());
        double compra3 = montadora.getSmallComps().buyComponent(5,50000);
        double compra4 = montadora.getEletronics().buyComponent(12,50000);
        System.out.println(montadora.getTires().getComponent().getStock());
        System.out.println(montadora.getEngines().getComponent().getStock());
        System.out.println(montadora.getSmallComps().getComponent().getStock());
        System.out.println(montadora.getEletronics().getComponent().getStock());

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
        for (List<String> tabela1 : tabela) {
            System.out.println(tabela1);
            if(jTextField1.getText().equals(tabela1.get(2)) && jTextField2.getText().equals(tabela1.get(1))&& tabela1.get(5).equals("CEO")){
                ManagerDashboard loggedinManager = new ManagerDashboard();
                loggedinManager.show();
                dispose();
            }
        }
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
