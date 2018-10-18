

import java.util.Scanner;

public class Artista_CRUD {

    private static Scanner console = new Scanner(System.in);
    private static Arquivo<Artista> arqArtistas;

    
    public static void main(String[] args) {

        try {

            arqArtistas = new Arquivo<>(Artista.class.getConstructor(), "listaDeArtistas.txt");
            
            // menu
           int opcao;
           do {
               System.out.println("\n\nGESTAO DE ARTISTAS");
               System.out.println("-----------------------------\n");
               System.out.println("1 - Listar");
               System.out.println("2 - Incluir");
               System.out.println("3 - Alterar");
               System.out.println("4 - Excluir");
               System.out.println("5 - Buscar");
               System.out.println("0 - Sair");
               System.out.print("\nOpcao: ");
               opcao = Integer.valueOf(console.nextLine());
               
               switch(opcao) {
                   case 1: listaArtistas(); break;
                   case 2: cadastraArtista(); break;
                   case 3: atualizaArtista(); break;
                   case 4: excluiArtista(); break;
                   case 5: buscaArtista(); break;

                   case 0: break;
                   default: System.out.println("Opcao invalida");
               }
               
           } while(opcao!=0);
       } catch(Exception e) {
           e.printStackTrace();
       }
    }
    

   public static void listaArtistas() throws Exception {
       
       Object[] obj = arqArtistas.listar();
       
       System.out.println("\nLISTA DE ARTISTAS");
       for(int i=0; i<obj.length; i++) {
           System.out.println((Livro)obj[i]);
       }
       pausa();
       
   }
   
   public static void cadastraArtista() throws Exception {
       
       String nomeArtista;
       String telefone;
       String  email;
       
       System.out.println("\nINCLUSAO DE ARTISTA");
       System.out.print("Nome: ");
       nomeArtista = console.nextLine();
       System.out.print("Email: ");
       email = console.nextLine();
       System.out.print("Telefone: ");
       telefone = console.nextLine();
       
       System.out.print("\nConfirma inclusao? ");
       char confirma = console.nextLine().charAt(0);
       if(confirma=='s' || confirma=='S') {
           Artista obj = new Artista(email, nomeArtista, telefone);
           int id = arqArtistas.incluir(obj);
           System.out.println("Artista incluido com ID: "+id);
       }

       pausa();
   }

   
   public static void atualizaArtista() throws Exception {
       
       System.out.println("\nATUALIZACAO DE ARTISTA");

       int id;
       System.out.print("ID do artista: ");
       id = Integer.valueOf(console.nextLine());
       if(id <=0) 
           return;
       
       Artista obj;
       if( (obj = (Artista)arqArtistas.buscar(id))!=null ) {
            System.out.println(obj);
            
            String email;
            String nomeArtista;
            String  telefone;
            
            System.out.print("\nNome atualizado: ");
            nomeArtista = console.nextLine();
            System.out.print("Novo telefone: ");
            telefone = console.nextLine();
            System.out.print("Novo email: ");
            email = console.nextLine(); 

            if(nomeArtista.length()>0 || telefone.length()>0 || email.length()>0) {
                System.out.print("\nConfirma alteracao? ");
                char confirma = console.nextLine().charAt(0);
                if(confirma=='s' || confirma=='S') {

                obj.setNomeArtista((nomeArtista.length()>0 ? nomeArtista : obj.getNomeArtista())) ;
                obj.setTelefone((telefone.length()>0 ? telefone : obj.telefone));
                obj.setEmail((email.length()>0 ? email : obj.email));

                if( arqArtistas.alterar(obj) ) 
                        System.out.println("Dados alterados.");
                    else
                        System.out.println("Dados nao podem ser alterado.");
                }
            }
       }
       else
           System.out.println("Artista nao encontrado");
       pausa();
       
   }
  
   
   public static void excluiArtista() throws Exception {
       
       System.out.println("\nEXCLUSAO DE ARTISTA");

       int id;
       System.out.print("ID do artista: ");
       id = Integer.valueOf(console.nextLine());
       if(id <=0) 
           return;
       
       Artista obj;
       if( (obj = (Artista)arqArtistas.buscar(id))!=null ) {
            System.out.println(obj);
            
            System.out.print("\nConfirma exclusao? ");
            char confirma = console.nextLine().charAt(0);
            if(confirma=='s' || confirma=='S') {
                if( arqArtistas.excluir(id) ) {
                    System.out.println("Cadastro excluido.");
                }
            }
       }
       else
           System.out.println("Cadastro nao encontrado");
       pausa();
       
   }
   
   
   public static void buscaArtista() throws Exception {
       
       System.out.println("\nBUSCA DE ARTISTA POR CODIGO");
       
       int codigo;
       System.out.print("Codigo: ");
       codigo = Integer.valueOf(console.nextLine());
       if(codigo <=0) 
           return; 
       
       Livro obj;
       if( (obj = (Artista)arqArtistas.buscar(codigo))!=null )
           System.out.println(obj);
       else
           System.out.println("Cadastro nao encontrado");
       pausa();
       
   }

    public static void pausa() throws Exception {
        System.out.println("\nPressione ENTER para continuar ...");
        console.nextLine();
    }
    

}
