package aed3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Excluir extends JFrame{
	JLabel titulo, nome;
	JPanel campoTitulo, listagem, botao;
	JButton voltar, excluir;
	JTextField txNome;
	
	public Excluir() {
		super("Exclusão de Clientes");
		JFrame frame = new JFrame();
		frame.setSize(1000,500);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(1,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titulo = new JLabel("Exclusão de clientes");
		titulo.setHorizontalAlignment(0);
		campoTitulo = new JPanel();
		campoTitulo.setLayout(new FlowLayout());
		campoTitulo.add(titulo);
		nome = new JLabel("Nome");
		txNome = new JTextField();
		listagem = new JPanel();
		listagem.setLayout(new GridLayout(1,2));
		listagem.add(nome);
		listagem.add(txNome);
		voltar = new JButton("Voltar");
		excluir = new JButton("Excluir");
		botao = new JPanel();
		botao.setLayout(new FlowLayout());
		botao.add(excluir);
		botao.add(voltar);
		Container c = new Container();
		c.setLayout(new GridLayout(3,1));
		c.add(campoTitulo);
		c.add(listagem);
		c.add(botao);
		frame.add(c);
		voltar.addActionListener((e) -> {
			try {
				frame.dispose();
				new Menu();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}

}
