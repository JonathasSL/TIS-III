package Fornecedores;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculadora extends JFrame {

		
	JLabel txInicio= new JLabel("Adicionar Fornecedores");
	
	JLabel txnome = new JLabel("Nome do Fornecedor: ");
	 JTextField camponome = new JTextField(20);
	 
	 JLabel txproduto = new JLabel("Produto:");
	 JTextField campoproduto = new JTextField(20);
	 
	JLabel txpessoa = new JLabel("Pessoa Responsavel: ");
	JTextField campopessoa = new JTextField(20);
		 
	JLabel txemail = new JLabel("Email: ");
	JTextField campoemail = new JTextField(20);
			 
	JLabel txtelefone = new JLabel("Telefone: ");
	 JTextField campotelefone = new JTextField(20);
	 
	 JButton b = new JButton("Cadastrar");
	 JFrame frame = new JFrame();
	 

		
//	 JButton bMul = new JButton("*");
//	 JButton bDiv = new JButton("/");
//	 JButton bRes = new JButton("=");		
//
//	 private float op1, op2, res;
//	 private char operacao;
	 public Calculadora() {
	 super("Calculadora");
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GridLayout frame");

		Container c = getContentPane();
	

		c.setLayout(new GridLayout(7,1 ));

	
//		GridBagConstraints constraints = new GridBagConstraints();
//		constraints.fill = GridBagConstraints.BOTH;
//		constraints.weightx = 1; constraints.weighty = 1;


		


		c.add(txnome);
		c.add(camponome);
				

	 c.add(txproduto);
	 c.add(campoproduto);


	 c.add(txpessoa);
	 c.add(campopessoa);

	 c.add(txemail);
	 c.add(campoemail);

	 c.add(txtelefone);
	 c.add(campotelefone);
	 
//	 cPane.add(bMul);
//	 cPane.add(bDiv);
//	 cPane.add(bRes);
//
//	 op1 = 0;
//	 op2 = 0;
//	 res = 0;
//	 operacao = ' ';
		
	 c.add(b);
		
	 
	 b.addActionListener(e -> {
		try {
			 FornecedoresCrud p= new FornecedoresCrud();
			 p.incluirCliente(txnome.getText(),txproduto.getText(),txpessoa.getText(),txemail.getText(),txtelefone.getText());
			 dispose();
			 Calculadora y = new Calculadora();
		     	y.setVisible(true);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
//	 bSub.addActionListener(e -> processaOperacao('-', campo.getText()));
//	 bMul.addActionListener(e -> processaOperacao('*', campo.getText()));
//	 bDiv.addActionListener(e -> processaOperacao('/', campo.getText()));
//	 bRes.addActionListener(new ActionListener() {
//	 @Override
//	 public void actionPerformed(ActionEvent e) {
//	 processaOperacao('=', camponome.getText());
//	 }
//	 });
	 
	 
	 pack();
	 }
	 private void Incluir(String campo,String campo1,String campo2,String campo3,String campo4) throws Exception {
	
		 
		 
//	 this.campo.setText(Float.toString(res));
	 
	 }
//	 public static void main(String[] args) {
//	 Calculadora c = new Calculadora();
//	 
//	 c.setVisible(true);
//	 }
	}
