package Relatorio;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import Projeto.Projeto;
import Projeto.CRUDProjeto;
import Relatorio.RelatorioUI;

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

	
	public byte[] getByteArray() throws IOException {
        ByteArrayOutputStream dados = new ByteArrayOutputStream();
        DataOutputStream saida = new DataOutputStream( dados );
        saida.writeUTF(this.nome);
        saida.writeUTF(this.local);
        saida.writeUTF(this.descricao);
        saida.writeFloat(this.tempoGasto);
        saida.writeUTF(this.artistasEnvolvidos);
        saida.writeUTF(this.democratizacao);
        saida.writeUTF(this.acessibilidade);
        saida.writeBoolean(this.prazo);
        saida.writeFloat(this.orcamento);
        saida.writeFloat(this.lucro);
        return dados.toByteArray();        
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

	public void buscaDados(String nome) {
		Projeto p = CRUDProjeto.retrieve(nome);
		

		new RelatorioUI(p);
	}



}


	

