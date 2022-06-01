/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sesion10;

import javax.swing.table.DefaultTableModel;

public class FrmListaCircularSemana10 extends javax.swing.JFrame {

    ListaCircularDoble lcd = new ListaCircularDoble();
    private final DefaultTableModel modelo;
    private final String[] cabecera = {"Nombre", "Ape. Paterno", "Ape. Materno", "Estado Civil", "Fecha Nacimiento", "Altura", "DNI", "Edad", "Cantidad Hijos",};
    private String[][] data;

    public FrmListaCircularSemana10() {
        initComponents();
        modelo = new DefaultTableModel(data, cabecera);
        jTable1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        jtxtApePaterno = new jtextfieldround.JTextFieldRound();
        jtxtNombre = new jtextfieldround.JTextFieldRound();
        jtxtApeMaterno = new jtextfieldround.JTextFieldRound();
        jtxtAltura = new jtextfieldround.JTextFieldRound();
        jtxtDni = new jtextfieldround.JTextFieldRound();
        jtxtEdad = new jtextfieldround.JTextFieldRound();
        jcbxEstadoCivil = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jrbMasculino = new javax.swing.JRadioButton();
        jbtnFemenino = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtApePaterno.setBackground(new java.awt.Color(51, 51, 51));
        jtxtApePaterno.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApePaterno.setText("aaaa");
        jtxtApePaterno.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jtxtApePaterno.setFont(new java.awt.Font("Josefin Sans", 0, 18)); // NOI18N

        jtxtNombre.setBackground(new java.awt.Color(51, 51, 51));
        jtxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setText("aaaa");
        jtxtNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jtxtNombre.setFont(new java.awt.Font("Josefin Sans", 0, 18)); // NOI18N

        jtxtApeMaterno.setBackground(new java.awt.Color(51, 51, 51));
        jtxtApeMaterno.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApeMaterno.setText("aaaa");
        jtxtApeMaterno.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jtxtApeMaterno.setFont(new java.awt.Font("Josefin Sans", 0, 18)); // NOI18N

        jtxtAltura.setBackground(new java.awt.Color(51, 51, 51));
        jtxtAltura.setForeground(new java.awt.Color(255, 255, 255));
        jtxtAltura.setText("127");
        jtxtAltura.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jtxtAltura.setFont(new java.awt.Font("Josefin Sans", 0, 18)); // NOI18N

        jtxtDni.setBackground(new java.awt.Color(51, 51, 51));
        jtxtDni.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDni.setText("4545645");
        jtxtDni.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jtxtDni.setFont(new java.awt.Font("Josefin Sans", 0, 18)); // NOI18N

        jtxtEdad.setBackground(new java.awt.Color(51, 51, 51));
        jtxtEdad.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEdad.setText("10");
        jtxtEdad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jtxtEdad.setFont(new java.awt.Font("Josefin Sans", 0, 18)); // NOI18N

        jcbxEstadoCivil.setBackground(new java.awt.Color(51, 51, 51));
        jcbxEstadoCivil.setFont(new java.awt.Font("Josefin Sans", 0, 18)); // NOI18N
        jcbxEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        jcbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Viudo", "Divorciado" }));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtxaArea.setColumns(20);
        jtxaArea.setRows(5);
        jScrollPane1.setViewportView(jtxaArea);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Ordenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGroupSexo.add(jrbMasculino);
        jrbMasculino.setText("Hombre");

        btnGroupSexo.add(jbtnFemenino);
        jbtnFemenino.setText("Mujer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtApeMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtApePaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbMasculino)
                        .addGap(46, 46, 46)
                        .addComponent(jbtnFemenino)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbMasculino)
                            .addComponent(jbtnFemenino))
                        .addGap(54, 54, 54)
                        .addComponent(jtxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lcd.agregarAlFinal(new Persona(jtxtNombre.getText().trim(),
                jtxtApePaterno.getText().trim(), jtxtApePaterno.getText().trim(),
                jcbxEstadoCivil.getSelectedItem().toString(), jrbMasculino.isSelected() ? "Hombre" : "Mujer",
                Double.parseDouble(jtxtAltura.getText()), Integer.parseInt(jtxtDni.getText()),
                Byte.parseByte(jtxtEdad.getText()), Byte.parseByte(jSpinner1.getValue().toString())));
        lcd.vaciarTabla(modelo, jTable1.getRowCount());
        lcd.mostrarListaTabla(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lcd.ordenar();
        lcd.vaciarTabla(modelo, jTable1.getRowCount());
        lcd.mostrarListaTabla(modelo);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmListaCircularSemana10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaCircularSemana10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaCircularSemana10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaCircularSemana10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListaCircularSemana10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jbtnFemenino;
    private javax.swing.JComboBox<String> jcbxEstadoCivil;
    private javax.swing.JRadioButton jrbMasculino;
    private javax.swing.JTextArea jtxaArea;
    private jtextfieldround.JTextFieldRound jtxtAltura;
    private jtextfieldround.JTextFieldRound jtxtApeMaterno;
    private jtextfieldround.JTextFieldRound jtxtApePaterno;
    private jtextfieldround.JTextFieldRound jtxtDni;
    private jtextfieldround.JTextFieldRound jtxtEdad;
    private jtextfieldround.JTextFieldRound jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
