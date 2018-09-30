import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
	private String userName;
	private String password;
	private String email;
	
	public Usuario(String userName, String password,String email) {
		this.setUserName(userName);
		this.setPassword(password);
		this.setEmail(email);
	}
	public Usuario(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		try {
			MessageDigest cript = MessageDigest.getInstance("MD5");
			byte messageDigest[] = cript.digest(password.getBytes("UTF-8"));

			StringBuilder hexString = new StringBuilder();
			for (byte b: messageDigest)
				hexString.append(String.format("%02x",0xFF & b));

			this.password = hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "userName=" + userName + "; password=" + password;
	}

}