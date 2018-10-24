package Usuario;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class CRUDUsuario {
	private static final String NOME_ARQUIVO = "users"; 

	@SuppressWarnings("deprecation")
	public static boolean create(String nome, String senha) {
		try {
			FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
			PrintStream output = new PrintStream(file);

			Usuario user = new Usuario(nome,senha,1);
			if(retrieve(user) == null) {
				output.println(user);
				output.close();
				file.close();
				return true;
			}

			output.close();
			file.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public static boolean create(Usuario user) {
		try {
			FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
			PrintStream output = new PrintStream(file);

			FileInputStream openFile = new FileInputStream(NOME_ARQUIVO);
			DataInputStream input = new DataInputStream(openFile);

			if(input.available() == 0) {
				output.println(user);
				
				openFile.close();
				input.close();
				output.close();
				file.close();
			}else
				if(retrieve(user) == null) {
					output.println(user);
					output.close();
					file.close();
					return true;
				}

			output.close();
			file.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public static Usuario retrieve(Usuario usuario) {
		try {
			FileInputStream file = new FileInputStream(NOME_ARQUIVO);
			DataInputStream input = new DataInputStream(file);

			String userName = null;
			String password = null;
			boolean notFound = true;
			Usuario user = null;

			while(input.available() != 0 && notFound) {
				StringTokenizer sToken = new StringTokenizer(input.readLine(),";");
				userName = sToken.nextToken();
				password = sToken.nextToken();
				Usuario temp = new Usuario(userName,password,2);
				if(usuario.equals(temp)) {	
					notFound = false;
					user = temp.clone();
				}
			}
			input.close();
			file.close();
			return user;
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo nao existe");
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static boolean updateUserName(Usuario user, String newName) {
		if(retrieve(user) != null) {
			delete(user);
			user.setUserName(newName);

			try {
				FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
				PrintStream output = new PrintStream(file);

				output.println(user);
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

	public static boolean updatePassword(Usuario user, String newPassword){
		if(retrieve(user) != null) {			
			try {
				FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
				PrintStream output = new PrintStream(file);

				delete(user);
				user.newPassword(newPassword);

				output.println(user);
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

	public static boolean delete(Usuario user) {
		if(retrieve(user) != null) {
			try {
				FileInputStream file = new FileInputStream(NOME_ARQUIVO);
				DataInputStream input = new DataInputStream(file);

				FileOutputStream tempFile = new FileOutputStream("temp_"+NOME_ARQUIVO,false);
				PrintStream output = new PrintStream(tempFile);

				String userName = null;
				String password = null;
				while(input.available() != 0) {
					StringTokenizer sToken = new StringTokenizer(input.readLine(),";");
					userName = sToken.nextToken();
					password = sToken.nextToken();
					Usuario temp = new Usuario(userName,password,2);
					if(!temp.equals(user))
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

}
