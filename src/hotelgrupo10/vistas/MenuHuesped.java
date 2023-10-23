package hotelgrupo10.vistas;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Huesped;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MenuHuesped extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private CategoriaData cd;
    private HabitacionData hd;
    private HuespedData hd1;
    private ReservaData rd;

    public MenuHuesped(CategoriaData cd, HabitacionData hd, HuespedData hd1, ReservaData rd, MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        this.hd1 = new HuespedData();
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
        JTNombre = new javax.swing.JTextField();
        JTApellido = new javax.swing.JTextField();
        JTDocumento = new javax.swing.JTextField();
        JTCorreo = new javax.swing.JTextField();
        JTCelular = new javax.swing.JTextField();
        JBMenuCsiguiente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JTdomicilio = new javax.swing.JTextField();
        JBclienteEx = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu Huesped");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese sus datos personales");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Documento");

        jLabel6.setText("Correo");

        jLabel7.setText("Celular");

        JBMenuCsiguiente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBMenuCsiguiente.setText("Siguiente");
        JBMenuCsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuCsiguienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Domicilio");

        JBclienteEx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBclienteEx.setText("Cliente existente");
        JBclienteEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBclienteExActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(22, 22, 22)
                            .addComponent(JTCelular))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(JTNombre))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBclienteEx, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTDocumento)
                            .addComponent(JTCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(JTdomicilio)))
                    .addComponent(JBMenuCsiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(JTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBMenuCsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBclienteEx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBMenuCsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuCsiguienteActionPerformed
        // TODO add your handling code here:

        try {
            String nombre = JTNombre.getText();
            String apellido = JTApellido.getText();
            int celular = Integer.parseInt(JTCelular.getText());
            String correo = JTCorreo.getText();
            int documento = Integer.parseInt(JTDocumento.getText());
            String domicilio = JTdomicilio.getText();
            if (!validarDatosSinNumeros(nombre) || !validarDatosSinNumeros(apellido)) {
              JOptionPane.showMessageDialog(null, "error al ingresar el nombre o el apellido del huesped");
              return;
            }else{
            Huesped huesped = new Huesped(nombre, apellido, documento, domicilio, correo, celular);
            hd1.agregarHuesped(huesped);

            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error al guadar Huesped, verifique los datos y vuelva intentelo más tarde.");
        }


    }//GEN-LAST:event_JBMenuCsiguienteActionPerformed

    private void JBclienteExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBclienteExActionPerformed
        // TODO add your handling code here:
        MenuReserva menuReserva = new MenuReserva(cd, hd, hd1, rd, menuPrincipal);
        this.dispose();
        menuReserva.setVisible(true);
        menuPrincipal.getEscritorio().add(menuReserva);
        menuPrincipal.getEscritorio().moveToFront(menuReserva);
    }//GEN-LAST:event_JBclienteExActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMenuCsiguiente;
    private javax.swing.JButton JBclienteEx;
    private javax.swing.JTextField JTApellido;
    private javax.swing.JTextField JTCelular;
    private javax.swing.JTextField JTCorreo;
    private javax.swing.JTextField JTDocumento;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextField JTdomicilio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables



private boolean validarDatosSinNumeros(String cadena) {
        return !Pattern.compile("[0-9]").matcher(cadena).find();
    }






}
