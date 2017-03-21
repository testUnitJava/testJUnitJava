
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LlenarDatosCoche extends javax.swing.JFrame {

    public int x = 0;
    public Coches coches[] = new Coches[2000];
    public Aparcamiento parking = new Aparcamiento(2000);

    public LlenarDatosCoche() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        poneralto = new javax.swing.JTextField();
        ponerancho = new javax.swing.JTextField();
        ponermatricula = new javax.swing.JTextField();
        abono = new javax.swing.JCheckBox();
        volver = new javax.swing.JButton();
        guardarCoche = new javax.swing.JButton();
        borde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Llenar datos coche");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Altura ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 154, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Ancho");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 154, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Matricula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Abono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 154, 33));

        poneralto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        poneralto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poneraltoMouseClicked(evt);
            }
        });
        getContentPane().add(poneralto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 178, 39));

        ponerancho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ponerancho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poneranchoMouseClicked(evt);
            }
        });
        getContentPane().add(ponerancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 178, 39));

        ponermatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ponermatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ponermatriculaMouseClicked(evt);
            }
        });
        getContentPane().add(ponermatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 178, 39));

        abono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        abono.setForeground(new java.awt.Color(255, 255, 255));
        abono.setText("Lo tengo!");
        abono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        volver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 443, 117, 40));

        guardarCoche.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarCoche.setText("GUARDAR COCHE");
        guardarCoche.setBorder(null);
        guardarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCocheActionPerformed(evt);
            }
        });
        getContentPane().add(guardarCoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 240, 70));

        borde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parkingcoches.jpg"))); // NOI18N
        borde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(borde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        TipoVehiculo tipoVehiculo = new TipoVehiculo();
        tipoVehiculo.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void ponermatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ponermatriculaMouseClicked
        ponermatricula.setText("");
    }//GEN-LAST:event_ponermatriculaMouseClicked

    private void poneraltoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poneraltoMouseClicked
        poneralto.setText("");
    }//GEN-LAST:event_poneraltoMouseClicked

    private void poneranchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poneranchoMouseClicked
        ponerancho.setText("");
    }//GEN-LAST:event_poneranchoMouseClicked

    private void guardarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCocheActionPerformed
        Aparcamiento parking = leerBaseDatos(); // Lee objeto parking y sobreescribe al inicializado arriba.
        if (!ponermatricula.getText().isEmpty() && !poneralto.getText().isEmpty() && !poneralto.getText().isEmpty()) {
            String matricula = "";
            matricula = ponermatricula.getText().toUpperCase();
            ponermatricula.setText(matricula);// Si lo escriben en minuscula lo mostramos en mayuscula como se guardara
            boolean descuento = false;
            if (abono.isSelected()) {
                descuento = true;
            }
            String valoralto = poneralto.getText();
            double alto = 0;
            String valorancho = ponerancho.getText();
            double ancho = 0;
            if (comprobarNumero(valoralto)) {
                alto = Double.parseDouble(valoralto);
                if (comprobarNumero(valorancho)) {
                    ancho = Double.parseDouble(valorancho);
                    coches[x] = new Coches(matricula, descuento, ancho, alto);// Vector coches inicializado fuera para que pueda almacenar los distintos coches del vector sino cada vez que de al boton guardaria solo el ultimo
                    //parking.setCapacidad(200);
                    parking.introducirVehiculo(coches[x]); // parking esta inicializado afuera porque sino cada vez que de al boton guardar se volvera a crear el mismo objeto sobreescribiendose
                    x++;// Inicialiazo la variable x afuera porque sino cada vez que de al boton x volvera a cero y se sobreescribiran coches a otros
                    guardarBaseDatos(parking);
                }
                if (comprobarNumero(valorancho) == false) {
                    JOptionPane.showMessageDialog(this, "Introduzca solo numeros en alto o ancho");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Introduzca solo numeros en alto o ancho");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan 1 o mas valores");
        }
    }//GEN-LAST:event_guardarCocheActionPerformed
    public boolean comprobarNumero(String valordado) {
        int i = 0;
        int y = 0;// para comprobar si el punto ya ha sido ingresado  
        boolean valornumero = true;
        if (valordado.isEmpty()) {
            valornumero = false;
        }
        while (i <= valordado.length() - 1) {
            if (!Character.isDigit(valordado.charAt(i))) {
                valornumero = false;

                if (valordado.charAt(i) == '.' && y == 0) { // Comprobamos que pueda incluirse un punto pero no mas de uno
                    valornumero = true;
                    y++;
                }
            }
            i++;
        }//Comprobamos que no solo se haya inscrito un punto sin digitos
        if (valordado.length() == 1 && valordado.charAt(0) == '.') {
            valornumero = false;
        }
        return valornumero;
    }

    private Aparcamiento leerBaseDatos() {
        Aparcamiento parking = null;
        FileInputStream fisPer = null;
        try {
            fisPer = new FileInputStream("misdatos.dat");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LlenarDatosCoche.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ObjectInputStream guardar1 = new ObjectInputStream(fisPer);
            parking = (Aparcamiento) guardar1.readObject();
            guardar1.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LlenarDatosCoche.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parking;

    }

    private void guardarBaseDatos(Aparcamiento parking) {
        FileOutputStream guardar = null;
        try {
            guardar = new FileOutputStream("misdatos.dat");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LlenarDatosCoche.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ObjectOutputStream guardar1 = new ObjectOutputStream(guardar);
            guardar1.writeObject(parking);
            guardar1.close();
        } catch (IOException ex) {
            Logger.getLogger(LlenarDatosCoche.class.getName()).log(Level.SEVERE, null, ex);
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
                new LlenarDatosCoche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox abono;
    private javax.swing.JLabel borde;
    private javax.swing.JButton guardarCoche;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField poneralto;
    private javax.swing.JTextField ponerancho;
    private javax.swing.JTextField ponermatricula;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
