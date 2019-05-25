/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.comisionventa.view;

import pe.continental.comisionventa.service.Administracion;
import pe.continental.comisionventa.service.Ofimatica;
import pe.continental.comisionventa.service.Otros;
import pe.continental.comisionventa.service.Programacion;

/**
 *
 * @author soporte
 */
public class ComisionVentaView extends javax.swing.JFrame {

    /**
     * Creates new form ComisionVentaView
     */
    public ComisionVentaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnProgramacion = new javax.swing.JButton();
        btnOfimatica = new javax.swing.JButton();
        btnAdministracion = new javax.swing.JButton();
        btnOtros = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtParticipantes = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        txtImpuesto = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtComision = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "D A T O S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setText("  Descripcion del curso:");

        jLabel2.setText("  Participantes:");

        jLabel3.setText("  Categoria:");

        btnProgramacion.setBackground(new java.awt.Color(102, 153, 255));
        btnProgramacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProgramacion.setText("PROGRAMACION");
        btnProgramacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramacionActionPerformed(evt);
            }
        });

        btnOfimatica.setBackground(new java.awt.Color(102, 153, 255));
        btnOfimatica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOfimatica.setText("OFIMATICA");
        btnOfimatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfimaticaActionPerformed(evt);
            }
        });

        btnAdministracion.setBackground(new java.awt.Color(102, 153, 255));
        btnAdministracion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdministracion.setText("ADMINISTACION");
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });

        btnOtros.setBackground(new java.awt.Color(102, 153, 255));
        btnOtros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOtros.setText("OTROS");
        btnOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtrosActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("CANCELAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProgramacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOfimatica, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton5)))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProgramacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOfimatica, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R E P O R T E", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel4.setText("  Precio del curso:");

        jLabel5.setText("  Importe de Venta:");

        jLabel6.setText("  Impuesto:");

        jLabel7.setText("  Total:");

        jLabel8.setText("  Comision:");

        txtPrecio.setEditable(false);
        txtPrecio.setEnabled(false);

        txtImporte.setEditable(false);
        txtImporte.setEnabled(false);

        txtImpuesto.setEditable(false);
        txtImpuesto.setEnabled(false);

        txtTotal.setEditable(false);
        txtTotal.setEnabled(false);

        txtComision.setEditable(false);
        txtComision.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecio)
                    .addComponent(txtImporte)
                    .addComponent(txtImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txtComision))
                .addGap(315, 315, 315))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtComision))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProgramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramacionActionPerformed
       // DATOS
       int participante =Integer.parseInt(txtParticipantes.getText());
       // PROCESO
      double precio = 800.0;
      double importe = Programacion.determinarImporte(participante);
      double total = Programacion.determinarTotal(participante);
      double impuesto = Programacion.determinarImpuesto(participante);
      double comision = Programacion.determinarComision(participante);
      // reporte 
      txtPrecio.setText(precio + "");
      txtImporte.setText(importe + "");
      txtTotal.setText(total + "");
      txtImpuesto.setText(impuesto + "");
      txtComision.setText(comision + "");
      
    }//GEN-LAST:event_btnProgramacionActionPerformed

    private void btnOfimaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfimaticaActionPerformed
 // DATOS
       int participante =Integer.parseInt(txtParticipantes.getText());
       // PROCESO
      double precio = 500.0;
      double importe =Ofimatica.determinarImporte(participante);
      double total = Ofimatica.determinarTotal(participante);
      double impuesto = Ofimatica.determinarImpuesto(participante);
      double comision = Ofimatica.determinarComision(participante);
      // reporte 
      txtPrecio.setText(precio + "");
      txtImporte.setText(importe + "");
      txtTotal.setText(total + "");
      txtImpuesto.setText(impuesto + "");
      txtComision.setText(comision + "");        // TODO add your handling code here:
    }//GEN-LAST:event_btnOfimaticaActionPerformed

    private void btnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracionActionPerformed
 // DATOS
       int participante =Integer.parseInt(txtParticipantes.getText());
       // PROCESO
      double precio = 1800.0;
      double importe = Administracion.determinarImporte(participante);
      double total = Administracion.determinarTotal(participante);
      double impuesto = Administracion.determinarImpuesto(participante);
      double comision = Administracion.determinarComision(participante);
      // reporte 
      txtPrecio.setText(precio + "");
      txtImporte.setText(importe + "");
      txtTotal.setText(total + "");
      txtImpuesto.setText(impuesto + "");
      txtComision.setText(comision + "");       
      
    }//GEN-LAST:event_btnAdministracionActionPerformed

    private void btnOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtrosActionPerformed
        // DATOS
       int participante =Integer.parseInt(txtParticipantes.getText());
       // PROCESO
      double precio = 1000.0;
      double importe = Otros.determinarImporte(participante);
      double total = Otros.determinarTotal(participante);
      double impuesto = Otros.determinarImpuesto(participante);
      double comision = Otros.determinarComision(participante);
      // reporte 
      txtPrecio.setText(precio + "");
      txtImporte.setText(importe + "");
      txtTotal.setText(total + "");
      txtImpuesto.setText(impuesto + "");
      txtComision.setText(comision + "");
    }//GEN-LAST:event_btnOtrosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      txtImporte.setText(null);
      txtPrecio.setText(null);
      txtImpuesto.setText(null);
      txtTotal.setText(null);
      txtComision.setText(null);
      txtParticipantes.setText(null);
      txtDescripcion.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ComisionVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComisionVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComisionVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComisionVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComisionVentaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnOfimatica;
    private javax.swing.JButton btnOtros;
    private javax.swing.JButton btnProgramacion;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtParticipantes;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}