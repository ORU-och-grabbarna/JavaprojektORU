/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.Random;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * This class represents a GUI for adding a new anställd to the system. The user
 * can input employee details, and the system will validate the inputs before
 * inserting the data into the database. Additionally, the user can generate a
 * random password for the new employee.
 *
 * @author Mohammed
 */
public class LäggTillAnställd extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String process;

    /**
     * Constructs a new LäggTillAnställd JFrame. Initializes the form components
     * and sets the database connection.
     *
     * @param idb The InfDB instance to interact with the database.
     */
    public LäggTillAnställd(InfDB idb) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfFörnamnOrNivå = new javax.swing.JTextField();
        tfEfternamnOrMentor = new javax.swing.JTextField();
        tfAdress = new javax.swing.JTextField();
        tfEpost = new javax.swing.JTextField();
        tfTelefon = new javax.swing.JTextField();
        tfAnsDatum = new javax.swing.JTextField();
        tfLösen = new javax.swing.JTextField();
        slumpaLösenord = new javax.swing.JButton();
        läggTillAnställdOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfAvdelning = new javax.swing.JTextField();
        lblSuccess = new javax.swing.JLabel();
        lblSuccess2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lägg till anställd");

        jLabel3.setText("Förnamn");

        jLabel4.setText("Efternamn");

        jLabel5.setText("adress");

        jLabel6.setText("epost");

        jLabel7.setText("telefon");

        jLabel8.setText("Anställningsdatum");

        jLabel9.setText("Lösenord");

        tfFörnamnOrNivå.setColumns(10);

        tfEfternamnOrMentor.setColumns(10);

        tfAdress.setColumns(10);

        tfEpost.setColumns(10);

        tfTelefon.setColumns(10);

        tfAnsDatum.setColumns(10);

        tfLösen.setColumns(10);

        slumpaLösenord.setText("Slumpa Lösenord");
        slumpaLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slumpaLösenordActionPerformed(evt);
            }
        });

        läggTillAnställdOK.setText("OK");
        läggTillAnställdOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggTillAnställdOKActionPerformed(evt);
            }
        });

        jLabel2.setText("Avdelning");

        tfAvdelning.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEfternamnOrMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfFörnamnOrNivå, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                        .addComponent(lblSuccess))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lblSuccess2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(läggTillAnställdOK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAnsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfAvdelning)
                                    .addComponent(tfLösen))
                                .addGap(53, 53, 53)
                                .addComponent(slumpaLösenord)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSuccess2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFörnamnOrNivå, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSuccess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEfternamnOrMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfAnsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slumpaLösenord)
                    .addComponent(jLabel2)
                    .addComponent(tfAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(läggTillAnställdOK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * ActionListener for the Slumpa Lösenord button. When clicked, it generates
     * a random password and sets it in the Lösenord text field.
     *
     * @param evt The ActionEvent triggered by clicking the "Slumpa Lösenord"
     * button.
     */
    private void slumpaLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slumpaLösenordActionPerformed
        // TODO add your handling code here:
        int length = 10;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        tfLösen.setText(password.toString());

    }//GEN-LAST:event_slumpaLösenordActionPerformed
    /**
     * ActionListener for the OK button to add a new employee. It collects the
     * data from the form, validates it, and attempts to insert it into the
     * database. If successful, it displays a success message, otherwise, it
     * shows an error message.
     *
     * @param evt The ActionEvent triggered by clicking the "OK" button.
     */
    private void läggTillAnställdOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggTillAnställdOKActionPerformed

        // Har svårt att få det att bli null programmet vägrar acceptera det
        try {
            this.aid = idb.getAutoIncrement("anstalld", "aid");
        } catch (InfException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Problem med att autoinkrementera aid.");
        }

        String förnamn = tfFörnamnOrNivå.getText();
        String efternamn = tfEfternamnOrMentor.getText();
        String adress = tfAdress.getText();
        String epost = tfEpost.getText();
        String telefon = tfTelefon.getText();
        String ansDatum = tfAnsDatum.getText();
        String lösen = tfLösen.getText();
        String avdelning = tfAvdelning.getText();

        if (!Validator.isValidName(förnamn) || !Validator.isValidName(efternamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "För- och efternamn får endast bestå av bokstäver och mellanslag.");
            return;
        }
        if (!Validator.isValidPhoneNumber(telefon)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Telefon numret måste vara av formatet XXX-XXX-XXXX");
            return;
        }
        if (!Validator.isValidDate(ansDatum)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Anställningsdatum behöver vara i formatet YYYY-MM-DD.");
            return;
        }

        try {

            String query = "INSERT INTO anstalld VALUES(" + this.aid + ",'" + förnamn + "','" + efternamn + "','" + adress + "','" + epost + "','"
                    + telefon + "','" + ansDatum + "','" + lösen + "','" + avdelning + "')";

            idb.insert(query);

            lblSuccess.setText("Operationen slutfördes");

          
            slumpaLösenord.setVisible(false);

        } catch (InfException ex) {
            lblSuccess.setText("Operationen misslyckades");
        }


    }//GEN-LAST:event_läggTillAnställdOKActionPerformed

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
            java.util.logging.Logger.getLogger(LäggTillAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LäggTillAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LäggTillAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LäggTillAnställd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new LäggTillAnställd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblSuccess;
    private javax.swing.JLabel lblSuccess2;
    private javax.swing.JButton läggTillAnställdOK;
    private javax.swing.JButton slumpaLösenord;
    private javax.swing.JTextField tfAdress;
    private javax.swing.JTextField tfAnsDatum;
    private javax.swing.JTextField tfAvdelning;
    private javax.swing.JTextField tfEfternamnOrMentor;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfFörnamnOrNivå;
    private javax.swing.JTextField tfLösen;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables
}
