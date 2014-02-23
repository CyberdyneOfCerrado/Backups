package iteradores;

import java.util.ArrayList;

import objetos.Versao;

public class IteradorVersoes extends Iterador
{

	public IteradorVersoes(ArrayList<Object> colecao) 
	{
		super(colecao);
	}
	
	public  Versao next() 
	{
		return ( Versao ) super.next();
	}
}
