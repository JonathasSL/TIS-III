package Fornecedor;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarFornecedor extends JFrame {
	
    //variaveis para uso da JTable 
	JTable table; 


 
    /*Construtor da classe ,
      antes de executar o metodo main(),
      ir� construir o JFrame e a JTable*/
public ListarFornecedor(Fornecedor[] fornecedores) {
    setLayout(new FlowLayout());//tipo de layout
    setSize(new Dimension(600, 200));//tamanho do Formulario
    setLocationRelativeTo(null);//centralizado
    setTitle("Lista de Fornecedores");//titulo
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setando a a��o padr�o de fechamento do Formul�rio,
                                                           // neste caso  ir� fechar o programa
     
            //instanciando a JTable
    table = new JTable(new DefaultTableModel(null, new Object[]{"Nome", "Produto", "Telefone", "Email", "Respons�vel"}));
    table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
    table.setFillsViewportHeight(true);
    DefaultTableModel  modeloDados = (DefaultTableModel) table.getModel();
    for(int i=0; i<fornecedores.length; i++) {
        modeloDados.addRow(new Object[]{fornecedores[i].nome, fornecedores[i].prodFornecido, fornecedores[i].telefone, fornecedores[i].email, fornecedores[i].responsavel});
    }
   
     
            //adicionando a tabela em uma barra de rolagem, ficar� envolta , pela mesma 
    JScrollPane scrollPane=new JScrollPane(table);
             
            //adicionando ao JFrame "Formul�rio" a JTable "Tabela" 
    add(scrollPane);
}
 

	public static void main(String[] args) {
		
		  new ListarFornecedor(null).setVisible(true);

	}

}
