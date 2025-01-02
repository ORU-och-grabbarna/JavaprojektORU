/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package ngo2024;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;



/**
 *
 * @author diyar
 */
public class MinaprojektNy extends javax.swing.JFrame {
     /**
     * Instans av InfDB för att hantera databasoperationer.
     */
 private InfDB idb; 
     /**
     * Inloggad användares e-postadress.
     */
 private String inloggadAnvandare;
    /**
     * Skapar en ny form MinaprojektNy.
     * 
     * @param idb Databasen som ska användas för att hämta data.
     * @param inloggadAnvandare Den inloggade användarens e-postadress.
     */
 
    /**
     * Creates new form MinaprojektNy
     */
    public MinaprojektNy(InfDB idb, String inloggadAnvandare){
        this.idb = idb; //Databasuppkoppling
        this.inloggadAnvandare = inloggadAnvandare; //Inloggad användares e-postadress.      
        initComponents();
        minaprojekt();
     /**
     * Initierar komponenter i användargränssnittet.
     * Denna metod genereras automatiskt av Form Editor.
     */
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void minaprojekt(){
        try {
    String projektsql = "SELECT projektnamn,beskrivning,startdatum,slutdatum,kostnad,status,prioritet FROM projekt "
            + "JOIN ans_proj ON projekt.pid = ans_proj.pid "
            + "JOIN anstalld ON ans_proj.aid = anstalld.aid "
            + "WHERE anstalld.epost = '" + inloggadAnvandare + "'";
    
     ArrayList<HashMap<String, String>> resultat = idb.fetchRows(projektsql);
     
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
             /* Skapa och visa formuläret */
        }
    }
    /**
     * Startar applikationen.
     * 
     * @param args Kommandoradsargument.
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
            java.util.logging.Logger.getLogger(MinaprojektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinaprojektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinaprojektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinaprojektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MinaprojektNy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProjekt;
    // End of variables declaration//GEN-END:variables
}
