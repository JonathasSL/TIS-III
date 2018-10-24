package Usuario;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) {
		
		//Instancia um usuario passando uma string nome e uma string senha
		String name = "nome";
		String password = "senha";
		//passando o int 1 como modo de criar um novo usuario(para criptografar a senha) jamais passar int 2
		Usuario user = new Usuario(name,password,1);
		//passa o usuario como parametro para o create
		CRUDUsuario.create(user);
		System.out.println("usuario criado\n");

		/*no login, a tela de login instanciara um usuario e verificara se o usuario
		 *existe passando o mesmo como parametro para o metodo CRUDUsuario.retrieve
		 * que retorna o usuario se encontrado ou null se não encontrado */ 
		if(user.equals(CRUDUsuario.retrieve(user)));// para conferir se o usuario digitado existe e esta correto com o arquivo
			System.out.println("Logga");
		System.out.println(CRUDUsuario.retrieve(user));
		
		
	}

}