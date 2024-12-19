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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEjKopplade;
    private javax.swing.JTable tblKopplade;
    // End of variables declaration//GEN-END:variables
}
