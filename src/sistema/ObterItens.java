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
				resul.addAll(subpastas(raiz + (raiz.endsWith("\\") ? "" : '\\' ), res));
			}
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
