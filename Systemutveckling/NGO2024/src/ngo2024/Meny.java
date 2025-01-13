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
        kontrolleraBehörighet();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    private void kontrolleraBehörighet() {
    // SQL-fråga för att hämta projektchef-ID kopplat till den anställde
    String sqlProjektChef = "SELECT projekt.projektchef " +
                            "FROM projekt " +
                            "JOIN anstalld ON projekt.projektchef = anstalld.aid " +
                            "WHERE anstalld.epost = '" + inloggadAnvandare + "'";

    try {
        // Hämtar projektchefens AID om användaren är chef för något projekt
        String dbProjektChef = idb.fetchSingle(sqlProjektChef);

        // Om dbProjektChef inte är null -> användaren är projektchef
        if (dbProjektChef != null) {
            comboBoxProjektchef.setVisible(true);    // Gör ComboBox synlig
        } else {
            comboBoxProjektchef.setVisible(false);   // Dölj ComboBox om inte chef
        }
        
    } catch (InfException ex) {
        System.out.println("Fel vid hämtning av projektchef: " + ex.getMessage());
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInloggadAnvandare = new javax.swing.JLabel();
        comboBoxHandläggare = new javax.swing.JComboBox<>();
        btnLoggaUt = new javax.swing.JButton();
        comboBoxProjektchef = new javax.swing.JComboBox<>();
        lblSDG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblInloggadAnvandare.setText("inloggadanvändare");

        comboBoxHandläggare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Handläggare meny>", "Mina projekt", "Sök på projekt", "Sök handläggare", "Hållbarhetsmål", "Personalen på min avdelning", "Min avdelnings projekt" }));
        comboBoxHandläggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHandläggareActionPerformed(evt);
            }
        });

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        comboBoxProjektchef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Projektchef meny>", "Mina projekt" }));
        comboBoxProjektchef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProjektchefActionPerformed(evt);
            }
        });

        lblSDG.setFont(new java.awt.Font("Algerian", 0, 78)); // NOI18N
        lblSDG.setText("SDG SWEDEN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLoggaUt)
                .addGap(18, 18, 18)
                .addComponent(comboBoxHandläggare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBoxProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSDG)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoggaUt)
                    .addComponent(comboBoxHandläggare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(lblSDG)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxHandläggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHandläggareActionPerformed
        String valtAlternativ = (String) comboBoxHandläggare.getSelectedItem();
        
        
        switch (valtAlternativ) {
            
            case ("Mina projekt"):
                MinaprojektNy minaprojektFönster = new MinaprojektNy(idb, inloggadAnvandare);
                minaprojektFönster.setVisible(true);
                break;
                
            case ("Sök på projekt"):
                SökProjektPåDatum projektfönster = new SökProjektPåDatum (idb, inloggadAnvandare);
        projektfönster.setVisible(true);
        break;
        
            case ("Personinfo"):
                new Personinfo (idb, inloggadAnvandare).setVisible(true);
                break;
                
                
            case ("Sök handläggare"):
                SökPåHandläggare handläggaresök = new SökPåHandläggare (idb, inloggadAnvandare);
    handläggaresök.setVisible(true);
    
    
    
            case ("Min avdelnings projekt"):
                new MinAvdelningsprojekt (idb,inloggadAnvandare).setVisible(true);
                break;
                
                
            case ("Hållbarhetsmål"):
                 Hållbarhetsmål målfönster = new Hållbarhetsmål (idb, inloggadAnvandare);
        målfönster.setVisible(true);
        break;
        
        
            case ("Personalen på min avdelning"):
                     ListaPaPersonal personalfönster = new ListaPaPersonal (idb, inloggadAnvandare);
        personalfönster.setVisible(true);
        break;
        
        
        default: javax.swing.JOptionPane.showMessageDialog (this, "Error");
            break;
                
            
                
            
            
            
        }
        
    }//GEN-LAST:event_comboBoxHandläggareActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Inloggning inloggningFönster = new Inloggning (idb);
        inloggningFönster.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void comboBoxProjektchefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProjektchefActionPerformed
        String valtAlternativ = (String) comboBoxProjektchef.getSelectedItem();
        
        if (valtAlternativ.equals("Mina projekt")) {
            ProjektChefSeMinaProjekt projektfönster = new ProjektChefSeMinaProjekt(idb, inloggadAnvandare);
            projektfönster.setVisible(true);
        }
        
        
        
        
    }//GEN-LAST:event_comboBoxProjektchefActionPerformed

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
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JComboBox<String> comboBoxHandläggare;
    private javax.swing.JComboBox<String> comboBoxProjektchef;
    private javax.swing.JLabel lblInloggadAnvandare;
    private javax.swing.JLabel lblSDG;
    // End of variables declaration//GEN-END:variables
}
