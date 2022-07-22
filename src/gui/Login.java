/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Person;
import implement.ImplPerson;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB REDES
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel_titulo = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jPasswordField_pswd = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_titulo.setText("SISTEMA DE VENTAS PARA LA TIENDA DE VENTAS DE ZAPATILLAS");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel_usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_usuario.setText("Usuario:");
        getContentPane().add(jLabel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_password.setText("Contraseña");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jTextField_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 162, 39));
        getContentPane().add(jPasswordField_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 162, 41));

        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_login.setText("Ingresar");
        jButton_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 131, 35));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        
        
        if(jTextField_usuario.getText().equals("")||
           jPasswordField_pswd.getText().equals("")){
           
            JOptionPane.showMessageDialog(null, "Ingrese el usuario y/o contraseña");
        }else{
        
            ImplPerson ip= new ImplPerson();
            Person p= new Person();
            p.setPerson_usuario(jTextField_usuario.getText());
            p.setPerson_password(jPasswordField_pswd.getText());

            System.out.print("-----"+ip.validateLogin(p));
            if(ip.validateLogin(p)!=null){
            
                
                Login lg= new Login();                
                dispose();
                
                
                Menu menu = new Menu();
                menu.setVisible(true);
                
                
                
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese el usuario y/o contraseña VALIDO");
                jTextField_usuario.setText("");
                jPasswordField_pswd.setText("");
            }
        }
        
                
        
        
        
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jTextField_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_usuarioKeyTyped

  
        
    }//GEN-LAST:event_jTextField_usuarioKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPasswordField jPasswordField_pswd;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
