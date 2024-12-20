/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;

/**
 *
 * @author jamie
 */
public class ChefÄndraProjekt extends javax.swing.JFrame {
    
    
    private InfDB idb;
    private String inloggadAnvandare;

    /**
     * Creates new form ChefÄndraProjekt
     */
    public ChefÄndraProjekt(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfKostnad = new javax.swing.JTextField();
        tfFörnamn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPrioritet = new javax.swing.JTextField();
        tfInputNamn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        lblProjektNamn = new javax.swing.JLabel();
        btnHämtaInfo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnÄndra = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfLand = new javax.swing.JTextField();
        tfStartDatum = new javax.swing.JTextField();
        tfBeskrivning = new javax.swing.JTextField();
        tfProjektNamn = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfEfternamn = new javax.swing.JTextField();
        tfSlutDatum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblHittar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfKostnad.setColumns(10);

        tfFörnamn.setColumns(10);

        jLabel2.setText("Hämta projektnamn:");

        tfPrioritet.setColumns(10);

        tfInputNamn.setColumns(10);

        jLabel13.setText("Land");

        jLabel3.setText("Ändra uppgifter om projektet: ");

        lblPid.setText("[PID]");

        lblProjektNamn.setText("projektnamn");

        btnHämtaInfo.setText("Hämta");
        btnHämtaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaInfoActionPerformed(evt);
            }
        });

        jLabel4.setText("PID");

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        jLabel5.setText("Projekt namn");

        jLabel6.setText("Beskrivning");

        jLabel7.setText("Start datum");

        jLabel8.setText("Slut datum");

        jLabel9.setText("Kostnad");

        jLabel10.setText("Status");

        jLabel11.setText("Prioritet");

        jLabel12.setText("Projektchef för- och efternamn");

        tfLand.setColumns(10);

        tfStartDatum.setColumns(10);

        tfBeskrivning.setColumns(10);

        tfProjektNamn.setColumns(10);

        tfStatus.setColumns(10);

        tfEfternamn.setColumns(10);

        tfSlutDatum.setColumns(10);
        tfSlutDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSlutDatumActionPerformed(evt);
            }
        });

        jLabel1.setText("Ändra uppgifter om ett projekt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(lblHittar)
                .addGap(80, 80, 80))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnHämtaInfo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblProjektNamn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfSlutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfStartDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPid)
                                    .addComponent(tfProjektNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnÄndra))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblHittar)
                .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHämtaInfo))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lblProjektNamn))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblPid))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tfProjektNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(tfStartDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(tfSlutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(tfKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(tfPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(tfLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(26, 26, 26)
                    .addComponent(btnÄndra)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHämtaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaInfoActionPerformed
     
        String projektNamn = tfInputNamn.getText();
        lblProjektNamn.setText(projektNamn);
        String query = "SELECT * FROM projekt WHERE projektnamn = '" + projektNamn + "'";
        
        HashMap<String, String> projektRows = new HashMap<String, String>();
        
        try{
            projektRows = idb.fetchRow(query);
            if(projektRows.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog (this, "Hittar inte projektet i databasen.");
                
            }
        }catch(InfException e){
            javax.swing.JOptionPane.showMessageDialog (this, "Error i databasen.");
        }
        
        // uppdatera textfields
        lblPid.setText(projektRows.get("pid"));
        
        tfProjektNamn.setText(projektRows.get("projektnamn"));
        
        tfBeskrivning.setText(projektRows.get("beskrivning"));
        
        tfStartDatum.setText(projektRows.get("startdatum"));
        
        tfSlutDatum.setText(projektRows.get("slutdatum"));
        
        tfKostnad.setText(projektRows.get("kostnad"));
        
        tfStatus.setText(projektRows.get("status"));
        
        tfPrioritet.setText(projektRows.get("prioritet"));
        
        
        // Behlver få ut aid för projektchef och land
        String projektChefId = projektRows.get("projektchef");
        String landId = projektRows.get("land");
        
        // få ut namnet för projektchefen
        String projektChefNamnQuery = "SELECT fornamn, efternamn FROM anstalld WHERE aid = '" + projektChefId + "'";
        HashMap<String, String> projektChefNamn = new HashMap<String, String>();
        
        try{
            projektChefNamn = idb.fetchRow(projektChefNamnQuery);
            tfFörnamn.setText(projektChefNamn.get("fornamn"));
            tfEfternamn.setText(projektChefNamn.get("efternamn"));
        }catch(InfException e){
           javax.swing.JOptionPane.showMessageDialog (this, "Problem i databasen med att få fram chefens namn.");
        }
        
        // få ut namnet av landet med lid till namn
        String landNamn;
        String lid = projektRows.get("land");
        
        String fåLandNamnQuery = "SELECT namn FROM land WHERE lid = '" + lid + "'";
        
        try{
            landNamn = idb.fetchSingle(fåLandNamnQuery);
            tfLand.setText(landNamn);
        }catch(InfException e){
            javax.swing.JOptionPane.showMessageDialog (this, "Problem i databasen att hitta landets namn.");
        }

    }//GEN-LAST:event_btnHämtaInfoActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
      
    String pid = lblPid.getText();
    String projektNamn = tfProjektNamn.getText().trim();
    String beskrivning = tfBeskrivning.getText().trim();
    String startDatum = tfStartDatum.getText().trim();
    String slutDatum = tfSlutDatum.getText().trim();
    String kostnad = tfKostnad.getText().trim();
    String status = tfStatus.getText().trim();
    String prioritet = tfPrioritet.getText().trim();
    String förnamn = tfFörnamn.getText().trim();
    String efternamn = tfEfternamn.getText().trim();
    String land = tfLand.getText().trim();

    // Kontrollera att den inloggade användaren är projektchef för projektet
    String kontrollQuery = "SELECT projektchef FROM projekt WHERE pid = '" + pid + "'";
    try {
        String projektChefId = idb.fetchSingle(kontrollQuery);

        // Kontrollera om projektchefen matchar den inloggade användarens ID
        String anvandarIdQuery = "SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";
        String anvandarId = idb.fetchSingle(anvandarIdQuery);

        if (!projektChefId.equals(anvandarId)) {
            javax.swing.JOptionPane.showMessageDialog (this, "Du kan endast ändra projekt du är chef över!");
            return;
        }

        // Hitta aid och lid
        String aidQuery = "SELECT aid FROM anstalld WHERE fornamn = '" + förnamn + "' AND efternamn = '" + efternamn + "'";
        String aid = idb.fetchSingle(aidQuery);

        String lidQuery = "SELECT lid FROM land WHERE namn = '" + land + "'";
        String lid = idb.fetchSingle(lidQuery);

        // Uppdatera projektet
        String updateQuery = "UPDATE projekt SET projektnamn = '" + projektNamn + "', beskrivning = '" + beskrivning +
                             "', startdatum = '" + startDatum + "', slutdatum = '" + slutDatum + "', kostnad = '" +
                             kostnad + "', status = '" + status + "', prioritet = '" + prioritet +
                             "', projektchef = '" + aid + "', land = '" + lid + "' WHERE pid = '" + pid + "'";
        idb.update(updateQuery);

        javax.swing.JOptionPane.showMessageDialog (this, "Projektet har uppdaterats!");
    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog (this, "Fel vid uppdatering: " + e.getMessage());
    }


    }//GEN-LAST:event_btnÄndraActionPerformed

    private void tfSlutDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSlutDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSlutDatumActionPerformed

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
            java.util.logging.Logger.getLogger(ChefÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChefÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChefÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChefÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ChefÄndraProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämtaInfo;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHittar;
    private javax.swing.JLabel lblPid;
    private javax.swing.JLabel lblProjektNamn;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFörnamn;
    private javax.swing.JTextField tfInputNamn;
    private javax.swing.JTextField tfKostnad;
    private javax.swing.JTextField tfLand;
    private javax.swing.JTextField tfPrioritet;
    private javax.swing.JTextField tfProjektNamn;
    private javax.swing.JTextField tfSlutDatum;
    private javax.swing.JTextField tfStartDatum;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
