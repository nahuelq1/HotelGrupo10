package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private CategoriaData cd;
    private HabitacionData hd;
    private HuespedData hd1;
    private ReservaData rd;

    public MenuPrincipal() {
        initComponents();
        this.cd = new CategoriaData();
        this.hd = new HabitacionData();
        this.hd1 = new HuespedData();
        this.rd = new ReservaData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JBMenuCLientes = new javax.swing.JButton();
        JBMenuAdmin = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("¡Bienvenido!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Seleccione el menu al que desea ingresar");

        JBMenuCLientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBMenuCLientes.setText("Menu Clientes");
        JBMenuCLientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuCLientesActionPerformed(evt);
            }
        });

        JBMenuAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBMenuAdmin.setText("Menu Administracion");
        JBMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuAdminActionPerformed(evt);
            }
        });

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JBMenuCLientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JBMenuAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(JBMenuCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(JBMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBMenuCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public JDesktopPane getEscritorio() {
        return escritorio;
    }
    private void JBMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuAdminActionPerformed
//        Escritorio.removeAll();
//        Escritorio.repaint();
        MenuAdministracion Menua = new MenuAdministracion();
        Menua.setVisible(true);
        escritorio.add(Menua);
        escritorio.moveToFront(Menua);
    }//GEN-LAST:event_JBMenuAdminActionPerformed

    private void JBMenuCLientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuCLientesActionPerformed
//        Escritorio.removeAll();
//        Escritorio.repaint();
        MenuClientes menuC = new MenuClientes(cd, hd, hd1, rd, this); // Crear una instancia de la ventana MenuClientes
        menuC.setVisible(true); // Mostrar la ventana MenuClientes
        escritorio.add(menuC);
        escritorio.moveToFront(menuC);

    }//GEN-LAST:event_JBMenuCLientesActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMenuAdmin;
    private javax.swing.JButton JBMenuCLientes;
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
