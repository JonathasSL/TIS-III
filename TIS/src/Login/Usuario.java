package Login;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
	private String userName;
	private String password;
	private String email;

	public Usuario(String userName, String password,int mode) {
		if(mode == 1) {
			setUserName(userName);
			setPassword(digestPassword(password));
			//		this.setEmail(email);
		} else {
			if(mode == 2) {
				setUserName(userName);
				setPassword(password);
			}
		}
	}
	
	public boolean equals(Usuario user) {
		return (this.userName.equals(user.getUserName()) && this.password.equals(user.getCriptoPassword()))?true:false;
	}
	public boolean equals(String userName) {
		return userName.equalsIgnoreCase(this.userName);
	}
	
	public Usuario clone() {
		Usuario user = new Usuario(this.userName,this.password,2);
		return user;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCriptoPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void newPassword(String password) {
		setPassword(digestPassword(password));
	}
	public String digestPassword(String password) {
		try {
			MessageDigest cript = MessageDigest.getInstance("MD5");
			byte messageDigest[] = cript.digest(password.getBytes("UTF-8"));

			StringBuilder hexString = new StringBuilder();
			for (byte b: messageDigest)
				hexString.append(String.format("%02x",0xFF & b));

			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return userName + ";" + password;
	}

}