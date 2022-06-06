package sesion10;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FrmPresentación extends javax.swing.JFrame {

    private final ListaCircularDoble lista = new ListaCircularDoble();
    private final Utilidades utilidades = new Utilidades();
    private final DefaultTableModel modelo;
    private final String[] cabecera = {"ID", "Nombre", "Ape. Paterno", "Ape. Materno", "Estado Civil", "Sexo", "Fecha Nacimiento", "Altura", "DNI", "Edad", "Cantidad Hijos"};
    private String[][] data;
    private byte codigo = 1;
    private Nodo encontrado, desplazar;
    private final TableColumnModel COLUMN_MODEL;

    public FrmPresentación() {
        initComponents();
        modelo = new DefaultTableModel(data, cabecera);
        COLUMN_MODEL = jtblDatos.getColumnModel();
        jtblDatos.setModel(modelo);
        utilidades.calendar(dateChooser);
        utilidades.alinearCeldas(jtblDatos, SwingConstants.CENTER);
        utilidades.AnchoCeldas(COLUMN_MODEL);
    }

    private void limpiarCampos() {
        jtxtNombre.setText("");
        jtxtApellidoPaterno.setText("");
        jtxtApellidoMaterno.setText("");
        jcbxEstadoCivil.setSelectedIndex(0);
        jtxtFechaNacimiento.setText("");
        jtxtAltura.setText("");
        jtxtDNI.setText("");
        jtxtEdad.setText("");
        jspnCantidadHijos.setValue(0);
    }

    private boolean dniValido() {
        return jtxtDNI.getText().trim().length() == 8;
    }

    private boolean validarCampos() {
        return !(jtxtNombre.getText().isBlank()
                || jtxtApellidoPaterno.getText().isBlank()
                || jtxtApellidoMaterno.getText().isBlank()
                || jtxtFechaNacimiento.getText().isBlank()
                || jtxtAltura.getText().isBlank()
                || jtxtDNI.getText().isBlank()
                || jtxtEdad.getText().isBlank()
                || !(jrbHombre.isSelected() || jrbMujer.isSelected()));
    }

    private void mostrarDesplazando() {
        jtxtId.setText(String.valueOf(desplazar.getPersona().getId()));
        jtxtNombre.setText(desplazar.getPersona().getNombre());
        jtxtApellidoPaterno.setText(desplazar.getPersona().getApellidoPaterno());
        jtxtApellidoMaterno.setText(desplazar.getPersona().getApellidoMaterno());
        jcbxEstadoCivil.setSelectedItem(desplazar.getPersona().getEstadoCivil());
        jtxtFechaNacimiento.setText(desplazar.getPersona().getFechaNacimiento());
        if (desplazar.getPersona().getSexo().equals("Hombre")) {
            jrbHombre.setSelected(true);
        } else {
            jrbMujer.setSelected(true);
        }
        jtxtAltura.setText(String.valueOf(desplazar.getPersona().getAltura()));
        jtxtDNI.setText(String.valueOf(desplazar.getPersona().getDNI()));
        jtxtEdad.setText(String.valueOf(desplazar.getPersona().getEdad()));
        jspnCantidadHijos.setValue(desplazar.getPersona().getCantidadDeHijos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dateChooser = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jtxtId = new componentes.TextField();
        jtxtNombre = new componentes.TextField();
        jtxtApellidoMaterno = new componentes.TextField();
        jtxtApellidoPaterno = new componentes.TextField();
        jrbMujer = new componentes.RadioButtonCustom();
        jrbHombre = new componentes.RadioButtonCustom();
        jtxtAltura = new componentes.TextField();
        jtxtDNI = new componentes.TextField();
        jtxtEdad = new componentes.TextField();
        jlblMensaje = new javax.swing.JLabel();
        jspnCantidadHijos = new componentes.Spinner();
        materialTabbed1 = new componentes.MaterialTabbed();
        jPanel2 = new javax.swing.JPanel();
        jcbxAgregar = new componentes.Combobox();
        jbtnAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        buscarJtxtCodigo = new componentes.TextField();
        jbtnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jcbxOrdenar = new componentes.Combobox();
        jbtnOrdenar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jbtnDesplazarEmpezar = new javax.swing.JButton();
        jbtnDesplazarSiguiente = new javax.swing.JButton();
        jbtnDesplazarAnterior = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jcbxEliminar = new componentes.Combobox();
        jbtnEliminar = new javax.swing.JButton();
        eliminarJtxtCodigo = new componentes.TextField();
        jcbxEstadoCivil = new componentes.Combobox();
        jtxtFechaNacimiento = new componentes.TextField();
        jbtnMostrarCalendario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        dateChooser.setTextRefernce(jtxtFechaNacimiento);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTA CIRCULAR DOBLE - PRESENTACIÓN SEMANA 10 - GRUPO 8");

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtId.setBackground(new java.awt.Color(24, 24, 24));
        jtxtId.setForeground(new java.awt.Color(255, 255, 255));
        jtxtId.setEnabled(false);
        jtxtId.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtId.setLabelText("ID");
        jtxtId.setLineColor(new java.awt.Color(42, 143, 136));
        jPanel1.add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 300, 60));

        jtxtNombre.setBackground(new java.awt.Color(24, 24, 24));
        jtxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setText("a");
        jtxtNombre.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtNombre.setLabelText("Nombres");
        jtxtNombre.setLineColor(new java.awt.Color(42, 143, 136));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 300, 60));

        jtxtApellidoMaterno.setBackground(new java.awt.Color(24, 24, 24));
        jtxtApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApellidoMaterno.setText("a");
        jtxtApellidoMaterno.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtApellidoMaterno.setLabelText("Apellido Materno");
        jtxtApellidoMaterno.setLineColor(new java.awt.Color(42, 143, 136));
        jPanel1.add(jtxtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 300, 60));

        jtxtApellidoPaterno.setBackground(new java.awt.Color(24, 24, 24));
        jtxtApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApellidoPaterno.setText("a");
        jtxtApellidoPaterno.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtApellidoPaterno.setLabelText("Apellido Paterno");
        jtxtApellidoPaterno.setLineColor(new java.awt.Color(42, 143, 136));
        jPanel1.add(jtxtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 300, 60));

        jrbMujer.setBackground(new java.awt.Color(53, 211, 164));
        buttonGroup1.add(jrbMujer);
        jrbMujer.setForeground(new java.awt.Color(255, 255, 255));
        jrbMujer.setText("Mujer");
        jrbMujer.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jPanel1.add(jrbMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jrbHombre.setBackground(new java.awt.Color(53, 211, 164));
        buttonGroup1.add(jrbHombre);
        jrbHombre.setForeground(new java.awt.Color(255, 255, 255));
        jrbHombre.setText("Hombre");
        jrbHombre.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jPanel1.add(jrbHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jtxtAltura.setBackground(new java.awt.Color(24, 24, 24));
        jtxtAltura.setForeground(new java.awt.Color(255, 255, 255));
        jtxtAltura.setText("1");
        jtxtAltura.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtAltura.setLabelText("Altura");
        jtxtAltura.setLineColor(new java.awt.Color(42, 143, 136));
        jtxtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAlturaKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 300, 60));

        jtxtDNI.setBackground(new java.awt.Color(24, 24, 24));
        jtxtDNI.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDNI.setText("1");
        jtxtDNI.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtDNI.setLabelText("DNI");
        jtxtDNI.setLineColor(new java.awt.Color(42, 143, 136));
        jtxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDNIKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 300, 60));

        jtxtEdad.setBackground(new java.awt.Color(24, 24, 24));
        jtxtEdad.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEdad.setText("1");
        jtxtEdad.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtEdad.setLabelText("Edad");
        jtxtEdad.setLineColor(new java.awt.Color(42, 143, 136));
        jtxtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 300, 60));

        jlblMensaje.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jlblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jlblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 870, 20));

        jspnCantidadHijos.setBackground(new java.awt.Color(24, 24, 24));
        jspnCantidadHijos.setBorder(null);
        jspnCantidadHijos.setForeground(new java.awt.Color(255, 255, 255));
        jspnCantidadHijos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jspnCantidadHijos.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jspnCantidadHijos.setLabelText("Cantidad de Hijos");
        jPanel1.add(jspnCantidadHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 300, 60));

        materialTabbed1.setBackground(new java.awt.Color(24, 24, 24));
        materialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(24, 24, 24));

        jcbxAgregar.setBackground(new java.awt.Color(24, 24, 24));
        jcbxAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jcbxAgregar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar al inicio", "Agregar al final" }));
        jcbxAgregar.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jcbxAgregar.setLabeText("");
        jcbxAgregar.setLineColor(new java.awt.Color(42, 143, 136));

        jbtnAgregar.setBackground(new java.awt.Color(53, 211, 164));
        jbtnAgregar.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.setBorderPainted(false);
        jbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbxAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jcbxAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        materialTabbed1.addTab("Agregar", jPanel2);

        jPanel3.setBackground(new java.awt.Color(24, 24, 24));

        buscarJtxtCodigo.setBackground(new java.awt.Color(24, 24, 24));
        buscarJtxtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        buscarJtxtCodigo.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        buscarJtxtCodigo.setLabelText("DNI a buscar");
        buscarJtxtCodigo.setLineColor(new java.awt.Color(42, 143, 136));

        jbtnBuscar.setBackground(new java.awt.Color(53, 211, 164));
        jbtnBuscar.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.setBorderPainted(false);
        jbtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarJtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(buscarJtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Buscar", jPanel3);

        jPanel4.setBackground(new java.awt.Color(24, 24, 24));

        jcbxOrdenar.setBackground(new java.awt.Color(24, 24, 24));
        jcbxOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        jcbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ordenar por edad", "Ordenar por DNI", "Ordenar por código" }));
        jcbxOrdenar.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jcbxOrdenar.setLabeText("");
        jcbxOrdenar.setLineColor(new java.awt.Color(42, 143, 136));

        jbtnOrdenar.setBackground(new java.awt.Color(53, 211, 164));
        jbtnOrdenar.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnOrdenar.setText("Ordenar");
        jbtnOrdenar.setBorderPainted(false);
        jbtnOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnOrdenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jcbxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jbtnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        materialTabbed1.addTab("Ordenar", jPanel4);

        jPanel5.setBackground(new java.awt.Color(24, 24, 24));

        jbtnDesplazarEmpezar.setBackground(new java.awt.Color(53, 211, 164));
        jbtnDesplazarEmpezar.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnDesplazarEmpezar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDesplazarEmpezar.setText("Empezar");
        jbtnDesplazarEmpezar.setBorderPainted(false);
        jbtnDesplazarEmpezar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDesplazarEmpezar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDesplazarEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDesplazarEmpezarActionPerformed(evt);
            }
        });

        jbtnDesplazarSiguiente.setBackground(new java.awt.Color(53, 211, 164));
        jbtnDesplazarSiguiente.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnDesplazarSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDesplazarSiguiente.setText("Siguiente");
        jbtnDesplazarSiguiente.setBorderPainted(false);
        jbtnDesplazarSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDesplazarSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDesplazarSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDesplazarSiguienteActionPerformed(evt);
            }
        });

        jbtnDesplazarAnterior.setBackground(new java.awt.Color(53, 211, 164));
        jbtnDesplazarAnterior.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnDesplazarAnterior.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDesplazarAnterior.setText("Anterior");
        jbtnDesplazarAnterior.setBorderPainted(false);
        jbtnDesplazarAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDesplazarAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDesplazarAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDesplazarAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbtnDesplazarAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDesplazarSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnDesplazarEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jbtnDesplazarEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDesplazarSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDesplazarAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Desplazar", jPanel5);

        jPanel7.setBackground(new java.awt.Color(24, 24, 24));

        jcbxEliminar.setBackground(new java.awt.Color(24, 24, 24));
        jcbxEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jcbxEliminar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eliminar nodo específico", "Eliminar nodo inicial", "Eliminar nodo final" }));
        jcbxEliminar.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jcbxEliminar.setLabeText("");
        jcbxEliminar.setLineColor(new java.awt.Color(42, 143, 136));
        jcbxEliminar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxEliminarItemStateChanged(evt);
            }
        });

        jbtnEliminar.setBackground(new java.awt.Color(53, 211, 164));
        jbtnEliminar.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setBorderPainted(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        eliminarJtxtCodigo.setBackground(new java.awt.Color(24, 24, 24));
        eliminarJtxtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        eliminarJtxtCodigo.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        eliminarJtxtCodigo.setLabelText("Código");
        eliminarJtxtCodigo.setLineColor(new java.awt.Color(42, 143, 136));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(eliminarJtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jcbxEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jcbxEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(eliminarJtxtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Eliminar", jPanel7);

        jPanel1.add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 497, 240));

        jcbxEstadoCivil.setBackground(new java.awt.Color(24, 24, 24));
        jcbxEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        jcbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero (a)", "Casado (a)", "Viudo (a)", "Divorciado (a)" }));
        jcbxEstadoCivil.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jcbxEstadoCivil.setLabeText("");
        jPanel1.add(jcbxEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, -1));

        jtxtFechaNacimiento.setBackground(new java.awt.Color(24, 24, 24));
        jtxtFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jtxtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtFechaNacimiento.setText("");
        jtxtFechaNacimiento.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jtxtFechaNacimiento.setLabelText("Fecha de Nacimiento");
        jtxtFechaNacimiento.setLineColor(new java.awt.Color(42, 143, 136));
        jtxtFechaNacimiento.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel1.add(jtxtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, 60));

        jbtnMostrarCalendario.setBackground(new java.awt.Color(53, 211, 164));
        jbtnMostrarCalendario.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        jbtnMostrarCalendario.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMostrarCalendario.setText("...");
        jbtnMostrarCalendario.setBorderPainted(false);
        jbtnMostrarCalendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMostrarCalendario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnMostrarCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarCalendarioActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMostrarCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 60, 40));

        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtblDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 920, 360));

        jLabel2.setFont(new java.awt.Font("Josefin Sans Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OPCIONES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMostrarCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarCalendarioActionPerformed
        dateChooser.showPopup();
    }//GEN-LAST:event_jbtnMostrarCalendarioActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        if (validarCampos()) {
            if (dniValido()) {
                Persona persona = new Persona(
                        codigo++,
                        jtxtNombre.getText().trim(),
                        jtxtApellidoPaterno.getText().trim(),
                        jtxtApellidoMaterno.getText().trim(),
                        jcbxEstadoCivil.getSelectedItem().toString(),
                        jrbHombre.isSelected() ? "Hombre" : "Mujer",
                        jtxtFechaNacimiento.getText(),
                        Double.parseDouble(jtxtAltura.getText()),
                        Integer.parseInt(jtxtDNI.getText()),
                        Byte.parseByte(jtxtEdad.getText()),
                        Byte.parseByte(jspnCantidadHijos.getValue().toString()));
                if (jcbxAgregar.getSelectedIndex() == 0) {
                    lista.agregarAlInicio(persona);
                } else {
                    lista.agregarAlFinal(persona);
                }
                jlblMensaje.setText("");
                limpiarCampos();
            } else {
                jlblMensaje.setText("La longitud del DNI es incorrecta");
            }
            lista.vaciarTabla(modelo, jtblDatos.getRowCount());
            lista.mostrarListaTabla(modelo);
        } else {
            jlblMensaje.setText("Debes rellenar todos los campos");
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        try {
            encontrado = lista.buscar(Integer.parseInt(buscarJtxtCodigo.getText()));
            jtxtId.setText(String.valueOf(encontrado.getPersona().getId()));
            jtxtNombre.setText(encontrado.getPersona().getNombre());
            jtxtApellidoPaterno.setText(encontrado.getPersona().getApellidoPaterno());
            jtxtApellidoMaterno.setText(encontrado.getPersona().getApellidoMaterno());
            jcbxEstadoCivil.setSelectedItem(encontrado.getPersona().getEstadoCivil());
            jtxtFechaNacimiento.setText(encontrado.getPersona().getFechaNacimiento());
            jrbHombre.setSelected(encontrado.getPersona().getSexo().equals("Hombre"));
            jrbMujer.setSelected(encontrado.getPersona().getSexo().equals("Mujer"));
            jtxtAltura.setText(String.valueOf(encontrado.getPersona().getAltura()));
            jtxtDNI.setText(String.valueOf(encontrado.getPersona().getDNI()));
            jtxtEdad.setText(String.valueOf(encontrado.getPersona().getEdad()));
            jspnCantidadHijos.setValue(encontrado.getPersona().getCantidadDeHijos());
            jlblMensaje.setText("");
            buscarJtxtCodigo.setText("");
        } catch (NullPointerException e) {
            jlblMensaje.setText("No se encontró un registro con ese DNI");
        }

    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOrdenarActionPerformed
        jlblMensaje.setText(lista.ordenar(jcbxOrdenar.getSelectedIndex()));
        lista.vaciarTabla(modelo, jtblDatos.getRowCount());
        lista.mostrarListaTabla(modelo);
    }//GEN-LAST:event_jbtnOrdenarActionPerformed

    private void jbtnDesplazarEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDesplazarEmpezarActionPerformed
        try {
            jlblMensaje.setText("Se empezó a desplazar la lista");
            desplazar = lista.getInicio();
            mostrarDesplazando();
        } catch (NullPointerException e) {
            jlblMensaje.setText("Error - La lista está vacía");
        }
    }//GEN-LAST:event_jbtnDesplazarEmpezarActionPerformed

    private void jbtnDesplazarAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDesplazarAnteriorActionPerformed
        desplazar = desplazar.getAnterior();
        jlblMensaje.setText("Acaba de retroceder en la lista");
        mostrarDesplazando();
    }//GEN-LAST:event_jbtnDesplazarAnteriorActionPerformed

    private void jbtnDesplazarSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDesplazarSiguienteActionPerformed
        desplazar = desplazar.getSiguiente();
        jlblMensaje.setText("Acaba de avanzar en la lista");
        mostrarDesplazando();
    }//GEN-LAST:event_jbtnDesplazarSiguienteActionPerformed

    private void jcbxEliminarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxEliminarItemStateChanged
        if (jcbxEliminar.getSelectedIndex() == 0)
            eliminarJtxtCodigo.setVisible(true);
        else
            eliminarJtxtCodigo.setVisible(false);
    }//GEN-LAST:event_jcbxEliminarItemStateChanged

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed

        switch (jcbxEliminar.getSelectedIndex()) {
            case 0 ->
                lista.eliminarNodoEspecifico(Byte.parseByte(eliminarJtxtCodigo.getText()));
            case 1 ->
                lista.eliminarAlInicio();
            case 2 ->
                lista.eliminarDelFinal();
            default ->
                throw new AssertionError();
        }
        eliminarJtxtCodigo.setText("");
        lista.vaciarTabla(modelo, jtblDatos.getRowCount());
        lista.mostrarListaTabla(modelo);
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jtxtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAlturaKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jtxtAlturaKeyTyped

    private void jtxtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDNIKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jtxtDNIKeyTyped

    private void jtxtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEdadKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jtxtEdadKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPresentación().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.TextField buscarJtxtCodigo;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.raven.datechooser.DateChooser dateChooser;
    private componentes.TextField eliminarJtxtCodigo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnDesplazarAnterior;
    private javax.swing.JButton jbtnDesplazarEmpezar;
    private javax.swing.JButton jbtnDesplazarSiguiente;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnMostrarCalendario;
    private javax.swing.JButton jbtnOrdenar;
    private componentes.Combobox jcbxAgregar;
    private componentes.Combobox jcbxEliminar;
    private componentes.Combobox jcbxEstadoCivil;
    private componentes.Combobox jcbxOrdenar;
    private javax.swing.JLabel jlblMensaje;
    private componentes.RadioButtonCustom jrbHombre;
    private componentes.RadioButtonCustom jrbMujer;
    private componentes.Spinner jspnCantidadHijos;
    private javax.swing.JTable jtblDatos;
    private componentes.TextField jtxtAltura;
    private componentes.TextField jtxtApellidoMaterno;
    private componentes.TextField jtxtApellidoPaterno;
    private componentes.TextField jtxtDNI;
    private componentes.TextField jtxtEdad;
    private componentes.TextField jtxtFechaNacimiento;
    private componentes.TextField jtxtId;
    private componentes.TextField jtxtNombre;
    private componentes.MaterialTabbed materialTabbed1;
    // End of variables declaration//GEN-END:variables
}
