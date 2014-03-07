package sistema;

import java.io.Serializable;
import java.util.ArrayList;

public class Lista implements Serializable	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Item> lista;
	
	public Lista(ArrayList<Item> lista)
	{
		this.lista = lista;
	}
	public ArrayList<Item> getLista()
	{
		return lista;
	}
}
