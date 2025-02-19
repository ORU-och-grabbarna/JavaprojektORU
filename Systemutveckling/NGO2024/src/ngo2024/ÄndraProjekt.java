/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * The ÄndraProjekt class represents a GUI for editing project details in a
 * database. It allows users to retrieve information about a project, edit it,
 * and update the project details in the database. The class extends
 * javax.swing.JFrame and is primarily used for project management in a system.
 *
 * @author Mohammed
 */
public class ÄndraProjekt extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Constructor for the ÄndraProjekt class. Initializes the GUI and sets the
     * database interface.
     *
     * @param idb The InfDB object used to interact with the database.
     */
    public ÄndraProjekt(InfDB idb) {
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
        jLabel2 = new javax.swing.JLabel();
        tfInputNamn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblProjektNamn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        tfKostnad = new javax.swing.JTextField();
        tfFörnamn = new javax.swing.JTextField();
        tfPrioritet = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        btnHämtaInfo = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        lblHittar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ändra uppgifter om ett projekt");

        jLabel2.setText("Hämta projektnamn:");

        tfInputNamn.setColumns(10);

        jLabel3.setText("Ändra uppgifter om projektet: ");

        lblProjektNamn.setText("projektnamn");

        jLabel4.setText("PID");

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

        tfKostnad.setColumns(10);

        tfFörnamn.setColumns(10);

        tfPrioritet.setColumns(10);

        jLabel13.setText("Land");

        lblPid.setText("[PID]");

        btnHämtaInfo.setText("Hämta");
        btnHämtaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaInfoActionPerformed(evt);
            }
        });

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHämtaInfo)
                                .addGap(18, 18, 18)
                                .addComponent(lblHittar))
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
                                        .addComponent(tfProjektNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnÄndra))
                        .addGap(0, 105, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämtaInfo)
                    .addComponent(lblHittar))
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
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Handles the action when the user enters a project name and clicks the
     * Hämta button. Fetches the project's information from the database and
     * populates the corresponding fields. Displays the project details,
     * including project name, description, dates, cost, status, priority,
     * project manager's name, and country.
     *
     * @param evt The action event triggered by the Hämta button.
     */
    private void btnHämtaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaInfoActionPerformed
        // TODO add your handling code here:
        // hämta all info från projektet med select och fetchrow
        String projektNamn = tfInputNamn.getText();
        lblProjektNamn.setText(projektNamn);
        String query = "SELECT * FROM projekt WHERE projektnamn LIKE '%" + projektNamn + "%'";

        HashMap<String, String> projektRows = new HashMap<String, String>();

        try {
            projektRows = idb.fetchRow(query);
            if (projektRows.isEmpty()) {
                lblHittar.setText("Hittar inte projektet.");
            }
        } catch (InfException e) {
            lblHittar.setText("Error i databasen");
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

        try {
            projektChefNamn = idb.fetchRow(projektChefNamnQuery);
            tfFörnamn.setText(projektChefNamn.get("fornamn"));
            tfEfternamn.setText(projektChefNamn.get("efternamn"));
        } catch (InfException e) {
            lblHittar.setText("Problem i databasen med att få projekt chefens namn");
        }

        // få ut namnet av landet med lid till namn
        String landNamn;
        String lid = projektRows.get("land");

        String fåLandNamnQuery = "SELECT namn FROM land WHERE lid = '" + lid + "'";

        try {
            landNamn = idb.fetchSingle(fåLandNamnQuery);
            tfLand.setText(landNamn);
        } catch (InfException e) {
            lblHittar.setText("Problem i databasen med att hitta landets namn");
        }


    }//GEN-LAST:event_btnHämtaInfoActionPerformed
    /**
     * Handles the action when the user clicks the Ändra button to update
     * project details. Validates the input values and updates the project in
     * the database.
     *
     * @param evt The action event triggered by the "Ändra" button.
     */
    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        // uppdatera projektet med värden i textfields
        String pid = lblPid.getText();
        String projektNamn = tfProjektNamn.getText();
        String beskrivning = tfBeskrivning.getText();
        String startDatum = tfStartDatum.getText();
        String slutDatum = tfSlutDatum.getText();
        String kostnad = tfKostnad.getText();
        String status = tfStatus.getText();
        String prioritet = tfPrioritet.getText();
        String förnamn = tfFörnamn.getText();
        String efternamn = tfEfternamn.getText();
        String land = tfLand.getText();

        if (!Validator.isValidProjektName(projektNamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Projekt namn får endast bestå av bokstäver, mellanslag och siffror.");
            return;
        }
        if (!Validator.isValidDate(startDatum) || !Validator.isValidDate(slutDatum)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Start och slut datum måste vara på formatet YYYY-MM-DD");
            return;
        }
        if (!Validator.isValidName(förnamn) || !Validator.isValidName(efternamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "För- och efternamn får endast innehålla bokstäver och mellanslag");
            return;
        }

        // hitta aid och lid för projektchef och land
        // hitta aid
        String hittaAidQuery = "SELECT aid FROM anstalld WHERE fornamn = '" + förnamn + "' AND efternamn = '" + efternamn + "'";
        String aid = null;
        try {
            aid = idb.fetchSingle(hittaAidQuery);
        } catch (InfException e) {
            lblHittar.setText("Fel i databasen med att hitta projektchefens anställnings id");
        }

        // Hitta lid
        String hittaLidQuery = "SELECT lid FROM land WHERE namn = '" + land + "'";
        String lid = null;

        try {
            lid = idb.fetchSingle(hittaLidQuery);
        } catch (InfException e) {
            lblHittar.setText("Fel i databasen med att hitta landets namn");
        }

        // uppdatera projektet update - set - where;
        String updateQuery = "UPDATE projekt SET projektnamn ='" + projektNamn + "', beskrivning = '" + beskrivning + "', startdatum = '"
                + startDatum + "', slutDatum = '" + slutDatum + "', kostnad = '" + kostnad + "', status = '" + status + "', prioritet = '"
                + prioritet + "', projektchef = '" + aid + "', land = '" + lid + "'"
                + "WHERE pid = '" + pid + "'";

        try {
            idb.update(updateQuery);
            lblHittar.setText("Projekt uppdaterad");
        } catch (InfException e) {
            lblHittar.setText("Problem med att updatera projekt i databasen");
        }

    }//GEN-LAST:event_btnÄndraActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ÄndraProjekt().setVisible(true);
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
