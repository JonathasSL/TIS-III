package Produto;

import java.util.Scanner;

import ArtManager.Arquivo;
import ArtManager.Menu;
import Artista.Artista;
import Cliente.Cliente;


	public class Produto_CRUD {

	    private static Scanner console = new Scanner(System.in);
//	    private static Arquivo<Cliente> arqClientes;


	    /**
	     * Método principal, cujo objetivo é criar uma interface para o usuário
	     */
	    public static void main(String[] args) {

	        try {

	        	
//	            arqClientes = new Arquivo<>(Cliente.class.getConstructor(), "clientes.db");
//	            Menu i = new Menu();
//	            i.setVisible(true);
//	            
//	           int opcao;
//	           do {
//	               System.out.println("\n\nGEST�O DE CLIENTES");
//	               System.out.println("-----------------------------\n");
//	               System.out.println("1 - Listar");
//	               System.out.println("2 - Incluir");
//	               System.out.println("3 - Alterar");
//	               System.out.println("4 - Excluir");
//	               System.out.println("5 - Buscar");
//	               System.out.println("0 - Sair");
//	               System.out.print("\nOpcao: ");
//	               opcao = Integer.valueOf(console.nextLine());
//	               
//	               switch(opcao) {
//	                   case 1: listarClientes(); break;
//	                   case 2: incluirCliente(); break;
//	                   case 3: alterarCliente(); break;
//	                   case 4: excluirCliente(); break;
//	                   case 5: buscarCliente(); break;
	//
//	                   case 0: break;
//	                   default: System.out.println("Op��o Invalida");
//	               }
//	               
//	           } while(opcao!=0);
	       } catch(Exception e) {
	           e.printStackTrace();
	       }
	    }
	    

	   public static void listarProdutos(Arquivo arqProdutos) throws Exception {
		   
		   arqProdutos = new Arquivo<>(Produto.class.getConstructor(), "produtos.db");
	       
	       Object[] obj = arqProdutos.listar();
	       
	       System.out.println("\nLISTA DE CLIENTES");
	       for(int i=0; i<obj.length; i++) {
	           System.out.println((Produto)obj[i]);
	       }
	       pausa();
	       
	   }
	   
	   public static void incluirProduto(String nome, String descricao, String preco, Arquivo arqProdutos) throws Exception  {
	       
//	       String nome;
//	       String telefone;
//	       String  email;
//	       
//	       System.out.println("\nINCLUS�O DE CLIENTE");
//	       System.out.print("Nome: ");
//	       nome = console.nextLine();
//	       System.out.print("Telefone: ");
//	       telefone = console.nextLine();
//	       System.out.print("Email: ");
//	       email = console.nextLine();
//	       
//	       System.out.println("\nConfirma inclus�o? ");
//	       System.out.println("S - Sim");
//	       System.out.println("N - N�o");
//	       System.out.print("Op��o: ");
//	       char confirma = console.nextLine().charAt(0);
//	       if(confirma=='s' || confirma=='S') {
	           Produto obj = new Produto(-1, nome, descricao, preco);
	           int id = arqProdutos.incluir(obj);
	           //System.out.println("Cliente incluido com ID: "+id);
	       //}

//pausa();
	   }

	   
	   public static void alterarProduto(String nome, String newNome, String telefone, String email, Arquivo arqProdutos) throws Exception {
		   Produto obj;
		   obj = (Produto)arqProdutos.buscar(nome);
		   obj.nome = (newNome.length()>0 ? newNome : obj.nome);
		   obj.descricao = (telefone.length()>0 ? telefone : obj.descricao);
		   obj.preco = (email.length()>0 ? email : obj.preco);

		   arqProdutos.alterar(obj);
	   }
	  
	   
	   public static void excluirProduto(String nome, Arquivo arqProdutos) throws Exception {
	       
	    
	                arqProdutos.excluir(nome);                    
	       
	   }
	   
	   
	   public static Produto buscarProduto(String nome, Arquivo arqProdutos) throws Exception {
	       
	       Produto obj;
	       Produto dados = null;
		if( (obj = (Produto)arqProdutos.buscar(nome))!=null )
	          dados = obj;
		return dados;
	       
	   }

	    public static void pausa() throws Exception {
	        System.out.println("\nPressione ENTER para continuar ...");
	        console.nextLine();
	    }
	    

	


	}


