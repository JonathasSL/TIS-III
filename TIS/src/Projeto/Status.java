package Projeto;

public enum Status {
	EM_ESPERA,
	INICIADO,
	PENDENTE,
	EM_ANDAMENTO,
	EM_ATRASO;
	
	public String toString() {
		return this.name();
	}
	
}
