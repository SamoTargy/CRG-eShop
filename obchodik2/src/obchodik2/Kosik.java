package obchodik2;

public class Kosik extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame1
     */
    public Kosik() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pozadiePanel = new javax.swing.JPanel();
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
        ProduktyScrollPane = new javax.swing.JScrollPane();
        PanellSKosikomPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabulkaProduktovTable = new javax.swing.JTable();
        InformacieLabel = new javax.swing.JLabel();
        InformacieTextField = new javax.swing.JTextField();
        AdresaLabel = new javax.swing.JLabel();
        AdresaTextField = new javax.swing.JTextField();
        PocetProduktovLabel = new javax.swing.JLabel();
        PocetProduktovTextField = new javax.swing.JTextField();
        UhraditLabel = new javax.swing.JLabel();
        UhraditTextField = new javax.swing.JTextField();
        OdstranitButton = new javax.swing.JButton();
        PocetButton = new javax.swing.JButton();
        PocetSpinner = new javax.swing.JSpinner();
        PokracovatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(domovPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produktyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kontaktyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ucetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kosikPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(koniecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ProduktyScrollPane.setBorder(null);
        ProduktyScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ProduktyScrollPane.setToolTipText("");
        ProduktyScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        PanellSKosikomPanel.setBackground(new java.awt.Color(205, 205, 205));

        TabulkaProduktovTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Názov produkt", "Id produktu", "Cena Produktu", "Počet", "Cena celkovo"
            }
        ));
        jScrollPane1.setViewportView(TabulkaProduktovTable);
        TabulkaProduktovTable.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout PanellSKosikomPanelLayout = new javax.swing.GroupLayout(PanellSKosikomPanel);
        PanellSKosikomPanel.setLayout(PanellSKosikomPanelLayout);
        PanellSKosikomPanelLayout.setHorizontalGroup(
            PanellSKosikomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        PanellSKosikomPanelLayout.setVerticalGroup(
            PanellSKosikomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        ProduktyScrollPane.setViewportView(PanellSKosikomPanel);

        InformacieLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InformacieLabel.setText("Dodatočné informácie k objednávke (nepovinné)");
        InformacieLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdresaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AdresaLabel.setText("Adresa dodania (nepovinné v prípade osbného odberu)");
        AdresaLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PocetProduktovLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PocetProduktovLabel.setText("Počet produktov");

        PocetProduktovTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PocetProduktovTextFieldActionPerformed(evt);
            }
        });

        UhraditLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UhraditLabel.setText("K úhrade");

        UhraditTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UhraditTextFieldActionPerformed(evt);
            }
        });

        OdstranitButton.setBackground(new java.awt.Color(40, 130, 255));
        OdstranitButton.setText("Odstrániť");
        OdstranitButton.setBorder(null);

        PocetButton.setBackground(new java.awt.Color(40, 130, 255));
        PocetButton.setText("Zmeniť Počet");
        PocetButton.setBorder(null);
        PocetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PocetButtonActionPerformed(evt);
            }
        });

        PokracovatButton.setBackground(new java.awt.Color(40, 130, 255));
        PokracovatButton.setText("Pokračovať");
        PokracovatButton.setBorder(null);
        PokracovatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokracovatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pozadiePanelLayout = new javax.swing.GroupLayout(pozadiePanel);
        pozadiePanel.setLayout(pozadiePanelLayout);
        pozadiePanelLayout.setHorizontalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pozadiePanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(panelLavyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pozadiePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ProduktyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(pozadiePanelLayout.createSequentialGroup()
                        .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pozadiePanelLayout.createSequentialGroup()
                                .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InformacieLabel)
                                    .addComponent(InformacieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdresaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AdresaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PocetProduktovTextField)
                                    .addComponent(PocetProduktovLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UhraditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UhraditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pozadiePanelLayout.createSequentialGroup()
                                .addComponent(OdstranitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(PocetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(PocetSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(290, 290, 290)
                                .addComponent(PokracovatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pozadiePanelLayout.setVerticalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLavyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pozadiePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ProduktyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pozadiePanelLayout.createSequentialGroup()
                        .addComponent(InformacieLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InformacieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pozadiePanelLayout.createSequentialGroup()
                        .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PocetProduktovLabel)
                            .addComponent(UhraditLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PocetProduktovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UhraditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pozadiePanelLayout.createSequentialGroup()
                        .addComponent(AdresaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdresaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OdstranitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PocetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PocetSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PokracovatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pozadiePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pozadiePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void domovButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domovButtonActionPerformed

        Domov Domov = new Domov(); // Zadefinuje Jframe(Domov)
        Domov.show(); // Zobrazí Jframe(Domov)
        dispose(); // Zatvorí povodný Jframe
        
    }//GEN-LAST:event_domovButtonActionPerformed

    private void produktyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produktyButtonActionPerformed

        Produkty Produkty = new Produkty(); // Zadefinuje Jframe(Produkty)
        Produkty.show(); // Zobrazí Jframe(Produkty)
        dispose(); // Zatvorí povodný Jframe
        
    }//GEN-LAST:event_produktyButtonActionPerformed

    private void kontaktButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontaktButtonActionPerformed
                        
        Kontakt Kontakt = new Kontakt(); // Zadefinuje Jframe(Kontakt)
        Kontakt.show(); // Zobrazí Jframe(Domov)
        dispose(); // Zatvori povodný Jframe
        
    }//GEN-LAST:event_kontaktButtonActionPerformed

    private void ucetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucetButtonActionPerformed
        
        Ucet Ucet = new Ucet(); // Zadefinuje Jframe(Ucet)
        Ucet.show(); // Zobrazí Jframe(Ucet)
        dispose(); // Zatvorí povodný Jframe

    }//GEN-LAST:event_ucetButtonActionPerformed

    private void kosikButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosikButtonActionPerformed

        Kosik Kosik = new Kosik(); // Zadefinuje Jframe(Kosik)
        Kosik.show(); // Zobrazí Jframe(Kosik)
        dispose(); // Zatvorí povodný Jframe
        
    }//GEN-LAST:event_kosikButtonActionPerformed

    private void koniecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koniecButtonActionPerformed

        System.exit(0); // Ukončí všetky úkony a zatvorí program
        
    }//GEN-LAST:event_koniecButtonActionPerformed

    private void PocetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PocetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PocetButtonActionPerformed

    private void PokracovatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokracovatButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PokracovatButtonActionPerformed

    private void PocetProduktovTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PocetProduktovTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PocetProduktovTextFieldActionPerformed

    private void UhraditTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UhraditTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UhraditTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Kosik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kosik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kosik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kosik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kosik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdresaLabel;
    private javax.swing.JTextField AdresaTextField;
    private javax.swing.JLabel InformacieLabel;
    private javax.swing.JTextField InformacieTextField;
    private javax.swing.JButton OdstranitButton;
    private javax.swing.JPanel PanellSKosikomPanel;
    private javax.swing.JButton PocetButton;
    private javax.swing.JLabel PocetProduktovLabel;
    private javax.swing.JTextField PocetProduktovTextField;
    private javax.swing.JSpinner PocetSpinner;
    private javax.swing.JButton PokracovatButton;
    private javax.swing.JScrollPane ProduktyScrollPane;
    private javax.swing.JLabel ShopLabel;
    private javax.swing.JSeparator ShopSeparator;
    private javax.swing.JTable TabulkaProduktovTable;
    private javax.swing.JLabel UhraditLabel;
    private javax.swing.JTextField UhraditTextField;
    private javax.swing.JButton domovButton;
    private javax.swing.JPanel domovPanel;
    private javax.swing.JScrollPane jScrollPane1;
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
