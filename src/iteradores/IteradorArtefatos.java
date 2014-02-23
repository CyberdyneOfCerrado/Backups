package iteradores;

import java.util.ArrayList;

import objetos.Artefato;

public class IteradorArtefatos extends Iterador 
{
	public IteradorArtefatos(ArrayList<Object> colecao) 
	{
		super(colecao);
		// TODO Auto-generated constructor stub
	}

	public Artefato next() 
	{
		return ( Artefato ) super.next();
	}
}
