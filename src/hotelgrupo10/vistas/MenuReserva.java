package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import hotelgrupo10.entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuReserva extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private CategoriaData cd;
    private HabitacionData hd;
    private HuespedData hd1;
    private ReservaData rd;

    public MenuReserva(CategoriaData cd, HabitacionData hd, HuespedData hd1, ReservaData rd,MenuPrincipal menuPrincipal) {
        initComponents();
        this.cd = cd;
        this.hd = hd;
        this.hd1 = hd1;
        this.rd = rd;
        this.menuPrincipal = menuPrincipal;
        cargarCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JRB1persona = new javax.swing.JRadioButton();
        JRB2personas = new javax.swing.JRadioButton();
        JRB3personas = new javax.swing.JRadioButton();
        JRB4personas = new javax.swing.JRadioButton();
        JRB5personas = new javax.swing.JRadioButton();
        JRB6personas = new javax.swing.JRadioButton();
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

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Reserva de habitaciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de personas a hospedarse");

        JRB1persona.setText("1");
        JRB1persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB1personaActionPerformed(evt);
            }
        });

        JRB2personas.setText("2");

        JRB3personas.setText("3");

        JRB4personas.setText("4");

        JRB5personas.setText("5");

        JRB6personas.setText("6");

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
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Habitaciones Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JThabitdisp);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione la habitacion  ");

        JBreserva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBreserva.setText("Reservar");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total a pagar");

        JTpreciototal.setEditable(false);
        JTpreciototal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JDCfechaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(86, 86, 86)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JCBtiposhabit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JDCfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(177, 177, 177))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRB1persona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRB2personas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRB3personas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRB4personas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRB5personas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRB6personas)
                        .addGap(0, 4, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTpreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JRB1persona)
                    .addComponent(JRB2personas)
                    .addComponent(JRB3personas)
                    .addComponent(JRB4personas)
                    .addComponent(JRB5personas)
                    .addComponent(JRB6personas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JCBtiposhabit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(JDCfechaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JDCfechasalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTpreciototal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(JBreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBtiposhabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBtiposhabitActionPerformed

        if (JCBtiposhabit.getSelectedIndex() > 0) {

            String selectedItem = JCBtiposhabit.getSelectedItem().toString();
            String tipoHabitacion = selectedItem.split(" ")[1];

            obtenerReservas(tipoHabitacion);

        } else {

            JOptionPane.showMessageDialog(null, "Seleccione Habitacion");
        }

    }//GEN-LAST:event_JCBtiposhabitActionPerformed

    private void JRB1personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB1personaActionPerformed
        botones.add(JRB1persona);
        botones.add(JRB2personas);
        botones.add(JRB3personas);
        botones.add(JRB4personas);
        botones.add(JRB5personas);
        botones.add(JRB6personas);
    }//GEN-LAST:event_JRB1personaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBreserva;
    private javax.swing.JComboBox<String> JCBtiposhabit;
    private com.toedter.calendar.JDateChooser JDCfechaing;
    private com.toedter.calendar.JDateChooser JDCfechasalida;
    private javax.swing.JRadioButton JRB1persona;
    private javax.swing.JRadioButton JRB2personas;
    private javax.swing.JRadioButton JRB3personas;
    private javax.swing.JRadioButton JRB4personas;
    private javax.swing.JRadioButton JRB5personas;
    private javax.swing.JRadioButton JRB6personas;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {

        List<Habitacion> listaHabitacion = hd.listarHabitaciones();
        for (Habitacion habitacion : listaHabitacion) {

            JCBtiposhabit.addItem(habitacion.getIdHabitacion() + " " + habitacion.getCategoria().getTipoHabitacion());

        }

    }

    private void obtenerReservas(String tipoHabitacion) {

        DefaultTableModel model = (DefaultTableModel) JThabitdisp.getModel();
        model.setRowCount(0);

        List<Categoria> categorias = rd.mostrarHabitacionesLibres(tipoHabitacion);
        Reserva res = new Reserva();

        for (Categoria cat : categorias) {
            String t = cat.getTipoHabitacion();
//         String fechaEntradars="";
//         LocalDate fechaentrada= LocalDate.parse(fechaEntradars);
//         String fechasalidars="";
//         
//         LocalDate fechasalida=LocalDate.parse(fechasalidars);

            model.addRow(new Object[]{
                cat.getTipoHabitacion()

            });

        }
    }

}
