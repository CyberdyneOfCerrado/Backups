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
	public Lista()
	{
		this.lista = new ArrayList<Item>();
	}
	public void add(Item item)
	{
		this.lista.add(item);
	}
	public void addAll(Lista itens)
	{
		lista.addAll(itens.getLista());
	}
	public void AddAll(ArrayList<Item> itens)
	{
		lista.addAll(itens);
	}
	public ArrayList<Item> getLista()
	{
		return lista;
	}
}
