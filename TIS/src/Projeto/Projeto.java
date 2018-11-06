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
	
	

	protected String getNome() {
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
	protected float getOrcamento() {
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
}
