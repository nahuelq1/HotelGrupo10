package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class MenuGestionHabitaciones extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private CategoriaData cd;
    private HabitacionData hd;
//private HuespedData hd1;
//private ReservaData rd;

    /**
     * Creates new form MenuGestionHabitaciones
     */
    public MenuGestionHabitaciones(MenuPrincipal menuPrincipal) {
        initComponents();
        this.cd = new CategoriaData();
        this.hd = new HabitacionData();
        this.menuPrincipal= menuPrincipal;
//        this.hd1= hd1;
//        this.rd= rd;
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
        JTidHabitacion = new javax.swing.JTextField();
        JTidCategoria = new javax.swing.JTextField();
        JTnumeroHabit = new javax.swing.JTextField();
        JTnumeroPiso = new javax.swing.JTextField();
        JBeliminar = new javax.swing.JButton();
        JBcrearhabitacion = new javax.swing.JButton();
        JBmodificarhabit = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        JRBestado = new javax.swing.JRadioButton();
        JBlistadehabit = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestion de habitaciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese el numero de la habitacion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el piso");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ingrese el ID de la habitacion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ingrese el ID de la categoria");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ingrese el estado");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTidCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTnumeroHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTnumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBcrearhabitacion)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRBestado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(JBmodificarhabit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBlistadehabit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(JRBestado))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTnumeroHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTidCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGap(18, 18, 18)
                        .addComponent(JTnumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBcrearhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBmodificarhabit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBlistadehabit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBcrearhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcrearhabitacionActionPerformed
        try{
        int idHabitacion = Integer.parseInt(JTidHabitacion.getText());
        int idCategoria = Integer.parseInt(JTidCategoria.getText());
        int nroHabitacion = Integer.parseInt(JTnumeroHabit.getText());
        int nroPiso = Integer.parseInt(JTnumeroPiso.getText());
        boolean estado = JRBestado.isSelected();
        Categoria cat = cd.buscarCategoria(idCategoria);
            if (JRBestado.isSelected()==false) {
                JOptionPane.showMessageDialog(null, "Completar todos los datos");
            }else{
        Habitacion hab = new Habitacion(idHabitacion, cat, nroHabitacion, nroPiso, estado);
        hd.crearHabitacion(hab);
            }
        }catch(NumberFormatException nfe){
        
        JOptionPane.showMessageDialog(null, "Error al crear la habitacion verifique los datos");
        
        }catch(NullPointerException n){
        
         JOptionPane.showMessageDialog(null, "Error al crear la habitacion verifique los datos");
        
        }
    }//GEN-LAST:event_JBcrearhabitacionActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        try{
        int idHabitacion = Integer.parseInt(JTidHabitacion.getText());
        boolean estado = JRBestado.isSelected();
        Habitacion hab = hd.buscarHabitacion(idHabitacion);
        JTidCategoria.setText(String.valueOf(hab.getCategoria().getIdCategoria()));
        JTnumeroHabit.setText(String.valueOf(hab.getNroHabitacion()));
        JTnumeroPiso.setText(String.valueOf(hab.getPiso()));
        JRBestado.setSelected(hab.isEstado());
        }catch(NumberFormatException nfe){
        
        JOptionPane.showMessageDialog(null, "error hay que poner una id valida");
        }catch(NullPointerException n){
        
        
        JOptionPane.showMessageDialog(null, "error al buscar habitacion");
        
        }

    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
       try{
        int idHabitacion = Integer.parseInt(JTidHabitacion.getText());
        int idCategoria = Integer.parseInt(JTidCategoria.getText());
        int nroHabitacion = Integer.parseInt(JTnumeroHabit.getText());
        int nroPiso = Integer.parseInt(JTnumeroPiso.getText());
        boolean estado = JRBestado.isSelected();
        Categoria cat = cd.buscarCategoria(idCategoria);
        Habitacion hab = new Habitacion(idHabitacion, cat, nroHabitacion, nroPiso, estado);
        
        if(idHabitacion!=0){
        hd.eliminarHabitacion(idHabitacion);
        }
       }catch(NumberFormatException nfe){
       
           JOptionPane.showMessageDialog(null, "seleccione una habitacion activa");
       }
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void JBmodificarhabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmodificarhabitActionPerformed
       
        try{
        int idHabitacion = Integer.parseInt(JTidHabitacion.getText());
        int idCategoria = Integer.parseInt(JTidCategoria.getText());
        int nroHabitacion = Integer.parseInt(JTnumeroHabit.getText());
        int nroPiso = Integer.parseInt(JTnumeroPiso.getText());
        boolean estado = JRBestado.isSelected();
        Categoria cat = cd.buscarCategoria(idCategoria);
        Habitacion hab = new Habitacion(idHabitacion, cat, nroHabitacion, nroPiso, estado);
        hd.modificarHabitacion(hab);
        }catch(NumberFormatException nfe){
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBcrearhabitacion;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBlistadehabit;
    private javax.swing.JButton JBmodificarhabit;
    private javax.swing.JRadioButton JRBestado;
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

}
