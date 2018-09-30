import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) {
		
		try {
			FileOutputStream file = new FileOutputStream(".users",true);
			PrintStream output = new PrintStream(file);
			
			System.out.println();
			Usuario user = new Usuario("jon","jon");
			System.out.println(user);
			output.println(user);
			
			output.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}