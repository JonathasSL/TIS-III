package ArtManager;

import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import Artista.Artista;
import Cliente.Cliente;
import Fornecedor.Fornecedor;
import Produto.Produto;



public class Arquivo <T extends Entidade> {
	 RandomAccessFile arquivo;
	    String nomeArquivo;
	    Constructor<T> construtor;
	    
	    public Arquivo(Constructor<T> c, String n) throws Exception {
	        nomeArquivo = n;
	        construtor = c;
	        arquivo = new RandomAccessFile(nomeArquivo, "rw");
	        if(arquivo.length()<4)
	            arquivo.writeInt(0);
	    }
	    
	    public int incluir(T obj) throws Exception {
	        arquivo.seek(0);
	        int id = arquivo.readInt();
	        id++;
	        obj.setId(id);
	        arquivo.seek(0);
	        arquivo.writeInt(id);

	        arquivo.seek(arquivo.length());
	        arquivo.writeByte(' ');
	        byte[] b = obj.getByteArray();
	        arquivo.writeInt(b.length);
	        arquivo.write(b);
	        
	        return id;
	    }
	    
	    public Cliente[] listarClientes() throws Exception {

	        // Em um sistema real, o número de registros será muito superior ao que
	        // um ArrayList poderia comportar em memória. Esta operação está aqui
	        // apenas para facilitar a depuração do código
	     
	        ArrayList<T> lista = new ArrayList<>();
	        arquivo.seek(4);
	        byte lapide;
	        byte[] b;
	        int s;
	        T obj;
	        while(arquivo.getFilePointer()<arquivo.length()) {
	            obj = construtor.newInstance();
	            lapide = arquivo.readByte();
	            s = arquivo.readInt();
	            b = new byte[s];
	            arquivo.read(b);
	            obj.setByteArray(b);
	            if(lapide==' ')
	                lista.add(obj);
	        }
	        
	        Cliente[] ls = lista.toArray(new Cliente[lista.size()]);
	        return ls;
	    }
	    
	    public Artista[] listarArtistas() throws Exception {

	        // Em um sistema real, o número de registros será muito superior ao que
	        // um ArrayList poderia comportar em memória. Esta operação está aqui
	        // apenas para facilitar a depuração do código
	     
	        ArrayList<T> lista = new ArrayList<>();
	        arquivo.seek(4);
	        byte lapide;
	        byte[] b;
	        int s;
	        T obj;
	        while(arquivo.getFilePointer()<arquivo.length()) {
	            obj = construtor.newInstance();
	            lapide = arquivo.readByte();
	            s = arquivo.readInt();
	            b = new byte[s];
	            arquivo.read(b);
	            obj.setByteArray(b);
	            if(lapide==' ')
	                lista.add(obj);
	        }
	        
	        Artista[] ls = lista.toArray(new Artista[lista.size()]);
	        return ls;
	    }
	    
	    public Fornecedor[] listarFornecedores() throws Exception {

	        // Em um sistema real, o número de registros será muito superior ao que
	        // um ArrayList poderia comportar em memória. Esta operação está aqui
	        // apenas para facilitar a depuração do código
	     
	        ArrayList<T> lista = new ArrayList<>();
	        arquivo.seek(4);
	        byte lapide;
	        byte[] b;
	        int s;
	        T obj;
	        while(arquivo.getFilePointer()<arquivo.length()) {
	            obj = construtor.newInstance();
	            lapide = arquivo.readByte();
	            s = arquivo.readInt();
	            b = new byte[s];
	            arquivo.read(b);
	            obj.setByteArray(b);
	            if(lapide==' ')
	                lista.add(obj);
	        }
	        
	        Fornecedor[] ls = lista.toArray(new Fornecedor[lista.size()]);
	        return ls;
	    }
	    
	    public Produto[] listarProdutos() throws Exception {

	        // Em um sistema real, o número de registros será muito superior ao que
	        // um ArrayList poderia comportar em memória. Esta operação está aqui
	        // apenas para facilitar a depuração do código
	     
	        ArrayList<T> lista = new ArrayList<>();
	        arquivo.seek(4);
	        byte lapide;
	        byte[] b;
	        int s;
	        T obj;
	        while(arquivo.getFilePointer()<arquivo.length()) {
	            obj = construtor.newInstance();
	            lapide = arquivo.readByte();
	            s = arquivo.readInt();
	            b = new byte[s];
	            arquivo.read(b);
	            obj.setByteArray(b);
	            if(lapide==' ')
	                lista.add(obj);
	        }
	        
	        Produto[] ls = lista.toArray(new Produto[lista.size()]);
	        return ls;
	    }
	    
	    public Entidade buscar(String nome) throws Exception {
	        
	        T obj = construtor.newInstance();
	        byte lapide;
	        byte[] b;
	        int s;
	        
	        arquivo.seek(4);
	        while(arquivo.getFilePointer() < arquivo.length()) {
	            lapide = arquivo.readByte();
	            s = arquivo.readInt();
	            b = new byte[s];
	            arquivo.read(b);
	            obj.setByteArray(b);
	            if(lapide == ' ' && obj.getNome().equals(nome))
	                return obj;
	        }
	        return null;
	    }
	    
	    
	    public boolean excluir(String nome) throws Exception {
	        
	        T obj = construtor.newInstance();
	        byte lapide;
	        byte[] b;
	        int s;
	        long endereco;
	        
	        arquivo.seek(4);
	        while(arquivo.getFilePointer() < arquivo.length()) {
	            endereco = arquivo.getFilePointer();
	            lapide = arquivo.readByte();
	            s = arquivo.readInt();
	            b = new byte[s];
	            arquivo.read(b);
	            obj.setByteArray(b);
	            if(lapide == ' ' && obj.getNome().equals(nome)) {
	                arquivo.seek(endereco);
	                arquivo.write('*');
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public boolean alterar(T novoObj) throws Exception {

	        T obj = construtor.newInstance();
	        byte lapide;
	        byte[] b;
	        int s;
	        long endereco;
	        int id = novoObj.getId();
	        
	        arquivo.seek(4);
	        while(arquivo.getFilePointer() < arquivo.length()) {
	            endereco = arquivo.getFilePointer();
	            lapide = arquivo.readByte();
	            s = arquivo.readInt();
	            b = new byte[s];
	            arquivo.read(b);
	            obj.setByteArray(b);
	            if(lapide == ' ' && obj.getId()==id) {
	                arquivo.seek(endereco);
	                arquivo.write('*');
	                
	                arquivo.seek(arquivo.length());
	                arquivo.writeByte(' ');
	                b = novoObj.getByteArray();
	                arquivo.writeInt(b.length);
	                arquivo.write(b);
	                
	                return true;
	            }
	        }
	        return false;

	    }



}
