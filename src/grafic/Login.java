/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafic;

import javax.swing.JOptionPane;




/**
 *
 * @author ednux
 */
public class Login extends javax.swing.JFrame {

    
            
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
      this.setLocationRelativeTo(null);
        textUsername.requestFocus();
        textPass.setEnabled(true);
        
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        iniciar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        textPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(19, 75, 105));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(19, 58, 78));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafic/img/btna.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 516, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 602, 20));

        jLabel1.setBackground(new java.awt.Color(19, 75, 105));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafic/img/fondoLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 550));

        jPanel1.setBackground(new java.awt.Color(19, 75, 105));

        iniciar.setBackground(new java.awt.Color(102, 255, 153));
        iniciar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setText("INICIAR");
        iniciar.setBorder(null);
        iniciar.setBorderPainted(false);
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iniciar.setFocusable(false);
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 51, 0));
        salir.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        salir.setText("CERRAR");
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafic/img/iconLogin2.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        textUsername.setBackground(new java.awt.Color(19, 75, 105));
        textUsername.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textUsername.setForeground(new java.awt.Color(255, 255, 255));
        textUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textUsername.setBorder(null);
        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(1, 236, 217));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username ");

        textPass.setBackground(new java.awt.Color(19, 75, 105));
        textPass.setForeground(new java.awt.Color(255, 255, 255));
        textPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPass.setBorder(null);
        textPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPassActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(1, 236, 217));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textUsername)
                            .addComponent(jSeparator1)
                            .addComponent(textPass)
                            .addComponent(jSeparator2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        // TODO add your handling code here:
         String usuario;
        usuario=textUsername.getText();
        JOptionPane.showMessageDialog(null,"Bienvenido ");
        if(usuario.equals("eduardo")) {
           
            JOptionPane.showMessageDialog(null,"PorFavor Ingrese su Codigo de AuToriZacion");
            
            textPass.requestFocusInWindow();
            textPass.setEnabled(true);
            
        }  else {
            JOptionPane.showMessageDialog(null,"Usted no esta autorizado para usar este sistema");
            textUsername.setText("");
            textUsername.setEnabled(false);
            salir.requestFocusInWindow();
        }
    }//GEN-LAST:event_textUsernameActionPerformed

    private void textPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPassActionPerformed
        // TODO add your handling code here:
          String contraseña;
        contraseña=String.valueOf(textPass.getText());
        String usuario;
        usuario=textUsername.getText();
        int cont=0;
       
            if(contraseña.equals("12345")) {
                iniciar.requestFocusInWindow();
                JOptionPane.showMessageDialog(null,"INICIANDO");
                }
        else {
                JOptionPane.showMessageDialog(null,"La Contraseña o El Nombre de Usuario no considen");
                textPass.setText("");
                textPass.requestFocusInWindow();
             } 
    }//GEN-LAST:event_textPassActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        // TODO add your handling code here:
          String contrasena;
        contrasena=String.valueOf(textPass.getText());
        String usuario;
        usuario=textUsername.getText();
        int cont=0;
        if(usuario.equals("eduardo")&& contrasena.equals("12345")) {
            Inicio M =new Inicio();
        JOptionPane.showMessageDialog(null,"Bienvenido Eduardo :) ");
        M.setVisible(true);
        dispose();
             }
             
        
           else {
                JOptionPane.showMessageDialog(null,"Vuela a intentar");
                textPass.setText("");
                textPass.requestFocusInWindow();
            } 
    }//GEN-LAST:event_iniciarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton salir;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
