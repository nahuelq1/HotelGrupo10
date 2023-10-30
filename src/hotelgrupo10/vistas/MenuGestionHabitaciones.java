package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class MenuGestionHabitaciones extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private CategoriaData cd;
    private HabitacionData hd;
//private HuespedData hd1;
//private ReservaData rd;

    public MenuGestionHabitaciones(MenuPrincipal menuPrincipal) {
        initComponents();
        this.cd = new CategoriaData();
        this.hd = new HabitacionData();
        this.menuPrincipal = menuPrincipal;
        cargarCombo();
//        this.hd1= hd1;
//        this.rd= rd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTidHabitacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTidCategoria = new javax.swing.JTextField();
        JTnumeroHabit = new javax.swing.JTextField();
        JTnumeroPiso = new javax.swing.JTextField();
        JBeliminar = new javax.swing.JButton();
        JBcrearhabitacion = new javax.swing.JButton();
        JBmodificarhabit = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        JRBestado = new javax.swing.JRadioButton();
        JBlistadehabit = new javax.swing.JButton();
        JTCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        JTidHabitacion.setEditable(false);
        JTidHabitacion.setForeground(new java.awt.Color(240, 240, 240));
        JTidHabitacion.setCaretColor(new java.awt.Color(240, 240, 240));
        JTidHabitacion.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        JTidHabitacion.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        JTidHabitacion.setSelectionColor(new java.awt.Color(240, 240, 240));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("GESTION DE HABITACIONES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese el numero de la habitacion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el piso");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ingrese el ID de la categoria");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ingrese el estado");

        JTnumeroPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTnumeroPisoActionPerformed(evt);
            }
        });

        JBeliminar.setText("Eliminar Habitacion");
        JBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarActionPerformed(evt);
            }
        });

        JBcrearhabitacion.setText("Crear habitacion");
        JBcrearhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcrearhabitacionActionPerformed(evt);
            }
        });

        JBmodificarhabit.setText("Modificar habitacion");
        JBmodificarhabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmodificarhabitActionPerformed(evt);
            }
        });

        JBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.jpg"))); // NOI18N
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        JBlistadehabit.setText("Lista de habitaciones");
        JBlistadehabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlistadehabitActionPerformed(evt);
            }
        });

        JTCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria" }));
        JTCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setText(" O");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTidCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTnumeroHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTnumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JRBestado)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBcrearhabitacion)
                        .addGap(11, 11, 11)
                        .addComponent(JBmodificarhabit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBlistadehabit, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTnumeroHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTidCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JTnumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JRBestado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBcrearhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBmodificarhabit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBlistadehabit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBcrearhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcrearhabitacionActionPerformed
        try {

            int idCategoria = Integer.parseInt(JTidCategoria.getText());
            int nroHabitacion = Integer.parseInt(JTnumeroHabit.getText());
            int nroPiso = Integer.parseInt(JTnumeroPiso.getText());
            boolean estado = JRBestado.isSelected();
            Categoria cat = cd.buscarCategoria(idCategoria);
            if (JRBestado.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Completar todos los datos");
            } else if (JTidCategoria.getText().isEmpty() || JTnumeroHabit.getText().isEmpty()
                    || JTnumeroPiso.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "no dejar espacios en blanco");
            } else {
                Habitacion hab = new Habitacion(cat, nroHabitacion, nroPiso, estado);
                hd.crearHabitacion(hab);
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Error al crear la habitacion verifique los datos");

        } catch (NullPointerException n) {

            JOptionPane.showMessageDialog(null, "Error al crear la habitacion verifique los datos");

        }
    }//GEN-LAST:event_JBcrearhabitacionActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        try {
            int NroHabitacion = Integer.parseInt(JTnumeroHabit.getText());
            boolean estado = JRBestado.isSelected();
            Habitacion hab = hd.buscarHabitacion(NroHabitacion);
            JTidCategoria.setText(String.valueOf(hab.getCategoria().getIdCategoria()));
            JTidHabitacion.setText(String.valueOf(hab.getIdHabitacion()));
            JTnumeroPiso.setText(String.valueOf(hab.getPiso()));
            JRBestado.setSelected(hab.isEstado());

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "error hay que poner un nro de habitacion valido");
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "error al buscar habitacion");
        }

    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
        try {
            int idCategoria = Integer.parseInt(JTidCategoria.getText());
            int idHabitacion = Integer.parseInt(JTidHabitacion.getText());
            int nroHabitacion = Integer.parseInt(JTnumeroHabit.getText());
            int nroPiso = Integer.parseInt(JTnumeroPiso.getText());
            boolean estado = JRBestado.isSelected();
            Categoria cat = cd.buscarCategoria(idCategoria);
            Habitacion hab = new Habitacion(idHabitacion, cat, nroHabitacion, nroPiso, estado);

            if (idHabitacion != 0) {
                hd.eliminarHabitacion(idHabitacion);
                
                JTnumeroHabit.setText("");
                JTidCategoria.setText("");
                JTnumeroPiso.setText("");
                JRBestado.setSelected(false);
                
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "seleccione una habitacion activa");
        }
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void JBmodificarhabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmodificarhabitActionPerformed
        try {
            int idCategoria = Integer.parseInt(JTidCategoria.getText());
            int idHabitacion = Integer.parseInt(JTidHabitacion.getText());
            int nroHabitacion = Integer.parseInt(JTnumeroHabit.getText());
            int nroPiso = Integer.parseInt(JTnumeroPiso.getText());
            boolean estado = JRBestado.isSelected();
            Categoria cat = cd.buscarCategoria(idCategoria);
            Habitacion hab = new Habitacion(idHabitacion, cat, nroHabitacion, nroPiso, estado);
            hd.modificarHabitacion(hab);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error al modificar verifique los datos");
        }
    }//GEN-LAST:event_JBmodificarhabitActionPerformed

    private void JBlistadehabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlistadehabitActionPerformed
        // TODO add your handling code here:

        MenuListaHabitaciones mlh = new MenuListaHabitaciones();
        mlh.setVisible(true);
        menuPrincipal.getEscritorio().add(mlh);
        menuPrincipal.getEscritorio().moveToFront(mlh);

    }//GEN-LAST:event_JBlistadehabitActionPerformed

    private void JTnumeroPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnumeroPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnumeroPisoActionPerformed

    private void JTCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCategoriaActionPerformed

        if (JTCategoria.getSelectedIndex() > 0) {
            String selectedValue = JTCategoria.getSelectedItem().toString();
            String[] parts = selectedValue.split(" ");
            int idCategoria = Integer.parseInt(parts[0]);

            obtenerDatosC();
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione Una Categoria");

        }
    }//GEN-LAST:event_JTCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBcrearhabitacion;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBlistadehabit;
    private javax.swing.JButton JBmodificarhabit;
    private javax.swing.JRadioButton JRBestado;
    private javax.swing.JComboBox<String> JTCategoria;
    private javax.swing.JTextField JTidCategoria;
    private javax.swing.JTextField JTidHabitacion;
    private javax.swing.JTextField JTnumeroHabit;
    private javax.swing.JTextField JTnumeroPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        List<Categoria> categorias = cd.listarCategorias();
        for (Categoria categoria : categorias) {
            JTCategoria.addItem(categoria.getIdCategoria() + " " + categoria.getTipoHabitacion());
        }
    }

    private void obtenerDatosC() {
        int selectedIndex = JTCategoria.getSelectedIndex();

        // Obtener IDcategoría y el tipdehabitación
        String selectedValue = JTCategoria.getSelectedItem().toString();
        String[] parts = selectedValue.split(" ");
        int idCategoria = Integer.parseInt(parts[0]);
        String tipoHabitacion = parts[1];
        boolean estado = JRBestado.isSelected();

        Categoria cat = cd.buscarCategoria(idCategoria);
        JTidCategoria.setText(String.valueOf(cat.getIdCategoria()));

    }

}
