package iteradores;

import java.util.ArrayList;

import objetos.Dias;

public class IteradorDias extends Iterador
{

	public IteradorDias(ArrayList<Object> colecao) 
	{
		super(colecao);
	}

	public Dias next()
	{
		return (Dias) super.next();
	}
}
