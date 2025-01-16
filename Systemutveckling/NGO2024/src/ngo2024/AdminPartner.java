/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * The AdminPartner class provides a graphical interface for managing partner
 * information in the database. This class extends javax.swing.JFrame and allows
 * users to perform CRUD (Create, Read, Update, Delete) operations on partner
 * data. It interacts with an instance of the InfDB class for database
 * operations.
 */
/**
 *
 * @author Mohammed
 */
public class AdminPartner extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Constructs a new AdminPartner frame.
     *
     * @param idb an instance of the InfDB class used to interact with the
     * database.
     */
    public AdminPartner(InfDB idb) {
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
        lblPid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfNamn = new javax.swing.JTextField();
        tfEpost = new javax.swing.JTextField();
        tfKontaktPerson = new javax.swing.JTextField();
        tfStad = new javax.swing.JTextField();
        tfTelefon = new javax.swing.JTextField();
        tfBranch = new javax.swing.JTextField();
        tfAdress = new javax.swing.JTextField();
        btnHämta = new javax.swing.JButton();
        lblMsgTop = new javax.swing.JLabel();
        btnLäggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblMsgBottom = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Admin partner kontroller");

        jLabel2.setText("Partner namn");

        tfInputNamn.setColumns(10);

        jLabel3.setText("PID");

        lblPid.setText("PID");

        jLabel4.setText("Namn");

        jLabel6.setText("Kontaktperson");

        jLabel8.setText("Epost");

        jLabel10.setText("Telefon");

        jLabel11.setText("Adress");

        jLabel12.setText("Branch");

        jLabel13.setText("Stad");

        tfNamn.setColumns(10);

        tfEpost.setColumns(10);

        tfKontaktPerson.setColumns(10);

        tfStad.setColumns(10);

        tfTelefon.setColumns(10);

        tfBranch.setColumns(10);

        tfAdress.setColumns(10);

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta Bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        lblMsgBottom.setColumns(20);
        lblMsgBottom.setRows(5);
        jScrollPane1.setViewportView(lblMsgBottom);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAdress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfStad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTaBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLäggTill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHämta)
                            .addComponent(btnÄndra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblMsgTop)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(lblPid))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfKontaktPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfInputNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHämta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsgTop)
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfKontaktPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLäggTill)
                    .addComponent(tfAdress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(tfBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfStad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTaBort))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Event handler for the Hämta button. Retrieves partner information from
     * the database based on the name entered in the input text field.
     *
     * Steps: - Fetches the partner's details from the database using a query. -
     * Fetches the associated city's name. - Populates the relevant fields in
     * the UI with the retrieved information.
     *
     * @param evt the ActionEvent triggered when the button is clicked.
     */
    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        // TODO add your handling code here:
        // ta in string från tffield input och få info från databasen sedan skriv ut detta i textfields
        String inputNamn = tfInputNamn.getText();

        // få info från databasen
        String getPartnerQuery = "SELECT * FROM partner WHERE namn LIKE '%" + inputNamn + "%'";
        HashMap<String, String> partnerRow = new HashMap<String, String>();

        try {
            partnerRow = idb.fetchRow(getPartnerQuery);
        } catch (InfException e) {
            lblMsgTop.setText("Problem med att hämta partner från databasen");
        }

        // få ut stadens namn
        String sid = partnerRow.get("stad");

        String getStadNamnQuery = "SELECT namn FROM stad WHERE sid = '" + sid + "'";
        String stadNamn = null;

        try {
            stadNamn = idb.fetchSingle(getStadNamnQuery);
        } catch (InfException e) {
            lblMsgTop.setText("Problem med att hämta stadens namn");
        }

        // skirv ut infon i textfield
        lblPid.setText(partnerRow.get("pid"));

        tfNamn.setText(partnerRow.get("namn"));
        tfKontaktPerson.setText(partnerRow.get("kontaktperson"));
        tfEpost.setText(partnerRow.get("kontaktepost"));
        tfTelefon.setText(partnerRow.get("telefon"));
        tfAdress.setText(partnerRow.get("adress"));
        tfBranch.setText(partnerRow.get("branch"));
        tfStad.setText(stadNamn);


    }//GEN-LAST:event_btnHämtaActionPerformed
    /**
     * Event handler for the Ändra button. Updates the selected partner's
     * details in the database based on the values entered in the form fields.
     *
     * Steps: - Validates the input data for correctness (e.g., name, phone
     * number). - Retrieves the city's ID based on the entered city name. -
     * Updates the partner's details in the database. - Displays appropriate
     * messages for success or failure.
     *
     * @param evt the ActionEvent triggered when the button is clicked.
     */
    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        // ta in info från textfield
        String pid = lblPid.getText();
        String namn = tfNamn.getText();
        String kontaktPerson = tfKontaktPerson.getText();
        String epost = tfEpost.getText();
        String telefon = tfTelefon.getText();
        String adress = tfAdress.getText();
        String branch = tfBranch.getText();
        String stadNamn = tfStad.getText();

        if (!Validator.isValidName(namn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Namn får endast bestå av bokstäver och mellanslag.");
            return;
        }
        if (!Validator.isValidName(kontaktPerson)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Kontakt person får endast innehålla bokstäver och mellanslag.");
            return;
        }
        if (Validator.isValidPhoneNumber(telefon)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Telefon numret måste vara av formatet XXX-XXX-XXXX");
            return;
        }
        if (!Validator.isValidName(stadNamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Stadens namn får endast innehålla bokstäver och mellanslag.");
            return;
        }

        // få ut stad id
        String sid = null;

        String getSidQuery = "SELECT sid FROM stad WHERE namn = '" + stadNamn + "'";

        try {
            sid = idb.fetchSingle(getSidQuery);
        } catch (InfException e) {
            lblMsgBottom.setText("Error: databasen har problem med att hitta stadens id");
        }
        // update set where alla uppgifter

        String updateQuery = "UPDATE partner SET namn = '" + namn + "', kontaktperson = '" + kontaktPerson + "', "
                + "kontaktepost = '" + epost + "', telefon = '" + telefon + "', adress = '" + adress + "',"
                + "branch = '" + branch + "', stad = '" + sid + "' WHERE pid = '" + pid + "'";

        try {
            idb.update(updateQuery);
            lblMsgBottom.setText("Partnern har uppdaterats");
        } catch (InfException e) {
            lblMsgBottom.setText("Problem med att uppdatera partner i databasen");
        }


    }//GEN-LAST:event_btnÄndraActionPerformed

    /**
     * Deletes a partner from the database. This method removes the partner from
     * the `projekt_partner` table and then from the `partner` table based on
     * the `pid` displayed in the UI. Displays an appropriate message in the UI.
     *
     * @param evt the action event triggered when the "Ta Bort" button is
     * clicked.
     */
    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed

        String pid = lblPid.getText();

        String deleteProjektPartnerQuery = "DELETE FROM projekt_partner WHERE partner_pid = '" + pid + "'";

        String deletePartnerQuery = "DELETE FROM partner WHERE pid = '" + pid + "'";

        try {
            idb.delete(deleteProjektPartnerQuery);
            idb.delete(deletePartnerQuery);
            lblMsgBottom.setText("Partner: " + pid + " Har tagits bort");
        } catch (InfException e) {
            lblMsgBottom.setText("Kunde inte ta bort partner " + pid);
        }

    }//GEN-LAST:event_btnTaBortActionPerformed

    /**
     * Adds a new partner to the database. This method collects data from input
     * fields, validates the input, retrieves the city ID (sid), and inserts a
     * new partner into the database. Displays an appropriate success or error
     * message.
     *
     * @param evt the action event triggered when the "Lägg Till" button is
     * clicked.
     */
    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        // TODO add your handling code here:
        // ta in info från textfield
        // omvandla stadens namn till sid
        String pid = null;

        try {
            pid = idb.getAutoIncrement("partner", "pid");
        } catch (InfException e) {
            lblMsgBottom.setText("Problem med att incrementera partner id");
        }
        String namn = tfNamn.getText();
        String kontaktPerson = tfKontaktPerson.getText();
        String epost = tfEpost.getText();
        String telefon = tfTelefon.getText();
        String adress = tfAdress.getText();
        String branch = tfBranch.getText();
        String stadNamn = tfStad.getText();

        if (!Validator.isValidName(namn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Namn får endast bestå av bokstäver och mellanslag.");
            return;
        }
        if (!Validator.isValidName(kontaktPerson)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Kontakt person får endast innehålla bokstäver och mellanslag.");
            return;
        }
        if (Validator.isValidPhoneNumber(telefon)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Telefon numret måste vara av formatet XXX-XXX-XXXX");
            return;
        }
        if (!Validator.isValidName(stadNamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Stadens namn får endast innehålla bokstäver och mellanslag.");
            return;
        }

        // Få stadens sid
        String sid = null;

        String getSidQuery = "SELECT sid FROM stad WHERE namn = '" + stadNamn + "'";

        try {
            sid = idb.fetchSingle(getSidQuery);
        } catch (InfException e) {
            lblMsgBottom.setText("Problem med att få stadens id");
        }

        // gör insert query och ge meddelanden
        String insertQuery = "INSERT INTO partner VALUES(" + pid + ",'" + namn + "','" + kontaktPerson + "','"
                + epost + "','" + telefon + "','" + adress + "','" + branch + "','" + sid + "')";

        try {
            idb.insert(insertQuery);
            lblMsgBottom.setText("Partnern har tillagts");
        } catch (InfException e) {
            lblMsgBottom.setText("Problem med databasen att lägga till partnern");
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
            java.util.logging.Logger.getLogger(AdminPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminPartner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lblMsgBottom;
    private javax.swing.JLabel lblMsgTop;
    private javax.swing.JLabel lblPid;
    private javax.swing.JTextField tfAdress;
    private javax.swing.JTextField tfBranch;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfInputNamn;
    private javax.swing.JTextField tfKontaktPerson;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfStad;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables
}
