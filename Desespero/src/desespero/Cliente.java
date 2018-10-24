package desespero;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


public class Cliente implements Entidade{
	protected int    id;
    protected String nome;
    protected String telefone;
    protected String  email;
    
    public Cliente(int id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    public Cliente() {
        this.id = 0;
        this.nome = "";
        this.telefone = "";
        this.email = "";        
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
               "\nTelefone.: " + this.telefone +
               "\nEmail: " + this.email;
    }
    
    public byte[] getByteArray() throws IOException {
        ByteArrayOutputStream dados = new ByteArrayOutputStream();
        DataOutputStream saida = new DataOutputStream( dados );
        saida.writeInt(this.id);
        saida.writeUTF(this.nome);
        saida.writeUTF(this.telefone);
        saida.writeUTF(this.email);
        return dados.toByteArray();        
    }
    
    public void setByteArray(byte[] b) throws IOException {
        ByteArrayInputStream dados = new ByteArrayInputStream(b);
        DataInputStream entrada = new DataInputStream(dados);
        this.id = entrada.readInt();
        this.nome = entrada.readUTF();
        this.telefone = entrada.readUTF();
        this.email = entrada.readUTF();
    }
    
	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	@Override
	public String getNome() {
		return this.nome;
	}



}
