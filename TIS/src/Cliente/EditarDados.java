/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import ArtManager.Main;
import ArtManager.Menu;
import Login.Login;

/**
 *
 * @author professor
 */
public class EditarDados extends javax.swing.JFrame {
     

    /**
     * Creates new form Cadastrar
     */
    public EditarDados(String name) {
    	this.name = name;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        cadastrar1 = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        campo_nome = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        campo_senha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Digite os novos dados:");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(580, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        nome.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        nome.setText("Nome:");
        getContentPane().add(nome);
        nome.setBounds(190, 130, 70, 30);

        email.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        email.setText("Telefone:");
        getContentPane().add(email);
        email.setBounds(190, 190, 70, 30);

        senha.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        senha.setText("Email:");
        getContentPane().add(senha);
        senha.setBounds(190, 240, 70, 30);

        cadastrar1.setFont(new java.awt.Font("TlwgMono", 0, 15)); // NOI18N
        cadastrar1.setText("CANCELAR");
        cadastrar1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
        getContentPane().add(cadastrar1);
        cadastrar1.setBounds(400, 330, 130, 30);

        cadastrar.setFont(new java.awt.Font("TlwgMono", 0, 15)); // NOI18N
        cadastrar.setText("SALVAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           cadastrarActionPerformed(evt);
        }
    });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(240, 330, 130, 30);

//        campo_nome.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                campo_nomeActionPerformed(evt);
//            }
//        });
        getContentPane().add(campo_nome);
        campo_nome.setBounds(260, 130, 250, 30);
        getContentPane().add(campo_email);
        campo_email.setBounds(260, 190, 250, 30);
        getContentPane().add(campo_senha);
        campo_senha.setBounds(260, 240, 250, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Digite os novos dados:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 30, 360, 50);

        setSize(new java.awt.Dimension(743, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    private void campo_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nomeActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_campo_nomeActionPerformed

//    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
//
//                       try {
//            //Registra JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");
// 
//            //Abrindo a conexÃ£o: ATENÃ‡ÃƒO OS DOIS PARÃ‚METROS VAZIOS("") SÃƒO USUÃ�RIO E SENHA, RESPECTIVAMENTE.
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/estude_mais", 
//                    "root", "");
// 
//            
//            java.sql.Statement st = conn.createStatement();
//            st.executeUpdate("UPDATE aluno SET nome='"
//                    + this.campo_nome.getText() + "',email='"
//                    + this.campo_email.getText() + "',senha='" 
//                    + this.campo_senha.getText() + "' WHERE id='1' ");
// 
//            
//            JOptionPane.showMessageDialog(rootPane, "Dados Salvos!");
//            Login login = new Login ();
//            login.setVisible(true);
//            dispose();
//
//            
//        } catch (SQLException | ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(rootPane, e);
//        }//Fim try */
//
//    }//GEN-LAST:event_cadastrarActionPerformed

//    private void cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar1ActionPerformed
//            TelaInicial menu = new TelaInicial ();
//            menu.setVisible(true);
//            dispose();
//
//    }//GEN-LAST:event_cadastrar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
           // Cliente_CRUD c = new Cliente_CRUD();
            Cliente_CRUD.alterarCliente(name, campo_nome.getText(), campo_email.getText(), campo_senha.getText(), Main.arqClientes);
            dispose();
            Menu m=new Menu(Login.getNome());
            m.setVisible(true);
           JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dispose();
            Menu m=new Menu(Login.getNome());
            m.setVisible(true);
           JOptionPane.showMessageDialog(null, "Cliente não alterado.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(EditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarDados(name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cadastrar1;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_senha;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel senha;
    private static String name;
    // End of variables declaration//GEN-END:variables
}