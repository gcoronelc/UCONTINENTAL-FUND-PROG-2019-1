
package pe.continental.docentepublico.view;

import pe.continental.docentepublico.Service.SueldoDocentePublico;


public class DocentePublicoView extends javax.swing.JFrame {

    
    public DocentePublicoView() {
        initComponents();
    }

    

    

    
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    txtDescripcion = new javax.swing.JLabel();
    txtCategoriaEscala = new javax.swing.JLabel();
    cboCategoriaServidor = new javax.swing.JComboBox<>();
    txtNombreApellido = new javax.swing.JTextField();
    txtCategoriaTipo = new javax.swing.JLabel();
    txtDescripcion1 = new javax.swing.JLabel();
    txtDescripcion2 = new javax.swing.JLabel();
    txtDescripcion3 = new javax.swing.JLabel();
    txtDni = new javax.swing.JTextField();
    txtLugarTrabajo = new javax.swing.JTextField();
    txtNumeroHijos = new javax.swing.JTextField();
    cboCategoriaEscala = new javax.swing.JComboBox();
    txtDescripcion4 = new javax.swing.JLabel();
    txtCts = new javax.swing.JTextField();
    txtDescripcion5 = new javax.swing.JLabel();
    txtModalidad = new javax.swing.JTextField();
    txtDescripcion6 = new javax.swing.JLabel();
    txtBilingueAcreditado = new javax.swing.JTextField();
    txtJornadaLaboral = new javax.swing.JTextField();
    txtDescripcion7 = new javax.swing.JLabel();
    txtUnidocente = new javax.swing.JTextField();
    txtDescripcion9 = new javax.swing.JLabel();
    txtMultigrado = new javax.swing.JTextField();
    txtDescripcion10 = new javax.swing.JLabel();
    txtBilingue = new javax.swing.JTextField();
    txtDescripcion11 = new javax.swing.JLabel();
    txtLenguaOrdinaria = new javax.swing.JTextField();
    txtDescripcion12 = new javax.swing.JLabel();
    txtDescripcion13 = new javax.swing.JLabel();
    txtVacaciones = new javax.swing.JTextField();
    txtIncentivoAprendizaje = new javax.swing.JTextField();
    txtDescripcion14 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtSalarioBasico = new javax.swing.JTextField();
    txtAsignaciones = new javax.swing.JTextField();
    txtAsignacionFamiliar = new javax.swing.JTextField();
    txtRemuneracionIntegraMensual = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    txtOnp = new javax.swing.JTextField();
    txtBeneficios = new javax.swing.JTextField();
    txtEssalud = new javax.swing.JTextField();
    btnCancelar = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();
    btnProcesar = new javax.swing.JButton();
    txtRemuneracionAnual = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "D A T O S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

    txtDescripcion.setText("NOMBRE Y APELLIDO");

    txtCategoriaEscala.setText("ESCALA REMUNERATIVA");

    cboCategoriaServidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));
    cboCategoriaServidor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboCategoriaServidorActionPerformed(evt);
      }
    });

    txtCategoriaTipo.setText("TIPO DE SERVIDOR");

    txtDescripcion1.setText("N° DNI");

    txtDescripcion2.setText("LUGAR DE TRABAJO");

    txtDescripcion3.setText("NUMERO DE HIJOS");

    txtNumeroHijos.setText("2");
    txtNumeroHijos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNumeroHijosActionPerformed(evt);
      }
    });

    cboCategoriaEscala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
    cboCategoriaEscala.setToolTipText("1\n2\n3\n4\n5\n6\n7\n8");

    txtDescripcion4.setText("CTS");

    txtCts.setEditable(false);
    txtCts.setText("0.14");

    txtDescripcion5.setText("MODALIDAD");

    txtDescripcion6.setText("BILINGUE ACREDITADO");

    txtBilingueAcreditado.setEditable(false);
    txtBilingueAcreditado.setText("100");

    txtJornadaLaboral.setEditable(false);
    txtJornadaLaboral.setText("30");

    txtDescripcion7.setText("JORNADA LABORAL");

    txtUnidocente.setEditable(false);
    txtUnidocente.setText("200");

    txtDescripcion9.setText("UNIDOCENTE");

    txtMultigrado.setEditable(false);
    txtMultigrado.setText("140");

    txtDescripcion10.setText("BILINGUE");

    txtBilingue.setEditable(false);
    txtBilingue.setText("50");

    txtDescripcion11.setText("MULTIGRADO");

    txtLenguaOrdinaria.setEditable(false);
    txtLenguaOrdinaria.setText("100");

    txtDescripcion12.setText("LENGUA ORDINARIA");

    txtDescripcion13.setText("VACACIONES");

    txtIncentivoAprendizaje.setEditable(false);
    txtIncentivoAprendizaje.setText("1000");

    txtDescripcion14.setText("INCENTIVO APRENDIZAJE");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                      .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(32, 32, 32)
                      .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                      .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(45, 45, 45)
                      .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txtDescripcion2)
                    .addGap(45, 45, 45)
                    .addComponent(txtLugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtDescripcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumeroHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtDescripcion7)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtDescripcion6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBilingueAcreditado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(txtJornadaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(txtUnidocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtDescripcion9)
                  .addComponent(txtDescripcion11)
                  .addComponent(txtDescripcion10)
                  .addComponent(txtDescripcion12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtBilingue, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtMultigrado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtLenguaOrdinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtDescripcion4)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txtDescripcion5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(txtCts, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(375, 375, 375)))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(62, 62, 62)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtCategoriaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtCategoriaEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(cboCategoriaServidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(cboCategoriaEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(155, 155, 155))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtDescripcion14)
              .addComponent(txtDescripcion13))
            .addGap(26, 26, 26)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtIncentivoAprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(181, 181, 181))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtDescripcion11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(txtLugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(txtDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(txtDescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(txtNumeroHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(txtCts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(txtDescripcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(txtDescripcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txtDescripcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)
                    .addComponent(txtDescripcion12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtJornadaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtDescripcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtBilingueAcreditado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtDescripcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnidocente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMultigrado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtCategoriaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(cboCategoriaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtCategoriaEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(cboCategoriaEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtDescripcion13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtIncentivoAprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtDescripcion14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtBilingue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLenguaOrdinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(40, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R E P O R T E", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

    jLabel4.setText("SALARIO BASICO MENSUAL");

    jLabel5.setText("ASIGNACIONES");

    jLabel6.setText("ASIGNACION FAMILIAR");

    jLabel7.setText("REMUNERACION INTEGRA MENSUAL");

    jLabel8.setText("ONP");

    txtSalarioBasico.setEditable(false);
    txtSalarioBasico.setEnabled(false);

    txtAsignaciones.setEditable(false);
    txtAsignaciones.setEnabled(false);

    txtAsignacionFamiliar.setEditable(false);
    txtAsignacionFamiliar.setEnabled(false);

    txtRemuneracionIntegraMensual.setEditable(false);
    txtRemuneracionIntegraMensual.setEnabled(false);

    jLabel9.setText("SEGURO ESSALUD");

    jLabel10.setText("BENEFICIOS");

    jLabel11.setText("OTROS");

    txtOnp.setEditable(false);
    txtOnp.setEnabled(false);
    txtOnp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtOnpActionPerformed(evt);
      }
    });

    txtBeneficios.setEditable(false);
    txtBeneficios.setEnabled(false);
    txtBeneficios.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtBeneficiosActionPerformed(evt);
      }
    });

    txtEssalud.setEditable(false);
    txtEssalud.setEnabled(false);
    txtEssalud.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEssaludActionPerformed(evt);
      }
    });

    btnCancelar.setBackground(new java.awt.Color(255, 204, 204));
    btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
    btnCancelar.setText("CANCELAR");
    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelarActionPerformed(evt);
      }
    });

    btnSalir.setBackground(new java.awt.Color(255, 204, 204));
    btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnSalir.setForeground(new java.awt.Color(102, 102, 102));
    btnSalir.setText("SALIR");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    btnProcesar.setBackground(new java.awt.Color(255, 204, 204));
    btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnProcesar.setForeground(new java.awt.Color(102, 102, 102));
    btnProcesar.setText("PROCESAR");
    btnProcesar.setActionCommand("SALIR");
    btnProcesar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcesarActionPerformed(evt);
      }
    });

    txtRemuneracionAnual.setEditable(false);
    txtRemuneracionAnual.setEnabled(false);

    jLabel12.setText("REMUNERACION ANUAL");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(33, 33, 33)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtAsignaciones)
          .addComponent(txtAsignacionFamiliar)
          .addComponent(txtRemuneracionIntegraMensual)
          .addComponent(txtSalarioBasico)
          .addComponent(txtRemuneracionAnual, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        .addGap(28, 28, 28)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtEssalud, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtOnp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addGap(74, 74, 74))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(txtSalarioBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtAsignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
              .addComponent(jLabel9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(txtAsignacionFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel11)
            .addGap(29, 29, 29))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtRemuneracionIntegraMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtRemuneracionAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(txtOnp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txtEssalud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(60, 60, 60))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

        // DATOS
        String categoriaEscala = cboCategoriaEscala.getSelectedItem().toString();
        String categoriaServidor = cboCategoriaServidor.getSelectedItem().toString();
        String nombreApellido = txtNombreApellido.getText();
        String Dni = txtDni.getText();
        String LugarTrabajo = txtLugarTrabajo.getText();
        int numeroHijos =Integer.parseInt(txtNumeroHijos.getText());
        double unidocente =Integer.parseInt(txtUnidocente.getText());
        double vacaciones =Integer.parseInt(txtVacaciones.getText());
        double multigrado =Integer.parseInt(txtMultigrado.getText());
        double bilingue =Integer.parseInt(txtBilingue.getText());
        double bilingueAcreditado =Integer.parseInt(txtBilingueAcreditado.getText());
        double cts =Integer.parseInt(txtCts.getText());
        double incentivoAprendizaje =Integer.parseInt(txtIncentivoAprendizaje.getText());
        double lenguaOrdinaria =Integer.parseInt(txtLenguaOrdinaria.getText());
        double jornadaLaboral =Integer.parseInt(txtJornadaLaboral.getText());
        double modalidad =Integer.parseInt(txtModalidad.getText());

        // PROCESO
        double salarioMensual = SueldoDocentePublico.calcularSalarioMensual(categoriaEscala, modalidad, jornadaLaboral);
        double asignaciones = SueldoDocentePublico.calcularAsignaciones(categoriaEscala, bilingueAcreditado, unidocente, multigrado, bilingue, lenguaOrdinaria);
        double asignacionFamiliar = SueldoDocentePublico.calcularAsignacionFamiliar(numeroHijos, categoriaEscala);
        double remuneracionMensual = SueldoDocentePublico.calcularRemuneracionMensual(numeroHijos, categoriaEscala, modalidad, jornadaLaboral, bilingueAcreditado, unidocente, multigrado, bilingue, lenguaOrdinaria);
        double onp = SueldoDocentePublico.calcularOnp(categoriaEscala, modalidad, jornadaLaboral);
        double essalud = SueldoDocentePublico.calcularEssalud(categoriaEscala, jornadaLaboral, modalidad);
        double otros = SueldoDocentePublico.calcularOtros(numeroHijos, categoriaEscala, modalidad, incentivoAprendizaje, jornadaLaboral, bilingueAcreditado, unidocente, multigrado, bilingue, lenguaOrdinaria, vacaciones, cts);
        double beneficios = SueldoDocentePublico.calcularBeneficios(cts, modalidad, jornadaLaboral, categoriaEscala);
        
        
        // reporte
       txtAsignacionFamiliar.setText(asignacionFamiliar + "");
       txtAsignaciones.setText(asignaciones + "");
       txtBeneficios.setText(beneficios + "");
       txtOtros.setText(otros + "");
       txtOnp.setText(onp + "");
       txtEssalud.setText(essalud + "");
       txtSalarioBasico.setText(salarioMensual + "");
       txtRemuneracionIntegraMensual.setText(remuneracionMensual + "");
       txtPrecio.setText(precio + "");

    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtAsignaciones.setText(null);
        txtSalarioBasico.setText(null);
        txtAsignacionFamiliar.setText(null);
        txtRemuneracionIntegraMensual.setText(null);
       
        txtNombreApellido.setText(null);
        cboCategoriaServidor.setSelectedIndex(-1);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cboCategoriaServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaServidorActionPerformed

    }//GEN-LAST:event_cboCategoriaServidorActionPerformed

    private void txtOnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOnpActionPerformed

    private void txtBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeneficiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBeneficiosActionPerformed

    private void txtEssaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEssaludActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEssaludActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNumeroHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroHijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroHijosActionPerformed

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
            java.util.logging.Logger.getLogger(DocentePublicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocentePublicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocentePublicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocentePublicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocentePublicoView().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnProcesar;
  private javax.swing.JButton btnSalir;
  private javax.swing.JComboBox cboCategoriaEscala;
  private javax.swing.JComboBox<String> cboCategoriaServidor;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField txtAsignacionFamiliar;
  private javax.swing.JTextField txtAsignaciones;
  private javax.swing.JTextField txtBeneficios;
  private javax.swing.JTextField txtBilingue;
  private javax.swing.JTextField txtBilingueAcreditado;
  private javax.swing.JLabel txtCategoriaEscala;
  private javax.swing.JLabel txtCategoriaTipo;
  private javax.swing.JTextField txtCts;
  private javax.swing.JLabel txtDescripcion;
  private javax.swing.JLabel txtDescripcion1;
  private javax.swing.JLabel txtDescripcion10;
  private javax.swing.JLabel txtDescripcion11;
  private javax.swing.JLabel txtDescripcion12;
  private javax.swing.JLabel txtDescripcion13;
  private javax.swing.JLabel txtDescripcion14;
  private javax.swing.JLabel txtDescripcion2;
  private javax.swing.JLabel txtDescripcion3;
  private javax.swing.JLabel txtDescripcion4;
  private javax.swing.JLabel txtDescripcion5;
  private javax.swing.JLabel txtDescripcion6;
  private javax.swing.JLabel txtDescripcion7;
  private javax.swing.JLabel txtDescripcion9;
  private javax.swing.JTextField txtDni;
  private javax.swing.JTextField txtEssalud;
  private javax.swing.JTextField txtIncentivoAprendizaje;
  private javax.swing.JTextField txtJornadaLaboral;
  private javax.swing.JTextField txtLenguaOrdinaria;
  private javax.swing.JTextField txtLugarTrabajo;
  private javax.swing.JTextField txtModalidad;
  private javax.swing.JTextField txtMultigrado;
  private javax.swing.JTextField txtNombreApellido;
  private javax.swing.JTextField txtNumeroHijos;
  private javax.swing.JTextField txtOnp;
  private javax.swing.JTextField txtRemuneracionAnual;
  private javax.swing.JTextField txtRemuneracionIntegraMensual;
  private javax.swing.JTextField txtSalarioBasico;
  private javax.swing.JTextField txtUnidocente;
  private javax.swing.JTextField txtVacaciones;
  // End of variables declaration//GEN-END:variables

  
}
