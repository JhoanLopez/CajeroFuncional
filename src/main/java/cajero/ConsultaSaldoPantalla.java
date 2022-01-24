package cajero;

/**
 * @date 15 dic. 2021
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class ConsultaSaldoPantalla extends javax.swing.JFrame {

    public ConsultaSaldoPantalla() {
        initComponents();
        FechaHoraMetodos fechaHora = new FechaHoraMetodos();
        CuentaMetodos cuenta = new CuentaMetodos();
        jl_saldoActual.setText(cuenta.getSaldo((String) LoginPantalla.infoCliente.get(5)));
        jl_numTarjeta.setText((String) LoginPantalla.infoCliente.get(1));
        jl_fechaActual.setText(fechaHora.fechaActual());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        but_volver = new javax.swing.JButton();
        jl_fechaActual = new javax.swing.JLabel();
        jl_fecha2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jl_consultaSaldo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_minimizar = new javax.swing.JLabel();
        jl_cerrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jl_tarjeta = new javax.swing.JLabel();
        jl_numTarjeta = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jl_saldoActual = new javax.swing.JLabel();
        jl_euro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

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

        jl_fecha2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jl_fecha2.setForeground(new java.awt.Color(153, 153, 153));
        jl_fecha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_fecha2.setText("El saldo actual de su cuenta es:");
        jl_fecha2.setPreferredSize(new java.awt.Dimension(300, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(310, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_consultaSaldo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jl_consultaSaldo.setForeground(new java.awt.Color(153, 153, 153));
        jl_consultaSaldo.setText("Consulta De Saldo");
        jl_consultaSaldo.setPreferredSize(new java.awt.Dimension(310, 48));
        jPanel3.add(jl_consultaSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, -1));

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
            .addComponent(jl_numTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jl_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jl_saldoActual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jl_saldoActual.setForeground(new java.awt.Color(102, 102, 102));
        jl_saldoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_euro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jl_euro.setForeground(new java.awt.Color(102, 102, 102));
        jl_euro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_euro.setText("€");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jl_saldoActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_euro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_euro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_saldoActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jl_fechaActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(but_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350)))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jl_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113)
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
            java.util.logging.Logger.getLogger(ConsultaSaldoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaSaldoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaSaldoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaSaldoPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaSaldoPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jl_cerrar;
    private javax.swing.JLabel jl_consultaSaldo;
    private javax.swing.JLabel jl_euro;
    private javax.swing.JLabel jl_fecha2;
    private javax.swing.JLabel jl_fechaActual;
    private javax.swing.JLabel jl_minimizar;
    public javax.swing.JLabel jl_numTarjeta;
    private javax.swing.JLabel jl_saldoActual;
    private javax.swing.JLabel jl_tarjeta;
    // End of variables declaration//GEN-END:variables

    
}
