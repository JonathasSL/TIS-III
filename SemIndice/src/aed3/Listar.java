package aed3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Listar extends JFrame{
	JLabel titulo, lista;
	JPanel campoTitulo, listagem, botao;
	JButton voltar;
	
	public Listar() {
		super("Listagem de Clientes");
		JFrame frame = new JFrame();
		frame.setSize(1000,500);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(1,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titulo = new JLabel("Listagem dos clientes");
		titulo.setHorizontalAlignment(0);
		campoTitulo = new JPanel();
		campoTitulo.setLayout(new FlowLayout());
		campoTitulo.add(titulo);
		lista = new JLabel();
		listagem = new JPanel();
		listagem.setLayout(new FlowLayout());
		listagem.add(lista);
		voltar = new JButton("Voltar");
		botao = new JPanel();
		botao.setLayout(new FlowLayout());
		botao.add(voltar);
		Container c = new Container();
		c.setLayout(new GridLayout(1,3));
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
