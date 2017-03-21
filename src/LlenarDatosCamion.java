
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LlenarDatosCamion extends javax.swing.JFrame {

    public int x = 0;
    public Camiones camiones[] = new Camiones[2000];
    public Aparcamiento parking = new Aparcamiento(2000);

    public LlenarDatosCamion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ponerNumerodeRuedas = new javax.swing.JTextField();
        ponermatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        abono = new javax.swing.JCheckBox();
        volver = new javax.swing.JButton();
        guardarCamion = new javax.swing.JButton();
        borde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Llenar datos del camion");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Matricula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 154, 38));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Numero de Ruedas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 154, 34));

        ponerNumerodeRuedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ponerNumerodeRuedasMouseClicked(evt);
            }
        });
        getContentPane().add(ponerNumerodeRuedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 178, 39));

        ponermatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ponermatriculaMouseClicked(evt);
            }
        });
        getContentPane().add(ponermatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 178, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Abono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 154, 33));

        abono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        abono.setForeground(new java.awt.Color(255, 255, 255));
        abono.setText("Lo tengo!");
        abono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        volver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 443, 117, 40));

        guardarCamion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarCamion.setText("GUARDAR CAMION");
        guardarCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCamionActionPerformed(evt);
            }
        });
        getContentPane().add(guardarCamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 250, 100));

        borde.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        borde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondocamion.jpg"))); // NOI18N
        borde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(borde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        TipoVehiculo tipoVehiculo = new TipoVehiculo();
        tipoVehiculo.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void guardarCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCamionActionPerformed
        Aparcamiento parking = leerBaseDatos(); // Lee objeto parking y sobreescribe al inicializado arriba.
        if (!ponermatricula.getText().isEmpty() && !ponerNumerodeRuedas.getText().isEmpty()) {
            String matricula = "";
            matricula = ponermatricula.getText().toUpperCase();
            ponermatricula.setText(matricula);
            boolean descuento = false;
            if (abono.isSelected()) {
                descuento = true;
            }
            String valoruedas = ponerNumerodeRuedas.getText();
            int nRuedas = 0;

            if (comprobarNumeroEntero(valoruedas)) {
                nRuedas = Integer.valueOf(valoruedas);
                camiones[x] = new Camiones(matricula, descuento, nRuedas);// Vector camiones inicializado fuera para que pueda almacenar los distintos camiones del vector sino cada vez que de al boton guardaria solo el ultimo
                parking.introducirVehiculo(camiones[x]); // parking esta inicializado afuera porque sino cada vez que de al boton guardar se volvera a crear el mismo objeto sobreescribiendose
                x++;// Inicialiazo la variable x afuera porque sino cada vez que de al boton x volvera a cero y se sobreescribiran coches a otros
                guardarBaseDatos(parking); // Guardo mi objeto
            } else {
                JOptionPane.showMessageDialog(this, "Ruedas solo puede ser numero entero");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Faltan 1 o mas valores");
        }
    }//GEN-LAST:event_guardarCamionActionPerformed

    private void ponermatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ponermatriculaMouseClicked
        ponermatricula.setText("");
    }//GEN-LAST:event_ponermatriculaMouseClicked

    private void ponerNumerodeRuedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ponerNumerodeRuedasMouseClicked
        ponerNumerodeRuedas.setText("");
    }//GEN-LAST:event_ponerNumerodeRuedasMouseClicked

    public boolean comprobarNumeroEntero(String valordado) {
        int i = 0;
        boolean valornumero = true;
        if (valordado.isEmpty()) {
            valornumero = false;
        }
        while (i <= valordado.length() - 1) {
            if (!Character.isDigit(valordado.charAt(i))) {
                valornumero = false;
            }
            i++;
        }
        return valornumero;
    }

    private Aparcamiento leerBaseDatos() {
        Aparcamiento parking = null;
        FileInputStream fisPer = null;
        try {
            fisPer = new FileInputStream("misdatos.dat");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LlenarDatosCamion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ObjectInputStream guardar1 = new ObjectInputStream(fisPer);
            parking = (Aparcamiento) guardar1.readObject();
            guardar1.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LlenarDatosCamion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parking;

    }

    public void guardarBaseDatos(Aparcamiento parking) {
        FileOutputStream guardar = null;
        try {
            guardar = new FileOutputStream("misdatos.dat");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LlenarDatosCamion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ObjectOutputStream guardar1 = new ObjectOutputStream(guardar);
            guardar1.writeObject(parking);
            guardar1.close();
        } catch (IOException ex) {
            Logger.getLogger(LlenarDatosCamion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(LlenarDatosCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LlenarDatosCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LlenarDatosCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LlenarDatosCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LlenarDatosCamion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox abono;
    private javax.swing.JLabel borde;
    private javax.swing.JButton guardarCamion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField ponerNumerodeRuedas;
    private javax.swing.JTextField ponermatricula;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
