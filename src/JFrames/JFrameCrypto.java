/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import javax.swing.JFrame;


public class JFrameCrypto extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipale
     */
    public JFrameCrypto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        Affin = new javax.swing.JButton();
        Affin1 = new javax.swing.JButton();
        RSA = new javax.swing.JButton();
        Hill = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("application");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(null);

        Affin.setBackground(new java.awt.Color(153, 153, 153));
        Affin.setText("Affine");
        Affin.setAutoscrolls(true);
        Affin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AffinActionPerformed(evt);
            }
        });
        jPanel1.add(Affin);
        Affin.setBounds(30, 500, 300, 40);

        Affin1.setBackground(new java.awt.Color(153, 153, 153));
        Affin1.setText(" Vigenère");
        Affin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affin1ActionPerformed(evt);
            }
        });
        jPanel1.add(Affin1);
        Affin1.setBounds(30, 450, 300, 40);

        RSA.setBackground(new java.awt.Color(153, 153, 153));
        RSA.setText("RSA");
        RSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSAActionPerformed(evt);
            }
        });
        jPanel1.add(RSA);
        RSA.setBounds(30, 400, 300, 40);

        Hill.setBackground(new java.awt.Color(153, 153, 153));
        Hill.setText("Hill");
        Hill.setActionCommand(" Hill");
        Hill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HillActionPerformed(evt);
            }
        });
        jPanel1.add(Hill);
        Hill.setBounds(30, 550, 300, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("La cryptographie est la discipline qui permet de protéger des messages.");
        jLabel4.setFocusTraversalPolicyProvider(true);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 540, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vous voulez cryptez un message ? ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 200, 490, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vous trouverez ci joint quelques methodes permettant le cryptage et le decryptage de vos messages");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 230, 700, 90);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Les premières traces de la cryptographie remontent au XVIème siècle avant J.-C");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 40, 650, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("à ses débuts il était question de chiffrement symétrique, c’est-à-dire, avec une clé permettant de chiffrer et déchiffrer un message");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 70, 960, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ainsi ,une nouvelle méthode révolutionnaire de partage de messages est apparue avec des clés publiques : le cryptage asymétrique");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 100, 930, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Veuillez cliquez sur une methode pour plus de details ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 290, 520, 70);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Méthodes/pic.png"))); // NOI18N
        jLabel8.setText("vous");
        jLabel8.setFocusable(false);
        jLabel8.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1010, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("crypto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AffinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AffinActionPerformed
        JFrameAffin a = new JFrameAffin();
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            a.setVisible(true);            a.setVisible(true);    }//GEN-LAST:event_AffinActionPerformed

    private void RSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSAActionPerformed
        JFrameRsa a = new JFrameRsa();
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
    }//GEN-LAST:event_RSAActionPerformed

    private void Affin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affin1ActionPerformed
        JFrameVigenere a = new JFrameVigenere();
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
    }//GEN-LAST:event_Affin1ActionPerformed

    private void HillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HillActionPerformed
        JFrameHill a = new JFrameHill();
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
    }//GEN-LAST:event_HillActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCrypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCrypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCrypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCrypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCrypto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Affin;
    private javax.swing.JButton Affin1;
    private javax.swing.JButton Hill;
    private javax.swing.JButton RSA;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
