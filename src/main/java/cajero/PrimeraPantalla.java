package cajero;

import java.awt.Image;
import javax.swing.*;

/**
 * @date 15 dic. 2021
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class PrimeraPantalla extends javax.swing.JFrame {

   
    public PrimeraPantalla() {
        initComponents();
        ImageIcon imagLogo = new ImageIcon ("src/imagenes/Logo_olimpus.png");
        Icon icono = new ImageIcon (imagLogo.getImage().getScaledInstance(jl_logo.getWidth(), jl_logo.getHeight(), Image.SCALE_DEFAULT));
        jl_logo.setIcon(icono);  
    }

    SegundaPantalla segPantalla = new SegundaPantalla();
    Tarjeta tarjeta = new Tarjeta();
    
    
    int cont = 0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_logo = new javax.swing.JLabel();
        but_identificate = new javax.swing.JButton();
        jl_numTarjeta = new javax.swing.JLabel();
        jt_numCvs = new javax.swing.JTextField();
        jl_fechaCaducidad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jl_numCvs = new javax.swing.JLabel();
        jp_numPin = new javax.swing.JPasswordField();
        jt_numTarjeta = new javax.swing.JTextField();
        cb_meses = new javax.swing.JComboBox<>();
        cb_anos = new javax.swing.JComboBox<>();
        jl_infoNumPin = new javax.swing.JLabel();
        jl_infoNumCvs = new javax.swing.JLabel();
        jl_infoNumTarjeta = new javax.swing.JLabel();
        jl_infoNumPin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(450, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 700));

        jl_logo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        but_identificate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        but_identificate.setText("IDENTIFÍCATE");
        but_identificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_identificateActionPerformed(evt);
            }
        });

        jl_numTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_numTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numTarjeta.setText("Número de Tarjeta");
        jl_numTarjeta.setToolTipText("");

        jt_numCvs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jt_numCvs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_numCvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_numCvsKeyTyped(evt);
            }
        });

        jl_fechaCaducidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_fechaCaducidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_fechaCaducidad.setText("Fecha Caducidad");
        jl_fechaCaducidad.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PIN");
        jLabel4.setToolTipText("");

        jl_numCvs.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_numCvs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numCvs.setText("Número CVS");
        jl_numCvs.setToolTipText("");

        jp_numPin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jp_numPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_numPin.setText("xxxx");
        jp_numPin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jp_numPinFocusGained(evt);
            }
        });
        jp_numPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_numPinMouseClicked(evt);
            }
        });
        jp_numPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jp_numPinKeyTyped(evt);
            }
        });

        jt_numTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jt_numTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_numTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_numTarjetaActionPerformed(evt);
            }
        });
        jt_numTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_numTarjetaKeyTyped(evt);
            }
        });

        cb_meses.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_meses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cb_anos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_anos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));

        jl_infoNumPin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_infoNumCvs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_infoNumTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_infoNumTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jl_infoNumTarjetaKeyTyped(evt);
            }
        });

        jl_infoNumPin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jp_numPin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jt_numCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jl_fechaCaducidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(but_identificate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_infoNumPin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_infoNumCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_numCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jl_infoNumTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_anos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jl_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_infoNumPin1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(424, 424, 424))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jl_numTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jl_fechaCaducidad, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_anos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoNumPin1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jl_numCvs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_numCvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoNumCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_numPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoNumPin, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(but_identificate, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void but_identificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_identificateActionPerformed
        if (tarjeta.getIdentificarCliente(jt_numTarjeta.getText(), jt_numCvs.getText(), 
            jp_numPin.getText(), "") == "Usuario encontrado"){
            
            segPantalla.setVisible(true);
            segPantalla.jl_nombre.setText(tarjeta.buscarNombre(jt_numTarjeta.getText()));
            this.dispose();
        }
    }//GEN-LAST:event_but_identificateActionPerformed

    private void jp_numPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jp_numPinKeyTyped
        tarjeta.setSoloNum(evt, jl_infoNumPin, jp_numPin, 4);
    }//GEN-LAST:event_jp_numPinKeyTyped

    private void jp_numPinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jp_numPinFocusGained
        
    }//GEN-LAST:event_jp_numPinFocusGained

    private void jp_numPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_numPinMouseClicked
        if (cont == 0) {
            jp_numPin.setText("");
            cont++;
        }
    }//GEN-LAST:event_jp_numPinMouseClicked

    private void jt_numCvsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_numCvsKeyTyped
        tarjeta.setSoloNum(evt, jl_infoNumCvs, jt_numCvs, 4);
    }//GEN-LAST:event_jt_numCvsKeyTyped

    private void jl_infoNumTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jl_infoNumTarjetaKeyTyped
        
    }//GEN-LAST:event_jl_infoNumTarjetaKeyTyped

    private void jt_numTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_numTarjetaKeyTyped
        tarjeta.setValidarNumTarjeta(evt, jl_infoNumTarjeta, jt_numTarjeta, 25);
    }//GEN-LAST:event_jt_numTarjetaKeyTyped

    private void jt_numTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_numTarjetaActionPerformed
        
    }//GEN-LAST:event_jt_numTarjetaActionPerformed

    
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
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeraPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_identificate;
    private javax.swing.JComboBox<String> cb_anos;
    private javax.swing.JComboBox<String> cb_meses;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jl_fechaCaducidad;
    private javax.swing.JLabel jl_infoNumCvs;
    private javax.swing.JLabel jl_infoNumPin;
    private javax.swing.JLabel jl_infoNumPin1;
    private javax.swing.JLabel jl_infoNumTarjeta;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_numCvs;
    private javax.swing.JLabel jl_numTarjeta;
    private javax.swing.JPasswordField jp_numPin;
    private javax.swing.JTextField jt_numCvs;
    private javax.swing.JTextField jt_numTarjeta;
    // End of variables declaration//GEN-END:variables
}
