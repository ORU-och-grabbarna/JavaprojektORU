/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jamie
 */
public class ChefLäggTillPartner extends javax.swing.JFrame {
    
    
    private InfDB idb;
    private String inloggadAnvandare;

    /**
     * Creates new form ChefLäggTillPartner
     */
    public ChefLäggTillPartner(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        fyllEjKoppladeTabell();
        fyllKoppladeTabell();
    }
    
    
    
    
    private void fyllKoppladeTabell() {
        
        try {
            
            String sqlKopplade = "SELECT partner.namn, partner.telefon, partner.kontaktperson, partner.branch " +
                             "FROM partner " +
                             "JOIN projekt_partner ON partner.pid = projekt_partner.partner_pid " +
                             "JOIN projekt ON projekt_partner.pid = projekt.pid " +
                             "WHERE projekt.projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
            
            
            ArrayList <HashMap<String, String>> koppladePartners = idb.fetchRows(sqlKopplade);
            
            
            
            if (koppladePartners == null || koppladePartners.isEmpty()) {
                
                javax.swing.JOptionPane.showMessageDialog (this, "Inga kopplade partners hittades.");
                return;
                
            }
            
            
            DefaultTableModel koppladeModel = new DefaultTableModel();
            koppladeModel.addColumn("Namn");
            koppladeModel.addColumn("Telefon");
            koppladeModel.addColumn("Kontaktperson");
            koppladeModel.addColumn("Bransch");
            
            
            for (HashMap<String, String> rad : koppladePartners) {
                koppladeModel.addRow(new Object[]{
                    rad.get("namn"),
                    rad.get("telefon"),
                    rad.get("kontaktperson"),
                    rad.get("branch")
                });
            }
            
            
            
            tblKopplade.setModel(koppladeModel);
            
            
            
            
            
            
            
        } catch (InfException e) {
            javax.swing.JOptionPane.showMessageDialog (this, "Fel vid hämtning av partners: " + e.getMessage());
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    private void fyllEjKoppladeTabell() {
        
        try {
            
            String sqlEjKopplade = "SELECT namn, telefon, kontaktperson, branch FROM partner " +
                               "WHERE pid NOT IN ( " +
                               "    SELECT partner_pid FROM projekt_partner " +
                               "    WHERE pid IN ( " +
                               "        SELECT pid FROM projekt " +
                               "        WHERE projektchef IN ( " +
                               "            SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "' " +
                               "        ) " +
                               "    ) " +
                               ")";
            
            
            ArrayList<HashMap<String, String>> ejKoppladePartners = idb.fetchRows(sqlEjKopplade);
            
            if (ejKoppladePartners == null || ejKoppladePartners.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog (this, "Inga ej kopplade partners hittades.");
                return;
            }
            
            
            DefaultTableModel ejKoppladeModel = new DefaultTableModel();
            ejKoppladeModel.addColumn("Namn");
            ejKoppladeModel.addColumn("Kontaktperson");
            ejKoppladeModel.addColumn("Kontaktinformation");
            ejKoppladeModel.addColumn("Bransch");
            
            
            for (HashMap<String, String> rad : ejKoppladePartners) {
            ejKoppladeModel.addRow(new Object[]{
                rad.get("namn"),
                rad.get("kontaktperson"),
                rad.get("telefon"),
                rad.get("branch")
            });
        }
            
            tblEjKopplade.setModel(ejKoppladeModel);
            
            
            
            
            
            
            
            
        } catch (InfException e) {
            javax.swing.JOptionPane.showMessageDialog (this, "Fel vid hämtning av kopplade partners: " + e.getMessage());
        }
        
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEjKopplade = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKopplade = new javax.swing.JTable();
        txtPartnerNamn = new javax.swing.JTextField();
        btnLaggTillPartner = new javax.swing.JButton();
        btnTaBortPartner = new javax.swing.JButton();
        lblForInPartnernsNamn = new javax.swing.JLabel();
        lblInaktivaPartners = new javax.swing.JLabel();
        lblAktivaPartners = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblEjKopplade.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEjKopplade);

        tblKopplade.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblKopplade);

        txtPartnerNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartnerNamnActionPerformed(evt);
            }
        });

        btnLaggTillPartner.setText("Lägg till");
        btnLaggTillPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillPartnerActionPerformed(evt);
            }
        });

        btnTaBortPartner.setText("Ta bort");
        btnTaBortPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortPartnerActionPerformed(evt);
            }
        });

        lblForInPartnernsNamn.setText("För in partnerns namn:");

        lblInaktivaPartners.setText("Inaktiva partners");

        lblAktivaPartners.setText("Aktiva partners");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblForInPartnernsNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPartnerNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnLaggTillPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(btnTaBortPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInaktivaPartners)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAktivaPartners)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInaktivaPartners)
                    .addComponent(lblAktivaPartners))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPartnerNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForInPartnernsNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillPartner)
                    .addComponent(btnTaBortPartner))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillPartnerActionPerformed
        
        try {
        
        String partnerNamn = txtPartnerNamn.getText().trim();

        if (partnerNamn.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ange ett partnernamn!");
            return;
        }

        
        String sqlHittaPartnerPID = "SELECT pid FROM partner WHERE namn = '" + partnerNamn + "'";
        String partnerPID = idb.fetchSingle(sqlHittaPartnerPID);

        if (partnerPID == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Partnern \"" + partnerNamn + "\" finns inte i databasen.");
            return;
        }

        
        String sqlHittaProjektPID = "SELECT pid FROM projekt WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
        String projektPID = idb.fetchSingle(sqlHittaProjektPID);

        if (projektPID == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Projektet kunde inte hittas för den inloggade användaren.");
            return;
        }

       
        String sqlKontrolleraKoppling = "SELECT partner_pid FROM projekt_partner " +
                                        "WHERE partner_pid = '" + partnerPID + "' " +
                                        "AND pid = '" + projektPID + "'";
        String redanKopplad = idb.fetchSingle(sqlKontrolleraKoppling);

        
        System.out.println("Kontrollerar koppling för partner_pid: " + partnerPID + ", projekt_pid: " + projektPID);
        System.out.println("Resultat från SQL-frågan: " + redanKopplad);

        if (redanKopplad != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Partnern \"" + partnerNamn + "\" är redan kopplad till projektet.");
            return;
        }

        
        String sqlLaggTillKoppling = "INSERT INTO projekt_partner (partner_pid, pid) VALUES ('" + partnerPID + "', '" + projektPID + "')";
        idb.insert(sqlLaggTillKoppling);

        javax.swing.JOptionPane.showMessageDialog(this, "Partnern \"" + partnerNamn + "\" har lagts till i projektet.");
        txtPartnerNamn.setText("");
        fyllKoppladeTabell();
        fyllEjKoppladeTabell();

    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fel vid lägg till: " + e.getMessage());
    }
        
        
        
        
    }//GEN-LAST:event_btnLaggTillPartnerActionPerformed

    private void btnTaBortPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortPartnerActionPerformed
        
        
        try {
            
            String partnerNamn = txtPartnerNamn.getText().trim();
            
            if (partnerNamn.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ange ett partnernamn!");
                return;
            }
            
            
            
            String sqlHittaPartnerPID = "SELECT pid FROM partner WHERE namn = '" + partnerNamn + "'";
            String partnerPID = idb.fetchSingle(sqlHittaPartnerPID);
            
            if (partnerPID == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Partnern \"" + partnerNamn + "\" finns inte i databasen!");
                return;
            }
            
            
            String sqlHittaProjektPID = "SELECT pid FROM projekt WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
            String projektPID = idb.fetchSingle(sqlHittaProjektPID);
            
            if (projektPID == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Projektet kunde inte hittas för denna inlogging!");
                return;
                
                
            }
            
            
            String sqlKontrolleraKoppling = "SELECT partner_pid FROM projekt_partner WHERE partner_pid = '" + partnerPID + "' AND pid = '" + projektPID + "'";
            String redanKopplad = idb.fetchSingle(sqlKontrolleraKoppling);
            
            
            if (redanKopplad == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Partnern \"" + partnerNamn + "\" är inte kopplad till projektet!");
            return;
            
            }
            
            String sqlTaBortKoppling = "DELETE FROM projekt_partner WHERE partner_pid = '" + partnerPID + "' AND pid = '" + projektPID + "'";
            idb.delete(sqlTaBortKoppling);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Partnern \"" + partnerNamn + "\" har tagits bort från projektet!");
            txtPartnerNamn.setText("");
            fyllKoppladeTabell();
            fyllEjKoppladeTabell();
           
            
            
            
        } catch (InfException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fel vid borttagning: " + e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btnTaBortPartnerActionPerformed

    private void txtPartnerNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartnerNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartnerNamnActionPerformed

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
            java.util.logging.Logger.getLogger(ChefLäggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChefLäggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChefLäggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChefLäggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ChefLäggTillPartner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillPartner;
    private javax.swing.JButton btnTaBortPartner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAktivaPartners;
    private javax.swing.JLabel lblForInPartnernsNamn;
    private javax.swing.JLabel lblInaktivaPartners;
    private javax.swing.JTable tblEjKopplade;
    private javax.swing.JTable tblKopplade;
    private javax.swing.JTextField txtPartnerNamn;
    // End of variables declaration//GEN-END:variables
}
