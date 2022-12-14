/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormClient;

import controller.ClientController;
import domain.Account;
import domain.Client;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import models.TableModelAccounts;

/**
 *
 * @author Ana
 */
public class AccountTransfer extends javax.swing.JDialog {

    /**
     * Creates new form AccountTransfer
     */
    Client c1;
    Client c2;
    double amount;

    public AccountTransfer(JDialog parent, boolean modal, Client c1, Client c2, double amount) {

        super(parent, modal);
        initComponents();
        this.c1 = c1;
        this.c2 = c2;
        this.amount = amount;
        setLocationRelativeTo(null);
        lblName1.setText(c1.getName());
        lblName2.setText(c2.getName());
        lblLastname1.setText(c1.getLastname());
        lblLastname2.setText(c2.getLastname());
        tblAcc1.setModel(new TableModelAccounts(c1));
        tblAcc2.setModel(new TableModelAccounts(c2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName1 = new javax.swing.JLabel();
        lblLastname1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcc1 = new javax.swing.JTable();
        lblName2 = new javax.swing.JLabel();
        lblLastname2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAcc2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnConfirmTransfer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblName1.setText("jLabel1");

        lblLastname1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblLastname1.setText("jLabel2");

        tblAcc1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAcc1);

        lblName2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblName2.setText("jLabel3");

        lblLastname2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblLastname2.setText("jLabel4");

        tblAcc2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAcc2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText(" Please select the accounts from which you want to make the transfer");

        btnConfirmTransfer.setText("Confirm transfer");
        btnConfirmTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmTransferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName1)
                                .addGap(18, 18, 18)
                                .addComponent(lblLastname1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName2)
                                .addGap(43, 43, 43)
                                .addComponent(lblLastname2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(btnConfirmTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(lblLastname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(lblLastname2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnConfirmTransfer)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmTransferActionPerformed
        int row1 = tblAcc1.getSelectedRow();
        int row2 = tblAcc2.getSelectedRow();
        if (row1 >= 0 && row2 >= 0) {
            Account a1 = ((TableModelAccounts) tblAcc1.getModel()).getSelectedAccount(row1);
            Account a2 = ((TableModelAccounts) tblAcc2.getModel()).getSelectedAccount(row2);

            String sc1 = a1.getCurrency();
            String s1 = sc1.substring(sc1.indexOf(" ") + 1);
            s1.trim();

            String sc2 = a2.getCurrency();
            String s2 = sc2.substring(sc2.indexOf(" ") + 1);
            s2.trim();

            if (!(s1.equals(s2))) {
                JOptionPane.showMessageDialog(this, "Currencies do not match");
                return;
            }

            // to
            double newAmount2 = a2.getDepositedAmount() + amount;

            if (newAmount2 > a2.getCardLimit()) {
                JOptionPane.showMessageDialog(this, "You have exceeded the limit");
                return;
            }
            
           

            a2.setDepositedAmount(newAmount2);
            
            // from
            if (amount > 10000) {
                amount = amount + amount * 0.01;
            }

            double newAmount = a1.getDepositedAmount() - amount;

            if (newAmount > a1.getDepositedAmount() || newAmount < 0) {
                JOptionPane.showMessageDialog(this, "You cannot withdraw this amount of money");
                return;
            }

            a1.setDepositedAmount(newAmount);

            

            try {
                ClientController.getInstance().updateAccount(a1);
                ClientController.getInstance().updateAccount(a2);

                JOptionPane.showMessageDialog(this, "Successfully transferred " + amount + " " + s1 + " from "
                        + c1.getName() + " " + c1.getLastname() + "  to account " + c2.getName() + " " + c2.getLastname() + " . ");
                this.dispose();

            } catch (Exception ex) {
                Logger.getLogger(AccountTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnConfirmTransferActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmTransfer;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLastname1;
    private javax.swing.JLabel lblLastname2;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTable tblAcc1;
    private javax.swing.JTable tblAcc2;
    // End of variables declaration//GEN-END:variables
}
