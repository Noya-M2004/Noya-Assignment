// I'm specifically facing problems with this code 
package com.mycompany.degreeclassification;

public class Level5 extends javax.swing.JFrame {

    public Level5() {
        initComponents();
        addValidationListeners();

        // Quit button functionality
        quitButton.setText("Quit");
        quitButton.addActionListener(evt -> System.exit(0));

        // Back button functionality
        backButton.setText("Back");
        backButton.addActionListener(evt -> {
            new Level_5_6().setVisible(true);
            dispose();
        });

        // Restart button functionality
        restartButton.setText("Restart");
        restartButton.addActionListener(evt -> resetFields());

        pack();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        level5 = new javax.swing.JLabel();
        moduleTitle = new javax.swing.JLabel();
        module1 = new javax.swing.JTextField();
        module2 = new javax.swing.JTextField();
        module3 = new javax.swing.JTextField();
        module4 = new javax.swing.JTextField();
        module5 = new javax.swing.JTextField();
        module6 = new javax.swing.JTextField();
        module7 = new javax.swing.JTextField();
        module8 = new javax.swing.JTextField();
        creditsTitle = new javax.swing.JLabel();
        credits1 = new javax.swing.JTextField();
        credits2 = new javax.swing.JTextField();
        credits3 = new javax.swing.JTextField();
        credits4 = new javax.swing.JTextField();
        credits5 = new javax.swing.JTextField();
        credits6 = new javax.swing.JTextField();
        credits7 = new javax.swing.JTextField();
        credits8 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mark1 = new javax.swing.JTextField();
        mark2 = new javax.swing.JTextField();
        mark3 = new javax.swing.JTextField();
        mark4 = new javax.swing.JTextField();
        mark5 = new javax.swing.JTextField();
        mark6 = new javax.swing.JTextField();
        mark7 = new javax.swing.JTextField();
        mark8 = new javax.swing.JTextField();
        level6 = new javax.swing.JLabel();
        moduleTitle1 = new javax.swing.JLabel();
        creditsTitle1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        module9 = new javax.swing.JTextField();
        module10 = new javax.swing.JTextField();
        module11 = new javax.swing.JTextField();
        module12 = new javax.swing.JTextField();
        module13 = new javax.swing.JTextField();
        module14 = new javax.swing.JTextField();
        module15 = new javax.swing.JTextField();
        module16 = new javax.swing.JTextField();
        credits9 = new javax.swing.JTextField();
        credits10 = new javax.swing.JTextField();
        credits11 = new javax.swing.JTextField();
        credits12 = new javax.swing.JTextField();
        credits13 = new javax.swing.JTextField();
        credits14 = new javax.swing.JTextField();
        credits15 = new javax.swing.JTextField();
        credits16 = new javax.swing.JTextField();
        mark9 = new javax.swing.JTextField();
        mark10 = new javax.swing.JTextField();
        mark11 = new javax.swing.JTextField();
        mark12 = new javax.swing.JTextField();
        mark13 = new javax.swing.JTextField();
        mark14 = new javax.swing.JTextField();
        mark15 = new javax.swing.JTextField();
        mark16 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        averageOne = new javax.swing.JLabel();
        averageTwo = new javax.swing.JLabel();
        highAverage = new javax.swing.JLabel();
        classification = new javax.swing.JLabel();
        profileMark = new javax.swing.JLabel();
        average1 = new javax.swing.JTextField();
        average2 = new javax.swing.JTextField();
        higherAverage = new javax.swing.JTextField();
        classificationField = new javax.swing.JTextField();
        profileMarkField = new javax.swing.JTextField();
        quitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("  Degree Estimator ");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 5, true));

        jLabel2.setText("1. Enter credits for each module at level 5 and 6. Eg: 20 credits for a 20 credit module.");

        jLabel3.setText("2. Input either predicted or actual numeric marks recieved for a module.");

        jLabel4.setText("3. You will recieve an average grade for Level 5 and 6 combined.");

        level5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        level5.setForeground(new java.awt.Color(255, 0, 0));
        level5.setText("Level 5");

        moduleTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        moduleTitle.setText("Module:");

        module1.setText("module 1");
        module1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                module1ActionPerformed(evt);
            }
        });

        module2.setText("module 2");

        module3.setText("module 3");

        module4.setText("module 4");

        module5.setText("module 5");

        module6.setText("module 6");

        module7.setText("module 7");
        module7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                module7ActionPerformed(evt);
            }
        });

        module8.setText("module 8");

        creditsTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        creditsTitle.setText("Credits:");

        credits1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits1ActionPerformed(evt);
            }
        });

        credits2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits2ActionPerformed(evt);
            }
        });

        credits3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits3ActionPerformed(evt);
            }
        });

        credits4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits4ActionPerformed(evt);
            }
        });

        credits5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits5ActionPerformed(evt);
            }
        });

        credits6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits6ActionPerformed(evt);
            }
        });

        credits7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits7ActionPerformed(evt);
            }
        });

        credits8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mark:");

        mark1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark1ActionPerformed(evt);
            }
        });

        mark2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark2ActionPerformed(evt);
            }
        });

        mark3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark3ActionPerformed(evt);
            }
        });

        mark4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark4ActionPerformed(evt);
            }
        });

        mark5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark5ActionPerformed(evt);
            }
        });

        mark6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark6ActionPerformed(evt);
            }
        });

        mark7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark7ActionPerformed(evt);
            }
        });

        mark8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark8ActionPerformed(evt);
            }
        });

        level6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        level6.setForeground(new java.awt.Color(255, 0, 0));
        level6.setText("Level 6");

        moduleTitle1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        moduleTitle1.setText("Module:");

        creditsTitle1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        creditsTitle1.setText("Credits:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Mark:");

        module9.setText("module 1");
        module9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                module9ActionPerformed(evt);
            }
        });

        module10.setText("module 2");

        module11.setText("module 3");

        module12.setText("module 4");

        module13.setText("module 5");

        module14.setText("module 6");

        module15.setText("module 7");

        module16.setText("module 8");

        credits9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits9ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Predicted Degree:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("");

        averageOne.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        averageOne.setForeground(new java.awt.Color(255, 255, 255));
        averageOne.setText("Average 1 Level 5 + Level 6:");

        averageTwo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        averageTwo.setForeground(new java.awt.Color(255, 255, 255));
        averageTwo.setText("Average 2 Level 5 + Level 6 x2:");

        highAverage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        highAverage.setForeground(new java.awt.Color(255, 255, 255));
        highAverage.setText("Higher Average Mark:");

        classification.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        classification.setForeground(new java.awt.Color(255, 255, 255));
        classification.setText("Classification:");

        profileMark.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileMark.setForeground(new java.awt.Color(255, 255, 255));
        profileMark.setText("Profile Mark Classification:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(averageOne, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(average1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(classification, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classificationField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(profileMark, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(averageTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(average2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profileMarkField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(highAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(higherAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(averageOne)
                    .addComponent(average1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(averageTwo)
                    .addComponent(average2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highAverage)
                    .addComponent(higherAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classification)
                    .addComponent(classificationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(profileMark)
                        .addContainerGap())
                    .addComponent(profileMarkField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        quitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 0, 0));
        quitButton.setText("Quit");

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setText("Back");

        restartButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        restartButton.setForeground(new java.awt.Color(0, 102, 255));
        restartButton.setText("Restart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(module16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(module15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(module14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(module13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(module12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(module11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(module10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(moduleTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(260, 260, 260)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(moduleTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(level6)))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(creditsTitle1)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(credits16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(credits15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(credits14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(credits13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(credits12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(credits11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(credits10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(credits9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(mark15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(mark14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(mark13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(mark12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(mark11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(mark10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(mark9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mark16, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(restartButton)
                                        .addGap(29, 29, 29)
                                        .addComponent(backButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quitButton))))
                            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(level5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(module4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(module2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(creditsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(credits3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(credits4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(credits5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(credits6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(credits7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(credits2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(credits8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(credits1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mark8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mark2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mark5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mark6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mark7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mark3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mark4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(level5)
                    .addComponent(level6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moduleTitle)
                    .addComponent(creditsTitle)
                    .addComponent(jLabel5)
                    .addComponent(moduleTitle1)
                    .addComponent(creditsTitle1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(module8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(module16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(restartButton)
                            .addComponent(backButton)
                            .addComponent(quitButton))
                        .addGap(72, 72, 72))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
private void calculateMethodA() {
        int totalCreditsL5 = 0, totalCreditsL6 = 0;
        int weightedSumL5 = 0, weightedSumL6 = 0;

        try {
            // Level 5 calculations
            for (int i = 0; i < 7; i++) {
                int credits = Integer.parseInt(creditsFields[i].getText());
                int marks = Integer.parseInt(marksFields[i].getText());
                totalCreditsL5 += credits;
                weightedSumL5 += credits * marks;
            }

            // Level 6 calculations
            for (int i = 7; i < 14; i++) {
                int credits = Integer.parseInt(creditsFields[i].getText());
                int marks = Integer.parseInt(marksFields[i].getText());
                totalCreditsL6 += credits;
                weightedSumL6 += credits * marks;
            }

            if (totalCreditsL5 == 0 || totalCreditsL6 == 0) {
                JOptionPane.showMessageDialog(this, "Total credits for Level 5 or Level 6 cannot be zero.");
                return;
            }
            
         try {
            double averageL5 = (double) weightedSumL5 / totalCreditsL5;
            double averageL6 = (double) weightedSumL6 / totalCreditsL6;
            double overallAverage = (averageL5 + averageL6) / 2;

            // Display results
            average1.setText(String.format("%.2f", averageL5));
            average2.setText(String.format("%.2f", averageL6));
            higherAverage.setText(String.format("%.2f", overallAverage));

            String classification;
            if (overallAverage >= 70) {
                classification = "1st";
            } else if (overallAverage >= 60) {
                classification = "2:1";
            } else if (overallAverage >= 50) {
                classification = "2:2";
            } else if (overallAverage >= 40) {
                classification = "3rd";
            } else {
                classification = "Fail";
            }

            classificationField.setText(classification);
            profileMarkField.setText(String.format("%.2f", overallAverage));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for credits and marks.");
        }


    private void addValidationListeners() {
            // Add validation for credits
            for (int i = 0; i < 14; i++) {
            creditsFields[i].addKeyListener(new keyAdapter()) {
                public void keyTyped(keyEvent evt) {
                    validateNumericInput(evt, creditFields[i], 20, "Credits cannot exceed 20.");
                }
            });

            



    private void initializeFields() {
        
    // Initialize module, credits, and marks fields
            for (int i = 0; i < 14; i++) {
                moduleFields[i] = new JTextField("Module " + (i + 1));
                creditsFields[i] = new JTextField();
                marksFields[i] = new JTextField();

            


            // Add validation for marks
            marksFields[i].addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent evt) {
                    validateNumericInput(evt, marksFields[i], 100, "Marks cannot exceed 100.");
                }
            });
        }
    }
        
    private void validateNumericInput(KeyEvent evt, JTextField field, int max, String errorMessage) {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {
                evt.consume();
                return;
            }

            String text = field.getText();
            int caretPos = field.getCaretPosition();
            StringBuilder sb = new StringBuilder(text);
            sb.insert(caretPos, c);

            if (sb.length() > 3 || Integer.parseInt(sb.toString()) > max) {
                evt.consume();
                JOptionPane.showMessageDialog(this, errorMessage);
            }
        }

    private void resetFields() {
        for (int i = 0; i < 14; i++) {
            moduleFields[i].setText("");
            creditsFields[i].setText("");
            marksFields[i].setText("");
        }
        average1.setText("");
        average2.setText("");
        higherAverage.setText("");
        classificationField.setText("");
        profileMarkField.setText("");
        progressBar.setValue(100);
    }

    
    private void module1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_module1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_module1ActionPerformed

    private void credits1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits1ActionPerformed

    private void credits2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits2ActionPerformed

    private void credits3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits3ActionPerformed

    private void credits4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits4ActionPerformed

    private void credits5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits5ActionPerformed

    private void credits6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits6ActionPerformed

    private void credits7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits7ActionPerformed

    private void credits8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits8ActionPerformed

    private void module7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_module7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_module7ActionPerformed

    private void mark1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark1ActionPerformed

    private void mark2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark2ActionPerformed

    private void mark3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark3ActionPerformed

    private void mark4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark4ActionPerformed

    private void mark5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark5ActionPerformed

    private void mark6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark6ActionPerformed

    private void mark7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark7ActionPerformed

    private void mark8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark8ActionPerformed

    private void credits9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credits9ActionPerformed

    private void module9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_module9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_module9ActionPerformed

    public static void main(String args[]) {
 
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
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Level5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField average1;
    private javax.swing.JTextField average2;
    private javax.swing.JLabel averageOne;
    private javax.swing.JLabel averageTwo;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel classification;
    private javax.swing.JTextField classificationField;
    private javax.swing.JTextField credits1;
    private javax.swing.JTextField credits10;
    private javax.swing.JTextField credits11;
    private javax.swing.JTextField credits12;
    private javax.swing.JTextField credits13;
    private javax.swing.JTextField credits14;
    private javax.swing.JTextField credits15;
    private javax.swing.JTextField credits16;
    private javax.swing.JTextField credits2;
    private javax.swing.JTextField credits3;
    private javax.swing.JTextField credits4;
    private javax.swing.JTextField credits5;
    private javax.swing.JTextField credits6;
    private javax.swing.JTextField credits7;
    private javax.swing.JTextField credits8;
    private javax.swing.JTextField credits9;
    private javax.swing.JLabel creditsTitle;
    private javax.swing.JLabel creditsTitle1;
    private javax.swing.JLabel highAverage;
    private javax.swing.JTextField higherAverage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level5;
    private javax.swing.JLabel level6;
    private javax.swing.JTextField mark1;
    private javax.swing.JTextField mark10;
    private javax.swing.JTextField mark11;
    private javax.swing.JTextField mark12;
    private javax.swing.JTextField mark13;
    private javax.swing.JTextField mark14;
    private javax.swing.JTextField mark15;
    private javax.swing.JTextField mark16;
    private javax.swing.JTextField mark2;
    private javax.swing.JTextField mark3;
    private javax.swing.JTextField mark4;
    private javax.swing.JTextField mark5;
    private javax.swing.JTextField mark6;
    private javax.swing.JTextField mark7;
    private javax.swing.JTextField mark8;
    private javax.swing.JTextField mark9;
    private javax.swing.JTextField module1;
    private javax.swing.JTextField module10;
    private javax.swing.JTextField module11;
    private javax.swing.JTextField module12;
    private javax.swing.JTextField module13;
    private javax.swing.JTextField module14;
    private javax.swing.JTextField module15;
    private javax.swing.JTextField module16;
    private javax.swing.JTextField module2;
    private javax.swing.JTextField module3;
    private javax.swing.JTextField module4;
    private javax.swing.JTextField module5;
    private javax.swing.JTextField module6;
    private javax.swing.JTextField module7;
    private javax.swing.JTextField module8;
    private javax.swing.JTextField module9;
    private javax.swing.JLabel moduleTitle;
    private javax.swing.JLabel moduleTitle1;
    private javax.swing.JLabel profileMark;
    private javax.swing.JTextField profileMarkField;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton restartButton;
    // End of variables declaration//GEN-END:variables
}
