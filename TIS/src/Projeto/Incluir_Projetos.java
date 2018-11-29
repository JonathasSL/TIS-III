/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import ArtManager.Main;
import Artista.Artista;
import Cliente.Cliente;
import Cliente.Cliente_CRUD;
import Produto.Produto;

/**
 *
 * @author Projetos ES
 */
public class Incluir_Projetos extends javax.swing.JFrame {
	
	ArrayList<Artista> aIncluidos;
	ArrayList<Produto> pIncluidos;

    /**
     * Creates new form Incluir_Fornecedores
     */
    public Incluir_Projetos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelObjetivo = new javax.swing.JLabel();
        jTextFieldObjetivo = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldLocal = new javax.swing.JTextField();
        jLabelLocal = new javax.swing.JLabel();
        jLabelJustificativa = new javax.swing.JLabel();
        jTextFieldJustificativa = new javax.swing.JTextField();
        jLabelDemocratizacao = new javax.swing.JLabel();
        jLabelAcessibilidade = new javax.swing.JLabel();
        jLabelPublicoEstimado = new javax.swing.JLabel();
        jLabelOrcamento = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jTextFieldDemocratizacao = new javax.swing.JTextField();
        jTextFieldAcessibilidade = new javax.swing.JTextField();
        jTextFieldPublicoEstimado = new javax.swing.JTextField();
        jTextFieldOrcamento = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jLabelArtista = new javax.swing.JLabel();
        jButtonCadastrarArtistas = new javax.swing.JButton();
        jLabelProdutos = new javax.swing.JLabel();
        jButtonCadastrarProdutos = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Projetos");

        jLabelNome.setText("Nome:");

        jTextFieldNome.setText("Nome");

        jLabelDescricao.setText("Descricao:");

        jTextFieldDescricao.setText("Descricao");
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jLabelObjetivo.setText("Objetivo:");

        jTextFieldObjetivo.setText("Objetivo");

        jButtonCadastrar.setText("Incluir ");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldLocal.setText("Local");

        jLabelLocal.setText("Local:");

        jLabelJustificativa.setText("Justificativa:");

        jTextFieldJustificativa.setText("Justificativa");

        jLabelDemocratizacao.setText("Democratizacao:");

        jLabelAcessibilidade.setText("Acessibilidade:");

        jLabelPublicoEstimado.setText("Publico Estimado:");

        jLabelOrcamento.setText("Orcamento:");

        jLabelStatus.setText("Status:");

        jTextFieldDemocratizacao.setText("Democratizacao");

        jTextFieldAcessibilidade.setText("Acessibilidade");

        jTextFieldPublicoEstimado.setText("Publico Estimado");

        jTextFieldOrcamento.setText("Orcamento");
        jTextFieldOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOrcamentoActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelCliente.setText("Cliente:");

        jLabelArtista.setText("Artistas:");

        jButtonCadastrarArtistas.setText("Cadastrar");
        jButtonCadastrarArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarArtistasActionPerformed(evt);
            }
        });

        jLabelProdutos.setText("Produtos:");

        jButtonCadastrarProdutos.setText("Cadastrar");

        DefaultComboBoxModel dlm = new DefaultComboBoxModel();
		try {
	        Cliente[] c = Cliente_CRUD.listarClientes(Main.arqClientes);
	        for(int i=0; i<c.length ;i++)
	        dlm.addElement(c[i].getNome());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel listar os clientes");
		}
        jComboBoxCliente.setModel(dlm);

        dlm = new DefaultComboBoxModel();
        Status[] s = Status.values();
        for(int i=0; i<s.length ;i++)
        dlm.addElement(s[i].name());
        jComboBox2.setModel(dlm);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addComponent(jButtonVoltar)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jButtonCadastrar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLocal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelObjetivo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelJustificativa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDemocratizacao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAcessibilidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPublicoEstimado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelOrcamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelArtista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelProdutos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldDescricao)
                    .addComponent(jTextFieldObjetivo)
                    .addComponent(jTextFieldLocal)
                    .addComponent(jTextFieldJustificativa)
                    .addComponent(jTextFieldDemocratizacao)
                    .addComponent(jTextFieldAcessibilidade)
                    .addComponent(jTextFieldPublicoEstimado, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jTextFieldOrcamento)
                    .addComponent(jButtonCadastrarArtistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCliente)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelObjetivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJustificativa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDemocratizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDemocratizacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAcessibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAcessibilidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPublicoEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPublicoEstimado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOrcamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArtista)
                    .addComponent(jButtonCadastrarArtistas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProdutos)
                    .addComponent(jButtonCadastrarProdutos))
                .addGap(34, 34, 34)
                .addComponent(jButtonCadastrar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        	
        } catch (Exception ex) {
//            Logger.getLogger(Incluir_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jTextFieldOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOrcamentoActionPerformed

    private void jButtonCadastrarArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarArtistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarArtistasActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
    	Menu_Projetos m = new Menu_Projetos();
    	m.setVisible(true);
    	dispose();
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
            java.util.logging.Logger.getLogger(Incluir_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incluir_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incluir_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incluir_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incluir_Projetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonCadastrarArtistas;
    private javax.swing.JButton jButtonCadastrarProdutos;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAcessibilidade;
    private javax.swing.JLabel jLabelArtista;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDemocratizacao;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelJustificativa;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObjetivo;
    private javax.swing.JLabel jLabelOrcamento;
    private javax.swing.JLabel jLabelProdutos;
    private javax.swing.JLabel jLabelPublicoEstimado;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAcessibilidade;
    private javax.swing.JTextField jTextFieldDemocratizacao;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldJustificativa;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldObjetivo;
    private javax.swing.JTextField jTextFieldOrcamento;
    private javax.swing.JTextField jTextFieldPublicoEstimado;
    // End of variables declaration//GEN-END:variables
}
