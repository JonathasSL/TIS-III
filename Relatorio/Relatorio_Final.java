package Relatorio;

import Projeto.Projeto;
import Projeto.Status;


public class Relatorio_Final {

	private String nome;
	private String local;
	private String descricao;
	private float tempoGasto;
	private String artistasEnvolvidos;
	private String democratizacao;
	private String acessibilidade;
	private boolean prazo;
	private float orcamento;
	private float lucro;


	public Relatorio_Final  (String nome){
		setNome(nome);
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
	protected float getTempoGasto() {
		return tempoGasto;
	}
	protected void setTempoGasto (float tempoGasto) {
		this.tempoGasto = tempoGasto;
	}
	protected String getArtistasEnvolvidos () {
		return artistasEnvolvidos;
	}
	protected void setArtistasEnvolvidos (String artistasEnvolvidos) {
		this.artistasEnvolvidos = artistasEnvolvidos;
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
	protected boolean getPrazo () {
		return prazo;
	}
	protected void setPrazo(boolean prazo) {
		this.prazo = prazo;
	}
	protected float getOrcamento() {
		return orcamento;
	}
	protected void setOrcamento(float orcamento) {
		this.orcamento = orcamento;
	}
	protected float getLucro() {
		return lucro;
	}
	protected void setLucro(float lucro) {
		this.lucro = lucro;
	}






/*
chama a tela
chama o metodo q busca em projeto as info (nome, local, descrição)
 prazo eh true se status = status.finalizado , se prazo = true imprime msg sucesso
 lucro = ganho - orçamento
 artistas = busca no projeto
 tempo gasto = tempo fim- tempo ini
 democratizacao = se democratizacao string is not initial = true
 acessibilidade = se acessibilidade string is not initial = true


 */
	
}
