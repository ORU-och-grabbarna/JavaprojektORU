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
            
            String sqlHandlaggare = "SELECT fornamn, ansvarighetsomrade " +
             "FROM anstalld " +
             "JOIN handlaggare ON handlaggare.aid = anstalld.aid " +
             "WHERE epost = '" + inloggadAnvandare + "';";
            
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaBortHandlaggare)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTaBortHandlaggare)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortHandlaggareActionPerformed
        ChefTaBortHandlaggare taborthandlaggareWindow = new ChefTaBortHandlaggare(idb, inloggadAnvandare);
        taborthandlaggareWindow.setVisible(true);
        
    }//GEN-LAST:event_btnTaBortHandlaggareActionPerformed

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
    private javax.swing.JButton btnTaBortHandlaggare;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblHandlaggare;
    private javax.swing.JTable tblPartner;
    private javax.swing.JTable tblProjekt;
    // End of variables declaration//GEN-END:variables
}
