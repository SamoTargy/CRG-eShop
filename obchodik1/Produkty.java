package com.mycompany.obchodik1;


import javax.swing.ImageIcon;

public class Produkty extends javax.swing.JFrame {

    
    public Produkty() {
        initComponents();
        
        ImageIcon imageProdukt1 = new ImageIcon("img/produkt1.png"); //
        ImageIcon imageProdukt2 = new ImageIcon("img/produkt1.png"); //
        ImageIcon imageProdukt3 = new ImageIcon("img/produkt1.png"); //
        ImageIcon imageProdukt4 = new ImageIcon("img/produkt1.png"); //
        ImageIcon imageProdukt5 = new ImageIcon("img/produkt1.png"); //
        ImageIcon imageProdukt6 = new ImageIcon("img/produkt1.png"); // Vytvorí ImageIcon do ktorého
        ImageIcon imageProdukt7 = new ImageIcon("img/produkt1.png"); // sa následne uloží obrázok 
        ImageIcon imageProdukt8 = new ImageIcon("img/produkt1.png"); //
        ImageIcon imageProdukt9 = new ImageIcon("img/produkt1.png"); //
        ImageIcon imageProdukt10 = new ImageIcon("img/produkt1.png");//
        ImageIcon imageProdukt11 = new ImageIcon("img/produkt1.png");//
        ImageIcon imageProdukt12 = new ImageIcon("img/produkt1.png");//
        //--------------------------------------------------------------------------------------
        ObrazokProduktu1Label.setIcon(imageProdukt1); //
        ObrazokProduktu2Label.setIcon(imageProdukt1); //
        ObrazokProduktu3Label.setIcon(imageProdukt1); //
        ObrazokProduktu4Label.setIcon(imageProdukt1); //
        ObrazokProduktu5Label.setIcon(imageProdukt1); //
        ObrazokProduktu6Label.setIcon(imageProdukt1); // Nastavý do bjektu Label ImageIcon(obrázok)
        ObrazokProduktu7Label.setIcon(imageProdukt1); //
        ObrazokProduktu8Label.setIcon(imageProdukt1); //
        ObrazokProduktu9Label.setIcon(imageProdukt1); //
        ObrazokProduktu10Label.setIcon(imageProdukt1);//
        ObrazokProduktu11Label.setIcon(imageProdukt1);//
        ObrazokProduktu12Label.setIcon(imageProdukt1);//
//----------------------------------------------------------------------------------------------       
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
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
        PanellSProduktmiPanel = new javax.swing.JPanel();
        Produkt1Panel = new javax.swing.JPanel();
        ObrazokProduktu1Label = new javax.swing.JLabel();
        PopisProduktu1Label = new javax.swing.JLabel();
        Kupit1Button = new javax.swing.JButton();
        Produkt2Panel = new javax.swing.JPanel();
        ObrazokProduktu2Label = new javax.swing.JLabel();
        PopisProduktu2Label = new javax.swing.JLabel();
        Kupit2Button = new javax.swing.JButton();
        Produkt3Panel = new javax.swing.JPanel();
        ObrazokProduktu3Label = new javax.swing.JLabel();
        PopisProduktu3Label = new javax.swing.JLabel();
        Kupit3Button = new javax.swing.JButton();
        Produkt4Panel = new javax.swing.JPanel();
        ObrazokProduktu4Label = new javax.swing.JLabel();
        PopisProduktu4Label = new javax.swing.JLabel();
        Kupit4Button = new javax.swing.JButton();
        Produkt5Panel = new javax.swing.JPanel();
        ObrazokProduktu5Label = new javax.swing.JLabel();
        PopisProduktu5Label = new javax.swing.JLabel();
        Kupit5Button = new javax.swing.JButton();
        Produkt6Panel = new javax.swing.JPanel();
        ObrazokProduktu6Label = new javax.swing.JLabel();
        PopisProduktu6Label = new javax.swing.JLabel();
        Kupit6Button = new javax.swing.JButton();
        Produkt7Panel = new javax.swing.JPanel();
        ObrazokProduktu7Label = new javax.swing.JLabel();
        PopisProduktu7Label = new javax.swing.JLabel();
        Kupit7Button = new javax.swing.JButton();
        Produkt8Panel = new javax.swing.JPanel();
        ObrazokProduktu8Label = new javax.swing.JLabel();
        PopisProduktu8Label = new javax.swing.JLabel();
        Kupit8Button = new javax.swing.JButton();
        Produkt9Panel = new javax.swing.JPanel();
        ObrazokProduktu9Label = new javax.swing.JLabel();
        PopisProduktu9Label = new javax.swing.JLabel();
        Kupit9Button = new javax.swing.JButton();
        Produkt10Panel = new javax.swing.JPanel();
        ObrazokProduktu10Label = new javax.swing.JLabel();
        PopisProduktu10Label = new javax.swing.JLabel();
        Kupit10Button = new javax.swing.JButton();
        Produkt11Panel = new javax.swing.JPanel();
        ObrazokProduktu11Label = new javax.swing.JLabel();
        PopisProduktu11Label = new javax.swing.JLabel();
        Kupit11Button = new javax.swing.JButton();
        Produkt12Panel = new javax.swing.JPanel();
        ObrazokProduktu12Label = new javax.swing.JLabel();
        PopisProduktu12Label = new javax.swing.JLabel();
        Kupit12Button = new javax.swing.JButton();

        jButton1.setText("jButton1");

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

        ProduktyScrollPane.setBorder(null);
        ProduktyScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ProduktyScrollPane.setToolTipText("");
        ProduktyScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Produkt1Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu1Label.setText("Popis produktu");

        Kupit1Button.setText("Do košíka");

        javax.swing.GroupLayout Produkt1PanelLayout = new javax.swing.GroupLayout(Produkt1Panel);
        Produkt1Panel.setLayout(Produkt1PanelLayout);
        Produkt1PanelLayout.setHorizontalGroup(
            Produkt1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt1PanelLayout.createSequentialGroup()
                .addComponent(Kupit1Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt1PanelLayout.setVerticalGroup(
            Produkt1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit1Button))
        );

        Produkt2Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu2Label.setText("Popis produktu");

        Kupit2Button.setText("Do košíka");
        Kupit2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kupit2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Produkt2PanelLayout = new javax.swing.GroupLayout(Produkt2Panel);
        Produkt2Panel.setLayout(Produkt2PanelLayout);
        Produkt2PanelLayout.setHorizontalGroup(
            Produkt2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt2PanelLayout.createSequentialGroup()
                .addComponent(Kupit2Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt2PanelLayout.setVerticalGroup(
            Produkt2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit2Button))
        );

        Produkt3Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu3Label.setText("Popis produktu");

        Kupit3Button.setText("Do košíka");
        Kupit3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kupit3ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Produkt3PanelLayout = new javax.swing.GroupLayout(Produkt3Panel);
        Produkt3Panel.setLayout(Produkt3PanelLayout);
        Produkt3PanelLayout.setHorizontalGroup(
            Produkt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt3PanelLayout.createSequentialGroup()
                .addComponent(Kupit3Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt3PanelLayout.setVerticalGroup(
            Produkt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit3Button))
        );

        Produkt4Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu4Label.setText("Popis produktu");

        Kupit4Button.setText("Do košíka");
        Kupit4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kupit4ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Produkt4PanelLayout = new javax.swing.GroupLayout(Produkt4Panel);
        Produkt4Panel.setLayout(Produkt4PanelLayout);
        Produkt4PanelLayout.setHorizontalGroup(
            Produkt4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt4PanelLayout.createSequentialGroup()
                .addComponent(Kupit4Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt4PanelLayout.setVerticalGroup(
            Produkt4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit4Button))
        );

        Produkt5Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu5Label.setText("Popis produktu");

        Kupit5Button.setText("Do košíka");

        javax.swing.GroupLayout Produkt5PanelLayout = new javax.swing.GroupLayout(Produkt5Panel);
        Produkt5Panel.setLayout(Produkt5PanelLayout);
        Produkt5PanelLayout.setHorizontalGroup(
            Produkt5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt5PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt5PanelLayout.createSequentialGroup()
                .addComponent(Kupit5Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt5PanelLayout.setVerticalGroup(
            Produkt5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt5PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu5Label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit5Button))
        );

        Produkt6Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu6Label.setText("Popis produktu");

        Kupit6Button.setText("Do košíka");
        Kupit6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kupit6ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Produkt6PanelLayout = new javax.swing.GroupLayout(Produkt6Panel);
        Produkt6Panel.setLayout(Produkt6PanelLayout);
        Produkt6PanelLayout.setHorizontalGroup(
            Produkt6PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt6PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt6PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu6Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu6Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt6PanelLayout.createSequentialGroup()
                .addComponent(Kupit6Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt6PanelLayout.setVerticalGroup(
            Produkt6PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt6PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu6Label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit6Button))
        );

        Produkt7Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu7Label.setText("Popis produktu");

        Kupit7Button.setText("Do košíka");

        javax.swing.GroupLayout Produkt7PanelLayout = new javax.swing.GroupLayout(Produkt7Panel);
        Produkt7Panel.setLayout(Produkt7PanelLayout);
        Produkt7PanelLayout.setHorizontalGroup(
            Produkt7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt7PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu7Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu7Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt7PanelLayout.createSequentialGroup()
                .addComponent(Kupit7Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt7PanelLayout.setVerticalGroup(
            Produkt7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt7PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu7Label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit7Button))
        );

        Produkt8Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu8Label.setText("Popis produktu");

        Kupit8Button.setText("Do košíka");

        javax.swing.GroupLayout Produkt8PanelLayout = new javax.swing.GroupLayout(Produkt8Panel);
        Produkt8Panel.setLayout(Produkt8PanelLayout);
        Produkt8PanelLayout.setHorizontalGroup(
            Produkt8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt8PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu8Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu8Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt8PanelLayout.createSequentialGroup()
                .addComponent(Kupit8Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt8PanelLayout.setVerticalGroup(
            Produkt8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt8PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu8Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu8Label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit8Button))
        );

        Produkt9Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu9Label.setText("Popis produktu");

        Kupit9Button.setText("Do košíka");

        javax.swing.GroupLayout Produkt9PanelLayout = new javax.swing.GroupLayout(Produkt9Panel);
        Produkt9Panel.setLayout(Produkt9PanelLayout);
        Produkt9PanelLayout.setHorizontalGroup(
            Produkt9PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt9PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt9PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu9Label, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu9Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt9PanelLayout.createSequentialGroup()
                .addComponent(Kupit9Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt9PanelLayout.setVerticalGroup(
            Produkt9PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt9PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu9Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu9Label, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit9Button))
        );

        Produkt10Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu10Label.setText("Popis produktu");

        Kupit10Button.setText("Do košíka");

        javax.swing.GroupLayout Produkt10PanelLayout = new javax.swing.GroupLayout(Produkt10Panel);
        Produkt10Panel.setLayout(Produkt10PanelLayout);
        Produkt10PanelLayout.setHorizontalGroup(
            Produkt10PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt10PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt10PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu10Label, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu10Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt10PanelLayout.createSequentialGroup()
                .addComponent(Kupit10Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt10PanelLayout.setVerticalGroup(
            Produkt10PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt10PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu10Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu10Label, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit10Button))
        );

        Produkt11Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu11Label.setText("Popis produktu");

        Kupit11Button.setText("Do košíka");
        Kupit11Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kupit11ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Produkt11PanelLayout = new javax.swing.GroupLayout(Produkt11Panel);
        Produkt11Panel.setLayout(Produkt11PanelLayout);
        Produkt11PanelLayout.setHorizontalGroup(
            Produkt11PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt11PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt11PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu11Label, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu11Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt11PanelLayout.createSequentialGroup()
                .addComponent(Kupit11Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt11PanelLayout.setVerticalGroup(
            Produkt11PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt11PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu11Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu11Label, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit11Button))
        );

        Produkt12Panel.setBackground(new java.awt.Color(205, 205, 205));

        PopisProduktu12Label.setText("Popis produktu");

        Kupit12Button.setText("Do košíka");

        javax.swing.GroupLayout Produkt12PanelLayout = new javax.swing.GroupLayout(Produkt12Panel);
        Produkt12Panel.setLayout(Produkt12PanelLayout);
        Produkt12PanelLayout.setHorizontalGroup(
            Produkt12PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Produkt12PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Produkt12PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PopisProduktu12Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObrazokProduktu12Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Produkt12PanelLayout.createSequentialGroup()
                .addComponent(Kupit12Button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Produkt12PanelLayout.setVerticalGroup(
            Produkt12PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Produkt12PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObrazokProduktu12Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PopisProduktu12Label, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kupit12Button))
        );

        javax.swing.GroupLayout PanellSProduktmiPanelLayout = new javax.swing.GroupLayout(PanellSProduktmiPanel);
        PanellSProduktmiPanel.setLayout(PanellSProduktmiPanelLayout);
        PanellSProduktmiPanelLayout.setHorizontalGroup(
            PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanellSProduktmiPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Produkt5Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt9Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Produkt10Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt6Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Produkt7Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt11Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Produkt8Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt12Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        PanellSProduktmiPanelLayout.setVerticalGroup(
            PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanellSProduktmiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Produkt1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Produkt6Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt5Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt7Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt8Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(PanellSProduktmiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Produkt9Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt10Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt11Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produkt12Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        ProduktyScrollPane.setViewportView(PanellSProduktmiPanel);

        javax.swing.GroupLayout pozadiePanelLayout = new javax.swing.GroupLayout(pozadiePanel);
        pozadiePanel.setLayout(pozadiePanelLayout);
        pozadiePanelLayout.setHorizontalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pozadiePanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(panelLavyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProduktyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pozadiePanelLayout.setVerticalGroup(
            pozadiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelLavyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ProduktyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void Kupit2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kupit2ButtonActionPerformed
        
    }//GEN-LAST:event_Kupit2ButtonActionPerformed

    private void Kupit6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kupit6ButtonActionPerformed
        
    }//GEN-LAST:event_Kupit6ButtonActionPerformed

    private void Kupit3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kupit3ButtonActionPerformed
        
    }//GEN-LAST:event_Kupit3ButtonActionPerformed

    private void Kupit11ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kupit11ButtonActionPerformed
       
    }//GEN-LAST:event_Kupit11ButtonActionPerformed

    private void Kupit4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kupit4ButtonActionPerformed
        
    }//GEN-LAST:event_Kupit4ButtonActionPerformed

    private void domovButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domovButtonActionPerformed

        Domov Domov = new Domov(); // Zadefinuje Jframe(Domov)
        Domov.show(); // Zobrazí Jframe(Domov)
        dispose(); // Zatvoí povodný Jframe

    }//GEN-LAST:event_domovButtonActionPerformed

