package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MenuGestionCategorias extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private CategoriaData cd;

    public MenuGestionCategorias(MenuPrincipal menuPrincipal) {
        initComponents();
        this.cd = new CategoriaData();
        this.menuPrincipal = menuPrincipal;
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTFcantpersonas = new javax.swing.JTextField();
        JTFcantcamas = new javax.swing.JTextField();
        JTFtipodecama = new javax.swing.JTextField();
        JTFtipodehabitacion = new javax.swing.JTextField();
        JTFprecio = new javax.swing.JTextField();
        JRBestado = new javax.swing.JRadioButton();
        JBbuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JTFidcategoria = new javax.swing.JTextField();
        JBeliminarcat = new javax.swing.JButton();
        JBmodificarcat = new javax.swing.JButton();
        JBcrearcat = new javax.swing.JButton();
        JBlistacat = new javax.swing.JButton();
        jCBfindCatg = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestion de categorias");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese cantidad de personas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese cantidad de camas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el tipo de cama");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese el tipo de habitacion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese el precio");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Marque el estado");

        JBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.jpg"))); // NOI18N
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ingrese el ID de la categoria");

        JBeliminarcat.setText("Eliminar categoria");
        JBeliminarcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarcatActionPerformed(evt);
            }
        });

        JBmodificarcat.setText("Modificar categoria");
        JBmodificarcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmodificarcatActionPerformed(evt);
            }
        });

        JBcrearcat.setText("Crear categoria");
        JBcrearcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcrearcatActionPerformed(evt);
            }
        });

        JBlistacat.setText("Lista de categorias");
        JBlistacat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlistacatActionPerformed(evt);
            }
        });

        jCBfindCatg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione  la Categoria" }));
        jCBfindCatg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfindCatgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRBestado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JTFcantpersonas)
                                .addComponent(JTFcantcamas)
                                .addComponent(JTFtipodecama)
                                .addComponent(JTFtipodehabitacion)
                                .addComponent(JTFprecio)
                                .addComponent(JTFidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBfindCatg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBeliminarcat)
                        .addGap(18, 18, 18)
                        .addComponent(JBmodificarcat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBcrearcat)
                        .addGap(18, 18, 18)
                        .addComponent(JBlistacat, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBfindCatg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTFcantpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTFcantcamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTFtipodecama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTFtipodehabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTFprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JRBestado))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBeliminarcat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBmodificarcat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBcrearcat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBlistacat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBeliminarcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarcatActionPerformed
        try {
            int idCategoria = Integer.parseInt(JTFidcategoria.getText());
            int cantPersonas = Integer.parseInt(JTFcantpersonas.getText());
            int cantCamas = Integer.parseInt(JTFcantcamas.getText());
            String tipoCamas = JTFtipodecama.getText();
            String tipoHabitacion = JTFtipodehabitacion.getText();
            double precio = Double.parseDouble(JTFprecio.getText());
            boolean estado = JRBestado.isSelected();
            Categoria cat = new Categoria(idCategoria, cantPersonas, cantCamas, tipoCamas, tipoHabitacion, precio, estado);
            if (idCategoria != 0) {

                cd.eliminarCategoria(idCategoria);
                //act combobox
                while (jCBfindCatg.getItemCount() > 1) {
                    jCBfindCatg.removeItemAt(1);
                }
                cargarCombo();

                JTFidcategoria.setText("");
                JTFcantpersonas.setText("");
                JTFcantcamas.setText("");
                JTFtipodecama.setText("");
                JTFtipodehabitacion.setText("");
                JTFprecio.setText("");
                JRBestado.setSelected(false);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Seleccione Una categoria Activa o no cambie los datos");
        }


    }//GEN-LAST:event_JBeliminarcatActionPerformed

    private void JBlistacatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlistacatActionPerformed
        MenuListaCategorias mlc = new MenuListaCategorias();
        mlc.setVisible(true);
        menuPrincipal.getEscritorio().add(mlc);
        menuPrincipal.getEscritorio().moveToFront(mlc);
    }//GEN-LAST:event_JBlistacatActionPerformed

    private void JBcrearcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcrearcatActionPerformed
        try {
            int idCategoria = Integer.parseInt(JTFidcategoria.getText());
            int cantPersonas = Integer.parseInt(JTFcantpersonas.getText());
            int cantCamas = Integer.parseInt(JTFcantcamas.getText());
            String tipoCamas = JTFtipodecama.getText();
            String tipoHabitacion = JTFtipodehabitacion.getText();
            double precio = Double.parseDouble(JTFprecio.getText());
            boolean estado = JRBestado.isSelected();
            if (!validarCategoriaSinNumeros(tipoCamas) || !validarCategoriaSinNumeros(tipoHabitacion)) {
                JOptionPane.showMessageDialog(null, "tipocamas y tipohabitacion no deben contener números.");
                return;
            }
            if (JTFidcategoria.getText().isEmpty() || JTFcantpersonas.getText().isEmpty()
                    || JTFcantcamas.getText().isEmpty()
                    || JTFtipodecama.getText().isEmpty() || JTFtipodehabitacion.getText().isEmpty()
                    || JTFprecio.getText().isEmpty() || JRBestado.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "no dejar espacios en blanco");
            } else {
                Categoria cat = new Categoria(idCategoria, cantPersonas, cantCamas, tipoCamas, tipoHabitacion, precio, estado);
                cd.agregarCategoria(cat);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "datos incorrectos o incompletos");
        }
    }//GEN-LAST:event_JBcrearcatActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        try {
            int idCategoria = Integer.parseInt(JTFidcategoria.getText());
            boolean estado = JRBestado.isSelected();
            Categoria cat = cd.buscarCategoria(idCategoria);
            JTFcantpersonas.setText(String.valueOf(cat.getCantPersonas()));
            JTFcantcamas.setText(String.valueOf(cat.getCantCamas()));
            JTFtipodecama.setText(cat.getTipoCamas());
            JTFtipodehabitacion.setText(cat.getTipoHabitacion());
            JTFprecio.setText(String.valueOf(cat.getPrecio()));
            JRBestado.setSelected(cat.isEstado());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ingresa una id valida");
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "error al buscar categoria");
        }

    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBmodificarcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmodificarcatActionPerformed
        try {
            int idCategoria = Integer.parseInt(JTFidcategoria.getText());
            int cantPersonas = Integer.parseInt(JTFcantpersonas.getText());
            int cantCamas = Integer.parseInt(JTFcantcamas.getText());
            String tipoCamas = JTFtipodecama.getText();
            String tipoHabitacion = JTFtipodehabitacion.getText();
            double precio = Double.parseDouble(JTFprecio.getText());
            boolean estado = JRBestado.isSelected();
            if (!validarCategoriaSinNumeros(tipoCamas) || !validarCategoriaSinNumeros(tipoHabitacion)) {
                JOptionPane.showMessageDialog(null, "tipo de camas y tipo de habitacion no deben contener números.");
                return;
            } else {
                Categoria cat = new Categoria(idCategoria, cantPersonas, cantCamas, tipoCamas, tipoHabitacion, precio, estado);
                cd.modificarCategoria(cat);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error Al Modificar Los Datos");
        }

    }//GEN-LAST:event_JBmodificarcatActionPerformed

    private void jCBfindCatgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfindCatgActionPerformed
        if (jCBfindCatg.getSelectedIndex() > 0) {
            obtenerDatosC();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la Categoria");
        }
    }//GEN-LAST:event_jCBfindCatgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBcrearcat;
    private javax.swing.JButton JBeliminarcat;
    private javax.swing.JButton JBlistacat;
    private javax.swing.JButton JBmodificarcat;
    private javax.swing.JRadioButton JRBestado;
    private javax.swing.JTextField JTFcantcamas;
    private javax.swing.JTextField JTFcantpersonas;
    private javax.swing.JTextField JTFidcategoria;
    private javax.swing.JTextField JTFprecio;
    private javax.swing.JTextField JTFtipodecama;
    private javax.swing.JTextField JTFtipodehabitacion;
    private javax.swing.JComboBox<String> jCBfindCatg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private boolean validarCategoriaSinNumeros(String cadena) {
        return !Pattern.compile("[0-9]").matcher(cadena).find();
    }

    private void obtenerDatosC() {
        int selectedIndex = jCBfindCatg.getSelectedIndex();

        // Obtener IDcategoría y el tipdehabitación
        String selectedValue = jCBfindCatg.getSelectedItem().toString();
        String[] parts = selectedValue.split(" ");
        int idCategoria = Integer.parseInt(parts[0]);
        String tipoHabitacion = parts[1];
        boolean estado = JRBestado.isSelected();

        Categoria cat = cd.buscarCategoria(idCategoria);
        JTFidcategoria.setText(String.valueOf(cat.getIdCategoria()));
        JTFcantpersonas.setText(String.valueOf(cat.getCantPersonas()));
        JTFcantcamas.setText(String.valueOf(cat.getCantCamas()));
        JTFtipodecama.setText(cat.getTipoCamas());
        JTFtipodehabitacion.setText(cat.getTipoHabitacion());
        JTFprecio.setText(String.valueOf(cat.getPrecio()));
        JRBestado.setSelected(cat.isEstado());
    }

    private void cargarCombo() {
        List<Categoria> categorias = cd.listarCategorias();
        for (Categoria categoria : categorias) {
            jCBfindCatg.addItem(categoria.getIdCategoria() + " " + categoria.getTipoHabitacion());
        }

    }

}
