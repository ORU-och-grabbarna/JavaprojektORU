/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Mohammed
 */
public class AdminAnställda extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form AdminAnställda
     */
    public AdminAnställda(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();
        läggTillAdmin = new javax.swing.JButton();
        läggTillHand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Anställda");

        taBort.setText("Ta bort anställd");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        läggTillAdmin.setText("Lägg till Admin");
        läggTillAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggTillAdminActionPerformed(evt);
            }
        });

        läggTillHand.setText("Lägg till handläggare");
        läggTillHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggTillHandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(läggTillAdmin)
                        .addGap(56, 56, 56)
                        .addComponent(läggTillHand))
                    .addComponent(taBort)
                    .addComponent(jLabel1))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(läggTillAdmin)
                    .addComponent(läggTillHand))
                .addGap(48, 48, 48)
                .addComponent(taBort)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Opens the "TaBortAnställd" window to remove an employee.
     *
     * @param evt the action event triggered by the user interaction.
     */
    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        new TaBortAnställd(idb).setVisible(true);
    }//GEN-LAST:event_taBortActionPerformed
    /**
     * Opens the "LäggTillAdmin" window to add a new admin.
     *
     * @param evt the action event triggered by the user interaction.
     */
    private void läggTillAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggTillAdminActionPerformed
        new LäggTillAdmin(idb).setVisible(true);
    }//GEN-LAST:event_läggTillAdminActionPerformed
    /**
     * Opens the "LäggTillHandläggare" window to add a new case officer.
     *
     * @param evt the action event triggered by the user interaction.
     */
    private void läggTillHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggTillHandActionPerformed
        new LäggTillHandläggare(idb).setVisible(true);
    }//GEN-LAST:event_läggTillHandActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminAnställda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton läggTillAdmin;
    private javax.swing.JButton läggTillHand;
    private javax.swing.JButton taBort;
    // End of variables declaration//GEN-END:variables
}
