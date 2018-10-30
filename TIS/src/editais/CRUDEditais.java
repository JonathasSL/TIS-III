package editais;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public abstract class CRUDEditais {
	private static final String NOME_ARQUIVO = "publicadores";
	
	public static boolean create(String nomeSite,String linkWeb) {
		try {
			FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
			PrintStream output = new PrintStream(file);
			
			Publicador publicador = new Publicador(nomeSite,linkWeb);
			if(retrieve(publicador) == null) {
				output.println(publicador);
				output.close();
				file.close();
				return true;
			}
			output.close();
			file.close();
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

		return false;
		
	}
	public static boolean create(Publicador publicador) {
		try {
			FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
			PrintStream output = new PrintStream(file);
			
			if(retrieve(publicador) == null) {
				output.println(publicador);
				output.close();
				file.close();
				return true;
			}
			output.close();
			file.close();
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

		return false;
		
	}

	public static Publicador retrieve(Publicador pub) {
		
		return pub;
	}
}
