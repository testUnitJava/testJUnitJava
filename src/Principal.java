
import javax.swing.ImageIcon;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vehiculoNuevo = new javax.swing.JButton();
        retirarVehiculo = new javax.swing.JButton();
        borde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aparcamiento");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vehiculoNuevo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        vehiculoNuevo.setText("VEHICULO NUEVO");
        vehiculoNuevo.setBorder(null);
        vehiculoNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehiculoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculoNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(vehiculoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 67, 323, 143));

        retirarVehiculo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        retirarVehiculo.setText("RETIRAR VEHICULO");
        retirarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(retirarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 258, 323, 143));

        borde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estacionamiento.jpg"))); // NOI18N
        borde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(borde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehiculoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculoNuevoActionPerformed
        this.setVisible(false);
        TipoVehiculo tipo = new TipoVehiculo();
        tipo.setVisible(true);
    }//GEN-LAST:event_vehiculoNuevoActionPerformed

    private void retirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarVehiculoActionPerformed
        this.setVisible(false);
        TipoVehiculoRetirar tipo = new TipoVehiculoRetirar();
        tipo.setVisible(true);
    }//GEN-LAST:event_retirarVehiculoActionPerformed
    public void redimensionarFondo(){
         ImageIcon imagen= new ImageIcon();
         ImageIcon imagenredimensionada = new ImageIcon();
         imagen=new ImageIcon("imagenes/imagen1.jpg");
         imagenredimensionada= new ImageIcon(imagen.getImage().getScaledInstance(borde.getWidth(), borde.getHeight(), 1));
         borde.setIcon(imagenredimensionada);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel borde;
    private javax.swing.JButton retirarVehiculo;
    private javax.swing.JButton vehiculoNuevo;
    // End of variables declaration//GEN-END:variables
}
