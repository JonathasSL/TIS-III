package editais;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

import Login.Usuario;

public abstract class CRUDEditais {
	private static final String NOME_ARQUIVO = "publicadores";

	public static boolean create(String nomeSite,String linkWeb) {
		try {
			FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
			PrintStream output = new PrintStream(file);

			Publicador publicador = new Publicador(nomeSite,linkWeb);
			if(!exist(publicador)) {
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

			if(!exist(publicador)) {
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

	public static boolean exist(Publicador publicador) {
		try {
			FileInputStream file = new FileInputStream(NOME_ARQUIVO);
			DataInputStream input = new DataInputStream(file);

			String nomeSite = null;
			String linkWeb = null;

			while(input.available() !=0) {
				StringTokenizer sToken = new StringTokenizer(input.readLine(),";");
				nomeSite = sToken.nextToken();
				linkWeb = sToken.nextToken();
				Usuario temp = new Usuario(nomeSite,linkWeb,2);
				if(publicador.equals(temp)) {
					input.close();
					file.close();
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<Publicador> retrieve(String retrieve) {
		try {
			FileInputStream file = new FileInputStream(NOME_ARQUIVO);
			DataInputStream input = new DataInputStream(file);

			ArrayList<Publicador> publicadores = new ArrayList<>();

			String nomeSite;
			String linkWeb;

			while(input.available() != 0) {
				StringTokenizer line = new StringTokenizer(input.readLine(),";");
				nomeSite = line.nextToken();
				linkWeb = line.nextToken();
				Publicador pub = new Publicador(nomeSite,linkWeb);
				publicadores.add(pub);
			}
			return publicadores;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean updateNomeSite(Publicador publicador, String nomeSite){
		if(exist(publicador)){
			delete(publicador);
			publicador.setNomeSite(nomeSite);

			try {
				FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
				PrintStream output = new PrintStream(file);

				output.println(publicador);
				output.close();
				file.close();

				return true;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return false;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}

		}
		return false;
	}
	public static boolean updateLinkWeb(Publicador publicador, String nomeSite){
		if(exist(publicador)){
			delete(publicador);
			publicador.setLinkWeb(nomeSite);

			try {
				FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
				PrintStream output = new PrintStream(file);

				output.println(publicador);
				output.close();
				file.close();

				return true;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return false;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}

		}
		return false;
	}

	public static boolean delete(Publicador publicador){
		if(exist(publicador)){
			try {
				FileInputStream file = new FileInputStream(NOME_ARQUIVO);
				DataInputStream input = new DataInputStream(file);

				FileOutputStream tempFile = new FileOutputStream("temp_"+NOME_ARQUIVO,false);
				PrintStream output = new PrintStream(tempFile);

				String nomeSite;
				String linkWeb;
				while(input.available() !=0){
					StringTokenizer sToken = new StringTokenizer(input.readLine(),";");
					nomeSite = sToken.nextToken();
					linkWeb = sToken.nextToken();
					Publicador temp = new Publicador(nomeSite,linkWeb);
					if(!temp.equals(publicador))
						output.println(input.readLine());
				}

				output.flush();
				output.close();
				tempFile.close();
				input.close();
				file.close();

				FileInputStream tempFile1 = new FileInputStream("temp_"+NOME_ARQUIVO);
				DataInputStream input1 = new DataInputStream(tempFile1);

				FileOutputStream file1 = new FileOutputStream(NOME_ARQUIVO,false);
				PrintStream output1 = new PrintStream(file1);

				while(input1.available() != 0)
					output1.println(input1.readLine());


				output1.close();
				file1.close();

				input1.close();
				tempFile1.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return false;
	}
}
