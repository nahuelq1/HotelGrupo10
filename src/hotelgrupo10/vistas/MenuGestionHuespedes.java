/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.entidades.Huesped;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nahue
 */
public class MenuGestionHuespedes extends javax.swing.JInternalFrame {
private HuespedData hd;
    /**
     * Creates new form MenuGestionHuespedes
     */
    public MenuGestionHuespedes() {
        initComponents();
        this.hd=new HuespedData();
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
        JTFingresoDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTtablahuespedes = new javax.swing.JTable();
        JBbuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(648, 472));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestion huespedes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Ingrese el DNI");

        JTFingresoDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFingresoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFingresoDNIActionPerformed(evt);
            }
        });

        JTtablahuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdHuesped", "Nombre", "Apellido", "celular", "correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTtablahuespedes.setMinimumSize(new java.awt.Dimension(105, 64));
        jScrollPane1.setViewportView(JTtablahuespedes);

        JBbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título.jpg"))); // NOI18N
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(JTFingresoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFingresoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(JBbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed

        try{
            int dni= Integer.parseInt(JTFingresoDNI.getText());
            Huesped huesped=hd.buscarHuesped(dni);
            if(huesped!=null){
                obtenerHuespedesPorDni(dni);

            }else{

                JOptionPane.showMessageDialog(null, "no existe ese huesped");

            }
        }catch(NumberFormatException nfe){

            JOptionPane.showMessageDialog(null, "ingrese un dni valido");

        }

    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JTFingresoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFingresoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFingresoDNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JTextField JTFingresoDNI;
    private javax.swing.JTable JTtablahuespedes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


private void obtenerHuespedesPorDni(int dni){

DefaultTableModel model = (DefaultTableModel) JTtablahuespedes.getModel();
        model.setRowCount(0);

List<Huesped> huespedes= hd.listarHuespedesPorDni(dni);

for(Huesped huesped: huespedes){

 model.addRow(new Object[]{

     huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getCelular(), huesped.getCorreo()

 });

}



}

}
