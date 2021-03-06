
package pe.continental.impuestorentaprofesionalapp.view;

import pe.continental.impuestorentaprofesionalapp.service.ImpuestoRentaProfesionalApp4taCategoriaService;

import static pe.continental.impuestorentaprofesionalapp.service.ImpuestoRentaProfesionalApp4taCategoriaService.Deduccion7UIT;
import pe.continental.impuestorentaprofesionalapp.service.ImpuestoRentaProfesionalApp4taY5taCategoriaService;

import pe.continental.impuestorentaprofesionalapp.service.ImpuestoRentaProfesionalApp5taCategoriaService;



public class ImpuestoRentaProfesionalAppView extends javax.swing.JFrame {

    
    public ImpuestoRentaProfesionalAppView() {
        initComponents();
      this.setLocationRelativeTo(null);
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRentaBruta4taCategoria = new javax.swing.JTextField();
        txtRentaBruta5taCategoria = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtRepoRentaBruta4taCategoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtRepoDeduccion = new javax.swing.JTextField();
        txtRepoRentaNeta4taCategoria = new javax.swing.JTextField();
        txtRepoRentaBruta5taCategoria = new javax.swing.JTextField();
        txtRepoTotalRenta4taY5taCategoria = new javax.swing.JTextField();
        txtRepoDeduccion7UIT = new javax.swing.JTextField();
        txtRepoRentaImponible4taCategoria = new javax.swing.JTextField();
        txtRepoImpuestoRenta4taCategoria = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtRepoImpuestoRenta5taCategoria = new javax.swing.JTextField();
        txtRepoImpuestoRenta4taY5taCategoria = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtRepoRentaImponible5taCategoria = new javax.swing.JTextField();
        txtRepoRentaImponible4taY5taCategoria = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnImpuestoRenta4taCategoria = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnImpuestoRenta5taCategoria = new javax.swing.JButton();
        btnImpuestoRenta4taY5taCategoria = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPUESTO ANUAL A LA RENTA DE UN PROFESIONAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 14))); // NOI18N
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 153, 255))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("  Renta Bruta de 4ta Categoría");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("  Renta Bruta de 5ta Categoría");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRentaBruta5taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRentaBruta4taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRentaBruta4taCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRentaBruta5taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 153, 255))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("  Renta Bruta de 4ta Categoría");
        jLabel9.setOpaque(true);

        txtRepoRentaBruta4taCategoria.setEnabled(false);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  Deducción de 4ta Categoría (20%)");
        jLabel10.setOpaque(true);

        jLabel12.setText("  Renta Neta de 4ta Categoría");

        jLabel16.setBackground(new java.awt.Color(204, 255, 204));
        jLabel16.setText("  Renta Bruta de 5ta Categoría");
        jLabel16.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("  Dedución de 7 UIT");
        jLabel18.setOpaque(true);

        txtRepoDeduccion.setEnabled(false);

        txtRepoRentaNeta4taCategoria.setEnabled(false);

        txtRepoRentaBruta5taCategoria.setEnabled(false);

        txtRepoTotalRenta4taY5taCategoria.setEnabled(false);

        txtRepoDeduccion7UIT.setEnabled(false);

        txtRepoRentaImponible4taCategoria.setEnabled(false);

        txtRepoImpuestoRenta4taCategoria.setEnabled(false);

        jLabel22.setText("  Renta Imponible de 4ta Categoría");

        jLabel23.setBackground(new java.awt.Color(153, 204, 255));
        jLabel23.setText("  Impuesto de Renta Anual ( 4ta Categoría)");
        jLabel23.setOpaque(true);

        jLabel24.setText("  Total Renta de 4ta Y 5ta Categoría");

        jLabel25.setBackground(new java.awt.Color(153, 153, 255));
        jLabel25.setText("   Impuesto de Renta Anual (5ta Categoría)");
        jLabel25.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(255, 204, 204));
        jLabel26.setText("  Impuesto de Renta Anual (4ta Y 5ta Categoría)");
        jLabel26.setOpaque(true);

        txtRepoImpuestoRenta5taCategoria.setEnabled(false);

        txtRepoImpuestoRenta4taY5taCategoria.setEnabled(false);

        jLabel27.setText("  Renta Imponible de 5ta Categoría");

        jLabel28.setText("  Renta Imponible  de 4ta Y 5ta Categoría");

        txtRepoRentaImponible5taCategoria.setEnabled(false);

        txtRepoRentaImponible4taY5taCategoria.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRepoRentaNeta4taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRepoDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRepoRentaBruta4taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRepoRentaImponible5taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepoRentaImponible4taY5taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepoImpuestoRenta4taY5taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepoImpuestoRenta5taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepoImpuestoRenta4taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 83, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRepoRentaBruta5taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepoDeduccion7UIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepoRentaImponible4taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepoTotalRenta4taY5taCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepoRentaBruta4taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtRepoDeduccion)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepoRentaNeta4taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepoRentaBruta5taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRepoTotalRenta4taY5taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepoDeduccion7UIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepoRentaImponible4taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepoRentaImponible5taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepoRentaImponible4taY5taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepoImpuestoRenta4taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepoImpuestoRenta5taCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRepoImpuestoRenta4taY5taCategoria)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 153, 255))); // NOI18N

        btnImpuestoRenta4taCategoria.setBackground(new java.awt.Color(153, 204, 255));
        btnImpuestoRenta4taCategoria.setText("4TA CATEGORIA");
        btnImpuestoRenta4taCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpuestoRenta4taCategoriaActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnImpuestoRenta5taCategoria.setBackground(new java.awt.Color(153, 153, 255));
        btnImpuestoRenta5taCategoria.setText("5TA CATEGORIA");
        btnImpuestoRenta5taCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpuestoRenta5taCategoriaActionPerformed(evt);
            }
        });

        btnImpuestoRenta4taY5taCategoria.setBackground(new java.awt.Color(255, 204, 204));
        btnImpuestoRenta4taY5taCategoria.setText("4TA Y 5TA CATEGORIA");
        btnImpuestoRenta4taY5taCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpuestoRenta4taY5taCategoriaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImpuestoRenta4taY5taCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImpuestoRenta5taCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImpuestoRenta4taCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnImpuestoRenta4taCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(btnImpuestoRenta5taCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(btnImpuestoRenta4taY5taCategoria))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImpuestoRenta4taCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpuestoRenta4taCategoriaActionPerformed
       // DATOS
        double RentaBruta4taCategoria = Integer.parseInt(txtRentaBruta4taCategoria.getText());
        double porcen = 0.20;
        double Deducion = 0;
     
        // PROCESO
        double RentaNeta4taCategoria = ImpuestoRentaProfesionalApp4taCategoriaService.calcularRentaNeta4taCategoria(RentaBruta4taCategoria, Deducion);
        double RentaImponible4taCategoria = ImpuestoRentaProfesionalApp4taCategoriaService.calcularRentaImponible4taCategoria(RentaNeta4taCategoria, Deduccion7UIT);
        double ImpuestoRenta4taCategoria = ImpuestoRentaProfesionalApp4taCategoriaService.calcularImpuestoRenta4taCategoria(RentaImponible4taCategoria);
      
        double Deduccion = ImpuestoRentaProfesionalApp4taCategoriaService.calcularDeduccion(RentaBruta4taCategoria, porcen);
        
        // REPORTE
        txtRepoRentaBruta4taCategoria.setText(RentaBruta4taCategoria + "");
        txtRepoDeduccion.setText(Deduccion + "");
        txtRepoRentaNeta4taCategoria.setText(RentaNeta4taCategoria + "");
        txtRepoDeduccion7UIT.setText(Deduccion7UIT + "");
        txtRepoRentaImponible4taCategoria.setText(RentaImponible4taCategoria + "");
        txtRepoImpuestoRenta4taCategoria.setText(ImpuestoRenta4taCategoria + "");
        
    }//GEN-LAST:event_btnImpuestoRenta4taCategoriaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImpuestoRenta5taCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpuestoRenta5taCategoriaActionPerformed
        // DATOS
        double RentaBruta5taCategoria = Integer.parseInt(txtRentaBruta5taCategoria.getText());
        
        // PROCESO
        double RentaImponible5taCategoria = ImpuestoRentaProfesionalApp5taCategoriaService.calcularRentaImponible5taCategoria(RentaBruta5taCategoria, Deduccion7UIT);
        double ImpuestoRenta5taCategoria = ImpuestoRentaProfesionalApp5taCategoriaService.calcularImpuestoRenta5taCategoria(RentaImponible5taCategoria);
        
        // REPORTE
        txtRepoRentaBruta5taCategoria.setText(RentaBruta5taCategoria + "");
        txtRepoDeduccion7UIT.setText(Deduccion7UIT + "");
        txtRepoRentaImponible5taCategoria.setText(RentaImponible5taCategoria + "");
        txtRepoImpuestoRenta5taCategoria.setText(ImpuestoRenta5taCategoria + "");  
        
    }//GEN-LAST:event_btnImpuestoRenta5taCategoriaActionPerformed

    private void btnImpuestoRenta4taY5taCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpuestoRenta4taY5taCategoriaActionPerformed
        // DATOS
        double RentaBruta4taCategoria = Integer.parseInt(txtRentaBruta4taCategoria.getText());
        double RentaBruta5taCategoria = Integer.parseInt(txtRentaBruta5taCategoria.getText());
        double porcen = 0.20;
        double Deducion = 0;
        
        // PROCESO
        double Deduccion = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularDeduccion(RentaBruta4taCategoria, porcen);
        double RentaNeta4taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularRentaNeta4taCategoria(RentaBruta4taCategoria, Deduccion);
        double TotalRenta4taY5taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularTotalRenta4taY5taCategoria(RentaNeta4taCategoria, RentaBruta5taCategoria);
        double RentaImponible4taY5taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularRentaImponible4taY5taCategoria(TotalRenta4taY5taCategoria, Deduccion7UIT);
        double ImpuestoRenta4taY5taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularImpuestoRenta4taY5taCategoria(RentaNeta4taCategoria);
        
        // REPORTE
        txtRepoRentaBruta4taCategoria.setText(RentaBruta4taCategoria + "");
        txtRepoDeduccion.setText(Deduccion + "");
        txtRepoRentaNeta4taCategoria.setText(RentaNeta4taCategoria + "");
        txtRepoRentaBruta5taCategoria.setText(RentaBruta5taCategoria + ""); 
        txtRepoTotalRenta4taY5taCategoria.setText(TotalRenta4taY5taCategoria + "");
        txtRepoDeduccion7UIT.setText(Deduccion7UIT + "");
        txtRepoRentaImponible4taY5taCategoria.setText(RentaImponible4taY5taCategoria + "");
        txtRepoImpuestoRenta4taY5taCategoria.setText(ImpuestoRenta4taY5taCategoria + "");
        
        
    }//GEN-LAST:event_btnImpuestoRenta4taY5taCategoriaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtRentaBruta4taCategoria.setText("");
       txtRentaBruta5taCategoria.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ImpuestoRentaProfesionalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImpuestoRentaProfesionalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImpuestoRentaProfesionalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImpuestoRentaProfesionalAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImpuestoRentaProfesionalAppView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpuestoRenta4taCategoria;
    private javax.swing.JButton btnImpuestoRenta4taY5taCategoria;
    private javax.swing.JButton btnImpuestoRenta5taCategoria;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtRentaBruta4taCategoria;
    private javax.swing.JTextField txtRentaBruta5taCategoria;
    private javax.swing.JTextField txtRepoDeduccion;
    private javax.swing.JTextField txtRepoDeduccion7UIT;
    private javax.swing.JTextField txtRepoImpuestoRenta4taCategoria;
    private javax.swing.JTextField txtRepoImpuestoRenta4taY5taCategoria;
    private javax.swing.JTextField txtRepoImpuestoRenta5taCategoria;
    private javax.swing.JTextField txtRepoRentaBruta4taCategoria;
    private javax.swing.JTextField txtRepoRentaBruta5taCategoria;
    private javax.swing.JTextField txtRepoRentaImponible4taCategoria;
    private javax.swing.JTextField txtRepoRentaImponible4taY5taCategoria;
    private javax.swing.JTextField txtRepoRentaImponible5taCategoria;
    private javax.swing.JTextField txtRepoRentaNeta4taCategoria;
    private javax.swing.JTextField txtRepoTotalRenta4taY5taCategoria;
    // End of variables declaration//GEN-END:variables


}











