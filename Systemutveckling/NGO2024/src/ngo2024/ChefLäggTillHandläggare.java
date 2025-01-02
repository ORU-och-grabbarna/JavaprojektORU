/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jamie
 */
public class ChefLäggTillHandläggare extends javax.swing.JFrame {
    
    
    private InfDB idb;
    private String inloggadAnvandare;

    /**
     * Creates new form ChefLäggTillHandläggare
     */
    public ChefLäggTillHandläggare(InfDB idb, String inloggadAnvandare) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        initComponents();
        fyllKoppladeHandlaggareTabell();
        fyllEjKoppladeHandlaggare();
        fyllTillgangligaProjektTabell();
        tfFornamn.setText("");
        tfEfternamn.setText("");
        tfProjektnamn.setText("");
    }
    
    
    
    
    
    
    /**
     * Populates the table with handlers currently connected to the logged-in user's projects.
     * <p>
     * Retrieves handler data such as first name, last name, responsibility area, and project name
     * and displays it in the "Kopplade Handläggare" table.
     * </p>
     */
    private void fyllKoppladeHandlaggareTabell() {
    try {
        String sql = "SELECT anstalld.fornamn, anstalld.efternamn, handlaggare.ansvarighetsomrade, projekt.projektnamn " +
                     "FROM anstalld " +
                     "JOIN handlaggare ON anstalld.aid = handlaggare.aid " +
                     "JOIN ans_proj ON anstalld.aid = ans_proj.aid " +
                     "JOIN projekt ON ans_proj.pid = projekt.pid " +
                     "WHERE projekt.projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
        
        ArrayList<HashMap<String, String>> handlaggare = idb.fetchRows(sql);

        DefaultTableModel model = new DefaultTableModel(new String[]{"Förnamn", "Efternamn", "Ansvarighetsområde", "Projektnamn"}, 0);
        tblKoppladeHandlaggare.setModel(model);

        for (HashMap<String, String> rad : handlaggare) {
            model.addRow(new Object[]{rad.get("fornamn"), rad.get("efternamn"), rad.get("ansvarighetsomrade"), rad.get("projektnamn")});
        }

    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fel vid hämtning av kopplade handläggare: " + e.getMessage());
    }
}
    
    
    /**
     * Checks whether a specified handler is already connected to a specified project.
     *
     * @param fornamn    the first name of the handler.
     * @param efternamn  the last name of the handler.
     * @param projektnamn the name of the project.
     * @return {@code true} if the handler is already connected to the project; {@code false} otherwise.
     */
    private boolean kontrolleraOmKopplingFinns(String fornamn, String efternamn, String projektnamn) {
    try {
        String sqlKollaKoppling = "SELECT COUNT(*) FROM ans_proj " +
                                  "WHERE aid = (SELECT aid FROM anstalld WHERE fornamn = '" + fornamn + "' AND efternamn = '" + efternamn + "') " +
                                  "AND pid = (SELECT pid FROM projekt WHERE projektnamn = '" + projektnamn + "')";
        String antalKopplingar = idb.fetchSingle(sqlKollaKoppling);

        System.out.println("Kontrollerar koppling för handläggare: " + fornamn + " " + efternamn + ", projekt: " + projektnamn);
        System.out.println("Resultat från COUNT: " + antalKopplingar);

        return !antalKopplingar.equals("0");
    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fel vid kontroll av koppling: " + e.getMessage());
        return true;
    }
}


    /**
     * Populates the table with handlers not connected to any of the logged-in user's projects.
     * <p>
     * Retrieves handler data such as first name, last name, and responsibility area
     * and displays it in the "Ej Kopplade Handläggare" table.
     * </p>
     */
    private void fyllEjKoppladeHandlaggare() {
    try {
        String sql = "SELECT anstalld.fornamn, anstalld.efternamn, handlaggare.ansvarighetsomrade " +
                     "FROM anstalld " +
                     "JOIN handlaggare ON anstalld.aid = handlaggare.aid " +
                     "WHERE anstalld.aid NOT IN ( " +
                     "    SELECT aid FROM ans_proj " +
                     "    WHERE pid IN ( " +
                     "        SELECT pid FROM projekt " +
                     "        WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "') " +
                     "    ) " +
                     ")";

        ArrayList<HashMap<String, String>> ejKoppladeHandlaggare = idb.fetchRows(sql);

        DefaultTableModel model = new DefaultTableModel(new String[]{"Förnamn", "Efternamn", "Ansvarighetsområde"}, 0);
        tblEjKoppladeHandlaggare.setModel(model);

        if (ejKoppladeHandlaggare != null) {
            for (HashMap<String, String> rad : ejKoppladeHandlaggare) {
                model.addRow(new Object[]{rad.get("fornamn"), rad.get("efternamn"), rad.get("ansvarighetsomrade")});
            }
        }
    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fel vid hämtning av ej kopplade handläggare: " + e.getMessage());
    }
}
    
    
    
    
    /**
     * Populates the table with the names of projects managed by the logged-in user.
     */
    private void fyllTillgangligaProjektTabell() {
    try {
        String sql = "SELECT projektnamn FROM projekt " +
                     "WHERE projektchef IN (SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare + "')";
        
        ArrayList<HashMap<String, String>> projekt = idb.fetchRows(sql);

        DefaultTableModel model = new DefaultTableModel(new String[]{"Tillgängliga projekt"}, 0);
        tblTillgangligaProjekt.setModel(model);

        for (HashMap<String, String> rad : projekt) {
            model.addRow(new Object[]{rad.get("projektnamn")});
        }

    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fel vid hämtning av tillgängliga projekt: " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEjKoppladeHandlaggare = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKoppladeHandlaggare = new javax.swing.JTable();
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblProjektnamn = new javax.swing.JLabel();
        tfFornamn = new javax.swing.JTextField();
        tfEfternamn = new javax.swing.JTextField();
        tfProjektnamn = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTillgangligaProjekt = new javax.swing.JTable();
        btnLaggTillHandlaggare = new javax.swing.JButton();
        btnTaBortHandlaggare = new javax.swing.JButton();
        lblTillgangliga = new javax.swing.JLabel();
        lblAktiva = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblEjKoppladeHandlaggare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEjKoppladeHandlaggare);

        tblKoppladeHandlaggare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblKoppladeHandlaggare);

        lblFornamn.setText("Förnamn:");

        lblEfternamn.setText("Efternamn:");

        lblProjektnamn.setText("Projektnamn:");

        tfFornamn.setText("tfFornamn");

        tfEfternamn.setText("tfEfternamn");

        tfProjektnamn.setText("tfProjektnamn");

        tblTillgangligaProjekt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(tblTillgangligaProjekt);

        btnLaggTillHandlaggare.setText("Lägg till handläggare");
        btnLaggTillHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillHandlaggareActionPerformed(evt);
            }
        });

        btnTaBortHandlaggare.setText("Ta bort handläggare");
        btnTaBortHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortHandlaggareActionPerformed(evt);
            }
        });

        lblTillgangliga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTillgangliga.setText("Tillgängliga handläggare");

        lblAktiva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAktiva.setText("Aktiva handläggare");

        jLabel2.setText("Skriv in handläggarens förnamn samt efternamn och projektets");

        jLabel3.setText("namn för att lägga till eller ta bort en handläggare i projektet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnLaggTillHandlaggare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaBortHandlaggare)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEfternamn)
                    .addComponent(lblFornamn)
                    .addComponent(lblProjektnamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfFornamn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(tfEfternamn))
                    .addComponent(tfProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(287, 287, 287)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTillgangliga)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAktiva)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTillgangliga)
                    .addComponent(lblAktiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillHandlaggare)
                    .addComponent(btnTaBortHandlaggare))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFornamn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEfternamn)
                            .addComponent(tfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProjektnamn)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**
     * Adds a handler to a specified project.
     * <p>
     * Validates user input, checks if the handler is already connected to the project,
     * and then inserts the connection into the database.
     * </p>
     *
     * @param evt the event triggered by clicking the "Lägg till handläggare" button.
     */
    private void btnLaggTillHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillHandlaggareActionPerformed
        
    try {
        String fornamn = tfFornamn.getText().trim();
        String efternamn = tfEfternamn.getText().trim();
        String projektnamn = tfProjektnamn.getText().trim();

        if (fornamn.isEmpty() || efternamn.isEmpty() || projektnamn.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fyll i förnamn, efternamn och projektnamn!");
            return;
        }
        
        if (!Validator.isValidName(fornamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, 
    "Ogiltigt namn! Endast bokstäver och mellanslag är tillåtna.", 
    "Valideringsfel", 
    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!Validator.isValidName(efternamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, 
    "Ogiltigt namn! Endast bokstäver och mellanslag är tillåtna.", 
    "Valideringsfel", 
    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        

        
        if (kontrolleraOmKopplingFinns(fornamn, efternamn, projektnamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Handläggaren är redan kopplad till projektet.");
            return;
        }

      
        String sqlLaggTillKoppling = "INSERT INTO ans_proj (aid, pid) " +
                                     "VALUES ((SELECT aid FROM anstalld WHERE fornamn = '" + fornamn + "' AND efternamn = '" + efternamn + "'), " +
                                     "(SELECT pid FROM projekt WHERE projektnamn = '" + projektnamn + "'))";
        idb.insert(sqlLaggTillKoppling);

        javax.swing.JOptionPane.showMessageDialog(this, "Handläggaren \"" + fornamn + " " + efternamn + "\" har lagts till i projektet \"" + projektnamn + "\".");

        
        tfFornamn.setText("");
        tfEfternamn.setText("");
        tfProjektnamn.setText("");

        
        fyllKoppladeHandlaggareTabell();
        fyllEjKoppladeHandlaggare();

    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fel vid lägg till: " + e.getMessage());
    }


    }//GEN-LAST:event_btnLaggTillHandlaggareActionPerformed

    
    /**
     * Updates both the "Kopplade Handläggare" and "Ej Kopplade Handläggare" tables with fresh data.
     */
    
    private void uppdateraTabeller() {
      fyllKoppladeHandlaggareTabell();
      fyllEjKoppladeHandlaggare();
}
    
    
    
    
    
    
     /**
     * Removes a handler from a specified project.
     * <p>
     * Validates user input, checks if the handler is connected to the project,
     * and then removes the connection from the database.
     * </p>
     *
     * @param evt the event triggered by clicking the "Ta bort handläggare" button.
     */
    private void btnTaBortHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortHandlaggareActionPerformed
        
    try {
        String fornamn = tfFornamn.getText().trim();
        String efternamn = tfEfternamn.getText().trim();
        String projektnamn = tfProjektnamn.getText().trim();

        if (fornamn.isEmpty() || efternamn.isEmpty() || projektnamn.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fyll i förnamn, efternamn och projektnamn!");
            return;
        }
        
        if (!Validator.isValidName(fornamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, 
    "Ogiltigt namn! Endast bokstäver och mellanslag är tillåtna.", 
    "Valideringsfel", 
    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!Validator.isValidName(efternamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, 
    "Ogiltigt namn! Endast bokstäver och mellanslag är tillåtna.", 
    "Valideringsfel", 
    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (!kontrolleraOmKopplingFinns(fornamn, efternamn, projektnamn)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Handläggaren är inte kopplad till projektet.");
            return;
        }

        
        String sqlTaBortKoppling = "DELETE FROM ans_proj WHERE aid = " +
                                   "(SELECT aid FROM anstalld WHERE fornamn = '" + fornamn + "' AND efternamn = '" + efternamn + "') " +
                                   "AND pid = (SELECT pid FROM projekt WHERE projektnamn = '" + projektnamn + "')";
        idb.delete(sqlTaBortKoppling);

        javax.swing.JOptionPane.showMessageDialog(this, "Handläggaren \"" + fornamn + " " + efternamn + "\" har tagits bort från projektet \"" + projektnamn + "\".");

        
        tfFornamn.setText("");
        tfEfternamn.setText("");
        tfProjektnamn.setText("");

        
        fyllKoppladeHandlaggareTabell();
        fyllEjKoppladeHandlaggare();

    } catch (InfException e) {
        javax.swing.JOptionPane.showMessageDialog (this, "Fel vid borttagning: " + e.getMessage());
    
}

    }//GEN-LAST:event_btnTaBortHandlaggareActionPerformed

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
            java.util.logging.Logger.getLogger(ChefLäggTillHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChefLäggTillHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChefLäggTillHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChefLäggTillHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ChefLäggTillHandläggare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillHandlaggare;
    private javax.swing.JButton btnTaBortHandlaggare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAktiva;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblProjektnamn;
    private javax.swing.JLabel lblTillgangliga;
    private javax.swing.JTable tblEjKoppladeHandlaggare;
    private javax.swing.JTable tblKoppladeHandlaggare;
    private javax.swing.JTable tblTillgangligaProjekt;
    private javax.swing.JTextField tfEfternamn;
    private javax.swing.JTextField tfFornamn;
    private javax.swing.JTextField tfProjektnamn;
    // End of variables declaration//GEN-END:variables
}
