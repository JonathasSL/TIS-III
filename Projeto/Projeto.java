package Projeto;

public class Projeto {
	private String nome;
	private String local;
	private String descricao;
	private String objetivo;
	private String resumo;
	private String justificativa;
	private String democratizacao;
	private String acessibilidade;
	private int publicoEstimado;
	private float orcamento;
	private Status status;
	
	public Projeto(String nome){
		setNome(nome);
		setStatus(Status.EM_ESPERA);
	}
	
	
	public String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	protected void setLocal(String local) {
		this.local = local;
	}
	public String getDescricao() {
		return descricao;
	}
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObjetivo() {
		return objetivo;
	}
	protected void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getResumo() {
		return resumo;
	}
	protected void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getJustificativa() {
		return justificativa;
	}
	protected void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public String getDemocratizacao() {
		return democratizacao;
	}
	protected void setDemocratizacao(String democratizacao) {
		this.democratizacao = democratizacao;
	}
	public String getAcessibilidade() {
		return acessibilidade;
	}
	protected void setAcessibilidade(String acessibilidade) {
		this.acessibilidade = acessibilidade;
	}
	public int getPublicoEstimado() {
		return publicoEstimado;
	}
	protected void setPublicoEstimado(int publicoEstimado) {
		this.publicoEstimado = publicoEstimado;
	}
	public float getOrcamento() {
		return orcamento;
	}
	protected void setOrcamento(float orcamento) {
		this.orcamento = orcamento;
	}
	public Status getStatus() {
		return status;
	}
	protected void setStatus(Status status) {
		this.status = status;
	} 
	
	public boolean equals(Projeto projeto) {
		if(projeto.getNome().equalsIgnoreCase(this.nome))
			if(projeto.getLocal().equalsIgnoreCase(this.local))
				if(projeto.getDescricao().equalsIgnoreCase(this.descricao))
					return true;
		return false;
	}
	
	@Override
	public String toString() {
		return nome + ";" + local + ";" + descricao + ";" + objetivo + ";" + resumo + ";" + justificativa + ";" + democratizacao
				+ ";" + acessibilidade + ";" + publicoEstimado + ";" + orcamento + ";" + status;
	}
}
