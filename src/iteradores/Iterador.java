package iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador implements Iterator<Object>
{
	int controle;
	ArrayList<Object> colecao;
	public Iterador(ArrayList<Object> colecao)
	{
		this.colecao = colecao;
		controle = -1 ;
	}
	
	public Iterador(){
		
	}
	@Override
	public boolean hasNext() 
	{
		return ( controle < colecao.size() );
	}

	@Override
	public Object next() 
	{
		return colecao.get(++controle);
	}

	@Override
	public void remove() 
	{
		colecao.remove(controle);
	}

}
