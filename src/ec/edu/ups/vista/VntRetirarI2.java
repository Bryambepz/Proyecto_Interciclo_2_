/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorAutomovilP;
import ec.edu.ups.controlador.ControladorTicketP;
import ec.edu.ups.controlador.ControladorUsuarioP;
import ec.edu.ups.modelo.AutomovilP;
import ec.edu.ups.modelo.TicketP;
import ec.edu.ups.modelo.Usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class VntRetirarI2 extends javax.swing.JInternalFrame {

    private ControladorUsuarioP ctrlUsuario;
    private ControladorTicketP ctrlTicket;
    private ControladorAutomovilP ctrlAuto;
    private VntPrincipalI2 vntPrincipal;
    private LocalDateTime horaSalida;
    private Date FechaSalida;

    /**
     * Creates new form VntRetirar
     *
     * @param ctrlUsuario
     * @param vntPrincipal
     * @param ctrlTicket
     */
    public VntRetirarI2(ControladorUsuarioP ctrlUsuario, ControladorAutomovilP ctrlAuto, VntPrincipalI2 vntPrincipal, ControladorTicketP ctrlTicket) {
        initComponents();
        this.ctrlUsuario = ctrlUsuario;
        this.ctrlTicket = ctrlTicket;
        this.ctrlAuto = ctrlAuto;
        this.vntPrincipal = vntPrincipal;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtTipoC = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        txtFechaI = new javax.swing.JTextField();
        txtFechaSalida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bntFactura = new javax.swing.JButton();

        jLabel7.setText("Numero estacionamiento");

        setTitle("Retirar");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imgs/klipartz.com.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Ingrese Id");

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        txtCedula.setEditable(false);

        txtNombre.setEditable(false);

        txtApellido.setEditable(false);

        jLabel2.setText("Cedula");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        txtTelefono.setEditable(false);

        txtNumero.setEditable(false);

        txtPlaca.setEditable(false);

        txtModelo.setEditable(false);

        txtColor.setEditable(false);

        txtTipoC.setEditable(false);

        txtTotalPagar.setEditable(false);

        txtFechaI.setEditable(false);

        txtFechaSalida.setEditable(false);

        jLabel5.setText("Telefono");

        jLabel6.setText("Numero estacionamiento");

        jLabel8.setText("Placa");

        jLabel9.setText("Modelo");

        jLabel10.setText("Color");

        jLabel11.setText("Tipo de Contrato");

        jLabel12.setText("Fecha de Ingreso");

        jLabel13.setText("Fecha de salida");

        jLabel14.setText("Total a Pagar");

        bntFactura.setText("Generar Factura");
        bntFactura.setEnabled(false);
        bntFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca)
                            .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaSalida, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(bntFactura)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bntFactura)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Ingrese dato");
        } else {
            var ticket = ctrlUsuario.obtenerSesion().buscar(Integer.valueOf(txtId.getText()));

            if (ticket != null) {
                var datosUsuarioT = ticket.getTicket();
                txtCedula.setText(datosUsuarioT.getCedula());
                txtNombre.setText(datosUsuarioT.getNombre());
                txtApellido.setText(datosUsuarioT.getApellido());
                txtTelefono.setText(datosUsuarioT.getTelefono());
                txtNumero.setText(String.valueOf(datosUsuarioT.getLugar()));
                txtPlaca.setText(ticket.getPlaca());
                txtModelo.setText(ticket.getModelo());
                txtColor.setText(ticket.getColor());

                horaSalida = LocalDateTime.now();
                FechaSalida = java.sql.Timestamp.valueOf(horaSalida);
                txtFechaSalida.setText(horaSalida.toString());

                txtFechaI.setText(ticket.getTicket().getFechaIngreso().toString());
                txtTipoC.setText(datosUsuarioT.getTipoContrato());
                txtTotalPagar.setText(String.valueOf(ctrlTicket.total(txtTipoC.getText(), ticket.getTicket().getFechaIngreso(), horaSalida)));
                bntFactura.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese id valido");
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void bntFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFacturaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Imprimiendo Factura");
        int id = Integer.valueOf(txtId.getText());
        int lugar = Integer.valueOf(txtNumero.getText());
        String fechS = txtFechaSalida.getText();
        //String fechaI = txtFechaI.getText();
//        DateTimeFormatter salida = DateTimeFormatter.ofPattern("aaaa-MM-dd HH:mm");
        //LocalDateTime fI = LocalDateTime.parse(fechaI);
        LocalDateTime fS = LocalDateTime.parse(fechS);
        String con = txtTipoC.getText();
//        var ticketb = ctrlUsuario.obtenerSesion().buscar(Integer.valueOf(txtId.getText()));
        
        //var ticket = new Ticket(id, lugar, fI, fS, con);
        //var nAuto = new Automovil(txtPlaca.getText(), txtModelo.getText(), txtColor.getText(), ticket);
        var us = ctrlUsuario.obtenerSesion();
        var auto = ctrlUsuario.obtenerSesion().buscar(id);
        var ticket = ctrlUsuario.obtenerSesion().buscar(Integer.valueOf(txtId.getText())).getTicket();
        ticket.setFechaSalida(fS);
        ticket.setCorreo(us.getCorreo());
        ticket.setCotrasenia(us.getCotrasenia());
        ticket.setFinalizadoC(true);
        //ctrlUsuario.update(us);
        ctrlTicket.update(ticket);
        //ctrlAuto.update(auto);
        //ctrlAuto.actualizar(Integer.valueOf(txtId.getText()), nAuto);
        System.out.println("*-*-* > " + ctrlTicket.update(ticket));
        this.dispose();
    }//GEN-LAST:event_bntFacturaActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        txtId.setText("");
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtNumero.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtFechaI.setText("");
        txtFechaSalida.setText("");
        txtTotalPagar.setText("");
        txtTipoC.setText("");
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntFactura;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtFechaI;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoC;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
