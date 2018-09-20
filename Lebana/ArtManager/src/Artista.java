public class Artista {
private String nomeArtista;
private String telefone;
private String email;


public String getNomeArtista() {
	return nomeArtista;
}
public void setNomeArtista(String nomeArtista) {
	this.nomeArtista = nomeArtista;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Artista(String nomeArtista, String telefone, String email) {
	this.nomeArtista = nomeArtista;
	this.telefone = telefone;
	this.email = email;
}

@Override
public String toString () {
return "nome: "+nomeArtista+" telefone: "+telefone+" email: "+email;
}







}
