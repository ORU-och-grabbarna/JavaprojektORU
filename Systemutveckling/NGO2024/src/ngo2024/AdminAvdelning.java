/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Mohammed
 */
public class AdminAvdelning extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form AdminAvdelning
     */
    public AdminAvdelning(InfDB idb) {
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

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfInputAvdelning = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfBeskrivning = new javax.swing.JTextField();
        tfAdress = new javax.swing.JTextField();
        tfChefFörnamn = new javax.swing.JTextField();
        tfStad = new javax.swing.JTextField();
        tfTelefon = new javax.swing.JTextField();
        tfEpost = new javax.swing.JTextField();
        tfNamn = new javax.swing.JTextField();
        lblAvdid = new javax.swing.JLabel();
        btnHämta = new javax.swing.JButton();
        btnLäggTill = new javax.swing.JButton();
        lblMeddellandeBottom = new javax.swing.JLabel();
        btnÄndra = new javax.swing.JButton();
        lblMeddelandeTop = new javax.swing.JLabel();
        tfChefEfternamn = new javax.swing.JTextField();

        jTextField2.setColumns(10);
        jTextField2.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Admin avdelning kontroller");

        jLabel2.setText("Avdelningsnamn");

        tfInputAvdelning.setColumns(10);
        tfInputAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputAvdelningActionPerformed(evt);
            }
        });

        jLabel3.setText("Avdid");

        jLabel4.setText("Namn");

        jLabel5.setText("beskrivning");

        jLabel6.setText("adress");

        jLabel7.setText("epost");

        jLabel8.setText("telefon");

        jLabel9.setText("stad");

        jLabel10.setText("Chef för- och efternamn");

        tfBeskrivning.setColumns(10);

        tfAdress.setColumns(10);

        tfChefFörnamn.setColumns(10);

        tfStad.setColumns(10);

        tfTelefon.setColumns(10);

        tfEpost.setColumns(10);

        tfNamn.setColumns(10);

        lblAvdid.setText("Avdid");

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        btnLäggTill.setText("Lägg till Avdelning");

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        tfChefEfternamn.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMeddellandeBottom)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfChefFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfChefEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8))
                                    .addGap(63, 63, 63)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblAvdid)
                                            .addGap(93, 93, 93))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfStad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(35, 35, 35))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLäggTill)
                            .addComponent(btnÄndra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMeddelandeTop)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfInputAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(btnHämta)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfInputAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMeddelandeTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAvdid))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnÄndra))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfChefFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfChefEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLäggTill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMeddellandeBottom)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        // TODO add your handling code here:
        // få ut info om avdelningen med namnet
     
        String InputAvdelningsnamn = tfInputAvdelning.getText();
        
        String QueryAvdelning = "SELECT * FROM avdelning WHERE namn LIKE '%" + InputAvdelningsnamn + "%'";
        HashMap<String, String> AvdelningsRow = new HashMap<String,String>();
        
        try {
            AvdelningsRow = idb.fetchRow(QueryAvdelning);
        } catch (InfException ex) {
            lblMeddelandeTop.setText("Problem med att hitta info om avdelningen");
        }
        
        // mata in värdena i textfields
        lblAvdid.setText(AvdelningsRow.get("avdid"));
        tfNamn.setText(AvdelningsRow.get("namn"));
        tfBeskrivning.setText(AvdelningsRow.get("beskrivning"));
        tfAdress.setText(AvdelningsRow.get("adress"));
        tfEpost.setText(AvdelningsRow.get("epost"));
        tfTelefon.setText(AvdelningsRow.get("telefon"));
        
        // få ut stadnamn och chef namn from sid(stad) och aid(chef)
        
        String fåStadNamnQuery = "SELECT namn FROM stad WHERE sid = " + AvdelningsRow.get("stad");
        String stadNamn = "";
        
        try{
            stadNamn = idb.fetchSingle(fåStadNamnQuery);
            tfStad.setText(stadNamn);
        }catch (InfException e){
            lblMeddelandeTop.setText("Problem med att hitta stadens namn");
        }
        
        // chef namn
        
        String fåChefensNamn = "SELECT fornamn, efternamn FROM anstalld WHERE aid = " + AvdelningsRow.get("chef");
        HashMap<String, String> chefensNamn = new HashMap<String, String>();
        
        try{
            chefensNamn = idb.fetchRow(fåChefensNamn);
            tfChefFörnamn.setText(chefensNamn.get("fornamn"));
            tfChefEfternamn.setText(chefensNamn.get("efternamn"));
        } catch (InfException e){
            lblMeddelandeTop.setText("Problem med att hitta chefens namn");
        }
        
        
        
        
    }//GEN-LAST:event_btnHämtaActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        // ta in data från textfields
        String avdid = lblAvdid.getText();
        String namn = tfNamn.getText();
        String beskrivning = tfBeskrivning.getText();
        String adress = tfAdress.getText();
        String epost = tfEpost.getText();
        String telefon = tfTelefon.getText();
        String stadNamn = tfStad.getText();
        String chefFörnamn = tfChefFörnamn.getText();
        String chefEfternamn = tfChefEfternamn.getText();
        
        // omvandla namn och stad till aid och sid
        // stad
        
        String hittaSid = "SELECT sid FROM stad WHERE namn = '" + stadNamn + "'";
        String sid = "";
        try{
            sid = idb.fetchSingle(hittaSid);
        }catch (InfException e){
            lblMeddelandeTop.setText("Problem med att hitta stadens id");
        }
        
        // Chef
        String hittaAid = "SELECT aid FROM anstalld WHERE fornamn = '"+ chefFörnamn +"' AND efternamn = '" + chefEfternamn + "'";
        String aid = "";
        
        try{
            aid = idb.fetchSingle(hittaAid);
        } catch (InfException e){
            lblMeddelandeTop.setText("Problem med att hitta chefens anställnings id");
        }
        
        // Uppdatera set where ändringarna
        String uppdateraAvdelning;
        
        if(aid == null || aid.isEmpty()){
        uppdateraAvdelning = "UPDATE avdelning SET namn = '" + namn + "', beskrivning = '" + beskrivning + "', adress = '" 
                + adress + "', epost = '" + epost + "', telefon = '" + telefon + "', stad = '" + sid + "'" + "WHERE avdid = '" + avdid + "'" ;
        }else{
            uppdateraAvdelning = "UPDATE avdelning SET namn = '" + namn + "', beskrivning = '" + beskrivning + "', adress = '" 
                + adress + "', epost = '" + epost + "', telefon = '" + telefon + "', stad = '" + sid + "', chef = '" + aid + "'" +  "WHERE avdid = '" + avdid + "'";
        }
        
        
        try{
            idb.update(uppdateraAvdelning);
            lblMeddelandeTop.setText("Avdelning uppdateras");
        } catch (InfException e){
            lblMeddelandeTop.setText("Problem med att uppdatera avdelning i databasen");
        }
        
       
    }//GEN-LAST:event_btnÄndraActionPerformed

    private void tfInputAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputAvdelningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfInputAvdelningActionPerformed

    
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
            java.util.logging.Logger.getLogger(AdminAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminAvdelning().setVisible(true);
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAvdid;
    private javax.swing.JLabel lblMeddelandeTop;
    private javax.swing.JLabel lblMeddellandeBottom;
    private javax.swing.JTextField tfAdress;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfChefEfternamn;
    private javax.swing.JTextField tfChefFörnamn;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfInputAvdelning;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfStad;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables
}
