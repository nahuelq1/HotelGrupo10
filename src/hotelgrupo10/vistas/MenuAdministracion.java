package hotelgrupo10.vistas;

public class MenuAdministracion extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;

    public MenuAdministracion(MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escmenuadm = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        JBgestionHU = new javax.swing.JButton();
        JBgestionH = new javax.swing.JButton();
        JBgestionCat = new javax.swing.JButton();
        JBgestionReservas = new javax.swing.JButton();

        Escmenuadm.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu administracion");

        JBgestionHU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBgestionHU.setText("Gestion de huespedes");
        JBgestionHU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBgestionHUActionPerformed(evt);
            }
        });

        JBgestionH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBgestionH.setText("Gestion de habitaciones");
        JBgestionH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBgestionHActionPerformed(evt);
            }
        });

        JBgestionCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBgestionCat.setText("Gestion de categorias");
        JBgestionCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBgestionCatActionPerformed(evt);
            }
        });

        JBgestionReservas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBgestionReservas.setText("Gestion de reservas");
        JBgestionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBgestionReservasActionPerformed(evt);
            }
        });

        Escmenuadm.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escmenuadm.setLayer(JBgestionHU, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escmenuadm.setLayer(JBgestionH, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escmenuadm.setLayer(JBgestionCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escmenuadm.setLayer(JBgestionReservas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscmenuadmLayout = new javax.swing.GroupLayout(Escmenuadm);
        Escmenuadm.setLayout(EscmenuadmLayout);
        EscmenuadmLayout.setHorizontalGroup(
            EscmenuadmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscmenuadmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
            .addGroup(EscmenuadmLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(EscmenuadmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBgestionHU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBgestionCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(EscmenuadmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBgestionH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBgestionReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        EscmenuadmLayout.setVerticalGroup(
            EscmenuadmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscmenuadmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(EscmenuadmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBgestionHU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBgestionH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(EscmenuadmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBgestionReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBgestionCat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escmenuadm, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escmenuadm, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBgestionHUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBgestionHUActionPerformed
        // TODO add your handling code here:
        MenuGestionHuespedes Menug = new MenuGestionHuespedes();
        Menug.setVisible(true);
        menuPrincipal.getEscritorio().add(Menug);
        menuPrincipal.getEscritorio().moveToFront(Menug);

    }//GEN-LAST:event_JBgestionHUActionPerformed

    private void JBgestionHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBgestionHActionPerformed
        MenuGestionHabitaciones Menuh = new MenuGestionHabitaciones(menuPrincipal);
        Menuh.setVisible(true);
        menuPrincipal.getEscritorio().add(Menuh);
        menuPrincipal.getEscritorio().moveToFront(Menuh);
    }//GEN-LAST:event_JBgestionHActionPerformed

    private void JBgestionCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBgestionCatActionPerformed

        MenuGestionCategorias Menugc = new MenuGestionCategorias(menuPrincipal);
        Menugc.setVisible(true);
        menuPrincipal.getEscritorio().add(Menugc);
        menuPrincipal.getEscritorio().moveToFront(Menugc);
    }//GEN-LAST:event_JBgestionCatActionPerformed

    private void JBgestionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBgestionReservasActionPerformed
        // TODO add your handling code here:
        MenuGestionReservas Menugr = new MenuGestionReservas();
        Menugr.setVisible(true);
        menuPrincipal.getEscritorio().add(Menugr);
        menuPrincipal.getEscritorio().moveToFront(Menugr);
    }//GEN-LAST:event_JBgestionReservasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escmenuadm;
    private javax.swing.JButton JBgestionCat;
    private javax.swing.JButton JBgestionH;
    private javax.swing.JButton JBgestionHU;
    private javax.swing.JButton JBgestionReservas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
