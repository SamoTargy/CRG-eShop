
public class Kosik extends javax.swing.JFrame {

   
    public Kosik() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pozadiePanel = new javax.swing.JPanel();
        ProduktyScrollPane = new javax.swing.JScrollPane();
        PanellSKosikomPanel = new javax.swing.JPanel();
        panelLavyPanel = new javax.swing.JPanel();
        ShopLabel = new javax.swing.JLabel();
        ShopSeparator = new javax.swing.JSeparator();
        domovPanel = new javax.swing.JPanel();
        domovButton = new javax.swing.JButton();
        produktyPanel = new javax.swing.JPanel();
        produktyButton = new javax.swing.JButton();
        kontaktyPanel = new javax.swing.JPanel();
        kontaktButton = new javax.swing.JButton();
        ucetPanel = new javax.swing.JPanel();
        ucetButton = new javax.swing.JButton();
        kosikPanel = new javax.swing.JPanel();
        kosikButton = new javax.swing.JButton();
        koniecButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ProduktyScrollPane.setBorder(null);
        ProduktyScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ProduktyScrollPane.setToolTipText("");
        ProduktyScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout PanellSKosikomPanelLayout = new javax.swing.GroupLayout(PanellSKosikomPanel);
        PanellSKosikomPanel.setLayout(PanellSKosikomPanelLayout);
        PanellSKosikomPanelLayout.setHorizontalGroup(
            PanellSKosikomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
        );
        PanellSKosikomPanelLayout.setVerticalGroup(
            PanellSKosikomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
        );

        ProduktyScrollPane.setViewportView(PanellSKosikomPanel);

        panelLavyPanel.setBackground(new java.awt.Color(30, 144, 255));

        ShopLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ShopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopLabel.setText("Targoshop");

        ShopSeparator.setBackground(new java.awt.Color(0, 0, 0));
        ShopSeparator.setForeground(new java.awt.Color(0, 0, 0));

        domovPanel.setBackground(new java.awt.Color(40, 130, 255));

        domovButton.setBackground(new java.awt.Color(40, 130, 255));
        domovButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        domovButton.setText("DOMOV");
        domovButton.setBorder(null);
        domovButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domovButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout domovPanelLayout = new javax.swing.GroupLayout(domovPanel);
        domovPanel.setLayout(domovPanelLayout);
        domovPanelLayout.setHorizontalGroup(
            domovPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(domovButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        domovPanelLayout.setVerticalGroup(
            domovPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(domovButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        produktyPanel.setBackground(new java.awt.Color(40, 130, 255));

        produktyButton.setBackground(new java.awt.Color(40, 130, 255));
        produktyButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        produktyButton.setText("PRODUKTY");
        produktyButton.setBorder(null);
        produktyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produktyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout produktyPanelLayout = new javax.swing.GroupLayout(produktyPanel);
        produktyPanel.setLayout(produktyPanelLayout);
        produktyPanelLayout.setHorizontalGroup(
            produktyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produktyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        produktyPanelLayout.setVerticalGroup(
            produktyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produktyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        kontaktyPanel.setBackground(new java.awt.Color(40, 130, 255));

        kontaktButton.setBackground(new java.awt.Color(40, 130, 255));
        kontaktButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        kontaktButton.setText("KONTAKT");
        kontaktButton.setBorder(null);
        kontaktButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontaktButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kontaktyPanelLayout = new javax.swing.GroupLayout(kontaktyPanel);
        kontaktyPanel.setLayout(kontaktyPanelLayout);
        kontaktyPanelLayout.setHorizontalGroup(
            kontaktyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kontaktButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kontaktyPanelLayout.setVerticalGroup(
            kontaktyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kontaktButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        ucetPanel.setBackground(new java.awt.Color(40, 130, 255));

        ucetButton.setBackground(new java.awt.Color(40, 130, 255));
        ucetButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ucetButton.setText("ÚČET");
        ucetButton.setBorder(null);
        ucetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ucetPanelLayout = new javax.swing.GroupLayout(ucetPanel);
        ucetPanel.setLayout(ucetPanelLayout);
        ucetPanelLayout.setHorizontalGroup(
            ucetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ucetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ucetPanelLayout.setVerticalGroup(
            ucetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ucetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        kosikPanel.setBackground(new java.awt.Color(40, 130, 255));

        kosikButton.setBackground(new java.awt.Color(40, 130, 255));
        kosikButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        kosikButton.setText("KOŠÍK");
        kosikButton.setBorder(null);
        kosikButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosikButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kosikPanelLayout = new javax.swing.GroupLayout(kosikPanel);
        kosikPanel.setLayout(kosikPanelLayout);
        kosikPanelLayout.setHorizontalGroup(
            kosikPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kosikButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kosikPanelLayout.setVerticalGroup(
            kosikPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kosikButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelLavyPanelLayout = new javax.swing.GroupLayout(panelLavyPanel);
        panelLavyPanel.setLayout(panelLavyPanelLayout);
        panelLavyPanelLayout.setHorizontalGroup(
            panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produktyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(domovPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ucetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kosikPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kontaktyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLavyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShopSeparator)
                    .addGroup(panelLavyPanelLayout.createSequentialGroup()
                        .addComponent(koniecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ShopLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLavyPanelLayout.setVerticalGroup(
            panelLavyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLavyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShopSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(domovPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produktyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kontaktyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ucetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kosikPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(koniecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pozadiePanelLayout = new javax.swing.GroupLayout(pozadiePanel);
        pozadiePanel.setLayout(pozadiePanelLayout);
        pozadiePanelLayout.setHorizontalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pozadiePanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(panelLavyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProduktyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pozadiePanelLayout.setVerticalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLavyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ProduktyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pozadiePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pozadiePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void domovButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domovButtonActionPerformed

        Domov Domov = new Domov();
        Domov.show();
        dispose();
    }//GEN-LAST:event_domovButtonActionPerformed

    private void produktyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produktyButtonActionPerformed

        Produkty Produkty = new Produkty();
        Produkty.show();
        dispose();
    }//GEN-LAST:event_produktyButtonActionPerformed

    private void kontaktButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontaktButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kontaktButtonActionPerformed

    private void ucetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ucetButtonActionPerformed

    private void kosikButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosikButtonActionPerformed

        Kosik Kosik = new Kosik();
        Kosik.show();
        dispose();
    }//GEN-LAST:event_kosikButtonActionPerformed

    private void koniecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koniecButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_koniecButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kosik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanellSKosikomPanel;
    private javax.swing.JScrollPane ProduktyScrollPane;
    private javax.swing.JLabel ShopLabel;
    private javax.swing.JSeparator ShopSeparator;
    private javax.swing.JButton domovButton;
    private javax.swing.JPanel domovPanel;
    private javax.swing.JButton koniecButton;
    private javax.swing.JButton kontaktButton;
    private javax.swing.JPanel kontaktyPanel;
    private javax.swing.JButton kosikButton;
    private javax.swing.JPanel kosikPanel;
    private javax.swing.JPanel panelLavyPanel;
    private javax.swing.JPanel pozadiePanel;
    private javax.swing.JButton produktyButton;
    private javax.swing.JPanel produktyPanel;
    private javax.swing.JButton ucetButton;
    private javax.swing.JPanel ucetPanel;
    // End of variables declaration//GEN-END:variables
}
