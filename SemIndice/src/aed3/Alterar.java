package aed3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Alterar extends JFrame {
	
	JLabel titulo, nome, telefone, email;
	JPanel campo, campoBotao, campoTitulo;
	JButton alterar, voltar;
	JTextField txNome, txTelefone, txEmail;
	
	public Alterar() {
		super("Alteração de Clientes");
		JFrame frame = new JFrame();
		frame.setSize(600,300);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(1,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titulo = new JLabel("Alteração de Cliente");
		campoTitulo = new JPanel();
		campoTitulo.setLayout(new FlowLayout());
		campoTitulo.add(titulo);
		nome = new JLabel("Nome do cliente");
		nome.setHorizontalAlignment(0);
		telefone = new JLabel("Telefone do cliente");
		telefone.setHorizontalAlignment(0);
		email = new JLabel("Email do cliente");
		email.setHorizontalAlignment(0);
		txNome = new JTextField("");
		txTelefone = new JTextField("");
		txEmail = new JTextField("");
		alterar = new JButton("Incluir");
		voltar = new JButton("Voltar");
		alterar.setAlignmentX(0);
		campo = new JPanel();
		campo.setLayout(new GridLayout(3,2));
		campoBotao = new JPanel();
		campoBotao.setLayout(new FlowLayout());
		campo.add(nome);
		campo.add(txNome);
		campo.add(telefone);
		campo.add(txTelefone);
		campo.add(email);
		campo.add(txEmail);
		campoBotao.add(alterar);
		campoBotao.add(voltar);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,1));
		c.add(campoTitulo);
		c.add(campo);
		c.add(campoBotao);
		frame.add(c);
		voltar.addActionListener((e) ->{
			try {
				frame.dispose();
				new Menu();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		
	}

}
