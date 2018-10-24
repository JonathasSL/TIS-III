package Fornecedores;



import java.util.Scanner;

public class FornecedoresCrud {

    private static Scanner console = new Scanner(System.in);
    private static Arquivo<Fornecedores> arqForn;

    /**
     * Método principal, cujo objetivo é criar uma interface para o usuário
     */
    public static void main(String[] args) {

        try {

         	arqForn = new Arquivo<>(Fornecedores.class.getConstructor(), "fornecedores.db");

            
            Menu i = new Menu();
            i.setVisible(true);
  
            
//            // menu
//           int opcao;
//           do {
//               System.out.println("\n\nGEST�O DE CLIENTES");
//               System.out.println("-----------------------------\n");
//               System.out.println("1 - Listar");
//               System.out.println("2 - Incluir");
//               System.out.println("3 - Alterar");
//               System.out.println("4 - Excluir");
//               System.out.println("5 - Buscar");
//               System.out.println("0 - Sair");
//               System.out.print("\nOpcao: ");
//               opcao = Integer.valueOf(console.nextLine());
//               
//               switch(opcao) {
//                   case 1: listarFornecedores(); break;
//                   case 2: incluirFornecedores(); break;
//                   case 3: alterarFornecedores(); break;
//                   case 4: excluirFornecedores(); break;
//                   case 5: buscarFornecedores(); break;
//
//                   case 0: break;
//                   default: System.out.println("Op��o Invalida");
//               }
//               
//           } while(opcao!=0);
       } catch(Exception e) {
           e.printStackTrace();
       }
    }
    

   public static void listarFornecedores() throws Exception {
       
       Object[] obj = arqForn.listar();
       
       System.out.println("\nLISTA DE CLIENTES");
       for(int i=0; i<obj.length; i++) {
           System.out.println((Fornecedores)obj[i]);
       }
       pausa();
       
   }
   
   public  void incluirCliente(String nome,String produto,String pessoa, String telefone, String email) throws Exception  {
       
//     String nome;
//     String telefone;
//     String  email;
//     
//     System.out.println("\nINCLUS�O DE CLIENTE");
//     System.out.print("Nome: ");
//     nome = console.nextLine();
//     System.out.print("Telefone: ");
//     telefone = console.nextLine();
//     System.out.print("Email: ");
//     email = console.nextLine();
//     
//     System.out.println("\nConfirma inclus�o? ");
//     System.out.println("S - Sim");
//     System.out.println("N - N�o");
//     System.out.print("Op��o: ");
//     char confirma = console.nextLine().charAt(0);
//     if(confirma=='s' || confirma=='S') {
         Fornecedores obj = new Fornecedores(-1, nome,produto,pessoa, telefone, email);
         int id = arqForn.incluir(obj);
         //System.out.println("Cliente incluido com ID: "+id);
     //}

//    pausa();
 }
//   }

       //pausa();
   

   
   public static void alterarFornecedores() throws Exception {
       
       System.out.println("\nALTERA��O DE CLIENTE");

       String nome;
       System.out.print("Nome do Cliente: ");
       nome = console.nextLine();
       if(nome.length() <=0) 
           return;
       
       Fornecedores obj;
       if( (obj = (Fornecedores)arqForn.buscar(nome))!=null ) {
            System.out.println(obj);
            
            String newNome;
            String telefone;
            String  email;
            String produto;
            String  pessoa_responsavel;
            
            System.out.print("\nNovo nome: ");
            newNome = console.nextLine();
            System.out.print("Novo telefone: ");
            telefone = console.nextLine();
            System.out.print("Novo email: ");
            email = console.nextLine();
            System.out.print("produto: ");
            produto = console.nextLine();
            System.out.print("pessoa: ");
            pessoa_responsavel = console.nextLine();

            if(newNome.length()>0 || telefone.length()>0 || email.length()>0|| produto.length()>0 || pessoa_responsavel.length()>0) {
                System.out.println("\nConfirma altera��o? ");
                System.out.println("S - Sim");
                System.out.println("N - N�o");
                System.out.print("Op��o: ");
                char confirma = console.nextLine().charAt(0);
                if(confirma=='s' || confirma=='S') {

                obj.nome = (newNome.length()>0 ? newNome : obj.nome);
                obj.telefone = (telefone.length()>0 ? telefone : obj.telefone);
                obj.email = (email.length()>0 ? email : obj.email);
                obj.produto = (produto.length()>0 ? produto : obj.produto);
                obj.pessoa_responsavel = (pessoa_responsavel.length()>0 ? pessoa_responsavel : obj.pessoa_responsavel);
                

                if( arqForn.alterar(obj) ) 
                        System.out.println("Cliente alterado.");
                    else
                        System.out.println("Cliente n�o pode ser alterado.");
                }
            }
       }
       else
           System.out.println("Cliente n�o encontrado");
       pausa();
       
   }
  
   
   public static void excluirFornecedores() throws Exception {
       
       System.out.println("\nEXCLUS�O DE CLIENTE");

       String nome;
       System.out.print("Nome do cliente: ");
       nome = console.nextLine();
       if(nome.length() <=0) 
           return;
       
       Fornecedores obj;
       if( (obj = (Fornecedores)arqForn.buscar(nome))!=null ) {
            System.out.println(obj);
            
            System.out.println("\nConfirma exclus�o? ");
            System.out.println("S - Sim");
            System.out.println("N - N�o");
            char confirma = console.nextLine().charAt(0);
            if(confirma=='s' || confirma=='S') {
                if( arqForn.excluir(nome) ) {
                    System.out.println("Cliente excluido.");
                }
            }
       }
       else
           System.out.println("Cliente n�o encontrado");
       pausa();
       
   }
   
   
   public static void buscarFornecedores() throws Exception {
       
       System.out.println("\nBUSCA DE CLIENTE POR NOME");
       
       String nome;
       System.out.print("Nome: ");
       nome = console.nextLine();
       if(nome.length() <=0) 
           return; 
       
       Fornecedores obj;
       if( (obj = (Fornecedores)arqForn.buscar(nome))!=null )
           System.out.println(obj);
       else
           System.out.println("Cliente n�o encontrado");
       pausa();
       
   }

    public static void pausa() throws Exception {
        System.out.println("\nPressione ENTER para continuar ...");
        console.nextLine();
    }
    

}

