 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.JOptionPane;
/**
 *
 * @author Nel
 */
public class Promedio extends javax.swing.JFrame {

    /**
     * Creates new form promedio
     */
    public Promedio() {
        initComponents();
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

        txt_n1 = new javax.swing.JTextField();
        txt_promedio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_n2 = new javax.swing.JTextField();
        txt_n3 = new javax.swing.JTextField();
        txt_n4 = new javax.swing.JTextField();
        txt_n5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_promedio1 = new javax.swing.JTextField();
        txt_rendimiento = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        txt_n1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        txt_promedio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setText("regresar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 590, 110, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calcula tu Promedio ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 70, 250, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nota1:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 220, 73, 28);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nota2:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 300, 80, 28);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nota3:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 380, 73, 28);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nota4:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 450, 87, 28);

        txt_n2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n2ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n2);
        txt_n2.setBounds(190, 220, 71, 29);

        txt_n3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n3ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n3);
        txt_n3.setBounds(190, 300, 71, 33);

        txt_n4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(txt_n4);
        txt_n4.setBounds(190, 380, 71, 29);

        txt_n5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(txt_n5);
        txt_n5.setBounds(190, 450, 71, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tu Promedio Es:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 230, 222, 28);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tu Rendimiento Es: ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 310, 233, 28);

        txt_promedio1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(txt_promedio1);
        txt_promedio1.setBounds(590, 220, 150, 32);

        txt_rendimiento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(txt_rendimiento);
        txt_rendimiento.setBounds(590, 310, 150, 32);

        btn_calcular.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_calcular.setText("CALCULAR ");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calcular);
        btn_calcular.setBounds(860, 240, 169, 34);

        btn_nuevo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_nuevo.setText("NUEVO ");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo);
        btn_nuevo.setBounds(860, 370, 170, 34);

        btn_salir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_salir.setText("SALIR ");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir);
        btn_salir.setBounds(860, 490, 170, 34);

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/certus2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 0);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("y Rendimiento ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(760, 80, 180, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
 // declaramos las variables 
        int n2,n3,n4,n5;
        double promedio1;
        String rendimiento;
        n2 = Integer.parseInt(txt_n2.getText());
        n3 = Integer.parseInt(txt_n3.getText());
        n4 = Integer.parseInt(txt_n4.getText());
        n5 = Integer.parseInt(txt_n5.getText());
       
        if ((n2>=0 &&  n2<=20) && (n3>=0 &&  n3<=20)&&(n4>=0 &&  n4<=20)&&(n5>=0 &&  n5<=20)  ){
            promedio1 = (n2+n3+n4+n5)/4;
            if (promedio1<=10){
                rendimiento  = "MUY BAJO ";
            
            }else if (promedio1 > 10 && promedio1 <=13){
                rendimiento  ="INTERMEDIO";
            }else if (promedio1 > 13 && promedio1 <=17){
                rendimiento  ="BUENO ";
            }else {
                rendimiento ="EXCELENTE ";
            }
        //mostrar los datos 
            txt_promedio1.setText(String.valueOf(promedio1));
            txt_rendimiento.setText(String.valueOf(rendimiento));
       
        }else{
        
            JOptionPane.showMessageDialog(null,"INTENTE OTRA VEZ");
           txt_n2.setText("");
           txt_n3.setText("");
           txt_n4.setText("");
           txt_n5.setText("");
        }
           
     
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        txt_n2.setText("");
        txt_n3.setText("");
        txt_n4.setText("");
        txt_n5.setText("");
        txt_promedio1.setText("");
        txt_rendimiento.setText("");
        txt_n2.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n2ActionPerformed
        
           
    }//GEN-LAST:event_txt_n2ActionPerformed

    private void txt_n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_n3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //menu menu =new menu();
    //menu.setVisible(true); 
    dispose();



// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_n2;
    private javax.swing.JTextField txt_n3;
    private javax.swing.JTextField txt_n4;
    private javax.swing.JTextField txt_n5;
    private javax.swing.JTextField txt_promedio;
    private javax.swing.JTextField txt_promedio1;
    private javax.swing.JTextField txt_rendimiento;
    // End of variables declaration//GEN-END:variables
}
