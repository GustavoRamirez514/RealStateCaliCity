/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.C_Usuario;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import realestatecalicity.Principal;

/**
 *
 * @author wdg20
 */
public class V_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    Principal P;

    public V_Login(Principal P) {
        this.P = P;
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        L_Identificacion = new javax.swing.JTextField();
        L_Contraseña = new javax.swing.JPasswordField();
        L_BtnIngresar = new javax.swing.JButton();
        L_BtnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        L_TipoUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Identificación:");

        jLabel3.setText("Contraseña:");

        L_BtnIngresar.setText("Ingresar");
        L_BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_BtnIngresarActionPerformed(evt);
            }
        });

        L_BtnRegistrar.setText("Resgitrarse");
        L_BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_BtnRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo: ");

        L_TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Agente", "Administrador" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_Identificacion)
                            .addComponent(L_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(L_TipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_BtnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_BtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(L_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(L_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(L_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(L_BtnIngresar)
                .addGap(8, 8, 8)
                .addComponent(L_BtnRegistrar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void L_BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_BtnIngresarActionPerformed
        // AL PRESIONAR EL INGRESAR DE INICIO DE SECCION 
        if (L_Identificacion.getText().isEmpty() || L_Contraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");

        } else {
            C_Usuario ConUs = new C_Usuario();
            ConUs.setIu_login(this); //SE LE ASIGNA AL CONTROLADOR SOBRE QUIEN LO ESCUCHA
            ConUs.IniciarSesion(); //Y LUEGO SE LLAMA EL METODO INISIAR SECCION DONDE CAPTURA LOS DATOS.
        }
    }//GEN-LAST:event_L_BtnIngresarActionPerformed

    private void L_BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_BtnRegistrarActionPerformed
        //CODIGO PARA SELECCIONAR EL BOTON REGISTRARSE E INICIAR CON EL FORMULARIO
        V_Registro re = new V_Registro();
        re.setVisible(true);
        re.setLocationRelativeTo(this);


    }//GEN-LAST:event_L_BtnRegistrarActionPerformed

    public String getIdentificacion() {
        return L_Identificacion.getText();
    }

    public void setIdentificacion(String i) {
        L_Identificacion.setText(i);
    }

    public String getContraseña() {
        return L_Contraseña.getText();
    }

    public void setContraseaña(String c) {
        L_Contraseña.setText(c);
    }
    
    
   public String getTipoUsuario() {
        return L_TipoUsuario.getSelectedItem().toString();
    }

    public void HabilitarMenu(String Nombre) {
        P.HabilitarMenu(Nombre);
    }

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
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton L_BtnIngresar;
    private javax.swing.JButton L_BtnRegistrar;
    private javax.swing.JPasswordField L_Contraseña;
    private javax.swing.JTextField L_Identificacion;
    private javax.swing.JComboBox<String> L_TipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}