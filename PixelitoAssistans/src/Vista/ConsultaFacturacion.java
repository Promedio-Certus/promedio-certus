/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import pack_clase.Pagos;
import javax.swing.JOptionPane;






/**
 *
 * @author Nel
 */
public class ConsultaFacturacion extends javax.swing.JFrame {

    /**
     * Creates new form pagos
     */
    public ConsultaFacturacion() {
        // colocamos  los iten "carreras  tecnologicas "
        initComponents();
        //llena el combo de producto 
        cboCarreras.addItem("ADMINISTRACION DE EMPRESAS");
        cboCarreras.addItem("ADMINISTRACION DE NEGOCIOS INTERNACIONALES");
        cboCarreras.addItem("ADMINISTRACION DE GESTION COMERCIAL");
        cboCarreras.addItem("MARKETING");
        cboCarreras.addItem("ADMINISTRACION DE NEGOCIOS FINANCIEROS Y BANCARIOS");
        cboCarreras.addItem("CONTABILIDAD");
        cboCarreras.addItem("DISEÑO Y DESARROLLO DE SOFTWARE");
        cboCarreras.addItem("ADMINISTRACION DE SISTEMAS");
        cboCarreras.addItem("DISEÑO GRAFICO ");
        cboCarreras.addItem("PUBLICIDAD");
        
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtApe_Nom = new javax.swing.JTextField();
        cboCarreras = new javax.swing.JComboBox<>();
        txtMeses_pagos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        tbnSalir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Boleta  de Pago");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 70, 215, 29);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 180, 110, 28);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos y Nombres: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 230, 210, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carreras :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 290, 120, 28);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Meses a Pagar:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 350, 180, 28);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(240, 180, 217, 22);
        jPanel1.add(txtApe_Nom);
        txtApe_Nom.setBounds(240, 230, 386, 22);

        jPanel1.add(cboCarreras);
        cboCarreras.setBounds(240, 290, 386, 22);
        jPanel1.add(txtMeses_pagos);
        txtMeses_pagos.setBounds(240, 350, 380, 22);

        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(770, 160, 360, 260);

        btnAceptar.setText("ACEPTAR ");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(320, 520, 130, 22);

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);
        btnNuevo.setBounds(670, 520, 100, 30);

        tbnSalir.setText("REGRESAR AL MENÚ");
        tbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(tbnSalir);
        tbnSalir.setBounds(900, 520, 190, 22);

        jButton4.setText("PROCEDIMIENTO DE PAGOS ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(860, 40, 183, 51);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/certus2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1162, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSalirActionPerformed
        menu menu= new menu();
    menu.setVisible(true);
    dispose();

// CODIGO PARA CERRAR SESION 
        /*int ok =JOptionPane.showConfirmDialog(null,"¿Deseas cerrarla ventana ?");
        if (JOptionPane.OK_OPTION==ok)
            System.exit(0);*/
    }//GEN-LAST:event_tbnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Pagos obj= new Pagos();
       
        //leer los atributos de la clase venta 
        obj.codigo=Integer.parseInt(txtCodigo.getText());
        obj.ape_nom=txtApe_Nom.getText();
        obj.carreras=cboCarreras.getSelectedItem().toString();
        obj.meses_pagos=Integer.parseInt(txtMeses_pagos.getText());
        //escribir los atributos yoperaciones  de la venta 
        txtMostrar.setText("Boleta de venta \n"
                        +"*****************\n");
        txtMostrar.append("Numerode venta: "+obj.codigo+"\n" +
                "ALUMNO: "+obj.ape_nom+"\n"+
                "CARRERAS: "+obj.carreras+"\n"+
                "MESES A PAGAR: "+obj.meses_pagos+"\n"+
                "Importe A  PAGAR "+obj.ImporteCompra());
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText("");
        txtApe_Nom.setText("");
        cboCarreras.setSelectedIndex(0);
        txtMeses_pagos.setText("");
        txtMostrar.setText("");
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    instructivo instructivo =new instructivo();
    instructivo.setVisible(true); 
    dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ConsultaFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFacturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboCarreras;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tbnSalir;
    private javax.swing.JTextField txtApe_Nom;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMeses_pagos;
    private javax.swing.JTextArea txtMostrar;
    // End of variables declaration//GEN-END:variables

  
    }
