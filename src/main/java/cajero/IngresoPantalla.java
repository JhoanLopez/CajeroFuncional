package cajero;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @date 15 dic. 2021
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class IngresoPantalla extends javax.swing.JFrame {

    public IngresoPantalla() {
        initComponents();
        FechaHoraMetodos fechaHora = new FechaHoraMetodos();
        jl_numTarjeta.setText((String) LoginPantalla.infoCliente.get(1));
        jl_fechaActual.setText(fechaHora.fechaActual());
        jl_infoIngreso.setForeground(Color.black);
    }
    
    public static int cont = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        but_realizarIngreso = new javax.swing.JButton();
        but_volver = new javax.swing.JButton();
        jl_fechaActual = new javax.swing.JLabel();
        jl_infoIngreso = new javax.swing.JLabel();
        jt_importeIngresar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jl_minimizar = new javax.swing.JLabel();
        jl_cerrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jl_ingreso = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jl_tarjeta = new javax.swing.JLabel();
        jl_numTarjeta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        but_realizarIngreso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        but_realizarIngreso.setText("Realizar Ingreso");
        but_realizarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_realizarIngresoActionPerformed(evt);
            }
        });

        but_volver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        but_volver.setText("Volver");
        but_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_volverActionPerformed(evt);
            }
        });

        jl_fechaActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_fechaActual.setForeground(new java.awt.Color(204, 204, 204));
        jl_fechaActual.setText("DD/MM/YYYY");

        jl_infoIngreso.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jl_infoIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jt_importeIngresar.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jt_importeIngresar.setForeground(new java.awt.Color(153, 153, 153));
        jt_importeIngresar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_importeIngresar.setText("Importe a Ingresar");
        jt_importeIngresar.setPreferredSize(new java.awt.Dimension(300, 60));
        jt_importeIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_importeIngresarMouseClicked(evt);
            }
        });
        jt_importeIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_importeIngresarKeyTyped(evt);
            }
        });

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_ingreso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jl_ingreso.setForeground(new java.awt.Color(153, 153, 153));
        jl_ingreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ingreso.setText("Ingreso");
        jl_ingreso.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel3.add(jl_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 300, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 40));

        jl_tarjeta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_tarjeta.setForeground(new java.awt.Color(102, 102, 102));
        jl_tarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_tarjeta.setText("Tarjeta:");
        jl_tarjeta.setPreferredSize(new java.awt.Dimension(300, 25));

        jl_numTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_numTarjeta.setForeground(new java.awt.Color(102, 102, 102));
        jl_numTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numTarjeta.setText("XXXX-XXXX-XXXX-XXXX");
        jl_numTarjeta.setPreferredSize(new java.awt.Dimension(300, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jl_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_numTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(jl_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(but_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jl_fechaActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_infoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jt_importeIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(but_realizarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_fechaActual))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_realizarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_importeIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jl_infoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(but_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void but_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_volverActionPerformed
        BienvenidoUsuarioPantalla usuarioPant = new BienvenidoUsuarioPantalla();
        usuarioPant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_volverActionPerformed

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jl_cerrarMouseClicked

    private void jl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jl_minimizarMouseClicked

    private void jt_importeIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_importeIngresarMouseClicked
        if (cont == 0) {
            jt_importeIngresar.setText("");
            cont++;
        } 
    }//GEN-LAST:event_jt_importeIngresarMouseClicked

    private void jt_importeIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_importeIngresarKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57 || key == 8 || key == 127;
        
        if (!numeros) {
            evt.consume();
            jl_infoIngreso.setText("Este campo solo admite números");
        } else if (jt_importeIngresar.getText().length() > 2) {
            evt.consume();
        } else {
            jl_infoIngreso.setText("");   
        }
    }//GEN-LAST:event_jt_importeIngresarKeyTyped

    private void but_realizarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_realizarIngresoActionPerformed
        TarjetaMetodos tarjeta = new TarjetaMetodos();
        
        String importeString = null;
        Integer importeInt = null;
        try {
            importeString = jt_importeIngresar.getText();
            importeInt = Integer.parseInt(importeString);
            if (importeInt > 500) {
                jl_infoIngreso.setText("Importe máximo de 500 euros para ingresar con tarjeta");
            } else if (!(importeInt % 10 == 0)) {
                jl_infoIngreso.setText("Este campo solo admite números múltiplos de 10");
            } else {
                String numCuenta = String.valueOf(LoginPantalla.infoCliente.get(5).toString());
                tarjeta.ingreso(importeInt, numCuenta, jl_infoIngreso);
                jt_importeIngresar.setText("Importe a Ingresar");  
            }
            cont = 0;
        } catch (NumberFormatException ex){
            System.out.println("Formato de número incorrecto");
            System.out.println(ex);
        }
    }//GEN-LAST:event_but_realizarIngresoActionPerformed

    
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
            java.util.logging.Logger.getLogger(IngresoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_realizarIngreso;
    private javax.swing.JButton but_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jl_cerrar;
    private javax.swing.JLabel jl_fechaActual;
    private javax.swing.JLabel jl_infoIngreso;
    private javax.swing.JLabel jl_ingreso;
    private javax.swing.JLabel jl_minimizar;
    public javax.swing.JLabel jl_numTarjeta;
    private javax.swing.JLabel jl_tarjeta;
    private javax.swing.JTextField jt_importeIngresar;
    // End of variables declaration//GEN-END:variables

    
}
