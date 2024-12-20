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
public class ProjektChefSeMinaProjekt extends javax.swing.JFrame {
    
    
    private InfDB idb;
    private String inloggadAnvandare;

    /**
     * Creates new form ProjektChefSeMinaProjekt
     */
    public ProjektChefSeMinaProjekt(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        fyllProjektTabell();
        fyllPartnerTabell();
        fyllHandlaggareTabell();
        lblInloggadAnvandare.setText(inloggadAnvandare);
    
    }
    
    
    
    
    
    
    public void fyllProjektTabell() {
        try {
            
            String sql = "SELECT projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet " +
                     "FROM projekt " +
                     "WHERE projektchef IN (" +
                     "    SELECT aid " +
                     "    FROM anstalld " +
                     "    WHERE epost = '" + inloggadAnvandare + "');";
            
            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);
            
            if (resultat == null || resultat.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Inga projekt hittades.");
                return;
            }
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Projektnamn");
            model.addColumn("Beskrivning");
            model.addColumn("Startdatum");
            model.addColumn("Slutdatum");
            model.addColumn("Kostnad");
            model.addColumn("Status");
            model.addColumn("Prioritet");
            
            
            for (HashMap<String, String> rad : resultat) {
                model.addRow(new Object[]{rad.get("projektnamn"), rad.get("beskrivning"), rad.get("startdatum"), rad.get("slutdatum"),
                rad.get("kostnad"), rad.get("status"), rad.get("prioritet")});
            }
            
            tblProjekt.setModel(model);
        } catch (InfException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fel vid hämtning av projekt: " + e.getMessage());
        }
    }
    
    
    
    
    public void fyllHandlaggareTabell () {
        
        try {
            
            String sqlHandlaggare = "SELECT anstalld.fornamn, anstalld.efternamn, handlaggare.ansvarighetsomrade " +
                        "FROM anstalld " +
                        "JOIN handlaggare ON anstalld.aid = handlaggare.aid " +
                        "JOIN ans_proj ON anstalld.aid = ans_proj.aid " +
                        "JOIN projekt ON ans_proj.pid = projekt.pid " +
                        "WHERE projekt.projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
            
            ArrayList<HashMap<String, String>> resultatx = idb.fetchRows(sqlHandlaggare);
            
            if (resultatx == null || resultatx.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Inga handläggare hittades." );
            }
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Handläggare");
            model.addColumn("Ansvarighetsområde");
            
            for (HashMap<String, String> rad : resultatx) {
                model.addRow(new Object[]{rad.get("fornamn"), rad.get("ansvarighetsomrade")});
                
            }
            
            tblHandlaggare.setModel(model);
            
        } catch (InfException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Fel vid hämtning av handläggare: " + e.getMessage());
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void fyllPartnerTabell () {
        
        try {
            
            String sqlPartner = "SELECT namn, telefon FROM partner " +
             "WHERE pid IN ( " +
             "    SELECT partner_pid FROM projekt_partner " +
             "    WHERE pid IN ( " +
             "        SELECT pid FROM projekt " +
             "        WHERE projektchef IN ( " +
             "            SELECT aid FROM anstalld " +
             "            WHERE epost = '" + inloggadAnvandare + "' " +
             "        ) " +
             "    ) " +
             ");";
            
            ArrayList<HashMap<String, String>> resultaten = idb.fetchRows(sqlPartner);
            
            if (resultaten == null || resultaten.isEmpty()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Partner");
                model.addColumn("Kontaktinformation");
                tblPartner.setModel(model);
                javax.swing.JOptionPane.showMessageDialog(this, "Inga partners hittades.");
                return;
            }
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn ("Partner");
            model.addColumn ("Kontaktinformation");
            
            
            for (HashMap<String, String> rad : resultaten) {
                model.addRow(new Object[]{rad.get("namn"), rad.get("telefon")});
            }
            
            tblPartner.setModel(model);
        } catch (InfException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fel vid hämtning av partner: " + e.getMessage());
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
        tblProjekt = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHandlaggare = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPartner = new javax.swing.JTable();
        btnTaBortHandlaggare = new javax.swing.JButton();
        btnUppdateraTabeller = new javax.swing.JButton();
        btnLaggTillHandlaggare = new javax.swing.JButton();
        btnLaggTillPartner = new javax.swing.JButton();
        btnAndraProjekt = new javax.swing.JButton();
        lblProjektInformation = new javax.swing.JLabel();
        lblHandlaggare = new javax.swing.JLabel();
        lblPartner = new javax.swing.JLabel();
        lblInloggadAnvandare = new javax.swing.JLabel();
        btnVisaProjektKostnad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblProjekt.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProjekt);

        tblHandlaggare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tblHandlaggare);

        tblPartner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane4.setViewportView(tblPartner);

        btnTaBortHandlaggare.setText("Ta bort handläggare");
        btnTaBortHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortHandlaggareActionPerformed(evt);
            }
        });

        btnUppdateraTabeller.setText("Uppdatera tabellerna");
        btnUppdateraTabeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraTabellerActionPerformed(evt);
            }
        });

        btnLaggTillHandlaggare.setText("Lägg till handläggare");
        btnLaggTillHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillHandlaggareActionPerformed(evt);
            }
        });

        btnLaggTillPartner.setText("Ändra projekt partners");
        btnLaggTillPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillPartnerActionPerformed(evt);
            }
        });

        btnAndraProjekt.setText("Ändra projekt information");
        btnAndraProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraProjektActionPerformed(evt);
            }
        });

        lblProjektInformation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProjektInformation.setText("Projektinformation");

        lblHandlaggare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHandlaggare.setText("Aktiva handläggare");

        lblPartner.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPartner.setText("Aktiva partners");

        lblInloggadAnvandare.setText("jLabel1");

        btnVisaProjektKostnad.setText("Visa projekt kostnad");
        btnVisaProjektKostnad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaProjektKostnadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLaggTillHandlaggare)
                    .addComponent(btnTaBortHandlaggare))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLaggTillPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisaProjektKostnad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAndraProjekt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUppdateraTabeller)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProjektInformation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInloggadAnvandare)
                        .addGap(29, 29, 29)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHandlaggare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPartner)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjektInformation)
                    .addComponent(lblInloggadAnvandare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblHandlaggare))
                    .addComponent(lblPartner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillHandlaggare)
                    .addComponent(btnLaggTillPartner)
                    .addComponent(btnAndraProjekt)
                    .addComponent(btnUppdateraTabeller))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortHandlaggare)
                    .addComponent(btnVisaProjektKostnad))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortHandlaggareActionPerformed
        ChefTaBortHandlaggare taborthandlaggareWindow = new ChefTaBortHandlaggare(idb, inloggadAnvandare);
        taborthandlaggareWindow.setVisible(true);
        
    }//GEN-LAST:event_btnTaBortHandlaggareActionPerformed

    private void btnUppdateraTabellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraTabellerActionPerformed
        
        try {
            
            fyllHandlaggareTabell();
            fyllProjektTabell();
            fyllPartnerTabell();
            
            javax.swing.JOptionPane.showMessageDialog(this, "Tabellerna har uppdaterats");
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog (this, "Fel vid uppdatering av tabeller: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnUppdateraTabellerActionPerformed

    private void btnLaggTillHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillHandlaggareActionPerformed
        ChefLäggTillHandläggare laggTillWindow = new ChefLäggTillHandläggare (idb, inloggadAnvandare);
        laggTillWindow.setVisible(true);
    }//GEN-LAST:event_btnLaggTillHandlaggareActionPerformed

    private void btnLaggTillPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillPartnerActionPerformed
       ChefLäggTillPartner laggTillPartnerFönster = new ChefLäggTillPartner (idb, inloggadAnvandare);
       laggTillPartnerFönster.setVisible(true);
    }//GEN-LAST:event_btnLaggTillPartnerActionPerformed

    private void btnAndraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraProjektActionPerformed
        ChefÄndraProjekt andraProjektFönster = new ChefÄndraProjekt (idb, inloggadAnvandare);
        andraProjektFönster.setVisible(true);
    }//GEN-LAST:event_btnAndraProjektActionPerformed

    private void btnVisaProjektKostnadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaProjektKostnadActionPerformed
       ProjektKostnadFönster projektKostnadFönster = new ProjektKostnadFönster (idb, inloggadAnvandare);
       projektKostnadFönster.setVisible(true);
    }//GEN-LAST:event_btnVisaProjektKostnadActionPerformed

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
            java.util.logging.Logger.getLogger(ProjektChefSeMinaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektChefSeMinaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektChefSeMinaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektChefSeMinaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektChefSeMinaProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraProjekt;
    private javax.swing.JButton btnLaggTillHandlaggare;
    private javax.swing.JButton btnLaggTillPartner;
    private javax.swing.JButton btnTaBortHandlaggare;
    private javax.swing.JButton btnUppdateraTabeller;
    private javax.swing.JButton btnVisaProjektKostnad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHandlaggare;
    private javax.swing.JLabel lblInloggadAnvandare;
    private javax.swing.JLabel lblPartner;
    private javax.swing.JLabel lblProjektInformation;
    private javax.swing.JTable tblHandlaggare;
    private javax.swing.JTable tblPartner;
    private javax.swing.JTable tblProjekt;
    // End of variables declaration//GEN-END:variables
}
