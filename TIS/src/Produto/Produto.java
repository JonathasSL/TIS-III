package Produto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ArtManager.Entidade;



public class Produto implements Entidade{
	protected int    id;
    protected String nome;
    protected String descricao;
    protected String  preco;
    
    public Produto(int id, String nome, String descricao, String preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Produto() {
        this.id = 0;
        this.nome = "";
        this.descricao = "";
        this.preco = "";        
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String toString() {
        return "\nCódigo: " + this.id +
               "\nNome: " + this.nome +
               "\nDescrição: " + this.descricao +
               "\nPreço: " + this.preco;
    }
    
    public byte[] getByteArray() throws IOException {
        ByteArrayOutputStream dados = new ByteArrayOutputStream();
        DataOutputStream saida = new DataOutputStream( dados );
        saida.writeInt(this.id);
        saida.writeUTF(this.nome);
        saida.writeUTF(this.descricao);
        saida.writeUTF(this.preco);
        return dados.toByteArray();        
    }
    
    public void setByteArray(byte[] b) throws IOException {
        ByteArrayInputStream dados = new ByteArrayInputStream(b);
        DataInputStream entrada = new DataInputStream(dados);
        this.id = entrada.readInt();
        this.nome = entrada.readUTF();
        this.descricao = entrada.readUTF();
        this.preco = entrada.readUTF();
    }
    
	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	@Override
	public String getNome() {
		return this.nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}

	


}
