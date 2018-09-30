package aed3;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame {
	JLabel titulo;
	JPanel campo;
	JButton listar, incluir, alterar, excluir, buscar, sair;
	
	public Menu() {
		super("Gestão de Clientes");
		JFrame frame = new JFrame();
		frame.setSize(1000,500);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(1,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titulo = new JLabel("Escolha a opção desejada");
		titulo.setHorizontalAlignment(0);
		listar = new JButton("Listar");
		incluir = new JButton("Incluir");
		alterar = new JButton("Alterar");
		excluir = new JButton("Excluir");
		buscar = new JButton("Buscar");
		sair = new JButton("Sair");
		campo = new JPanel();
		campo.setLayout(new GridLayout(7,1));
		campo.add(titulo);
		campo.add(listar);
		campo.add(incluir);
		campo.add(alterar);
		campo.add(excluir);
		campo.add(buscar);
		campo.add(sair);
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		c.add(campo);
		frame.add(c);
		incluir.addActionListener((e) -> {
			try {
				new Incluir();
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		sair.addActionListener((e) -> frame.dispose());
		listar.addActionListener((e) -> {
			try {
				new Listar();
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		alterar.addActionListener((e) -> {
			try {
				new Alterar();
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		buscar.addActionListener((e) -> {
			try {
				new Busca();
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		excluir.addActionListener((e) -> {
			try {
				new Excluir();
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	public static void main(String[] args) {
		new Menu();

	}
}
