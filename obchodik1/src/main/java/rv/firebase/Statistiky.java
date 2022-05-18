package rv.firebase;

public class Statistiky extends javax.swing.JFrame {
    /**
     * Creates new form Statistiky
     */
    public Statistiky() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pozadiePanel = new javax.swing.JPanel();
        panelLavyPanel = new javax.swing.JPanel();
        ShopLabel = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        ShopSeparator = new javax.swing.JSeparator();
        StatistikaPanel = new javax.swing.JPanel();
        StatistikaButton = new javax.swing.JButton();
        koniecButton = new javax.swing.JButton();
        OdhlasitButton = new javax.swing.JButton();
        VystProduktyLabel = new javax.swing.JLabel();
        VystProduktyTextField = new javax.swing.JTextField();
        PredProduktyLabel = new javax.swing.JLabel();
        PredProduktyTextField = new javax.swing.JTextField();
        RegistUzivLabel = new javax.swing.JLabel();
        RegistUzivTextField = new javax.swing.JTextField();
        ZiskyLabel = new javax.swing.JLabel();
        ZiskyTextField = new javax.swing.JTextField();
        NajProduktyLabel = new javax.swing.JLabel();
        NajProduktyTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelLavyPanel.setBackground(new java.awt.Color(30, 144, 255));

        ShopLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ShopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopLabel.setText("Targoshop");

        AdminLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        AdminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminLabel.setText("Admin");

        ShopSeparator.setBackground(new java.awt.Color(0, 0, 0));
        ShopSeparator.setForeground(new java.awt.Color(0, 0, 0));

        StatistikaPanel.setBackground(new java.awt.Color(40, 130, 255));

        StatistikaButton.setBackground(new java.awt.Color(40, 130, 255));
        StatistikaButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        StatistikaButton.setText("ŠTATISTIKA");
        StatistikaButton.setBorder(null);
        StatistikaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistikaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StatistikaPanelLayout = new javax.swing.GroupLayout(StatistikaPanel);
        StatistikaPanel.setLayout(StatistikaPanelLayout);
        StatistikaPanelLayout.setHorizontalGroup(
            StatistikaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatistikaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StatistikaPanelLayout.setVerticalGroup(
            StatistikaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatistikaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        koniecButton.setBackground(new java.awt.Color(30, 144, 255));
        koniecButton.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        koniecButton.setText("Koniec");
        koniecButton.setToolTipText("");
        koniecButton.setBorder(null);
        koniecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koniecButtonActionPerformed(evt);
            }
        });

        OdhlasitButton.setBackground(new java.awt.Color(30, 144, 255));
        OdhlasitButton.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        OdhlasitButton.setText("Odhlasiť sa");
        OdhlasitButton.setToolTipText("");
        OdhlasitButton.setBorder(null);
        OdhlasitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdhlasitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLavyPanelLayout = new javax.swing.GroupLayout(panelLavyPanel);
        panelLavyPanel.setLayout(panelLavyPanelLayout);
        panelLavyPanelLayout.setHorizontalGroup(
            panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatistikaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLavyPanelLayout.createSequentialGroup()
                .addGroup(panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLavyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShopSeparator)
                            .addGroup(panelLavyPanelLayout.createSequentialGroup()
                                .addComponent(koniecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OdhlasitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(panelLavyPanelLayout.createSequentialGroup()
                        .addGroup(panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLavyPanelLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(AdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLavyPanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(ShopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLavyPanelLayout.setVerticalGroup(
            panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLavyPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ShopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(AdminLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShopSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(StatistikaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379)
                .addGroup(panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(koniecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OdhlasitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pozadiePanelLayout = new javax.swing.GroupLayout(pozadiePanel);
        pozadiePanel.setLayout(pozadiePanelLayout);
        pozadiePanelLayout.setHorizontalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLavyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pozadiePanelLayout.setVerticalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLavyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VystProduktyLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        VystProduktyLabel.setText("Počet vystavených produktov:");

        VystProduktyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VystProduktyTextFieldActionPerformed(evt);
            }
        });

        PredProduktyLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        PredProduktyLabel.setText("Počet predaných produktov:");

        PredProduktyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PredProduktyTextFieldActionPerformed(evt);
            }
        });

        RegistUzivLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        RegistUzivLabel.setText("Počet registrovaných užívateľov:");

        ZiskyLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        ZiskyLabel.setText("Celkové zisky:");

        ZiskyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZiskyTextFieldActionPerformed(evt);
            }
        });

        NajProduktyLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        NajProduktyLabel.setText("Najpredávaniejší produkt:");

        NajProduktyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NajProduktyTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pozadiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VystProduktyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NajProduktyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ZiskyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PredProduktyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistUzivLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NajProduktyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PredProduktyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistUzivTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZiskyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VystProduktyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pozadiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VystProduktyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VystProduktyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PredProduktyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PredProduktyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistUzivTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistUzivLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ZiskyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ZiskyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NajProduktyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NajProduktyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StatistikaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatistikaButtonActionPerformed

        Statistiky Statistiky = new Statistiky(); // Zadefinuje Jframe(Statistiky)
        Statistiky.show(); // Zobrazí Jframe(Statistiky)
        dispose(); // Zatvorí povodný Jframe

    }//GEN-LAST:event_StatistikaButtonActionPerformed

    private void koniecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koniecButtonActionPerformed

        System.exit(0); // Ukončí všetky úkony a zatvorí program

    }//GEN-LAST:event_koniecButtonActionPerformed

    private void ZiskyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZiskyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZiskyTextFieldActionPerformed

    private void PredProduktyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PredProduktyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PredProduktyTextFieldActionPerformed

    private void OdhlasitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdhlasitButtonActionPerformed
        
        Prihlasenie Prihlasenie = new Prihlasenie(); // Zadefinuje Jframe(Prihlasenie)
        Prihlasenie.show(); // Zobrazí Jframe(Prihlasenie)
        dispose(); // Zatvorí povodný Jframe

    }//GEN-LAST:event_OdhlasitButtonActionPerformed

    private void VystProduktyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VystProduktyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VystProduktyTextFieldActionPerformed

    private void NajProduktyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NajProduktyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NajProduktyTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Statistiky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistiky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistiky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistiky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistiky().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JLabel NajProduktyLabel;
    private javax.swing.JTextField NajProduktyTextField;
    private javax.swing.JButton OdhlasitButton;
    private javax.swing.JLabel PredProduktyLabel;
    private javax.swing.JTextField PredProduktyTextField;
    private javax.swing.JLabel RegistUzivLabel;
    private javax.swing.JTextField RegistUzivTextField;
    private javax.swing.JLabel ShopLabel;
    private javax.swing.JSeparator ShopSeparator;
    private javax.swing.JButton StatistikaButton;
    private javax.swing.JPanel StatistikaPanel;
    private javax.swing.JLabel VystProduktyLabel;
    private javax.swing.JTextField VystProduktyTextField;
    private javax.swing.JLabel ZiskyLabel;
    private javax.swing.JTextField ZiskyTextField;
    private javax.swing.JButton koniecButton;
    private javax.swing.JPanel panelLavyPanel;
    private javax.swing.JPanel pozadiePanel;
    // End of variables declaration//GEN-END:variables
}
