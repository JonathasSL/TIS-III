package Cliente;

import java.util.Scanner;

import ArtManager.Arquivo;
import ArtManager.Menu;
import Artista.Artista;


	public class Cliente_CRUD {

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
	    

	   public static void listarClientes(Arquivo arqClientes) throws Exception {
		   
		   arqClientes = new Arquivo<>(Cliente.class.getConstructor(), "clientes.db");
	       
	       Object[] obj = arqClientes.listar();
	       
	       System.out.println("\nLISTA DE CLIENTES");
	       for(int i=0; i<obj.length; i++) {
	           System.out.println((Cliente)obj[i]);
	       }
	       pausa();
	       
	   }
	   
	   public static void incluirCliente(String nome, String telefone, String email, Arquivo arqClientes) throws Exception  {
	       
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
	           Cliente obj = new Cliente(-1, nome, telefone, email);
	           int id = arqClientes.incluir(obj);
	           //System.out.println("Cliente incluido com ID: "+id);
	       //}

//pausa();
	   }

	   
	   public static void alterarCliente(String nome, String newNome, String telefone, String email, Arquivo arqClientes) throws Exception {
		   Cliente obj;
		   obj = (Cliente)arqClientes.buscar(nome);
		   obj.nome = (newNome.length()>0 ? newNome : obj.nome);
		   obj.telefone = (telefone.length()>0 ? telefone : obj.telefone);
		   obj.email = (email.length()>0 ? email : obj.email);

		   arqClientes.alterar(obj);
	   }

	   
	   public static void excluirCliente(String nome, Arquivo arqClientes) throws Exception {
	       
	     //  System.out.println("\nEXCLUS�O DE CLIENTE");

	       //String nome;
//	       System.out.print("Nome do cliente: ");
//	       nome = console.nextLine();
	       //
	       
	 //      Cliente obj;
//	       if( (obj = (Cliente)arqClientes.buscar(nome))!=null ) {
//	            System.out.println(obj);
	            
//	            System.out.println("\nConfirma exclus�o? ");
//	            System.out.println("S - Sim");
//	            System.out.println("N - N�o");
//	            char confirma = console.nextLine().charAt(0);
//	            if(confirma=='s' || confirma=='S') {
	                arqClientes.excluir(nome);
//	                    System.out.println("Cliente excluido.");
//	                }
	           // }
	     //  }
//	       else
//	           System.out.println("Cliente n�o encontrado");
	       //pausa();
	       
	   }
	   
	   
	   public static Cliente buscarCliente(String nome, Arquivo arqClientes) throws Exception {
	       
	       Cliente obj;
	       Cliente dados = null;
		if( (obj = (Cliente)arqClientes.buscar(nome))!=null )
	          dados = obj;
		return dados;
	       
	   }

	    public static void pausa() throws Exception {
	        System.out.println("\nPressione ENTER para continuar ...");
	        console.nextLine();
	    }
	    

	


	}


