/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import ArtManager.Main;
import Artista.Artista;
import Artista.Artista_CRUD;
import Produto.Produto;
import Produto.Produto_CRUD;

/**
 *
 * @author Jônathas Leandro
 */
public class ListarProdutos extends javax.swing.JFrame {

	ArrayList<Produto> disponiveis;
	ArrayList<Produto> incluidos;
    /**
     * Creates new form ListarProdutos
     */
    public ListarProdutos() {
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

        jLabelAdicionar = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldAdicionar = new javax.swing.JTextField();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPaneDisponiveis = new javax.swing.JScrollPane();
        jListDisponiveis = new javax.swing.JList<>();
        jLabelDisponiveis = new javax.swing.JLabel();
        jLabelArtistasDisponiveis1 = new javax.swing.JLabel();
        jLabelRemover = new javax.swing.JLabel();
        jTextFieldRemover = new javax.swing.JTextField();
        jButtonRemover = new javax.swing.JButton();
        jScrollPaneIncluidos = new javax.swing.JScrollPane();
        jListIncluidos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAdicionar.setText("Produto a adicionar:");

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTitulo.setText("Produtos Disponiveis");

        jTextFieldAdicionar.setText("Produto");
        jTextFieldAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdicionarActionPerformed(evt);
            }
        });

        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        DefaultListModel dlm = new DefaultListModel();
		try {
	        Produto[] p = Produto_CRUD.listarProdutos(Main.arqProdutos);
	        for(int i=0; i<p.length ;i++)
	        	dlm.addElement(p[i]);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel listar os produtos");
		}

        jListDisponiveis.setModel(dlm);
        jScrollPaneDisponiveis.setViewportView(jListDisponiveis);

        jLabelDisponiveis.setText("Produtos disponiveis:");

        jLabelArtistasDisponiveis1.setText("Produtos incluidos:");

        jLabelRemover.setText("Produto a remover:");

        jTextFieldRemover.setText("Clientes");

        jButtonRemover.setText("Remover");
        
        dlm.clear();
        for(Produto pr : incluidos)
        	dlm.addElement(pr.getNome());
        
        
        jListIncluidos.setModel(dlm);
        jScrollPaneIncluidos.setViewportView(jListIncluidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRemover)
                            .addComponent(jLabelArtistasDisponiveis1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneIncluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonFinalizar)
                                    .addComponent(jButtonRemover)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAdicionar)
                            .addComponent(jLabelDisponiveis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAdicionar)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdicionar)
                    .addComponent(jTextFieldAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDisponiveis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRemover)
                    .addComponent(jTextFieldRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneIncluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelArtistasDisponiveis1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonFinalizar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdicionarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
    	try {
			Produto p = Produto_CRUD.buscarProduto(jTextFieldAdicionar.getText(), Main.arqProdutos);
	    	if(p!=null)
	    		disponiveis.add(p);
	    	else
	    		JOptionPane.showMessageDialog(null, "Produto nao encontrado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel executar");
		}
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabelAdicionar;
    private javax.swing.JLabel jLabelArtistasDisponiveis1;
    private javax.swing.JLabel jLabelDisponiveis;
    private javax.swing.JLabel jLabelRemover;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListDisponiveis;
    private javax.swing.JList<String> jListIncluidos;
    private javax.swing.JScrollPane jScrollPaneDisponiveis;
    private javax.swing.JScrollPane jScrollPaneIncluidos;
    private javax.swing.JTextField jTextFieldAdicionar;
    private javax.swing.JTextField jTextFieldRemover;
    // End of variables declaration//GEN-END:variables
}
