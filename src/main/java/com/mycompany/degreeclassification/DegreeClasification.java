package com.mycompany.degreeclassification;

public class DegreeClasification extends javax.swing.JFrame {

    public DegreeClasification() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        degreeEstimator = new javax.swing.JLabel();
        instructionsHome = new javax.swing.JLabel();
        instructionsHome2 = new javax.swing.JLabel();
        getStarted = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        undergraduateButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        degreeEstimator.setBackground(new java.awt.Color(255, 0, 0));
        degreeEstimator.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        degreeEstimator.setText("  Degree Estimator");
        degreeEstimator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 5, true));

        instructionsHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        instructionsHome.setText("Enter your predicted marks to calculate your degree classiciation.");

        instructionsHome2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        instructionsHome2.setText("This estimator should be used as a guide only!");

        getStarted.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getStarted.setText("To get started, please click undergraduate degrees:");

        quitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 0, 0));
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        undergraduateButton.setBackground(new java.awt.Color(255, 0, 0));
        undergraduateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        undergraduateButton.setForeground(new java.awt.Color(255, 255, 255));
        undergraduateButton.setText("Undergraduate Degrees");
        undergraduateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undergraduateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(getStarted)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(quitButton)
                            .addComponent(degreeEstimator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instructionsHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                            .addComponent(instructionsHome2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(undergraduateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(degreeEstimator, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(instructionsHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionsHome2)
                .addGap(62, 62, 62)
                .addComponent(getStarted)
                .addGap(36, 36, 36)
                .addComponent(undergraduateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quitButton)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // invoke quit method
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void undergraduateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undergraduateButtonActionPerformed
        // TODO add your handling code here:
        progressBar.setValue(33);
        
        // Open next GUI screen Level 5 and 6 Selection
        Level_5_6 nextScreen = new Level_5_6();
        nextScreen.setVisible(true);
        this.dispose(); // Close the Degree Classification Home Screen
        
        
        
    }//GEN-LAST:event_undergraduateButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new DegreeClassification().setVisible(true));{
            
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel degreeEstimator;
    private javax.swing.JLabel getStarted;
    private javax.swing.JLabel instructionsHome;
    private javax.swing.JLabel instructionsHome2;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton undergraduateButton;
    // End of variables declaration//GEN-END:variables

    private void quit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
