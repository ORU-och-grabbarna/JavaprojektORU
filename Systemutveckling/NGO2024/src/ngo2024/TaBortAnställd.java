/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * This class represents the user interface for deleting an employee from the
 * system. The form allows an administrator to input the first name and last
 * name of an employee, and upon clicking the "OK" button, the employee's record
 * will be deleted from the database. If the employee is an admin, their record
 * will be removed from both the "admin" and "anstalld" tables. If the employee
 * is a handläggare , their record will be removed from both the "handlaggare"
 * and "anstalld" tables.
 *
 * The class interacts with a database (InfDB) to perform the necessary delete
 * operations.
 *
 * @author Mohammed
 */
public class TaBortAnställd extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates a new TaBortAnställd frame. Initializes the components and sets
     * up the database connection.
     *
     * @param idb The InfDB instance to be used for database operations.
     */
    public TaBortAnställd(InfDB idb) {
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
        tfFörnamn = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        lblFörnamn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfEfternamn = new javax.swing.JTextField();
        lblSuccess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ta bort anställd");

        tfFörnamn.setColumns(20);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lblFörnamn.setText("Förnamn");

        jLabel2.setText("Efternamn");

        tfEfternamn.setColumns(20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addGap(32, 32, 32)
                        .addComponent(lblSuccess))
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFörnamn)
                            .addGap(27, 27, 27)
                            .addComponent(tfFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFörnamn))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(lblSuccess))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /**
     * Event handler for when the OK button is clicked. It retrieves the first
     * name and last name from the text fields and attempts to delete the
     * employee from the database. The method also checks if the employee is an
     * admin or a handläggare and deletes the appropriate records.
     *
     * If the deletion is successful, a success message is displayed. If there
     * is an error, a failure message is shown instead.
     *
     * @param evt The event that triggered this action (button click).
     */
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:

        // gör en delete där du använder namnet
        String fNamn = tfFörnamn.getText();
        String eNamn = tfEfternamn.getText();

        // behöver göra olika under frågor beroende på om det är en handläggare eller admin
        // se om det är handläggare eller admin
        try {
            String selectAid = "SELECT aid FROM anstalld where fornamn = '" + fNamn + "'" + "AND efternamn = '" + eNamn + "'";
            String aid = idb.fetchSingle(selectAid);
            String deleteAnstalld = "DELETE FROM anstalld WHERE aid =" + "'" + aid + "'";
            String deleteAnsProj = "DELETE FROM ans_proj WHERE aid =" + "'" + aid + "'";
            String deleteHandlaggare = "DELETE FROM handlaggare WHERE aid =" + "'" + aid + "'";
            String nullMentor = "UPDATE handlaggare SET mentor = NULL WHERE mentor = '" + aid + "'";
            String nullProjektChef = "UPDATE projekt SET projektchef = NULL WHERE projektchef = '" + aid + "'";
            String nullAvdelning = "UPDATE avdelning SET chef = NULL WHERE chef = '" + aid + "'";

            String selectAdmin = "SELECT behorighetsniva FROM admin WHERE aid = " + "'" + aid + "'";

            
            // Ta bort/Sätt till null där aid förekommer som främmande nyckel
            try {
                idb.update(nullMentor);
            } catch (InfException e) {
                lblSuccess.setText("Kunde inte ta bort handläggare som mentor");
            }

            try {
                idb.update(nullProjektChef);
            } catch (InfException e) {
                lblSuccess.setText("Kunde inte ta bort handläggare som projektchef");
            }
            try {
                idb.delete(deleteAnsProj);
            } catch (InfException e) {
                lblSuccess.setText("Kunde inte radera från ans_proj i databasen");
            }
            try{
                idb.update(nullAvdelning);
            }catch (InfException e){
                lblSuccess.setText("Kunde inte ta bort anställd som avdelningschef");
            }

            String behörighetsnivå = idb.fetchSingle(selectAdmin);

            // for admin:
            if (behörighetsnivå != null) {
                String deleteAdmin = "DELETE FROM admin WHERE aid =" + "'" + aid + "'";

                try {
                    idb.delete(deleteAdmin);
                } catch (InfException e) {
                    lblSuccess.setText("Kunde inte ta bort admin");
                }

            } else {
                try {
                    idb.delete(deleteHandlaggare);
                } catch (InfException e) {
                    lblSuccess.setText("Kunde inte ta bort handläggare");
                }

            }

            try {
                idb.delete(deleteAnstalld);
                lblSuccess.setText("Operationen lyckades");
            } catch (InfException e) {
                lblSuccess.setText("Kunde inte ta bort admin som anställd");
            }

            

        } catch (InfException e) {
            // fel medelleande här
            lblSuccess.setText("Operationen misslyckades");
        }


    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(TaBortAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TaBortAnställd(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFörnamn;
    private javax.swing.JLabel lblSuccess;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFörnamn;
    // End of variables declaration//GEN-END:variables
}
