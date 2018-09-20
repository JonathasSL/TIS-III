import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
			FileOutputStream file = new FileOutputStream(".users",true);
			DataOutputStream output = new DataOutputStream(file);
			
			Usuario jonathas = new Usuario("jon","jon");
			System.out.println(jonathas);
			
			output.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}