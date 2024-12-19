package com.mycompany.degreeclassification;

import com.mycompany.degreeclassification.DegreeClassification;

public class Level_5_6 extends javax.swing.JFrame {

    public Level_5_6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        degreeEstimator = new javax.swing.JLabel();
        sentenceOne = new javax.swing.JLabel();
        sentenceTwo = new javax.swing.JLabel();
        sentenceThree = new javax.swing.JLabel();
        level5level6 = new javax.swing.JButton();
        level6 = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        quitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        degreeEstimator.setBackground(new java.awt.Color(255, 0, 0));
        degreeEstimator.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        degreeEstimator.setText("  Degree Estimator");
        degreeEstimator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 5, true));

        sentenceOne.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sentenceOne.setText("Select your degree level. You can calculate your degree based on both Level 5 and 6 marks combined,");

        sentenceTwo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sentenceTwo.setText("or Level 6 marks individually.");

        sentenceThree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sentenceThree.setText("Please select your Level:");

        level5level6.setBackground(new java.awt.Color(255, 0, 0));
        level5level6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        level5level6.setForeground(new java.awt.Color(255, 255, 255));
        level5level6.setText("Level 5 and Level 6");
        level5level6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level5level6ActionPerformed(evt);
            }
        });

        level6.setBackground(new java.awt.Color(255, 0, 0));
        level6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        level6.setForeground(new java.awt.Color(255, 255, 255));
        level6.setText("Level 6");

        quitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 0, 0));
        quitButton.setText("Quit");

        backButton.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(sentenceThree))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(level5level6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(level6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(18, 18, 18)
                                .addComponent(quitButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(degreeEstimator, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sentenceTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sentenceOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(degreeEstimator)
                .addGap(36, 36, 36)
                .addComponent(sentenceOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sentenceTwo)
                .addGap(62, 62, 62)
                .addComponent(sentenceThree)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(level5level6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton)
                    .addComponent(backButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void level5level6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level5level6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level5level6ActionPerformed

    private void level5level6ActionPerfromed(java.awt.event.ActionEvent evt) {
        progressBar.setValue(66);
        
        // Opening the Level 5 and 6 (Level5) GUI and close the current screen.
        Level5 level5Screen = new Level5();
        level5Screen.setVisible(true);
        this.dispose();
    }
    
    backButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
    }
});

private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
    // Navigate back to the DegreeClassification page
    DegreeClassification degreeClassificationScreen = new DegreeClassification();
    degreeClassificationScreen.setVisible(true);
    this.dispose(); // Close the current window
}

    
    private void level6ActionPerformed(java.awt.event.ActionEvent evt) {
        progressBar.setValue(66);
        
        // Opening Level 6 GUI and close current screen.
        Level6 level6Screen = new Level6();
        level6Screen.setVisible(true);
        this.dispose();
    }
    
    
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
            java.util.logging.Logger.getLogger(Level_5_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level_5_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level_5_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level_5_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Level_5_6().setVisible(true)); 
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel degreeEstimator;
    private javax.swing.JButton level5level6;
    private javax.swing.JButton level6;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel sentenceOne;
    private javax.swing.JLabel sentenceThree;
    private javax.swing.JLabel sentenceTwo;
    // End of variables declaration//GEN-END:variables
}
