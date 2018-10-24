package Estoque;

public class Item {
	private int emEstoque;
	
	public Item() {
		
	}

	public int getEmEstoque() {
		return emEstoque;
	}
	public void setEmEstoque(int emEstoque) {
		if(emEstoque>0)
			this.emEstoque = emEstoque;
	}
	
}
