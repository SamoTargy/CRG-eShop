package obchodik2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class NovyUcet extends javax.swing.JFrame {
    /**
     * Creates new form NovyUcet
     */
    
    Connection connO;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public NovyUcet() {
        initComponents();
        connO = obchodik2connect.ConnectDb();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrihlaseniePanel = new javax.swing.JPanel();
        PrihlasenieLabel = new javax.swing.JLabel();
        MenoLabel = new javax.swing.JLabel();
        MenoTextField = new javax.swing.JTextField();
        PriezviskoLabel = new javax.swing.JLabel();
        PriezviskoTextField = new javax.swing.JTextField();
        PrihlasovacieMenoLabel = new javax.swing.JLabel();
        PrihlasovacieMenoTextField = new javax.swing.JTextField();
        HesloLabel = new javax.swing.JLabel();
        HesloPasswordField = new javax.swing.JPasswordField();
        UzMamUcetButton = new javax.swing.JButton();
        ZrusitButton = new javax.swing.JButton();
        RegistrovatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrihlaseniePanel.setBackground(new java.awt.Color(30, 144, 255));

        PrihlasenieLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        PrihlasenieLabel.setText("Registrácia");

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
        MenoLabel.setText("Meno:");

        PriezviskoLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        PriezviskoLabel.setText("Priezvisko:");

        PriezviskoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriezviskoTextFieldActionPerformed(evt);
            }
        });

        PrihlasovacieMenoLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        PrihlasovacieMenoLabel.setText("Prihlas. Meno:");

        HesloLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        HesloLabel.setText("Heslo:");

        HesloPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HesloPasswordFieldActionPerformed(evt);
            }
        });

        UzMamUcetButton.setBackground(new java.awt.Color(30, 144, 255));
        UzMamUcetButton.setText("Už mám účet");
        UzMamUcetButton.setBorder(null);
        UzMamUcetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UzMamUcetButtonActionPerformed(evt);
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

        RegistrovatButton.setBackground(new java.awt.Color(204, 204, 255));
        RegistrovatButton.setText("Registrovať sa");
        RegistrovatButton.setBorder(null);
        RegistrovatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrovatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrihlaseniePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MenoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(PrihlasovacieMenoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HesloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(HesloPasswordField)
                                    .addComponent(PrihlasovacieMenoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PriezviskoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PriezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UzMamUcetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ZrusitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(RegistrovatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PrihlaseniePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MenoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriezviskoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrihlasovacieMenoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrihlasovacieMenoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HesloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HesloPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UzMamUcetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RegistrovatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ZrusitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HesloPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HesloPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HesloPasswordFieldActionPerformed

    private void ZrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZrusitButtonActionPerformed

        System.exit(0); // Ukončí všetky úkony a zatvorí program

    }//GEN-LAST:event_ZrusitButtonActionPerformed

    private void RegistrovatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrovatButtonActionPerformed

        
                try{
            String sql2 = "select * from ucty where PrihlasMeno=?";
            String sql1 = "insert into ucty (Meno, Priezvisko, PrihlasMeno, Heslo) values (?,?,?,?)";
            
            pst = connO.prepareStatement(sql2);
            pst.setString(1, PrihlasovacieMenoTextField.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){               
                JOptionPane.showMessageDialog(this,"Učet s týmitoprohlasovacím menom už existuje.","LOGIN_ERROR",JOptionPane.ERROR_MESSAGE); //Error message
            }else{
                rs.close();
                pst.close();
            
                pst = connO.prepareStatement(sql1);
                pst.setString(1, MenoTextField.getText());
                pst.setString(2, PriezviskoTextField.getText());
                pst.setString(3, PrihlasovacieMenoTextField.getText());
                pst.setString(4, HesloPasswordField.getText());
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "<html><font face='Imprint MT Shadow' size='12' color='red'>Ucet bol vytvorený");
                pst.close();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//GEN-LAST:event_RegistrovatButtonActionPerformed

    private void PriezviskoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriezviskoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriezviskoTextFieldActionPerformed

    private void UzMamUcetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UzMamUcetButtonActionPerformed
            
            Prihlasenie Prihlasenie = new Prihlasenie(); // Zadefinuje Jframe(Prihlasenie)
            Prihlasenie.show(); // Zobrazí Jframe(Prihlasenie)
            dispose(); // Zatvorí povodný Jframe

    }//GEN-LAST:event_UzMamUcetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NovyUcet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovyUcet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovyUcet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovyUcet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovyUcet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HesloLabel;
    private javax.swing.JPasswordField HesloPasswordField;
    private javax.swing.JLabel MenoLabel;
    private javax.swing.JTextField MenoTextField;
    private javax.swing.JLabel PriezviskoLabel;
    private javax.swing.JTextField PriezviskoTextField;
    private javax.swing.JLabel PrihlasenieLabel;
    private javax.swing.JPanel PrihlaseniePanel;
    private javax.swing.JLabel PrihlasovacieMenoLabel;
    private javax.swing.JTextField PrihlasovacieMenoTextField;
    private javax.swing.JButton RegistrovatButton;
    private javax.swing.JButton UzMamUcetButton;
    private javax.swing.JButton ZrusitButton;
    // End of variables declaration//GEN-END:variables
}
