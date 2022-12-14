/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;
import Méthodes.Affin;
import Méthodes.Hill;
import java.util.Arrays;


public class JFrameHill extends javax.swing.JFrame {


    /**
     * Creates new form JFrameCesar
     */
    public JFrameHill() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TexteCry = new javax.swing.JEditorPane();
        Chefri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDec = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textC = new javax.swing.JEditorPane();
        Dechefri = new javax.swing.JButton();
        key1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        key2 = new javax.swing.JTextField();
        key3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hill");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel1.setText("  Méthode Hill");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Texte Clair");

        key.setBackground(new java.awt.Color(153, 153, 255));
        key.setForeground(new java.awt.Color(51, 51, 51));
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("a");

        TexteCry.setBackground(new java.awt.Color(204, 204, 204));
        TexteCry.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(TexteCry);

        Chefri.setForeground(new java.awt.Color(0, 51, 51));
        Chefri.setText("Cryptage");
        Chefri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChefriActionPerformed(evt);
            }
        });

        TextDec.setBackground(new java.awt.Color(204, 204, 204));
        TextDec.setForeground(new java.awt.Color(51, 51, 51));
        TextDec.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(TextDec);

        textC.setBackground(new java.awt.Color(204, 204, 204));
        textC.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(textC);

        Dechefri.setForeground(new java.awt.Color(0, 51, 51));
        Dechefri.setText("Décryptage");
        Dechefri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DechefriActionPerformed(evt);
            }
        });

        key1.setBackground(new java.awt.Color(153, 153, 255));
        key1.setForeground(new java.awt.Color(51, 51, 51));
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("b");

        key2.setBackground(new java.awt.Color(153, 153, 255));
        key2.setForeground(new java.awt.Color(51, 51, 51));
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });

        key3.setBackground(new java.awt.Color(153, 153, 255));
        key3.setForeground(new java.awt.Color(51, 51, 51));
        key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("d");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("c");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("est un modèle simple d'extension du chiffrement affine Il consiste à chiffrer le message en substituant les lettres du message, non plus ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("lettre à lettre, mais par groupe de lettres. Il permet ainsi de rendre plus difficile le cassage du code par observation des fréquences.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Veuillez saisir le texte que vous voulez chiffrer et la matrice carré A de cryptage avec :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("det(A) soit premier avec 26 pour qu'elle soit inversible dans Z/26Z");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Matrice de cryptage ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Chefri)
                                .addGap(125, 125, 125)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(358, 358, 358)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dechefri)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chefri)
                    .addComponent(Dechefri))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

    private void ChefriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChefriActionPerformed
        // TODO add your handling code here:
        try { String textclair = textC.getText();
        textclair = textclair.toUpperCase();
        char[] codecry = new char[textclair.length()];
        Hill message = new Hill();
        String textwithEX = textclair;
            textclair = textclair.replaceAll(" ", "");
            if(textclair.length()%2!=0){
                textclair=textclair+"A";
            }
             int[] code= new int[textclair.length()]; 
             for(int i=0;i<textclair.length();i++){
             code[i]=message.Codagenum(textclair)[i];
             System.out.print(code[i]+" ");
             }
            int[] tab1 = new int[textclair.length()/2]; 
            int[] tab2 = new int[textclair.length()/2]; 
            int j=0;
            for(int i=0;i<code.length;i++){
            tab1[j]=(Integer.parseInt(key.getText())*code[i]+Integer.parseInt(key1.getText())*code[i+1])%26;
            tab2[j]=(Integer.parseInt(key2.getText())*code[i]+Integer.parseInt(key3.getText())*code[i+1])%26;
            i++;
            j++;
            
        }
             int [][] tab3=new int[textclair.length()/2][2];
             for(int i=0;i<textclair.length()/2;i++){
             int e=0;
             tab3[i][e]=tab1[i];
             tab3[i][e+1]=tab2[i];
             }
             
              String result = "";
             for(int i=0;i<textclair.length()/2;i++){
             result+=message.Codage(tab3,textclair.length())[i];
             }
           
//            for(int i=0;i<textclair.length();i++){
//            result += Character.toString(codecry[i]);
//            }
        TexteCry.setText(result);  }
        catch (Exception e){
            
        }
    }//GEN-LAST:event_ChefriActionPerformed

    private void DechefriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DechefriActionPerformed
        int det = Integer.parseInt(key.getText())*Integer.parseInt(key3.getText())-Integer.parseInt(key1.getText())*Integer.parseInt(key2.getText());
        Hill message = new Hill();
        if(message.pgcd(det)!=1){
            TextDec.setText("\n l'inverse de "+det+" n'existe pas dans Z/Z26  \n");
             }
        String textclair = TexteCry.getText();
         int inv=message.inverse1(det);
             
             int e,f,g,h;
             e=Integer.parseInt(key3.getText())*inv%26;
             f=((26-Integer.parseInt(key1.getText()))*inv)%26;
             g=((26-Integer.parseInt(key2.getText()))*inv)%26;
             h=Integer.parseInt(key.getText())*inv%26;
            int[] tab1 = new int[textclair.length()/2]; 
            int[] tab2 = new int[textclair.length()/2]; 
             int[] code= new int[textclair.length()]; 
             for(int i=0;i<textclair.length();i++){
             code[i]=message.Codagenum(textclair)[i];
             System.out.print(code[i]+" ");
             }
             int j = 0;
            for(int i=0;i<code.length;i++){
            tab1[j]=code[i];
            tab2[j]=code[i+1];
            i++;
            j++;
            
        }
            int [][] tab4=new int[textclair.length()/2][2];
            for(int i=0;i<textclair.length()/2;i++){
            tab4[i][0]=(e*tab1[i]+f*tab2[i])%26;
            tab4[i][1]=(g*tab1[i]+h*tab2[i])%26;            
        }
        String result = "";
                for(int i=0;i<textclair.length()/2;i++){
             result+=message.Codage(tab4,textclair.length())[i];
             }
        TextDec.setText(result); 
    }//GEN-LAST:event_DechefriActionPerformed

    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key1ActionPerformed

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key2ActionPerformed

    private void key3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key3ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chefri;
    private javax.swing.JButton Dechefri;
    private javax.swing.JEditorPane TextDec;
    private javax.swing.JEditorPane TexteCry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField key;
    private javax.swing.JTextField key1;
    private javax.swing.JTextField key2;
    private javax.swing.JTextField key3;
    private javax.swing.JEditorPane textC;
    // End of variables declaration//GEN-END:variables
}
