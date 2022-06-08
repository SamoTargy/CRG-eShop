package obchodik2;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Prihlasenie extends javax.swing.JFrame {
  
    Connection connO;        //
    ResultSet rs;            //makará pre databazu
    PreparedStatement pst;   //
    /**
     * Creates new form Prihlásenie
     */
    public Prihlasenie() {
        initComponents();
        connO = obchodik2connect.ConnectDb();  //makro na prepojenie s databazovS
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrihlaseniePanel = new javax.swing.JPanel();
        PrihlasenieLabel = new javax.swing.JLabel();
        MenoLabel = new javax.swing.JLabel();
        MenoTextField = new javax.swing.JTextField();
        HesloLabel = new javax.swing.JLabel();
        HesloPasswordField = new javax.swing.JPasswordField();
        NemamUcetButton = new javax.swing.JButton();
        ZrusitButton = new javax.swing.JButton();
        PrihlasitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 144, 255));

        PrihlaseniePanel.setBackground(new java.awt.Color(30, 144, 255));

        PrihlasenieLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        PrihlasenieLabel.setText("Prihlásenie");

        javax.swing.GroupLayout PrihlaseniePanelLayout = new javax.swing.GroupLayout(PrihlaseniePanel);
        PrihlaseniePanel.setLayout(PrihlaseniePanelLayout);
        PrihlaseniePanelLayout.setHorizontalGroup(
            PrihlaseniePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrihlaseniePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(PrihlasenieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrihlaseniePanelLayout.setVerticalGroup(
            PrihlaseniePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrihlaseniePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrihlasenieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenoLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        MenoLabel.setText("Prihlas. Meno:");

        HesloLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        HesloLabel.setText("Heslo:");

        HesloPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HesloPasswordFieldActionPerformed(evt);
            }
        });
        HesloPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HesloPasswordFieldKeyPressed(evt);
            }
        });

        NemamUcetButton.setBackground(new java.awt.Color(30, 144, 255));
        NemamUcetButton.setText("Nemám účet");
        NemamUcetButton.setBorder(null);
        NemamUcetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NemamUcetButtonActionPerformed(evt);
            }
        });

        ZrusitButton.setBackground(new java.awt.Color(255, 0, 0));
        ZrusitButton.setText("Zrušiť");
        ZrusitButton.setBorder(null);
        ZrusitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZrusitButtonActionPerformed(evt);
            }
        });

        PrihlasitButton.setBackground(new java.awt.Color(204, 204, 255));
        PrihlasitButton.setText("Prihlásiť");
        PrihlasitButton.setBorder(null);
        PrihlasitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrihlasitButtonActionPerformed(evt);
            }
        });
        PrihlasitButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PrihlasitButtonKeyPressed(evt);
            }
        });

        jLabel4.setText("Heslo: admin");

        jLabel5.setText("Meno: 1");

        jLabel6.setText("Meno: admin");

        jLabel7.setText("Heslo: 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrihlaseniePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MenoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(HesloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NemamUcetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(ZrusitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(PrihlasitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PrihlaseniePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MenoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HesloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NemamUcetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrihlasitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ZrusitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HesloPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HesloPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HesloPasswordFieldActionPerformed

    private void PrihlasitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrihlasitButtonActionPerformed
        
        String sql1 = "select * from ucty where Meno=? and Heslo=?";         //
        String sql2 = "select * from uctyadmin where Meno=? and Heslo=?";    // php kod pre databazu  
        String sql3 = "update aktulanyucet set Meno=?, Priezvisko=?, PrihlasMeno=?, Heslo=?";   //    
        
        try {
            pst = connO.prepareStatement(sql1);               // vkladanie php kodu do databazy
            pst.setString(1, MenoTextField.getText());        // nacitanie a kontorla mena a heslo
            pst.setString(2, HesloPasswordField.getText());   //
            rs = pst.executeQuery();
            
            if(rs.next()){
                
                pst = connO.prepareStatement(sql1);                         //
                pst.setString(1, MenoTextField.getText());                  // nacitanie a kontorla mena a heslo
                pst.setString(2, HesloPasswordField.getText());             //
                pst.execute();                                              //
                
                String Meno = rs.getString("Meno");                         //
                String Priezvisko = rs.getString("Priezvisko");             //vyberanie dat do databazy a zapis do stringu
                String PrihlasMeno = rs.getString("PrihlasMeno");           //  
                String Heslo = rs.getString("Heslo");                       //
                pst.execute();   
                
                pst = connO.prepareStatement(sql3);                          //
                pst.setString(1, Meno);                                      //
                pst.setString(2, Priezvisko);                                //
                pst.setString(3, PrihlasMeno);                               // vkladanie dat do databazy
                pst.setString(4, Heslo);                                     //
                                                                             //
                pst.execute();                                               //
                rs.close();                                                  //
                pst.close();                                                 //
                
                Domov Domov = new Domov(); // Zadefinuje Jframe(Domov)
                Domov.show(); // Zobrazí Jframe(Domov)
                dispose(); // Zatvoí povodný Jframe
            
            }
            else{
                pst = connO.prepareStatement(sql2);             // vkladanie php kodu do databazy
                pst.setString(1, MenoTextField.getText());      // nacitanie a kontorla mena a heslo (admin
                pst.setString(2, HesloPasswordField.getText()); //
                rs = pst.executeQuery();            

                if(rs.next()){
                    rs.close();
                    pst.close();

                    Statistiky Statistiky = new Statistiky(); // Zadefinuje Jframe(Statistiky)
                    Statistiky.show(); // Zobrazí Jframe(Statistiky)
                    dispose(); // Zatvoí povodný Jframe                

                }
                else{
                    JOptionPane.showMessageDialog(this,"Neplatné alebo Zle zadané prihlasovacie údaje.","LOGIN_ERROR",JOptionPane.ERROR_MESSAGE); //Error message
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
            rs.close();
            pst.close();
        }catch(Exception e){
        }
                }
      
    }//GEN-LAST:event_PrihlasitButtonActionPerformed

    private void ZrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZrusitButtonActionPerformed
           
        System.exit(0); // Ukončí všetky úkony a zatvorí program
            
    }//GEN-LAST:event_ZrusitButtonActionPerformed

    private void NemamUcetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NemamUcetButtonActionPerformed
            
            NovyUcet NovyUcet = new NovyUcet(); // Zadefinuje Jframe(NovyUcet)
            NovyUcet.show(); // Zobrazí Jframe(NovyUcet)
            dispose(); // Zatvoí povodný Jframe
            
    }//GEN-LAST:event_NemamUcetButtonActionPerformed

    private void PrihlasitButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrihlasitButtonKeyPressed

    }//GEN-LAST:event_PrihlasitButtonKeyPressed

    private void HesloPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HesloPasswordFieldKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            String sql1 = "select * from ucty where PrihlasMeno=? and Heslo=?";                     //
            String sql2 = "select * from uctyadmin where Meno=? and Heslo=?";                       // php kod pre databazu  
            String sql3 = "update aktulanyucet set Meno=?, Priezvisko=?, PrihlasMeno=?, Heslo=?";   //    

            try {
                pst = connO.prepareStatement(sql1);               // vkladanie php kodu do databazy
                pst.setString(1, MenoTextField.getText());        // nacitanie a kontorla prihlasovacieho mena a heslo
                pst.setString(2, HesloPasswordField.getText());   //
                rs = pst.executeQuery();

                if(rs.next()){

                    pst = connO.prepareStatement(sql1);                         //
                    pst.setString(1, MenoTextField.getText());                  // nacitanie a kontorla mena a heslo
                    pst.setString(2, HesloPasswordField.getText());             //
                    pst.execute();                                              //

                    String Meno = rs.getString("Meno");                         //
                    String Priezvisko = rs.getString("Priezvisko");             //vyberanie dat do databazy a zapis do stringu
                    String PrihlasMeno = rs.getString("PrihlasMeno");           //  
                    String Heslo = rs.getString("Heslo");                       //
                    pst.execute();   

                    pst = connO.prepareStatement(sql3);                          //
                    pst.setString(1, Meno);                                      //
                    pst.setString(2, Priezvisko);                                //
                    pst.setString(3, PrihlasMeno);                               // vkladanie dat do databazy
                    pst.setString(4, Heslo);                                     //

                    pst.execute();                                               //
                    rs.close();                                                  //
                    pst.close();                                                 //

                    Domov Domov = new Domov(); // Zadefinuje Jframe(Domov)
                    Domov.show(); // Zobrazí Jframe(Domov)
                    dispose(); // Zatvoí povodný Jframe

                }
                else{
                    pst = connO.prepareStatement(sql2);             // vkladanie php kodu do databazy
                    pst.setString(1, MenoTextField.getText());      // nacitanie a kontorla mena a heslo (admin
                    pst.setString(2, HesloPasswordField.getText()); //
                    rs = pst.executeQuery();            

                    if(rs.next()){
                        rs.close();
                        pst.close();

                        Statistiky Statistiky = new Statistiky(); // Zadefinuje Jframe(Statistiky)
                        Statistiky.show(); // Zobrazí Jframe(Statistiky)
                        dispose(); // Zatvoí povodný Jframe                

                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Neplatné alebo Zle zadané prihlasovacie údaje.","LOGIN_ERROR",JOptionPane.ERROR_MESSAGE); //Error message
                    }
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                rs.close();
                pst.close();
            }catch(Exception e){
            }
            }

        }

    }//GEN-LAST:event_HesloPasswordFieldKeyPressed

    

    
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
            java.util.logging.Logger.getLogger(Prihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prihlasenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prihlasenie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HesloLabel;
    public static javax.swing.JPasswordField HesloPasswordField;
    private javax.swing.JLabel MenoLabel;
    public static javax.swing.JTextField MenoTextField;
    private javax.swing.JButton NemamUcetButton;
    private javax.swing.JLabel PrihlasenieLabel;
    private javax.swing.JPanel PrihlaseniePanel;
    private javax.swing.JButton PrihlasitButton;
    private javax.swing.JButton ZrusitButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
