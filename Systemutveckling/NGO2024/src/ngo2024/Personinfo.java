/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;
import ngo2024.Validator;
 import oru.inf.InfDB;
 import oru.inf.InfException;
/**
 *
 * @author diyar
 */
public class Personinfo extends javax.swing.JFrame {
    private InfDB idb;
    private String inloggadAnvandare;
    
    /**
     * Creates new form Personinfo
     */
    public Personinfo(InfDB idb,String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        visainfo();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txtfornamn = new javax.swing.JTextField();
        Txtefternamn = new javax.swing.JTextField();
        Txtadress = new javax.swing.JTextField();
        Txtepost = new javax.swing.JTextField();
        Txttelefon = new javax.swing.JTextField();
        Txtanstallningsdatum = new javax.swing.JTextField();
        Txtavdelning = new javax.swing.JTextField();
        Lblfornamn = new javax.swing.JLabel();
        Lblefternamn = new javax.swing.JLabel();
        lbladress = new javax.swing.JLabel();
        Lblepost = new javax.swing.JLabel();
        Lbltelefon = new javax.swing.JLabel();
        Lblavdelning = new javax.swing.JLabel();
        Lblanställningsdatum = new javax.swing.JLabel();
        Lblpersoninfo = new javax.swing.JLabel();
        Btnandra1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Txtfornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfornamnActionPerformed(evt);
            }
        });

        Txtefternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtefternamnActionPerformed(evt);
            }
        });

        Txttelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxttelefonActionPerformed(evt);
            }
        });

        Txtanstallningsdatum.setEditable(false);

        Lblfornamn.setText("Förnamn");

        Lblefternamn.setText("Efternamn");

        lbladress.setText("Adress");

        Lblepost.setText("Epost");

        Lbltelefon.setText("Telefon");

        Lblavdelning.setText("Avdelning");

        Lblanställningsdatum.setText("Anställningsdatum");

        Lblpersoninfo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Lblpersoninfo.setText("PERSONINFO");

        Btnandra1.setText("Ändra");
        Btnandra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnandra1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lblanställningsdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txtanstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Lbltelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lblefternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txtefternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lblfornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txtfornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lblavdelning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txtavdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbladress, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Lblepost, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Txtepost, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(64, 64, 64)
                .addComponent(Btnandra1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lblpersoninfo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Lblpersoninfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lblfornamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txtfornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txtefternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Lblefternamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btnandra1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbladress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lblepost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txtepost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbltelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtavdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lblavdelning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblanställningsdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txtanstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtfornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfornamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfornamnActionPerformed
    private void Btnandra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnandra1ActionPerformed
    String fornamn = Txtfornamn.getText().trim();
    String efternamn = Txtefternamn.getText().trim();
    String adress = Txtadress.getText().trim();
    String epost = Txtepost.getText().trim();
    String telefon = Txttelefon.getText().trim();
    String avdelning = Txtavdelning.getText().trim();
    if (!Validator.isValidName(fornamn)) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Ogiltigt förnamn! Endast bokstäver och mellanslag är tillåtna.",
            "Valideringsfel",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
     if (!Validator.isValidName(efternamn)) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Ogiltigt efternamn! Endast bokstäver och mellanslag är tillåtna.",
            "Valideringsfel",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
try {
     String updateQuery = "UPDATE anstalld SET "
                   + "fornamn = '" + fornamn + "', "
                   + "efternamn = '" + efternamn + "', "
                   + "adress = '" + adress + "', "
                   + "epost = '" + epost + "', "
                   + "telefon = '" + telefon + "', "
                   + "avdelning = '" + avdelning + "'"
                   + "WHERE epost = '" + inloggadAnvandare + "';";

idb.update(updateQuery);
}
catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog (this, "Fel vid uppdatering: " + e.getMessage());
    
    }//GEN-LAST:event_Btnandra1ActionPerformed
    }
    private void TxttelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxttelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxttelefonActionPerformed

    private void TxtefternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtefternamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtefternamnActionPerformed
    public void visainfo(){

        
        try{
            String fornamnsql  = "SELECT fornamn FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";
            String efternamnsql = "SELECT efternamn FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";
            String adresssql = "SELECT adress FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";        
            String telefonsql  = "SELECT telefon FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";
            String avdelningsql = "SELECT avdelning FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";
            String anstallningsdatumsql = "SELECT anstallningsdatum FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";
            String epostsql = "SELECT epost FROM anstalld WHERE epost = '" + inloggadAnvandare + "'";
            
            String fornamn = idb.fetchSingle(fornamnsql);
            String adress = idb.fetchSingle(adresssql);
            String efternamn = idb.fetchSingle(efternamnsql);
            String telefon = idb.fetchSingle(telefonsql);
            String avdelning = idb.fetchSingle(avdelningsql);
            String epost = idb.fetchSingle(epostsql);
            String anstallningsdatum = idb.fetchSingle(anstallningsdatumsql);

              
              Txtfornamn.setText(fornamn);
              Txtefternamn.setText(efternamn);
              Txtadress.setText(adress);
              Txtepost.setText(epost);
              Txttelefon.setText(telefon);
              Txtanstallningsdatum.setText(anstallningsdatum);
              Txtavdelning.setText(avdelning); 
        }
        
       
        catch(Exception ex){
            
        }
       
    }
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
            java.util.logging.Logger.getLogger(Personinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Personinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnandra1;
    private javax.swing.JLabel Lblanställningsdatum;
    private javax.swing.JLabel Lblavdelning;
    private javax.swing.JLabel Lblefternamn;
    private javax.swing.JLabel Lblepost;
    private javax.swing.JLabel Lblfornamn;
    private javax.swing.JLabel Lblpersoninfo;
    private javax.swing.JLabel Lbltelefon;
    private javax.swing.JTextField Txtadress;
    private javax.swing.JTextField Txtanstallningsdatum;
    private javax.swing.JTextField Txtavdelning;
    private javax.swing.JTextField Txtefternamn;
    private javax.swing.JTextField Txtepost;
    private javax.swing.JTextField Txtfornamn;
    private javax.swing.JTextField Txttelefon;
    private javax.swing.JLabel lbladress;
    // End of variables declaration//GEN-END:variables
}
