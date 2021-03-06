/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafic.app;

import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import listaDoblementeEnlazadaCircular.ListaDoblementeCircular;

/**
 *
 * @author ednux
 */
public class ListaCDE extends javax.swing.JInternalFrame {

    
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;
    ListaDoblementeCircular lista = new ListaDoblementeCircular();
    
      public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }
    
    
    

    public void agregar() {

        if (this.textDato.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Text Vacio");
        } else if (this.lista.buscar(Integer.parseInt(this.textDato.getText())) == true) {
            JOptionPane.showMessageDialog(null, "El Dato ya existe");
        } else {
            this.lista.insertar(Integer.parseInt(this.textDato.getText()));
            this.textResultado.setText(this.lista.imprimirLista());
            this.textDato.setText("");
            this.textDato.requestFocus();
        }

    }
    
    public void eliminar(){
         if (this.lista.estaVacia() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            this.textDato.requestFocus();
        } else {
            if (this.lista.buscar(Integer.parseInt(this.textDato.getText())) == true) {
                if (this.textDato.getText().equals("")) {
                    this.lista.eliminar(this.lista.first());
                    this.textResultado.setText(this.lista.imprimirLista());
                    this.texEliminado.setText(String.valueOf(this.textDato.getText()));
                    this.textDato.setText("");
                    this.textDato.requestFocus();

                } else {
                    this.lista.eliminar(Integer.parseInt(this.textDato.getText()));
                    this.textResultado.setText(this.lista.imprimir());
                    this.texEliminado.setText(String.valueOf(this.textDato.getText()));
                    this.textDato.setText("");
                    this.textDato.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El dato no existe");
                this.textDato.setText("");
                this.textDato.requestFocus();
            }
        }
    
    }

    /**
     * Creates new form ListaCDE
     */
    public ListaCDE() {
        initComponents();
         QuitarLaBarraTitulo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        textDato = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        textResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        texEliminado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Dato :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        textDato.setBackground(new java.awt.Color(255, 255, 255));
        textDato.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        textDato.setForeground(new java.awt.Color(51, 51, 51));
        textDato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDato.setBorder(null);
        textDato.setOpaque(false);
        getContentPane().add(textDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Estado de Lista");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 40));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 10));

        textResultado.setBackground(new java.awt.Color(255, 255, 255));
        textResultado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        textResultado.setForeground(new java.awt.Color(51, 51, 51));
        textResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textResultado.setBorder(null);
        textResultado.setOpaque(false);
        getContentPane().add(textResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 60));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Dato eliminado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 100, 20));

        texEliminado.setBackground(new java.awt.Color(255, 255, 255));
        texEliminado.setForeground(new java.awt.Color(51, 51, 51));
        texEliminado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texEliminado.setBorder(null);
        texEliminado.setOpaque(false);
        getContentPane().add(texEliminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, 40));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("AGREGAR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 40));

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 51, 0));
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 40));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("CERRAR");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafic/app/img/fondoapp4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 240, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
                
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField texEliminado;
    private javax.swing.JTextField textDato;
    private javax.swing.JTextField textResultado;
    // End of variables declaration//GEN-END:variables

}
