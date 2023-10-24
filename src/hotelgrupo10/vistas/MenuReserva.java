package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import hotelgrupo10.entidades.Huesped;
import hotelgrupo10.entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuReserva extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private CategoriaData cd;
    private HabitacionData hd;
    private HuespedData hd1;
    private ReservaData rd;

    public MenuReserva(CategoriaData cd, HabitacionData hd, HuespedData hd1, ReservaData rd, MenuPrincipal menuPrincipal) {
        initComponents();
        this.cd = new CategoriaData();
        this.hd = new HabitacionData();
        this.hd1 = new HuespedData();
        this.rd = new ReservaData();
        this.menuPrincipal = menuPrincipal;
        cargarCategoriasEnComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JDCfechaing = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JDCfechasalida = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        JCBtiposhabit = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JThabitdisp = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        JBreserva = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTpreciototal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTdniH = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Reserva de habitaciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de personas a hospedarse");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione fecha de ingreso ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de salida");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione el tipo de habitacion ");

        JCBtiposhabit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Habitacion" }));
        JCBtiposhabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBtiposhabitActionPerformed(evt);
            }
        });

        JThabitdisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nroHabitacion", "piso", "precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JThabitdisp);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione la habitacion  disponible");

        JBreserva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBreserva.setText("Reservar");
        JBreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBreservaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total a pagar");

        JTpreciototal.setEditable(false);
        JTpreciototal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTpreciototal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTpreciototalActionPerformed(evt);
            }
        });

        jLabel8.setText("DNI HUESPED");

        jTdniH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JCBtiposhabit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel7)
                                        .addGap(38, 38, 38)
                                        .addComponent(JTpreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)
                                        .addComponent(JDCfechaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JDCfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(86, 86, 86)
                        .addComponent(jTdniH, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(JBreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTdniH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(JCBtiposhabit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JDCfechaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDCfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTpreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(JBreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBtiposhabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBtiposhabitActionPerformed
        if (JCBtiposhabit.getSelectedIndex() > 0) {
            String selectedItem = JCBtiposhabit.getSelectedItem().toString();
            String categoria = selectedItem;
            String tipoHabitacion = selectedItem.split(" ")[0];

            //act tabla por disponibilidad
            completarTablaDisponibilidad();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione Habitación");
        }
    }//GEN-LAST:event_JCBtiposhabitActionPerformed

    private void jTdniHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniHActionPerformed

    private void JTpreciototalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTpreciototalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTpreciototalActionPerformed

    private void JBreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBreservaActionPerformed
        int dniHuesped = 0;
        String dniHuespedText = jTdniH.getText();
        dniHuesped = Integer.parseInt(dniHuespedText);

        int cantidadPersonas = (int) jSpinner1.getValue();

        if (JThabitdisp.getSelectedRow() != -1) {
            int filaSeleccionada = JThabitdisp.getSelectedRow();
            //Habitacion
            int numeroHabitacion = (int) JThabitdisp.getValueAt(filaSeleccionada, 0);
            Habitacion habitacion = hd.buscarHabitacionPorNumero(numeroHabitacion);

            JOptionPane.showMessageDialog(null, "nrohab= " + numeroHabitacion);
            JOptionPane.showMessageDialog(null, "nrohab= " + habitacion);
            //idCategoria y tipo de Habitacion
            String selectedValue = JCBtiposhabit.getSelectedItem().toString();
            String[] parts = selectedValue.split(" ");
            int idCategoria = Integer.parseInt(parts[0]);
            String tipoHabitacion = parts[1];

            //Fecha
            LocalDate fechaInicio = JDCfechaing.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFin = JDCfechasalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            //precio
            Categoria categoria = cd.buscarCategoria(idCategoria);
            double precio = categoria.getPrecio();

            //huesped
            Huesped huesped = hd1.buscarHuesped(dniHuesped);

            Reserva reserva = new Reserva(habitacion, huesped, categoria, fechaInicio, fechaFin, precio, cantidadPersonas, true);

            JOptionPane.showMessageDialog(null, "nrohab= " + reserva);
            rd.crearReserva(reserva);
            JOptionPane.showMessageDialog(null, "nrohab= " + reserva);
            completarTablaDisponibilidad();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una habitación para reservar.");
        }
    }//GEN-LAST:event_JBreservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBreserva;
    private javax.swing.JComboBox<String> JCBtiposhabit;
    private com.toedter.calendar.JDateChooser JDCfechaing;
    private com.toedter.calendar.JDateChooser JDCfechasalida;
    private javax.swing.JTable JThabitdisp;
    private javax.swing.JTextField JTpreciototal;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTdniH;
    // End of variables declaration//GEN-END:variables

    private void cargarCategoriasEnComboBox() {
        List<Categoria> listarCategorias = cd.listarCategorias();
        for (Categoria categoria : listarCategorias) {
            JCBtiposhabit.addItem(categoria.getIdCategoria() + " " + categoria.getTipoHabitacion());
        }
    }

    private void completarTablaDisponibilidad() {
        DefaultTableModel modeloTabla = (DefaultTableModel) JThabitdisp.getModel();
        // resettabla
        modeloTabla.setRowCount(0);
        //verifica la seleccion
        int selectedIndex = JCBtiposhabit.getSelectedIndex();
        if (selectedIndex <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione Habitación");
            return;
        }

        // Obtener IDcategoría y el tipdehabitación
        String selectedValue = JCBtiposhabit.getSelectedItem().toString();
        String[] parts = selectedValue.split(" ");
        int idCategoria = Integer.parseInt(parts[0]);
        String tipoHabitacion = parts[1];

        //obt lista de habt disponibles
        List<Habitacion> habitacionesDisponibles = hd.ListobtenerHabitacionesDisponiblesPorCategoria(idCategoria);
        // vrif hab dispobiles
        for (Habitacion habitacion : habitacionesDisponibles) {
            modeloTabla.addRow(new Object[]{habitacion.getNroHabitacion(), habitacion.getPiso(), habitacion.getCategoria().getPrecio()});
        }
    }
}
