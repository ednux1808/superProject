/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafic.app;

import app.Lista.ListaDoble;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author ednux
 */
public class ListaDobleV extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;

    ListaDoble lista = new ListaDoble();

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    /**
     * Creates new form ListaDobleV
     */
    public ListaDobleV() {
        initComponents();
        QuitarLaBarraTitulo();

    }

    public void agregar() {
        if (this.textdato.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Text Vacio");
        } else if (this.lista.buscar(Integer.parseInt(this.textdato.getText())) == true) {
            JOptionPane.showMessageDialog(null, "El Dato ya existe");
        } else {
            this.lista.insertar(Integer.parseInt(this.textdato.getText()));
            this.textestado.setText(this.lista.imprimir());
            this.textdato.setText("");
            this.textdato.requestFocus();
        }

    }

    public void eliminar() {
        if (this.lista.estaVacia() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            this.textdato.requestFocus();
        } else {
            if (this.lista.buscar(Integer.parseInt(this.textdato.getText())) == true) {
                if (this.textdato.getText().equals("")) {
                    this.lista.eliminar(this.lista.first());
                    this.textestado.setText(this.lista.imprimir());
                    this.textEliminado.setText(String.valueOf(this.textdato.getText()));
                    this.textdato.setText("");
                    this.textdato.requestFocus();

                } else {
                    this.lista.eliminar(Integer.parseInt(this.textdato.getText()));
                    this.textestado.setText(this.lista.imprimir());
                    this.textEliminado.setText(String.valueOf(this.textdato.getText()));
                    this.textdato.setText("");
                    this.textdato.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El dato no existe");
                this.textdato.setText("");
                this.textdato.requestFocus();
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        textdato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textestado = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        textEliminado = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Dato ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 20));

        textdato.setBackground(new java.awt.Color(204, 204, 204));
        textdato.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        textdato.setForeground(new java.awt.Color(51, 51, 51));
        textdato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textdato.setBorder(null);
        textdato.setOpaque(false);
        getContentPane().add(textdato, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Estado de la Lista");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        textestado.setBackground(new java.awt.Color(153, 153, 153));
        textestado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textestado.setForeground(new java.awt.Color(51, 51, 51));
        textestado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textestado.setBorder(null);
        textestado.setOpaque(false);
        getContentPane().add(textestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 60));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 30));

        textEliminado.setBackground(new java.awt.Color(204, 204, 204));
        textEliminado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textEliminado.setForeground(new java.awt.Color(102, 102, 102));
        textEliminado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEliminado.setBorder(null);
        textEliminado.setOpaque(false);
        getContentPane().add(textEliminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, 50));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 100, 20));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("AGREGAR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 200, 40));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("CERRAR");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Dato eliminado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafic/app/img/fondoapp5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 440));

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
    private javax.swing.JTextField textEliminado;
    private javax.swing.JTextField textdato;
    private javax.swing.JTextField textestado;
    // End of variables declaration//GEN-END:variables
}
