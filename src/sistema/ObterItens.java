package sistema;

import java.io.*;
import java.util.ArrayList;

public class ObterItens {
	private ArrayList<Item> resul;
	
	public ObterItens(String raiz, File f[])	{
		resul = new ArrayList<Item>();
		
		for ( File res : f)
		{
			resul.add(new Item(res.getAbsolutePath(), res.getName(), res.isFile(), res.length()));
			if ( !res.isFile())
			{
				resul.addAll(subpastas(raiz + (raiz.endsWith(File.separator) ? "" : File.separator ), res));
			}
		}
	}
	public ObterItens(String raiz, File f)	{
		resul = new ArrayList<Item>();
		
		resul.add(new Item(f.getAbsolutePath(), f.getName(), f.isFile(), f.length()));
		if ( !f.isFile())
		{
			resul.addAll(subpastas(raiz + (raiz.endsWith(File.separator) ? "" : File.separator ), f));
		}
	}
	public ObterItens(String raiz, String file)	{
		File f = new File(file);
		resul = new ArrayList<Item>();
		
		resul.add(new Item(f.getAbsolutePath(), f.getName(), f.isFile(), f.length()));
		if ( !f.isFile())
		{
			resul.addAll(subpastas(raiz + (raiz.endsWith(File.separator) ? "" : File.separator ), f));
		}
	}
	private ArrayList<Item> subpastas(String raiz, File f)
	{
		ArrayList<Item> sub = new ArrayList<Item>();
		
		for(File aux : f.listFiles())
		{
			sub.add(new Item(aux.getAbsolutePath(), aux.getAbsolutePath().substring(raiz.length()), aux.isFile(), (int)aux.length()));
			if ( aux.isDirectory() )	sub.addAll(subpastas(raiz, aux));
		}
		return sub;
	}
	
	public ArrayList<Item> getList()
	{
		return resul;
	}
}
