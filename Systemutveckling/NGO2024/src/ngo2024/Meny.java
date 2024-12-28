/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author jamie
 */
public class Meny extends javax.swing.JFrame {
    
    private InfDB idb;
    private String inloggadAnvandare;
    
    

    /**
     * Creates new form Meny
     */
    public Meny(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        lblInloggadAnvandare.setText(inloggadAnvandare);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnPersoninfo = new javax.swing.JButton();
        BtnMinaprojekt = new javax.swing.JButton();
        BtnPersonal = new javax.swing.JButton();
        lblInloggadAnvandare = new javax.swing.JLabel();
        btnHallbarhetsmal = new javax.swing.JButton();
        btnPersonalPaAvdelning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtnPersoninfo.setText("Personinfo");
        BtnPersoninfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPersoninfoActionPerformed(evt);
            }
        });

        BtnMinaprojekt.setText(" Mina projekt");
        BtnMinaprojekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinaprojektActionPerformed(evt);
            }
        });

        BtnPersonal.setText("Min Avdelnings Projekt");
        BtnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPersonalActionPerformed(evt);
            }
        });

        lblInloggadAnvandare.setText("inloggadanvändare");

        btnHallbarhetsmal.setText("Hållbarhetsmål");
        btnHallbarhetsmal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallbarhetsmalActionPerformed(evt);
            }
        });

        btnPersonalPaAvdelning.setText("Personalen på min avdelning");
        btnPersonalPaAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalPaAvdelningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnPersoninfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnMinaprojekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHallbarhetsmal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPersonalPaAvdelning)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(BtnPersoninfo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BtnMinaprojekt)
                .addGap(18, 18, 18)
                .addComponent(BtnPersonal)
                .addGap(18, 18, 18)
                .addComponent(btnHallbarhetsmal)
                .addGap(27, 27, 27)
                .addComponent(btnPersonalPaAvdelning)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPersoninfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPersoninfoActionPerformed
       new Personinfo (idb, inloggadAnvandare).setVisible(true);
    }//GEN-LAST:event_BtnPersoninfoActionPerformed

    private void BtnMinaprojektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinaprojektActionPerformed
        new MinaprojektNy (idb,inloggadAnvandare).setVisible(true);
    }//GEN-LAST:event_BtnMinaprojektActionPerformed

    private void BtnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPersonalActionPerformed
        new MinAvdelningsprojekt (idb,inloggadAnvandare).setVisible(true);
    }//GEN-LAST:event_BtnPersonalActionPerformed

    private void btnHallbarhetsmalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallbarhetsmalActionPerformed
        Hållbarhetsmål målfönster = new Hållbarhetsmål (idb, inloggadAnvandare);
        målfönster.setVisible(true);
    }//GEN-LAST:event_btnHallbarhetsmalActionPerformed

    private void btnPersonalPaAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalPaAvdelningActionPerformed
        ListaPaPersonal personalfönster = new ListaPaPersonal (idb, inloggadAnvandare);
        personalfönster.setVisible(true);
    }//GEN-LAST:event_btnPersonalPaAvdelningActionPerformed

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
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Meny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMinaprojekt;
    private javax.swing.JButton BtnPersonal;
    private javax.swing.JButton BtnPersoninfo;
    private javax.swing.JButton btnHallbarhetsmal;
    private javax.swing.JButton btnPersonalPaAvdelning;
    private javax.swing.JLabel lblInloggadAnvandare;
    // End of variables declaration//GEN-END:variables
}
