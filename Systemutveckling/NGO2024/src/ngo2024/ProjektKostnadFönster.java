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
public class ProjektKostnadFönster extends javax.swing.JFrame {
    
    
    private InfDB idb;
    private String inloggadAnvandare;

    /**
     * Creates new form ProjektKostnadFönster
     */
    public ProjektKostnadFönster(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        fyllProjektTabellOchTotalKostnad();
    }
    
    
    
    
    
    public void fyllProjektTabellOchTotalKostnad() {
        
    try {
        // SQL-fråga för att endast hämta projekt där användaren är projektchef
        String sql = "SELECT projektnamn, kostnad " +
                     "FROM projekt " +
                     "WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";

        ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);

        if (resultat == null || resultat.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Inga projekt hittades.");
            return;
        }

        // Ställ in kolumnnamn
        DefaultTableModel model = new DefaultTableModel(new String[]{"Projektnamn", "Kostnad"}, 0);
        tblProjektKostnad.setModel(model);

        double totalKostnad = 0;

        // Lägg till data i tabellen
        for (HashMap<String, String> rad : resultat) {
            String projektnamn = rad.get("projektnamn");
            double kostnad = Double.parseDouble(rad.get("kostnad"));
            totalKostnad += kostnad;

            model.addRow(new Object[]{projektnamn, kostnad});
        }

        // Uppdatera total kostnad
        lblTotalKostnad.setText("Total kostnad: " + totalKostnad + " SEK");

    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fel vid hämtning av projekt: " + e.getMessage());
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Felaktigt format för kostnad: " + e.getMessage());
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
        tblProjektKostnad = new javax.swing.JTable();
        lblTotalKostnad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblProjektKostnad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProjektKostnad);

        lblTotalKostnad.setText("Total kostnad: 0 SEK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTotalKostnad))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalKostnad)
                .addGap(0, 20, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(ProjektKostnadFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektKostnadFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektKostnadFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektKostnadFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektKostnadFönster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalKostnad;
    private javax.swing.JTable tblProjektKostnad;
    // End of variables declaration//GEN-END:variables
}
