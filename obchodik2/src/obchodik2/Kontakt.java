package obchodik2;

import javax.swing.ImageIcon;
public class Kontakt extends javax.swing.JFrame {
    
    public Kontakt() {
        initComponents();
        
        ImageIcon imageSidlo = new ImageIcon("img/sidlo.png");// Vytvorí ImageIcon do ktorého sa následne uloží obrázok sa následne uloží obrázok 
        SidloObrazokLabel.setIcon(imageSidlo); // Nastavý do bjektu Label ImageIcon(obrázok)
        
        ImageIcon imageCentrum = new ImageIcon("img/centrum.png");// Vytvorí ImageIcon do ktorého sa následne uloží obrázok sa následne uloží obrázok 
        CentrumObrazokLabel.setIcon(imageCentrum); // Nastavý do bjektu Label ImageIcon(obrázok)
        
        ImageIcon imageKorespondencia = new ImageIcon("img/korespondencia.png");// Vytvorí ImageIcon do ktorého sa následne uloží obrázok sa následne uloží obrázok 
        KorespondenciaObrazokLabel.setIcon(imageKorespondencia); // Nastavý do bjektu Label ImageIcon(obrázok)
        
        ImageIcon imageUdaje = new ImageIcon("img/info.png");// Vytvorí ImageIcon do ktorého sa následne uloží obrázok sa následne uloží obrázok 
        UdajeObrazokLabel.setIcon(imageUdaje); // Nastavý do bjektu Label ImageIcon(obrázok)
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
        SidloPanel = new javax.swing.JPanel();
        SidloObrazokLabel = new javax.swing.JLabel();
        SidloLabel = new javax.swing.JLabel();
        SidloInfo1Label = new javax.swing.JLabel();
        SidloInfo2Label = new javax.swing.JLabel();
        SidloInfo3Label = new javax.swing.JLabel();
        UdajePanel = new javax.swing.JPanel();
        UdajeObrazokLabel = new javax.swing.JLabel();
        UdajeLabel = new javax.swing.JLabel();
        UdajeInfo1Label = new javax.swing.JLabel();
        UdajeInfo2Label = new javax.swing.JLabel();
        UdajeInfo3Label = new javax.swing.JLabel();
        CentrumPanel = new javax.swing.JPanel();
        CentrumObrazokLabel = new javax.swing.JLabel();
        CentrumLabel = new javax.swing.JLabel();
        CentrumInfo1Label = new javax.swing.JLabel();
        CentrumInfo2Label = new javax.swing.JLabel();
        CentrumInfo3Label = new javax.swing.JLabel();
        CentrumInfo4Label = new javax.swing.JLabel();
        KorespondenciaPanel = new javax.swing.JPanel();
        KorespondenciaObrazokLabel = new javax.swing.JLabel();
        KorespondenciaLabel = new javax.swing.JLabel();
        KorespondenciaInfo1Label = new javax.swing.JLabel();
        KorespondenciaInfo2Label = new javax.swing.JLabel();
        KorespondenciaInfo3Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(36, 36, 36)
                .addComponent(koniecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pozadiePanelLayout = new javax.swing.GroupLayout(pozadiePanel);
        pozadiePanel.setLayout(pozadiePanelLayout);
        pozadiePanelLayout.setHorizontalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pozadiePanelLayout.createSequentialGroup()
                .addComponent(panelLavyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        pozadiePanelLayout.setVerticalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLavyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SidloPanel.setBackground(new java.awt.Color(205, 205, 205));

        SidloLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        SidloLabel.setText("Sídlo spoločnosti");

        SidloInfo1Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        SidloInfo1Label.setText("Targoshop a.s");

        SidloInfo2Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        SidloInfo2Label.setText("Galvaniho 13A");

        SidloInfo3Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        SidloInfo3Label.setText("821 04 Bratislava");

        javax.swing.GroupLayout SidloPanelLayout = new javax.swing.GroupLayout(SidloPanel);
        SidloPanel.setLayout(SidloPanelLayout);
        SidloPanelLayout.setHorizontalGroup(
            SidloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidloPanelLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(SidloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidloPanelLayout.createSequentialGroup()
                        .addGroup(SidloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SidloPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(SidloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SidloInfo2Label)
                                    .addComponent(SidloInfo1Label)))
                            .addComponent(SidloInfo3Label))
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidloPanelLayout.createSequentialGroup()
                        .addComponent(SidloObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidloPanelLayout.createSequentialGroup()
                        .addComponent(SidloLabel)
                        .addGap(144, 144, 144))))
        );
        SidloPanelLayout.setVerticalGroup(
            SidloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidloPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SidloObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SidloLabel)
                .addGap(18, 18, 18)
                .addComponent(SidloInfo1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SidloInfo2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SidloInfo3Label)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        UdajePanel.setBackground(new java.awt.Color(205, 205, 205));

        UdajeLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        UdajeLabel.setText("Firemné údaje");

        UdajeInfo1Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        UdajeInfo1Label.setText("IČ: 4444000");

        UdajeInfo2Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        UdajeInfo2Label.setText("IČ DPH: SK444400044 ");

        UdajeInfo3Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        UdajeInfo3Label.setText("DIČ: 444440004 ");

        javax.swing.GroupLayout UdajePanelLayout = new javax.swing.GroupLayout(UdajePanel);
        UdajePanel.setLayout(UdajePanelLayout);
        UdajePanelLayout.setHorizontalGroup(
            UdajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UdajePanelLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(UdajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UdajePanelLayout.createSequentialGroup()
                        .addComponent(UdajeInfo1Label)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UdajePanelLayout.createSequentialGroup()
                        .addComponent(UdajeObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UdajePanelLayout.createSequentialGroup()
                        .addComponent(UdajeInfo3Label)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UdajePanelLayout.createSequentialGroup()
                        .addComponent(UdajeLabel)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UdajePanelLayout.createSequentialGroup()
                        .addComponent(UdajeInfo2Label)
                        .addGap(152, 152, 152))))
        );
        UdajePanelLayout.setVerticalGroup(
            UdajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UdajePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UdajeObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UdajeLabel)
                .addGap(18, 18, 18)
                .addComponent(UdajeInfo1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UdajeInfo2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UdajeInfo3Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CentrumPanel.setBackground(new java.awt.Color(205, 205, 205));

        CentrumLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        CentrumLabel.setText("Zákaznícke centrum");

        CentrumInfo1Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        CentrumInfo1Label.setText("02/20 000 001");

        CentrumInfo2Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        CentrumInfo2Label.setText("shop@targoshop.sk");

        CentrumInfo3Label.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        CentrumInfo3Label.setText("Na telefóne sme pre vás od pondelka do piatku medzi 8:00 a 20:00");

        CentrumInfo4Label.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        CentrumInfo4Label.setText("a cez víkend medzi 8:00 a 16:30.");

        javax.swing.GroupLayout CentrumPanelLayout = new javax.swing.GroupLayout(CentrumPanel);
        CentrumPanel.setLayout(CentrumPanelLayout);
        CentrumPanelLayout.setHorizontalGroup(
            CentrumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CentrumPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(CentrumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentrumPanelLayout.createSequentialGroup()
                        .addComponent(CentrumInfo3Label)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentrumPanelLayout.createSequentialGroup()
                        .addComponent(CentrumInfo4Label)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentrumPanelLayout.createSequentialGroup()
                        .addComponent(CentrumObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentrumPanelLayout.createSequentialGroup()
                        .addComponent(CentrumLabel)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentrumPanelLayout.createSequentialGroup()
                        .addGroup(CentrumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentrumPanelLayout.createSequentialGroup()
                                .addComponent(CentrumInfo1Label)
                                .addGap(25, 25, 25))
                            .addComponent(CentrumInfo2Label, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(163, 163, 163))))
        );
        CentrumPanelLayout.setVerticalGroup(
            CentrumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CentrumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CentrumObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CentrumLabel)
                .addGap(18, 18, 18)
                .addComponent(CentrumInfo1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CentrumInfo2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(CentrumInfo3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(CentrumInfo4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        KorespondenciaPanel.setBackground(new java.awt.Color(205, 205, 205));

        KorespondenciaLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        KorespondenciaLabel.setText("Korešpondenčná adresa");

        KorespondenciaInfo1Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        KorespondenciaInfo1Label.setText("Targoshop a.s");

        KorespondenciaInfo2Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        KorespondenciaInfo2Label.setText("Galvaniho 13A");

        KorespondenciaInfo3Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        KorespondenciaInfo3Label.setText("821 04 Bratislava");

        javax.swing.GroupLayout KorespondenciaPanelLayout = new javax.swing.GroupLayout(KorespondenciaPanel);
        KorespondenciaPanel.setLayout(KorespondenciaPanelLayout);
        KorespondenciaPanelLayout.setHorizontalGroup(
            KorespondenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KorespondenciaPanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(KorespondenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KorespondenciaPanelLayout.createSequentialGroup()
                        .addGroup(KorespondenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KorespondenciaPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(KorespondenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KorespondenciaInfo2Label)
                                    .addComponent(KorespondenciaInfo1Label)))
                            .addComponent(KorespondenciaInfo3Label))
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KorespondenciaPanelLayout.createSequentialGroup()
                        .addComponent(KorespondenciaObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KorespondenciaPanelLayout.createSequentialGroup()
                        .addComponent(KorespondenciaLabel)
                        .addGap(109, 109, 109))))
        );
        KorespondenciaPanelLayout.setVerticalGroup(
            KorespondenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KorespondenciaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KorespondenciaObrazokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KorespondenciaLabel)
                .addGap(18, 18, 18)
                .addComponent(KorespondenciaInfo1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KorespondenciaInfo2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KorespondenciaInfo3Label)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pozadiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UdajePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SidloPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CentrumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KorespondenciaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pozadiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KorespondenciaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SidloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UdajePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CentrumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
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
        dispose(); // Zatvorí povodný Jframe
        
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
            java.util.logging.Logger.getLogger(Kontakt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kontakt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kontakt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kontakt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kontakt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CentrumInfo1Label;
    private javax.swing.JLabel CentrumInfo2Label;
    private javax.swing.JLabel CentrumInfo3Label;
    private javax.swing.JLabel CentrumInfo4Label;
    private javax.swing.JLabel CentrumLabel;
    private javax.swing.JLabel CentrumObrazokLabel;
    private javax.swing.JPanel CentrumPanel;
    private javax.swing.JLabel KorespondenciaInfo1Label;
    private javax.swing.JLabel KorespondenciaInfo2Label;
    private javax.swing.JLabel KorespondenciaInfo3Label;
    private javax.swing.JLabel KorespondenciaLabel;
    private javax.swing.JLabel KorespondenciaObrazokLabel;
    private javax.swing.JPanel KorespondenciaPanel;
    private javax.swing.JLabel ShopLabel;
    private javax.swing.JSeparator ShopSeparator;
    private javax.swing.JLabel SidloInfo1Label;
    private javax.swing.JLabel SidloInfo2Label;
    private javax.swing.JLabel SidloInfo3Label;
    private javax.swing.JLabel SidloLabel;
    private javax.swing.JLabel SidloObrazokLabel;
    private javax.swing.JPanel SidloPanel;
    private javax.swing.JLabel UdajeInfo1Label;
    private javax.swing.JLabel UdajeInfo2Label;
    private javax.swing.JLabel UdajeInfo3Label;
    private javax.swing.JLabel UdajeLabel;
    private javax.swing.JLabel UdajeObrazokLabel;
    private javax.swing.JPanel UdajePanel;
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
