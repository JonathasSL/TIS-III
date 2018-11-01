package Fornecedor;

import java.util.Scanner;

import ArtManager.Arquivo;
import ArtManager.Menu;
import Cliente.Cliente;


	public class Fornecedor_CRUD {

	    private static Scanner console = new Scanner(System.in);
//	    private static Arquivo<Artista> arqArtistas;

	    /**
	     * Método principal, cujo objetivo é criar uma interface para o usuário
	     */
	    public static void main(String[] args) {

	        try {

//	            arqArtistas = new Arquivo<>(Artista.class.getConstructor(), "artistas.db");
//	            Menu i = new Menu();
//	            i.setVisible(true);
//	 
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
	    

	   public static void listarFornecedores(Arquivo arqFornecedores) throws Exception {
	       
	       Object[] obj = arqFornecedores.listar();
	       
	       System.out.println("\nLISTA DE ");
	       for(int i=0; i<obj.length; i++) {
	           System.out.println((Fornecedor)obj[i]);
	       }
	       pausa();
	       
	   }
	   
	   public static void incluirFornecedor(String nome, String telefone, String email, String responsavel, String prodFornecido, Arquivo arqFornecedores) throws Exception  {
	       
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
	           Fornecedor obj = new Fornecedor(-1, nome, telefone, email, responsavel, prodFornecido);
	           int id = arqFornecedores.incluir(obj);
	           //System.out.println("Cliente incluido com ID: "+id);
	       //}

//pausa();
	   }

	   
	   public static void alterarFornecedor(String nome, String newNome, String telefone, String email, String responsavel, String prodFornecido, Arquivo arqFornecedores) throws Exception {
		   Fornecedor obj;
		   obj = (Fornecedor)arqFornecedores.buscar(nome);
		   obj.nome = (newNome.length()>0 ? newNome : obj.nome);
		   obj.telefone = (telefone.length()>0 ? telefone : obj.telefone);
		   obj.email = (email.length()>0 ? email : obj.email);
		   obj.responsavel = (responsavel.length()>0 ? responsavel : obj.responsavel);
		   obj.prodFornecido = (prodFornecido.length()>0 ? prodFornecido : obj.prodFornecido);
		   arqFornecedores.alterar(obj);

	   }

	   
	   public static void excluirFornecedor(String nome, Arquivo arqFornecedores) throws Exception {
	       
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
	                arqFornecedores.excluir(nome);
//	                    System.out.println("Cliente excluido.");
//	                }
	           // }
	     //  }
//	       else
//	           System.out.println("Cliente n�o encontrado");
	       //pausa();
	       
	   }
	   
	   
	   public static Fornecedor buscarFornecedor(String nome, Arquivo arqFornecedores) throws Exception {
	       
	      
		   Fornecedor obj;
	       Fornecedor dados = null;
		if( (obj = (Fornecedor)arqFornecedores.buscar(nome))!=null )
	          dados = obj;
		return dados;
	       
	   }

	    public static void pausa() throws Exception {
	        System.out.println("\nPressione ENTER para continuar ...");
	        console.nextLine();
	    }
	    

	


	}


