package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuListaHabitaciones extends javax.swing.JInternalFrame {

    private HabitacionData hd;
    private CategoriaData cd;

    public MenuListaHabitaciones() {
        initComponents();
        this.hd = new HabitacionData();
        this.cd = new CategoriaData();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EscListahabit = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCBlistacat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTlistacat = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        EscListahabit.setBackground(new java.awt.Color(204, 204, 204));
        EscListahabit.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Lista de habitaciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione el tipo de habitacion");

        JCBlistacat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBlistacat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Habitacion" }));
        JCBlistacat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBlistacatActionPerformed(evt);
            }
        });

        JTlistacat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Categoria", "nroHabitacion", "Piso", "Precio", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTlistacat);

        EscListahabit.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EscListahabit.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EscListahabit.setLayer(JCBlistacat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EscListahabit.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscListahabitLayout = new javax.swing.GroupLayout(EscListahabit);
        EscListahabit.setLayout(EscListahabitLayout);
        EscListahabitLayout.setHorizontalGroup(
            EscListahabitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscListahabitLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
            .addGroup(EscListahabitLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(EscListahabitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EscListahabitLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(JCBlistacat, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EscListahabitLayout.setVerticalGroup(
            EscListahabitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscListahabitLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(EscListahabitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCBlistacat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscListahabit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscListahabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBlistacatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBlistacatActionPerformed
        if (JCBlistacat.getSelectedIndex() > 0) {
            String selectedItem = JCBlistacat.getSelectedItem().toString();
            String tipoHabitacion = selectedItem.split(" ")[0];

            obtenerHabitaciones();
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione Habitacion");

        }
    }//GEN-LAST:event_JCBlistacatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EscListahabit;
    private javax.swing.JComboBox<String> JCBlistacat;
    private javax.swing.JTable JTlistacat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        List<Categoria> categorias = cd.listarCategorias();
        for (Categoria categoria : categorias) {
            JCBlistacat.addItem(categoria.getIdCategoria() + " " + categoria.getTipoHabitacion());
        }

    }

    private void obtenerHabitaciones() {
        DefaultTableModel modeloTabla = (DefaultTableModel) JTlistacat.getModel();
        // resettabla
        modeloTabla.setRowCount(0);
        //verifica la seleccion
        int selectedIndex = JCBlistacat.getSelectedIndex();
        if (selectedIndex <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione Habitación");
            return;
        }

        // Obtener IDcategoría y el tipdehabitación
        String selectedValue = JCBlistacat.getSelectedItem().toString();
        String[] parts = selectedValue.split(" ");
        int idCategoria = Integer.parseInt(parts[0]);
        String tipoHabitacion = parts[1];

        List<Habitacion> habitaciones = hd.ListobtenerHabDisponiblesXCatg2(idCategoria);

        for (Habitacion habitacion : habitaciones) {

            modeloTabla.addRow(new Object[]{
                habitacion.getCategoria().getTipoHabitacion(), habitacion.getNroHabitacion(),
                habitacion.getPiso(), habitacion.getCategoria().getPrecio(),habitacion.getCategoria().isEstado()
            });
        }

    }

}
