import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Aplicacao {

	public static void main(String[] args)throws IOException, ClassNotFoundException  {
		//Define o nome do arquivo a ser trabalhado		

		String listaDeArtistas = "listaDeArtistas.txt";	

		try {			

			//Novo arquivo de Backup
			FileOutputStream cadastro = new FileOutputStream(listaDeArtistas, true);
			PrintStream saida = new PrintStream(cadastro);

			Artista artista = new Artista ("carlos", "3322-1122", "carlinhos@gmail.com");
			saida.println(artista);
			//Finalização da manipulação dos dados no arquivo
			saida.flush();
			saida.close();
			cadastro.close();

		}
		catch(FileNotFoundException e) {
			System.out.println("O Arquivo informado não existe.\n" + e.toString());
		}		

	}

}

