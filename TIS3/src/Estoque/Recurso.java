package Estoque;

import java.util.Date;

public class Recurso {
	private int quantidade;
	private float preco_usado;
	private Date data;
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float getPreco_usado() {
		return preco_usado;
	}
	public void setPreco_usado(float preco_usado) {
		this.preco_usado = preco_usado;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	
}
