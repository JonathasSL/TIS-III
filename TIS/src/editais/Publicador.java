package editais;

public class Publicador {
	private String nomeSite;
	private String linkWeb;
	
	Publicador(String nomeSite, String linkWeb){
		setNomeSite(nomeSite);
		setLinkWeb(linkWeb);
	}

	public boolean equals(Publicador p) {
		return p.getLinkWeb() == getLinkWeb();
	}
	
	public String toString() {
		return getNomeSite()+";"+getLinkWeb();
	}
	public String getNomeSite() {
		return nomeSite;
	}
	public void setNomeSite(String nomeSite) {
		this.nomeSite = nomeSite;
	}

	public String getLinkWeb() {
		return linkWeb;
	}
	public void setLinkWeb(String linkWeb) {
		this.linkWeb = linkWeb;
	}
}
