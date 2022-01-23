package cajero;

import java.awt.Image;
import javax.swing.*;
import java.util.*;

/**
 * @date 15 dic. 2021
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class LoginPantalla extends javax.swing.JFrame implements Runnable {
   
    public LoginPantalla() {
        initComponents();
        jl_fecha.setText(fechaHora.fechaActual());
        ImageIcon imagLogo = new ImageIcon ("src/imagenes/Logo_olimpus.png");
        Icon icono = new ImageIcon (imagLogo.getImage().getScaledInstance(jl_logo.getWidth(), jl_logo.getHeight(), Image.SCALE_DEFAULT));
        jl_logo.setIcon(icono); 
        hilo = new Thread(this);
        hilo.start(); 
    }
    
    FechaHoraMetodos fechaHora = new FechaHoraMetodos();
    ClienteMetodos tarjeta = new ClienteMetodos();
    
    public static Map infoCliente = new HashMap();
    public static int cont = 0;
    public static Thread hilo;
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_logo = new javax.swing.JLabel();
        jl_fecha = new javax.swing.JLabel();
        jl_hora = new javax.swing.JLabel();
        jl_numTarjeta = new javax.swing.JLabel();
        jt_numTarjeta = new javax.swing.JTextField();
        jl_infoNumTarjeta = new javax.swing.JLabel();
        jl_fechaCaducidad = new javax.swing.JLabel();
        cb_meses = new javax.swing.JComboBox<>();
        cb_anos = new javax.swing.JComboBox<>();
        jl_infoFechaCaducidad = new javax.swing.JLabel();
        jl_numCvs = new javax.swing.JLabel();
        jt_numCvs = new javax.swing.JTextField();
        jl_numPin = new javax.swing.JLabel();
        jp_numPin = new javax.swing.JPasswordField();
        jl_infoNumPinCvs = new javax.swing.JLabel();
        but_identificate = new javax.swing.JButton();
        jl_infoGeneral = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_minimizar = new javax.swing.JLabel();
        jl_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 650));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 650));

        jl_logo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_fecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_fecha.setForeground(new java.awt.Color(204, 204, 204));
        jl_fecha.setText("DD/MM/YYYY");

        jl_hora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_hora.setForeground(new java.awt.Color(204, 204, 204));
        jl_hora.setText("00:00:00");

        jl_numTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_numTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numTarjeta.setText("Número de Tarjeta");
        jl_numTarjeta.setToolTipText("");

        jt_numTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jt_numTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_numTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_numTarjetaKeyTyped(evt);
            }
        });

        jl_infoNumTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_fechaCaducidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_fechaCaducidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_fechaCaducidad.setText("Fecha Caducidad");
        jl_fechaCaducidad.setToolTipText("");

        cb_meses.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_meses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cb_anos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_anos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));

        jl_infoFechaCaducidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_numCvs.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_numCvs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numCvs.setText("CVS");
        jl_numCvs.setToolTipText("");

        jt_numCvs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jt_numCvs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_numCvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_numCvsKeyTyped(evt);
            }
        });

        jl_numPin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_numPin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numPin.setText("PIN");
        jl_numPin.setToolTipText("");

        jp_numPin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jp_numPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_numPin.setText("xxxx");
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

        jl_infoNumPinCvs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        but_identificate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        but_identificate.setText("IDENTIFÍCATE");
        but_identificate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                but_identificateFocusLost(evt);
            }
        });
        but_identificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_identificateActionPerformed(evt);
            }
        });

        jl_infoGeneral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_infoGeneral.setForeground(new java.awt.Color(255, 0, 0));
        jl_infoGeneral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jl_minimizar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jl_minimizar.setForeground(new java.awt.Color(153, 153, 153));
        jl_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_minimizar.setText("-");
        jl_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jl_minimizar.setMaximumSize(new java.awt.Dimension(25, 25));
        jl_minimizar.setMinimumSize(new java.awt.Dimension(25, 25));
        jl_minimizar.setPreferredSize(new java.awt.Dimension(25, 25));
        jl_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_minimizarMouseClicked(evt);
            }
        });

        jl_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jl_cerrar.setForeground(new java.awt.Color(153, 153, 153));
        jl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cerrar.setText("X");
        jl_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jl_cerrar.setMaximumSize(new java.awt.Dimension(25, 25));
        jl_cerrar.setMinimumSize(new java.awt.Dimension(25, 25));
        jl_cerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        jl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jl_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jt_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jl_infoNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jl_fechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(but_identificate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_infoNumPinCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jl_numCvs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_numCvs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_anos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jl_infoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jl_numPin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jp_numPin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addComponent(jl_infoFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_fecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_hora))
                            .addComponent(jl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_fecha)
                    .addComponent(jl_hora))
                .addGap(56, 56, 56)
                .addComponent(jl_numTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl_fechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_anos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numCvs)
                    .addComponent(jl_numPin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_numCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_numPin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoNumPinCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(but_identificate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_infoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jl_cerrarMouseClicked

    private void jl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jl_minimizarMouseClicked

    private void jt_numTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_numTarjetaKeyTyped
        tarjeta.setValidarNumTarjeta(evt, jl_infoNumTarjeta, jt_numTarjeta, 25);
    }//GEN-LAST:event_jt_numTarjetaKeyTyped

    private void jp_numPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jp_numPinKeyTyped
        tarjeta.setSoloNum(evt, jl_infoNumPinCvs, jp_numPin, 4);
    }//GEN-LAST:event_jp_numPinKeyTyped

    private void jp_numPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_numPinMouseClicked
        if (cont == 0) {
            jp_numPin.setText("");
            cont++;
        }
    }//GEN-LAST:event_jp_numPinMouseClicked

    private void jt_numCvsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_numCvsKeyTyped
        tarjeta.setSoloNum(evt, jl_infoNumPinCvs, jt_numCvs, 3);
    }//GEN-LAST:event_jt_numCvsKeyTyped

    private void but_identificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_identificateActionPerformed

        if (tarjeta.getIdentificarCliente(jt_numTarjeta.getText(), jt_numCvs.getText(),
        jp_numPin.getText(), "") == "Usuario encontrado"){
            ClienteCuentaMetodos clienteCuenta = new ClienteCuentaMetodos();
            CuentaMetodos cuenta = new CuentaMetodos();
            
            infoCliente.put(1, jt_numTarjeta.getText());
            infoCliente.put(2, tarjeta.buscarNombre(jt_numTarjeta.getText()).toUpperCase());
            infoCliente.put(3, cuenta.getFechaUltimaOperacion
            (clienteCuenta.getNumeroCuenta(tarjeta.getBuscarNif(jt_numTarjeta.getText()))));
            infoCliente.put(4, cuenta.getSaldo
            (clienteCuenta.getNumeroCuenta(tarjeta.getBuscarNif(jt_numTarjeta.getText()))));
            infoCliente.put(5, clienteCuenta.getNumeroCuenta(tarjeta.getBuscarNif(jt_numTarjeta.getText())));
            
            BienvenidoUsuarioPantalla usuarioPant = new BienvenidoUsuarioPantalla();
            usuarioPant.setVisible(true);
            this.setVisible(false);
        } else {
            jl_infoGeneral.setText("Datos incorrectos, vuelve a intentarlo");
        }
    }//GEN-LAST:event_but_identificateActionPerformed

    private void but_identificateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_but_identificateFocusLost
        jl_infoGeneral.setText("");
    }//GEN-LAST:event_but_identificateFocusLost

    @Override
    public void run () {
        Thread current = Thread.currentThread();
        while (current ==  hilo) {
            fechaHora.horaActual();
            jl_hora.setText(fechaHora.hor + ":" + fechaHora.min + ":" + fechaHora.seg);       
        }
    }
    
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
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_identificate;
    private javax.swing.JComboBox<String> cb_anos;
    private javax.swing.JComboBox<String> cb_meses;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl_cerrar;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_fechaCaducidad;
    public javax.swing.JLabel jl_hora;
    private javax.swing.JLabel jl_infoFechaCaducidad;
    private javax.swing.JLabel jl_infoGeneral;
    private javax.swing.JLabel jl_infoNumPinCvs;
    private javax.swing.JLabel jl_infoNumTarjeta;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_minimizar;
    private javax.swing.JLabel jl_numCvs;
    private javax.swing.JLabel jl_numPin;
    private javax.swing.JLabel jl_numTarjeta;
    private javax.swing.JPasswordField jp_numPin;
    private javax.swing.JTextField jt_numCvs;
    public javax.swing.JTextField jt_numTarjeta;
    // End of variables declaration//GEN-END:variables
}
