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
	private String stats;
	
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
	protected String getLocal() {
		return local;
	}
	protected void setLocal(String local) {
		this.local = local;
	}
	protected String getDescricao() {
		return descricao;
	}
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	protected String getObjetivo() {
		return objetivo;
	}
	protected void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	protected String getResumo() {
		return resumo;
	}
	protected void setResumo(String resumo) {
		this.resumo = resumo;
	}
	protected String getJustificativa() {
		return justificativa;
	}
	protected void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	protected String getDemocratizacao() {
		return democratizacao;
	}
	protected void setDemocratizacao(String democratizacao) {
		this.democratizacao = democratizacao;
	}
	protected String getAcessibilidade() {
		return acessibilidade;
	}
	protected void setAcessibilidade(String acessibilidade) {
		this.acessibilidade = acessibilidade;
	}
	protected int getPublicoEstimado() {
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
	protected Status getStatus() {
		return status;
	}
	protected void setStatus(Status status) {
		this.status = status;
	} 
	public String getStats() {
		return stats;
	}
	public void setStats(String stats) {
		this.stats = stats;
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
