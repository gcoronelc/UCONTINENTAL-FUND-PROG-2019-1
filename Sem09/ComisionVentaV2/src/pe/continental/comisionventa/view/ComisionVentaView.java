package pe.continental.comisionventa.view;

import pe.continental.comisionventa.service.VentaService;

public class ComisionVentaView extends javax.swing.JFrame {

    /**
     * Creates new form ComisionVentaView
     */
    public ComisionVentaView() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarCombo();
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
    txtDescripcion = new javax.swing.JTextField();
    txtParticipantes = new javax.swing.JTextField();
    cboCategoria = new javax.swing.JComboBox<>();
    jPanel2 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtRepoPrecio = new javax.swing.JTextField();
    txtRepoImporte = new javax.swing.JTextField();
    txtRepoImpuesto = new javax.swing.JTextField();
    txtRepoTotal = new javax.swing.JTextField();
    txtRepoComision = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel();
    btnProcesar = new javax.swing.JButton();
    btnCancelar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("CALCULAR COMISION");

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "D A T O S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel1.setText("  Descripcion del curso:");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel2.setText("  Participantes:");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel3.setText("  Categoria:");

    txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

    txtParticipantes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

    cboCategoria.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtParticipantes)
          .addComponent(txtDescripcion)
          .addComponent(cboCategoria, 0, 344, Short.MAX_VALUE))
        .addGap(186, 186, 186))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        .addContainerGap(35, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R E P O R T E", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel4.setText("  Precio del curso:");

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel5.setText("  Importe de Venta:");

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel6.setText("  Impuesto:");

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel7.setText("  Total:");

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jLabel8.setText("  Comision:");

    txtRepoPrecio.setEditable(false);
    txtRepoPrecio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    txtRepoPrecio.setForeground(new java.awt.Color(0, 51, 204));
    txtRepoPrecio.setDisabledTextColor(new java.awt.Color(0, 102, 204));
    txtRepoPrecio.setEnabled(false);

    txtRepoImporte.setEditable(false);
    txtRepoImporte.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    txtRepoImporte.setForeground(new java.awt.Color(0, 51, 204));
    txtRepoImporte.setDisabledTextColor(new java.awt.Color(0, 102, 204));
    txtRepoImporte.setEnabled(false);

    txtRepoImpuesto.setEditable(false);
    txtRepoImpuesto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    txtRepoImpuesto.setForeground(new java.awt.Color(0, 51, 204));
    txtRepoImpuesto.setDisabledTextColor(new java.awt.Color(0, 102, 204));
    txtRepoImpuesto.setEnabled(false);

    txtRepoTotal.setEditable(false);
    txtRepoTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    txtRepoTotal.setForeground(new java.awt.Color(0, 51, 204));
    txtRepoTotal.setDisabledTextColor(new java.awt.Color(0, 102, 204));
    txtRepoTotal.setEnabled(false);

    txtRepoComision.setEditable(false);
    txtRepoComision.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    txtRepoComision.setForeground(new java.awt.Color(0, 51, 204));
    txtRepoComision.setDisabledTextColor(new java.awt.Color(0, 102, 204));
    txtRepoComision.setEnabled(false);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(10, 10, 10)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtRepoImporte)
          .addComponent(txtRepoImpuesto)
          .addComponent(txtRepoPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
        .addGap(98, 98, 98)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtRepoTotal)
          .addComponent(txtRepoComision, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(290, 290, 290))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtRepoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtRepoTotal))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtRepoImporte)
          .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtRepoComision))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtRepoImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        .addContainerGap())
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "A C C I O N E S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

    btnProcesar.setBackground(new java.awt.Color(102, 153, 255));
    btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnProcesar.setForeground(new java.awt.Color(51, 51, 51));
    btnProcesar.setText("Procesar");
    btnProcesar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcesarActionPerformed(evt);
      }
    });

    btnCancelar.setBackground(new java.awt.Color(102, 153, 255));
    btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
    btnCancelar.setText("Cancelar");
    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        .addContainerGap(57, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(22, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(32, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(26, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    // Datos
    String categoria = cboCategoria.getSelectedItem().toString();
    String descripcion = txtDescripcion.getText();
    int participantes = Integer.parseInt(txtParticipantes.getText());
    // Proceso
    double precio = VentaService.determinarPrecio(categoria);
    double total = VentaService.determinarTotal(categoria, participantes);
    double importe = VentaService.determinarImporte(categoria, participantes);
    double impuesto = VentaService.determinarImpuesto(categoria, participantes);
    double comision = VentaService.determinarComision(categoria, participantes);
    // Reporte
    txtRepoComision.setText("" + comision);
    txtRepoImporte.setText("" + importe);
    txtRepoImpuesto.setText("" + impuesto);
    txtRepoPrecio.setText("" + precio);
    txtRepoTotal.setText("" + total);
  }//GEN-LAST:event_btnProcesarActionPerformed

  private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnCancelarActionPerformed

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
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnProcesar;
  private javax.swing.JComboBox<String> cboCategoria;
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
  private javax.swing.JPanel jPanel3;
  private javax.swing.JTextField txtDescripcion;
  private javax.swing.JTextField txtParticipantes;
  private javax.swing.JTextField txtRepoComision;
  private javax.swing.JTextField txtRepoImporte;
  private javax.swing.JTextField txtRepoImpuesto;
  private javax.swing.JTextField txtRepoPrecio;
  private javax.swing.JTextField txtRepoTotal;
  // End of variables declaration//GEN-END:variables

  private void llenarCombo() {
    // Limpiar el combo
    cboCategoria.removeAllItems();
    // Cargar categorias
    cboCategoria.addItem(VentaService.CAT_ADMINISTRACION);
    cboCategoria.addItem(VentaService.CAT_OFIMATICA);
    cboCategoria.addItem(VentaService.CAT_PROGRAMACION);
    cboCategoria.addItem(VentaService.CAT_OTROS);
    // Quitar seleccion
    cboCategoria.setSelectedIndex(-1);
  }
  
}