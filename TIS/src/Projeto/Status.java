package Projeto;

import java.util.Iterator;

public enum Status implements Iterator{
	EM_ESPERA,
	INICIADO,
	PENDENTE,
	EM_ANDAMENTO,
	EM_ATRASO;
	
	public String toString() {
		return this.name();
	}

	@Override
	public boolean hasNext() {
		if(this.ordinal()<(Status.values().length-1))
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		Status[] s = values();
		if(hasNext())
			return s[this.ordinal()+1];
		return null;
	}
	
}
