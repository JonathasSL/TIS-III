package ArtManager;

import Artista.Artista;
import Cliente.Cliente;
import Fornecedor.Fornecedor;
import Login.Login;
import Produto.Produto;

public class Main {

	
	public static Arquivo<Cliente> arqClientes;
    public static Arquivo<Artista> arqArtistas;
    public static Arquivo<Fornecedor> arqFornecedores;
    public static Arquivo<Produto> arqProdutos;
    
	public static void main(String[] args) {
		
		Login cad  = new Login();
		cad.setVisible(true);
		
		try {
			arqFornecedores = new Arquivo<>(Fornecedor.class.getConstructor(), "fornecedores.db");
		} catch (NoSuchMethodException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SecurityException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
    	try {
			arqProdutos = new Arquivo<>(Produto.class.getConstructor(), "Produtos.db");
		} catch (NoSuchMethodException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SecurityException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
    	
    	 try {
			arqArtistas = new Arquivo<>(Artista.class.getConstructor(), "artistas.db");
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	 try {
			arqClientes = new Arquivo<>(Cliente.class.getConstructor(), "clientes.db");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
