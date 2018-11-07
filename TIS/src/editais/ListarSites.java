package editais;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListarSites extends JFrame {

	//variaveis para uso da JTable 
	private JTable table;
	private final String colunas[]={"Nome:","link"};

	/*Construtor da classe ,
      antes de executar o metodo main(),
      irá construir o JFrame e a JTable*/
	public ListarSites(String[][] sites) {
		setLayout(new FlowLayout());//tipo de layout
		setSize(new Dimension(600, 200));//tamanho do Formulario
		setLocationRelativeTo(null);//centralizado
		setTitle("Lista de Sites");//titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setando a ação padrão de fechamento do Formulário,
		// neste caso  irá fechar o programa

		//instanciando a JTable
		table = new JTable(sites,colunas);
		table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
		table.setFillsViewportHeight(true);

		//adicionando a tabela em uma barra de rolagem, ficará envolta , pela mesma 
		JScrollPane scrollPane=new JScrollPane(table);

		//adicionando ao JFrame "Formulário" a JTable "Tabela" 
		add(scrollPane);
	}


}
