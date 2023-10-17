package Main.application;
import Main.product_entities.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {


    public static void main(String[] args) {
        Car carro = new Sedan(313);
        Car joao = new Sedan();
        System.out.println(joao.getPrice());
        System.out.println(joao.getChassi());
        System.out.println(carro.getChassi());
        Montadora montadora = new Montadora("Renault",200000);
        montadora.makeCar(20,carro);
        System.out.println(montadora.getCarros().size());
        System.out.println(montadora.getSaldo());
        montadora.sellCar(10);
        System.out.println(montadora.getCarros().size());
        System.out.println(montadora.getSaldo());
        System.out.println(montadora.getCarros());

        montadora.sellCar(10);
        System.out.println(montadora.getCarros().size());
        System.out.println(montadora.getSaldo());

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

        String NOME_ARQUIVO = "application/funcionarios.csv";
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

            jLabel4 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jLabel5 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jTextField1 = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            jTextField2 = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel4.setText("Digite sua senha:");

            jButton1.setText("Entrar");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel3))
                                                    .addGap(104, 104, 104)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(52, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1)
                                    .addContainerGap(53, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1.setText("");
            jLabel5.setText("oi");
        }

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }


        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        // End of variables declaration



}
