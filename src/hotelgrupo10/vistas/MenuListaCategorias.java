/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.entidades.Categoria;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nahue
 */
public class MenuListaCategorias extends javax.swing.JInternalFrame {
private CategoriaData cd;
    /**
     * Creates new form MenuListaCategorias
     */
    public MenuListaCategorias() {
        initComponents();
        this.cd=new CategoriaData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        EsclistaCat = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTlistaCat = new javax.swing.JTable();
        JRBnro1 = new javax.swing.JRadioButton();
        JRBnro2 = new javax.swing.JRadioButton();
        JRBnro3 = new javax.swing.JRadioButton();
        JRBnro4 = new javax.swing.JRadioButton();
        JRBnro5 = new javax.swing.JRadioButton();
        JRBnro6 = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        EsclistaCat.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Lista de categorias");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione la cantidad de personas para ver las categorias");

        JTlistaCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idCategoria", "tipoCamas", "tipoHabitacion", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTlistaCat);

        JRBnro1.setBackground(new java.awt.Color(204, 204, 204));
        JRBnro1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRBnro1.setText("1");
        JRBnro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnro1ActionPerformed(evt);
            }
        });

        JRBnro2.setBackground(new java.awt.Color(204, 204, 204));
        JRBnro2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRBnro2.setText("2");
        JRBnro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnro2ActionPerformed(evt);
            }
        });

        JRBnro3.setBackground(new java.awt.Color(204, 204, 204));
        JRBnro3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRBnro3.setText("3");
        JRBnro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnro3ActionPerformed(evt);
            }
        });

        JRBnro4.setBackground(new java.awt.Color(204, 204, 204));
        JRBnro4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRBnro4.setText("4");
        JRBnro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnro4ActionPerformed(evt);
            }
        });

        JRBnro5.setBackground(new java.awt.Color(204, 204, 204));
        JRBnro5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRBnro5.setText("5");
        JRBnro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnro5ActionPerformed(evt);
            }
        });

        JRBnro6.setBackground(new java.awt.Color(204, 204, 204));
        JRBnro6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRBnro6.setText("6");
        JRBnro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnro6ActionPerformed(evt);
            }
        });

        EsclistaCat.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(JRBnro1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(JRBnro2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(JRBnro3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(JRBnro4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(JRBnro5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EsclistaCat.setLayer(JRBnro6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EsclistaCatLayout = new javax.swing.GroupLayout(EsclistaCat);
        EsclistaCat.setLayout(EsclistaCatLayout);
        EsclistaCatLayout.setHorizontalGroup(
            EsclistaCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EsclistaCatLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(EsclistaCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(EsclistaCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(EsclistaCatLayout.createSequentialGroup()
                            .addComponent(JRBnro1)
                            .addGap(43, 43, 43)
                            .addComponent(JRBnro2)
                            .addGap(43, 43, 43)
                            .addComponent(JRBnro3)
                            .addGap(43, 43, 43)
                            .addComponent(JRBnro4)
                            .addGap(43, 43, 43)
                            .addComponent(JRBnro5)
                            .addGap(40, 40, 40)
                            .addComponent(JRBnro6))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EsclistaCatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        EsclistaCatLayout.setVerticalGroup(
            EsclistaCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EsclistaCatLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(EsclistaCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBnro1)
                    .addComponent(JRBnro2)
                    .addComponent(JRBnro3)
                    .addComponent(JRBnro4)
                    .addComponent(JRBnro5)
                    .addComponent(JRBnro6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EsclistaCat, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EsclistaCat)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRBnro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnro1ActionPerformed
        // TODO add your handling code here:
        botones.add(JRBnro1);
        botones.add(JRBnro2);
        botones.add(JRBnro3);
        botones.add(JRBnro4);
        botones.add(JRBnro5);
        botones.add(JRBnro6);
        
        int cantpersonas=1;
        if(JRBnro1.isSelected()){
        
            categoriasDisponibles(cantpersonas);
        
        }
    }//GEN-LAST:event_JRBnro1ActionPerformed

    private void JRBnro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnro2ActionPerformed
        // TODO add your handling code here:
        botones.add(JRBnro1);
        botones.add(JRBnro2);
        botones.add(JRBnro3);
        botones.add(JRBnro4);
        botones.add(JRBnro5);
        botones.add(JRBnro6);
        int cantpersonas=2;
        if(JRBnro2.isSelected()){
        
            categoriasDisponibles(cantpersonas);
        
        }
    }//GEN-LAST:event_JRBnro2ActionPerformed

    private void JRBnro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnro3ActionPerformed
        // TODO add your handling code here:
        botones.add(JRBnro1);
        botones.add(JRBnro2);
        botones.add(JRBnro3);
        botones.add(JRBnro4);
        botones.add(JRBnro5);
        botones.add(JRBnro6);
        int cantpersonas=3;
        if(JRBnro3.isSelected()){
        
            categoriasDisponibles(cantpersonas);
        
        }
    }//GEN-LAST:event_JRBnro3ActionPerformed

    private void JRBnro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnro4ActionPerformed
        // TODO add your handling code here:
        botones.add(JRBnro1);
        botones.add(JRBnro2);
        botones.add(JRBnro3);
        botones.add(JRBnro4);
        botones.add(JRBnro5);
        botones.add(JRBnro6);
        int cantpersonas=4;
        if(JRBnro4.isSelected()){
        
            categoriasDisponibles(cantpersonas);
        
        }
    }//GEN-LAST:event_JRBnro4ActionPerformed

    private void JRBnro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnro5ActionPerformed
        // TODO add your handling code here:
        
        botones.add(JRBnro1);
        botones.add(JRBnro2);
        botones.add(JRBnro3);
        botones.add(JRBnro4);
        botones.add(JRBnro5);
        botones.add(JRBnro6);
        int cantpersonas=5;
        if(JRBnro5.isSelected()){
        
            categoriasDisponibles(cantpersonas);
        
        }
    }//GEN-LAST:event_JRBnro5ActionPerformed

    private void JRBnro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnro6ActionPerformed
        // TODO add your handling code here:
        
        botones.add(JRBnro1);
        botones.add(JRBnro2);
        botones.add(JRBnro3);
        botones.add(JRBnro4);
        botones.add(JRBnro5);
        botones.add(JRBnro6);
        int cantpersonas=6;
        if(JRBnro6.isSelected()){
        
            categoriasDisponibles(cantpersonas);
        
        }
    }//GEN-LAST:event_JRBnro6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EsclistaCat;
    private javax.swing.JRadioButton JRBnro1;
    private javax.swing.JRadioButton JRBnro2;
    private javax.swing.JRadioButton JRBnro3;
    private javax.swing.JRadioButton JRBnro4;
    private javax.swing.JRadioButton JRBnro5;
    private javax.swing.JRadioButton JRBnro6;
    private javax.swing.JTable JTlistaCat;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


private void categoriasDisponibles(int cantPersonas){

DefaultTableModel model = (DefaultTableModel) JTlistaCat.getModel();
model.setRowCount(0);


List<Categoria> cantidadPersonas=cd.listarCategoriasDisponiblesPorCantidadPersonas(cantPersonas);

for(Categoria categoria: cantidadPersonas){

 model.addRow(new Object[]{
categoria.getIdCategoria(),categoria.getTipoCamas(),categoria.getTipoHabitacion(),categoria.getPrecio()

 });
}



}





}
