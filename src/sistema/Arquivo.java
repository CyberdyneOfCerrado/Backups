package sistema;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;

import objetos.Artefato;

public class Arquivo {
	public Arquivo(String origem, String destino, boolean desligar, boolean isZip)
	{
		String[] paths = origem.split("|");
		ArrayList<Item> relacao = new ArrayList<Item>();
		
		for(String path : paths)
		{
			relacao.addAll(varrerDiretorios(path.substring(0 , path.lastIndexOf("\\")), path));
		}
		if ( isZip )
		{
			salvarZip(relacao, destino);
		}
		else
		{
			salvarAvulso(relacao, destino);
		}
	}
	private ArrayList<Item> varrerDiretorios(String origem, String path)
	{
		return new ObterItens(origem, path).getList();
	}
	private void salvarZip(ArrayList<Item> relacao, String destino)
	{
		int len;
        byte[] buffer = new byte[5242880];
        FileInputStream in = null;
        FileOutputStream fos = null;
        ZipOutputStream zos = null;

		try {
			fos = new FileOutputStream(destino);			
			zos = new ZipOutputStream(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Falhou.");
			return;
		}
	        
        for ( Item item : relacao )
        {
        	if ( !item.isFile())	continue;
        	ZipEntry ze = new ZipEntry(item.getCaminhoRelativo());
            try {
				zos.putNextEntry(ze);
			
	            try
	            {
	               in = new FileInputStream(item.getCaminhoCompleto());
	               
	               while ((len = in.read(buffer)) > 0)
	               {
	                  zos.write(buffer, 0, len);
	                  zos.flush();
	               }
	            }
	            catch ( IOException e)
	            {
	            	e.printStackTrace();
	            }
	            finally
	            {
	               in.close();
	            }
            }
            catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        try {
        	if ( zos != null )	zos.finish();
        	if ( fos != null )	fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void salvarAvulso(ArrayList<Item> relacao, String destino)
	{
		int len;
        byte[] buffer = new byte[5242880];
        FileInputStream in = null;
        FileOutputStream fos = null;
        
        for ( Item item : relacao )
        {
        	if ( !item.isFile())
        	{
        		new File(destino + "\\" + item.getCaminhoRelativo()).mkdir();
        		continue;
        	}
            try {
            	fos = new FileOutputStream(destino + "\\" + item.getCaminhoRelativo());
	            try
	            {
	               in = new FileInputStream(item.getCaminhoCompleto());
	               
	               while ((len = in.read(buffer)) > 0)
	               {
	                  fos.write(buffer, 0, len);
	                  fos.flush();
	               }
	            }
	            catch ( IOException e)
	            {
	            	e.printStackTrace();
	            }
	            finally
	            {
	               in.close();
	               fos.close();
	            }
            }
            catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
	public ArrayList<Artefato> buscarClone(String path, String nome)
	{
		ArrayList<Artefato> duplicados = new ArrayList<Artefato>();
		ArrayList<Item> relacao;

		relacao = new ObterItens(path, nome).getList();
		
		int x=0, y, z, cont;
		Item aux;
		while ( x < relacao.size() )
		{
			cont = 0;
			aux = relacao.get(x);
			if ( !aux.isFile() )
			{
				relacao.remove(x);
				continue;
			}
			
			for (y=x+1;y<relacao.size();y++)
			{
				if ( relacao.get(y).isFile() && aux.getNomeArquivo().compareTo(relacao.get(y).getNomeArquivo()) == 0 )
				{
					cont++;
				}
			}
			if ( cont > 0 )
			{
				z = x;
				while ( z < relacao.size() )
				{
					if ( relacao.get(z).isFile() && relacao.get(z).getNomeArquivo().compareTo(aux.getNomeArquivo()) == 0 )
					{
						duplicados.add(new Artefato(relacao.get(z).getCaminhoCompleto(), Long.toString(relacao.get(z).getTam())));
						relacao.remove(z);
					}
					else
					{
						z++;
					}
				}
			}
			x++;
		}        
		return duplicados;
	}
}
