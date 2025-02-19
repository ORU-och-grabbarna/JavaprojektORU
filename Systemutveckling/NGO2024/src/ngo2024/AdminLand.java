/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * AdminLand is a Java Swing-based GUI application for managing country (Land)
 * records. It interacts with a database to fetch, update, and add information
 * about countries. The application uses the InfDB library for database
 * operations.
 *
 * Features: - Retrieve country information based on a name query. - Update
 * existing country details. - Add new countries to the database.
 *
 * Validators are used to ensure data integrity before database operations.
 *
 * @author Mohammed
 */
public class AdminLand extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates a new AdminLand form.
     *
     * @param idb An instance of the InfDB class for database operations.
     */
    public AdminLand(InfDB idb) {
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
        lblMsgTop = new javax.swing.JLabel();
        btnHämta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfNamn = new javax.swing.JTextField();
        tfSprak = new javax.swing.JTextField();
        tfValuta = new javax.swing.JTextField();
        tfTidszon = new javax.swing.JTextField();
        tfPolitisk_struktur = new javax.swing.JTextField();
        tfEkonomi = new javax.swing.JTextField();
        btnLäggTill = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMsgBottom = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Admin land kontroller");

        jLabel2.setText("Land");

        tfInputNamn.setColumns(10);

        lblMsgTop.setText("Felmeddelande");

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        jLabel4.setText("LID");

        lblLid.setText("LID");

        jLabel6.setText("Namn");

        jLabel5.setText("Språk");

        jLabel7.setText("Valuta");

        jLabel8.setText("Tidszon");

        jLabel9.setText("Politiskt struktur");

        jLabel10.setText("Ekonomi");

        tfNamn.setColumns(10);

        tfSprak.setColumns(10);

        tfValuta.setColumns(10);

        tfTidszon.setColumns(10);

        tfPolitisk_struktur.setColumns(10);

        tfEkonomi.setColumns(10);

        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        taMsgBottom.setEditable(false);
        taMsgBottom.setColumns(20);
        taMsgBottom.setRows(5);
        jScrollPane1.setViewportView(taMsgBottom);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblLid))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfSprak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(76, 76, 76)
                                                .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(79, 79, 79)
                                                .addComponent(tfValuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(72, 72, 72)
                                                .addComponent(tfTidszon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(26, 26, 26)
                                                .addComponent(tfPolitisk_struktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(18, 18, 18)
                        .addComponent(btnHämta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMsgTop)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLäggTill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnÄndra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMsgTop)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblLid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSprak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfValuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfTidszon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPolitisk_struktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÄndra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLäggTill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Event handler for the Hämta button. Retrieves country information from
     * the database based on the name entered in tfInputNamn. Populates the form
     * fields with the retrieved data.
     *
     * @param evt The ActionEvent triggered by clicking the button.
     */
    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed

        String namn = tfInputNamn.getText();

        String getLandInfoQuery = "SELECT * FROM land WHERE namn LIKE '%" + namn + "%'";
        HashMap<String, String> landRow = new HashMap<String, String>();

        try {
            landRow = idb.fetchRow(getLandInfoQuery);
        } catch (InfException e) {
            lblMsgTop.setText("Problem med att hämta info om landet");
        }

        // sätt tf till värderna
        lblLid.setText(landRow.get("lid"));

        tfNamn.setText(landRow.get("namn"));
        tfSprak.setText(landRow.get("sprak"));
        tfValuta.setText(landRow.get("valuta"));
        tfTidszon.setText(landRow.get("tidszon"));
        tfPolitisk_struktur.setText(landRow.get("politisk_struktur"));
        tfEkonomi.setText(landRow.get("ekonomi"));


    }//GEN-LAST:event_btnHämtaActionPerformed

    /**
     * Event handler for the Ändra button. Updates the country information in
     * the database with the data provided in the form fields. Validates the
     * input fields to ensure correctness before performing the update.
     *
     * @param evt The ActionEvent triggered by clicking the button.
     */
    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed

        // get info från textfields
        String lid = lblLid.getText();
        String namn = tfNamn.getText();
        String sprak = tfSprak.getText();
        String valuta = tfValuta.getText();
        String tidszon = tfTidszon.getText();
        String politisk_struktur = tfPolitisk_struktur.getText();
        String ekonomi = tfEkonomi.getText();

        if (!Validator.isValidName(namn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Namn får endast bestå av bokstäver och mellanslag.");
            return;
        }
        if (!Validator.isPositiveNumber(valuta)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Valuta måste vara ett positivt nummer.");
            return;
        }

        // update set where med värderna
        String updateLandQuery = "UPDATE land SET namn = '" + namn + "', sprak = '" + sprak + "', valuta = '" + valuta + "', tidszon = '" + tidszon + "', "
                + "politisk_struktur = '" + politisk_struktur + "', ekonomi = '" + ekonomi + "' WHERE lid = '" + lid + "'";

        try {
            idb.update(updateLandQuery);
            taMsgBottom.setText("Landet har uppdaterats!");
        } catch (InfException e) {
            taMsgBottom.setText("Landet kunde inte uppdateras");
        }

    }//GEN-LAST:event_btnÄndraActionPerformed

    /**
     * Event handler for the "Lägg Till" (Add) button. Adds a new country record
     * to the database using the data provided in the form fields. Validates the
     * input fields and ensures data integrity.
     *
     * @param evt The ActionEvent triggered by clicking the button.
     */
    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        // TODO add your handling code here:
        // hämta info från textfields
        String lid = null;

        try {
            lid = idb.getAutoIncrement("land", "lid");
        } catch (InfException e) {
            taMsgBottom.setText("Kunde inte inkrementera landets id");
        }

        String namn = tfNamn.getText();
        String sprak = tfSprak.getText();
        String valuta = tfValuta.getText();
        String tidszon = tfTidszon.getText();
        String politisk_struktur = tfPolitisk_struktur.getText();
        String ekonomi = tfEkonomi.getText();

        if (!Validator.isValidName(namn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Namn får endast bestå av bokstäver och mellanslag.");
            return;
        }
        if (!Validator.isPositiveNumber(valuta)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Valuta måste vara ett positivt nummer.");
            return;
        }

        // använd insert in i databasen
        String insertLandQuery = "INSERT INTO land VALUES('" + lid + "','" + namn + "','"
                + sprak + "','" + valuta + "','" + tidszon + "','" + politisk_struktur + "','"
                + ekonomi + "')";

        try {
            idb.insert(insertLandQuery);
            taMsgBottom.setText("Landet har lagts till i databasen");
        } catch (InfException e) {
            taMsgBottom.setText("Landet kunde inte läggas till");
        }

    }//GEN-LAST:event_btnLäggTillActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminLand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLid;
    private javax.swing.JLabel lblMsgTop;
    private javax.swing.JTextArea taMsgBottom;
    private javax.swing.JTextField tfEkonomi;
    private javax.swing.JTextField tfInputNamn;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfPolitisk_struktur;
    private javax.swing.JTextField tfSprak;
    private javax.swing.JTextField tfTidszon;
    private javax.swing.JTextField tfValuta;
    // End of variables declaration//GEN-END:variables
}
