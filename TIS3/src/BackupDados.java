import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class BackupDados {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Define o nome do arquivo a ser trabalhado		
		System.out.print("Informe o nome do Arquivo a ser feito o Backup: ");
		String nomeArquivo = Teclado.readLine();	

		int numRegPesquisados = 0;		
		
		try {
			
			//Objetos utilizados na manipulação do arquivo e seus dados			
			FileInputStream arqEntrada = new FileInputStream(nomeArquivo);
			DataInputStream entrada = new DataInputStream(arqEntrada);
//
//			System.out.print("Digite o nome do Veículo a ser pesquisado: ");
//			String nome = Teclado.readLine();
//			
//			boolean registroEncontrado = false;
			
			//Novo arquivo de Backup
			FileOutputStream arqSaida = new FileOutputStream("Backup_"+nomeArquivo,true);
			PrintStream saida = new PrintStream(arqSaida);
			
			
			//Realiza a pesquisa no arquivo
			while (entrada.available() != 0) {
				
				String linha = entrada.readLine();
				saida.println(linha);
				numRegPesquisados++;

				//Pega uma linha e gera um vetor com as palavras desta linha
//				StringTokenizer listaPalavras = new StringTokenizer(linha); 
//				
//				String codigoLinha = listaPalavras.nextToken();
//				String nomeLinha = listaPalavras.nextToken();
//				
//				numRegPesquisados++;
//				if( nomeLinha.startsWith(nome) ) {
//					System.out.println(linha);
//					System.out.println("Registro encontrado!\n");
//					registroEncontrado = true;
//					break;
//				}
			}
//			if (!registroEncontrado)
//				System.out.println("Registro nao encontrado!\n");
			
			//Finalização da manipulação dos dados no arquivo
			saida.flush();
			saida.close();
			arqSaida.close();
			
			entrada.close();
			arqEntrada.close();

			System.out.println("Backup gravado com sucesso");
		}
		catch(FileNotFoundException e) {
			System.out.println("O Arquivo informado não existe.\n" + e.toString());
		}		
		
		System.out.println("Registros copiados: " + numRegPesquisados);
	}
}