    private void produktyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produktyButtonActionPerformed

        Produkty Produkty = new Produkty(); // Zadefinuje Jframe(Produkty)
        Produkty.show(); // Zobrazí Jframe(Produkty)
        dispose(); // Zatvoí povodný Jframe

    }//GEN-LAST:event_produktyButtonActionPerformed

    private void kontaktButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontaktButtonActionPerformed
                        
        Kontakt Kontakt = new Kontakt(); // Zadefinuje Jframe(Kontakt)
        Kontakt.show(); // Zobrazí Jframe(Domov)
        dispose(); // Zatvoí povodný Jframe
        
    }//GEN-LAST:event_kontaktButtonActionPerformed

    private void ucetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucetButtonActionPerformed
                
        Ucet Ucet = new Ucet(); // Zadefinuje Jframe(Ucet)
        Ucet.show(); // Zobrazí Jframe(Ucet)
        dispose(); // Zatvoí povodný Jframe
        
    }//GEN-LAST:event_ucetButtonActionPerformed

    private void kosikButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosikButtonActionPerformed

        Kosik Kosik = new Kosik(); // Zadefinuje Jframe(Kosik)
        Kosik.show(); // Zobrazí Jframe(Kosik)
        dispose(); // Zatvoí povodný Jframe

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
            java.util.logging.Logger.getLogger(Produkty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produkty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produkty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produkty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produkty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Kupit10Button;
    public javax.swing.JButton Kupit11Button;
    public javax.swing.JButton Kupit12Button;
    public javax.swing.JButton Kupit1Button;
    public javax.swing.JButton Kupit2Button;
    public javax.swing.JButton Kupit3Button;
    public javax.swing.JButton Kupit4Button;
    public javax.swing.JButton Kupit5Button;
    public javax.swing.JButton Kupit6Button;
    public javax.swing.JButton Kupit7Button;
    public javax.swing.JButton Kupit8Button;
    public javax.swing.JButton Kupit9Button;
    public javax.swing.JLabel ObrazokProduktu10Label;
    public javax.swing.JLabel ObrazokProduktu11Label;
    public javax.swing.JLabel ObrazokProduktu12Label;
    public javax.swing.JLabel ObrazokProduktu1Label;
    public javax.swing.JLabel ObrazokProduktu2Label;
    public javax.swing.JLabel ObrazokProduktu3Label;
    public javax.swing.JLabel ObrazokProduktu4Label;
    public javax.swing.JLabel ObrazokProduktu5Label;
    public javax.swing.JLabel ObrazokProduktu6Label;
    public javax.swing.JLabel ObrazokProduktu7Label;
    public javax.swing.JLabel ObrazokProduktu8Label;
    public javax.swing.JLabel ObrazokProduktu9Label;
    public javax.swing.JPanel PanellSProduktmiPanel;
    public javax.swing.JLabel PopisProduktu10Label;
    public javax.swing.JLabel PopisProduktu11Label;
    public javax.swing.JLabel PopisProduktu12Label;
    public javax.swing.JLabel PopisProduktu1Label;
    public javax.swing.JLabel PopisProduktu2Label;
    public javax.swing.JLabel PopisProduktu3Label;
    public javax.swing.JLabel PopisProduktu4Label;
    public javax.swing.JLabel PopisProduktu5Label;
    public javax.swing.JLabel PopisProduktu6Label;
    public javax.swing.JLabel PopisProduktu7Label;
    public javax.swing.JLabel PopisProduktu8Label;
    public javax.swing.JLabel PopisProduktu9Label;
    public javax.swing.JPanel Produkt10Panel;
    public javax.swing.JPanel Produkt11Panel;
    public javax.swing.JPanel Produkt12Panel;
    public javax.swing.JPanel Produkt1Panel;
    public javax.swing.JPanel Produkt2Panel;
    public javax.swing.JPanel Produkt3Panel;
    public javax.swing.JPanel Produkt4Panel;
    public javax.swing.JPanel Produkt5Panel;
    public javax.swing.JPanel Produkt6Panel;
    public javax.swing.JPanel Produkt7Panel;
    public javax.swing.JPanel Produkt8Panel;
    public javax.swing.JPanel Produkt9Panel;
    public javax.swing.JScrollPane ProduktyScrollPane;
    public javax.swing.JLabel ShopLabel;
    public javax.swing.JSeparator ShopSeparator;
    public javax.swing.JButton domovButton;
    public javax.swing.JPanel domovPanel;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton koniecButton;
    public javax.swing.JButton kontaktButton;
    public javax.swing.JPanel kontaktyPanel;
    public javax.swing.JButton kosikButton;
    public javax.swing.JPanel kosikPanel;
    public javax.swing.JPanel panelLavyPanel;
    public javax.swing.JPanel pozadiePanel;
    public javax.swing.JButton produktyButton;
    public javax.swing.JPanel produktyPanel;
    public javax.swing.JButton ucetButton;
    public javax.swing.JPanel ucetPanel;
    // End of variables declaration//GEN-END:variables
}
