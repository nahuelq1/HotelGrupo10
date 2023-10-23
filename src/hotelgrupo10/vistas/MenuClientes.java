package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Huesped;
import hotelgrupo10.entidades.Reserva;
import java.sql.Date;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuClientes extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private CategoriaData cd;
    private HabitacionData hd;
    private HuespedData hd1;
    private ReservaData rd;

    public MenuClientes(CategoriaData cd, HabitacionData hd, HuespedData hd1, ReservaData rd, MenuPrincipal menuPrincipal) {
        initComponents();
        this.cd = new CategoriaData();
        this.hd = new HabitacionData();
        this.hd1 = new HuespedData();
        this.rd = new ReservaData();
        this.menuPrincipal = menuPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTdni = new javax.swing.JTextField();
        JBbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTreservas = new javax.swing.JTable();
        JBeliminarReserva = new javax.swing.JButton();
        JBnuevareserva = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        Escritorio.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Menu clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese su DNI");

        JBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.jpg"))); // NOI18N
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        JTreservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id reserva", "Id habitacion", "Id huesped", "Fecha Inicio", "Fecha Fin", "Precio Total", "Cant personas"
            }
        ));
        JTreservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(JTreservas);
        JTreservas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        JBeliminarReserva.setText("Eliminar reserva");
        JBeliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarReservaActionPerformed(evt);
            }
        });

        JBnuevareserva.setText("Nueva reserva");
        JBnuevareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevareservaActionPerformed(evt);
            }
        });

        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(JTdni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(JBbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(JBeliminarReserva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(JBnuevareserva, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(JBeliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(JBnuevareserva, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBeliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBnuevareserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        try {
            int dni = Integer.parseInt(JTdni.getText());
            Huesped huesped = hd1.buscarHuesped(dni);

            if (huesped != null) {
                obtenerReservasXHuesped(huesped);
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese huésped");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un valor numérico válido para el DNI.");
        }

    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBnuevareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevareservaActionPerformed
        MenuHuesped menuHuesped = new MenuHuesped(cd, hd, hd1, rd, menuPrincipal);
        menuHuesped.setVisible(true);
        menuPrincipal.getEscritorio().add(menuHuesped);
        menuPrincipal.getEscritorio().moveToFront(menuHuesped);
    }//GEN-LAST:event_JBnuevareservaActionPerformed

    private void JBeliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarReservaActionPerformed
        int selectedRow = JTreservas.getSelectedRow();

        if (selectedRow != -1) {
            int idReserva = (int) JTreservas.getValueAt(selectedRow, 0);
            int idHuesped = (int) JTreservas.getValueAt(selectedRow, 2);
            Reserva reserva = rd.buscarReserva(idReserva);
            Huesped huesped = hd1.buscarHuespedPorId(idHuesped);
            
            rd.FinalReserva(huesped, reserva);
            JOptionPane.showMessageDialog(null, "Idreserva= " + idReserva + "\n Id huesped: " + idHuesped);

            
            obtenerReservasXHuesped(huesped);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una reserva para eliminar.");
        }
    }//GEN-LAST:event_JBeliminarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBeliminarReserva;
    private javax.swing.JButton JBnuevareserva;
    private javax.swing.JTextField JTdni;
    private javax.swing.JTable JTreservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void obtenerReservasXHuesped(Huesped huesped) {
        DefaultTableModel model = (DefaultTableModel) JTreservas.getModel();
        model.setRowCount(0);

        List<Reserva> reservas = rd.busquedaDeReservaPorHuesped(huesped);

        for (Reserva reserva : reservas) {

            model.addRow(new Object[]{
                reserva.getIdReserva(), reserva.getHabitacion().getIdHabitacion(),
                reserva.getHuesped().getIdHuesped(), reserva.getFechaInicio(),
                reserva.getFechaFin(), reserva.getPrecioTotal(), reserva.getCantPersonas()
            });
        }
    }
}
