package application;

import product_entities.Montadora;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Vector;

    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
     */

    /**
     *
     * @author Felpi
     */
    public class ManagerDashboard extends javax.swing.JFrame {


        /**
         * Creates new form ManagerDashboard
         */
        public ManagerDashboard() {
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jPanel3 = new javax.swing.JPanel();
            carModel = new javax.swing.JLabel();
            quantityText = new javax.swing.JTextField();
            quantity = new javax.swing.JLabel();
            carModelText = new javax.swing.JTextField();
            btnClear = new javax.swing.JButton();
            btnSend = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            tableOrders = new javax.swing.JTable();
            carMade = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            setTitle("Manager Dashboard");
            setMinimumSize(new java.awt.Dimension(1003, 674));
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    formWindowClosing(evt);
                }
                public void windowOpened(java.awt.event.WindowEvent evt) {
                    formWindowOpened(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Orders");

            jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "New Order\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
            jPanel3.setOpaque(false);

            carModel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            carModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            carModel.setText("Car model:");

            quantityText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            quantityText.setAlignmentX(0.1F);
            quantityText.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    quantityTextActionPerformed(evt);
                }
            });

            quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            quantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            quantity.setText("Quantity:");
            quantity.setToolTipText("");

            carModelText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            carModelText.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    carModelTextActionPerformed(evt);
                }
            });

            btnClear.setText("Clear");
            btnClear.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnClearActionPerformed(evt);
                }
            });

            btnSend.setText("Send");
            btnSend.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSendActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carModel)
                                            .addComponent(quantity, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(quantityText, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                                            .addComponent(carModelText))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(16, 16, 16))
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(carModel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carModelText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSend))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            tableOrders.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                    },
                    new String [] {
                            "Car Model", "Quantity", "Worker", "Cost"
                    }
            ));
            jScrollPane1.setViewportView(tableOrders);

            carMade.setText("Car Made");
            carMade.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    carMadeActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jScrollPane1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(carMade)
                                                    .addGap(12, 12, 12))))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carMade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );

            pack();
        }// </editor-fold>

        private void quantityTextActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void carModelTextActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
            carModelText.setText("");
            quantityText.setText("");
        }

        private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {
            String carModel = carModelText.getText();
            String quantity = quantityText.getText();

            Random random = new Random();
            if(Montadora.getEmployees().size() != 0){
                int numero = random.nextInt(0, Montadora.getEmployees().size());
                System.out.println(numero);
            }

            System.out.println(Montadora.getEmployees().size());

            if (carModel.isEmpty() || quantity.isEmpty()){
                JOptionPane.showMessageDialog(this,
                        "Please enter all fields",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
                model.addRow(new Object [] {carModel, quantity});

                carModelText.setText("");
                quantityText.setText("");
            }
        }

        private void carMadeActionPerformed(java.awt.event.ActionEvent evt) {
            int row = tableOrders.getSelectedRow();

            if (row < 0) {
                JOptionPane.showMessageDialog (this,
                        "No row is selected! Please select one row.",
                        "Select row.",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel model = (DefaultTableModel) tableOrders.getModel ();
                model.removeRow(row);
            }
            System.out.println("OI");
        }

        private void formWindowClosing(java.awt.event.WindowEvent evt) {
            System.out.println("rodou");
            dispose();
            DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
            Vector <Vector> tableData = model.getDataVector();

            //Saving of object in a file
            try {
                FileOutputStream file = new FileOutputStream("file.bin");
                ObjectOutputStream output = new ObjectOutputStream (file);

                //Method for serialization of object
                output.writeObject(tableData);

                output.close();
                file.close();
            } catch (Exception ex) {
                ex.printStackTrace();

            }
        }

        private void formWindowOpened(java.awt.event.WindowEvent evt) {
            try {
                FileInputStream file = new FileInputStream("file.bin");
                ObjectInputStream input = new ObjectInputStream (file);

                //Method for serialization of object
                Vector <Vector> tableData = (Vector<Vector>)input.readObject();

                input.close();
                file.close();

                DefaultTableModel model = (DefaultTableModel)tableOrders.getModel();
                for (int i = 0; i < tableData.size(); i++){
                    Vector row = tableData.get(i);
                    model.addRow(new Object[] {row.get(0), row.get(1)});
                }
            } catch (Exception ex) {
                ex.printStackTrace();

            }
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ManagerDashboard().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton btnClear;
        private javax.swing.JButton btnSend;
        private javax.swing.JButton carMade;
        private javax.swing.JLabel carModel;
        private javax.swing.JTextField carModelText;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel quantity;
        private javax.swing.JTextField quantityText;
        private javax.swing.JTable tableOrders;
        // End of variables declaration
    }


