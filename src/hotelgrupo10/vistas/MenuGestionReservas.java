/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.vistas;


import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Huesped;
import hotelgrupo10.entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nahue
 */
public class MenuGestionReservas extends javax.swing.JInternalFrame {
private HuespedData hd1;
  private MenuPrincipal menuPrincipal;
    private CategoriaData cd;
    private HabitacionData hd;
    private ReservaData rd;
    /**
     * Creates new form MenuGestionR
     */
    public MenuGestionReservas(MenuPrincipal menuPrincipal) {
        initComponents();
        this.hd1=new HuespedData();
        this.cd = new CategoriaData();
        this.hd = new HabitacionData();
        this.rd = new ReservaData();
        this.menuPrincipal = menuPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTidhuesped = new javax.swing.JTextField();
        JBbuscarXhuesped = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTreservasXhuesped = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JDCfechadebusqueda = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTreservasxF = new javax.swing.JTable();
        JBbuscarporF = new javax.swing.JButton();
        JBeliminarXhuesped = new javax.swing.JButton();
        JBnuevareserva = new javax.swing.JButton();
        JBeliminarXfecha = new javax.swing.JButton();
        JBnuevareserva2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestion de reservas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el ID del huesped ");

        JBbuscarXhuesped.setText("Buscar");
        JBbuscarXhuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarXhuespedActionPerformed(evt);
            }
        });

        JTreservasXhuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idHuesped", "nombre", "apellido", "celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTreservasXhuesped);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese la fecha ");

        JTreservasxF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idReserva", "idHabitacion", "idHuesped", "fechaInicio", "FechaFin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTreservasxF);

        JBbuscarporF.setText("buscar");
        JBbuscarporF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarporFActionPerformed(evt);
            }
        });

        JBeliminarXhuesped.setText("Eliminar reserva");
        JBeliminarXhuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarXhuespedActionPerformed(evt);
            }
        });

        JBnuevareserva.setText("Nueva reserva");
        JBnuevareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevareservaActionPerformed(evt);
            }
        });

        JBeliminarXfecha.setText("Eliminar reserva");
        JBeliminarXfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarXfechaActionPerformed(evt);
            }
        });

        JBnuevareserva2.setText("Nueva reserva");
        JBnuevareserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevareserva2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JDCfechadebusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(JBbuscarporF))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(JBeliminarXhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBnuevareserva, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTidhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBbuscarXhuesped)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(JBeliminarXfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(JBnuevareserva2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTidhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscarXhuesped))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBeliminarXhuesped)
                    .addComponent(JBnuevareserva))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JDCfechadebusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscarporF))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBeliminarXfecha)
                    .addComponent(JBnuevareserva2))
                .addGap(0, 80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbuscarXhuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarXhuespedActionPerformed
        // TODO add your handling code here:
     try {
           int id= Integer.parseInt(JTidhuesped.getText());
           Huesped huesped= hd1.buscarHuespedPorId(id);
            if (huesped != null) {
                obtenerHuespedesPorId(id);
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa reserva");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una fecha valida");
        }
    

    }//GEN-LAST:event_JBbuscarXhuespedActionPerformed

    private void JBnuevareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevareservaActionPerformed
        // TODO add your handling code here:
        MenuHuesped menuHuesped = new MenuHuesped(cd, hd, hd1, rd, menuPrincipal);
        menuHuesped.setVisible(true);
        menuPrincipal.getEscritorio().add(menuHuesped);
        menuPrincipal.getEscritorio().moveToFront(menuHuesped);
    }//GEN-LAST:event_JBnuevareservaActionPerformed

    private void JBeliminarXhuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarXhuespedActionPerformed
        
    }//GEN-LAST:event_JBeliminarXhuespedActionPerformed

    private void JBbuscarporFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarporFActionPerformed
        // TODO add your handling code here:
         try {
           LocalDate fecha = JDCfechadebusqueda.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            rd.busquedaDeReservaPorFecha(fecha);

            if (fecha != null) {
                obtenerReservasXFecha(fecha);
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa reserva");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una fecha valida");
        }

                                    
    }//GEN-LAST:event_JBbuscarporFActionPerformed

    private void JBeliminarXfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarXfechaActionPerformed
        // TODO add your handling code here:
         int selectedRow = JTreservasxF.getSelectedRow();

        if (selectedRow != -1) {
            int idReserva = (int) JTreservasxF.getValueAt(selectedRow, 0);
            int idHuesped = (int) JTreservasxF.getValueAt(selectedRow, 2);
            LocalDate fecha = JDCfechadebusqueda.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            rd.busquedaDeReservaPorFecha(fecha);
            Reserva reserva = rd.buscarReserva(idReserva);
            Huesped huesped = hd1.buscarHuespedPorId(idHuesped);
            
            rd.FinalReserva(huesped, reserva);
            JOptionPane.showMessageDialog(null, "Idreserva= " + idReserva + "\n Id huesped: " + idHuesped);

            obtenerReservasXFecha(fecha);
           
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una reserva para eliminar.");
        }
    }//GEN-LAST:event_JBeliminarXfechaActionPerformed

    private void JBnuevareserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevareserva2ActionPerformed
        // TODO add your handling code here:
        MenuHuesped menuHuesped = new MenuHuesped(cd, hd, hd1, rd, menuPrincipal);
        menuHuesped.setVisible(true);
        menuPrincipal.getEscritorio().add(menuHuesped);
        menuPrincipal.getEscritorio().moveToFront(menuHuesped);
    }//GEN-LAST:event_JBnuevareserva2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscarXhuesped;
    private javax.swing.JButton JBbuscarporF;
    private javax.swing.JButton JBeliminarXfecha;
    private javax.swing.JButton JBeliminarXhuesped;
    private javax.swing.JButton JBnuevareserva;
    private javax.swing.JButton JBnuevareserva2;
    private com.toedter.calendar.JDateChooser JDCfechadebusqueda;
    private javax.swing.JTextField JTidhuesped;
    private javax.swing.JTable JTreservasXhuesped;
    private javax.swing.JTable JTreservasxF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables


private void obtenerHuespedesPorId(int idHuesped){

DefaultTableModel model = (DefaultTableModel) JTreservasXhuesped.getModel();
        model.setRowCount(0);

 List<Huesped> huespedes= hd1.listarHuespedesPorid(idHuesped);

        
for(Huesped huesped: huespedes){


 model.addRow(new Object[]{
     huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getCelular()
  });
}



}

private void obtenerReservasXFecha(LocalDate fecha) {
        DefaultTableModel model = (DefaultTableModel) JTreservasxF.getModel();
        model.setRowCount(0);

        List<Reserva> reservas = rd.busquedaDeReservaPorFecha(fecha);

        for (Reserva reserva : reservas) {

            model.addRow(new Object[]{
                reserva.getIdReserva(), reserva.getHabitacion().getIdHabitacion(),
                reserva.getHuesped().getIdHuesped(), reserva.getFechaInicio(),
                reserva.getFechaFin(), reserva.getPrecioTotal(), reserva.getCantPersonas()
            });
        }
    }

 
}
