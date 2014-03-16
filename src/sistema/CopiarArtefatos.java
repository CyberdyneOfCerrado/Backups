package sistema;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;

public class CopiarArtefatos extends Thread{
	private String origem = null, destino = null;
	boolean desligar = false, isZip = false, parar = false;

	public CopiarArtefatos(String origem, String destino, boolean desligar)
	{
		this.origem = origem;
		this.destino = destino;
		this.desligar = desligar;
	}	
	public void run()
	{
		this.parar = false;
		String[] paths = this.origem.split("\\|");
		ArrayList<Item> relacao = new ArrayList<Item>();
		
		for(String path : paths)
		{
			System.out.println(path);
		}
		
		for(String path : paths)
		{
			if ( path == null || path.length() == 0 )	continue;
			if ( this.parar )	return;
			relacao.addAll(varrerDiretorios(path.substring(0 , path.lastIndexOf(File.separator)), path));
		}
		if ( isZip )
		{
			if ( new File(this.destino).isDirectory() )
			{
				System.out.println("Inválido!");
				this.parar = true;
				return;
			}
			salvarZip(relacao, this.destino);
		}
		else
		{
			if ( new File(this.destino).isFile() )
			{
				System.out.println("Inválido!");
				this.parar = true;
				return;
			}
			if ( !new File(this.destino).exists())	new File(this.destino).mkdir();
			salvarAvulso(relacao, this.destino);
		}
		this.parar = true;
	}
	public boolean isRodando()
	{
		return !this.parar;
	}
	public void parar()
	{
		this.parar = true;
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
        	if ( this.parar )	break;
        	if ( !item.isFile())	continue;
        	ZipEntry ze = new ZipEntry(item.getCaminhoRelativo());
            try {
				zos.putNextEntry(ze);
			
	            try
	            {
	               in = new FileInputStream(item.getCaminhoCompleto());
	               
	               while ((len = in.read(buffer)) > 0 && !this.parar)
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
        if ( this.parar )	new File(destino).delete();
	}
	private void salvarAvulso(ArrayList<Item> relacao, String destino)
	{
		int len;
        byte[] buffer = new byte[5242880];
        FileInputStream in = null;
        FileOutputStream fos = null;
        
        for ( Item item : relacao )
        {
        	if ( this.parar )	break;
        	
        	if ( !item.isFile())
        	{
        		new File(destino + File.separator + item.getCaminhoRelativo()).mkdir();
        		continue;
        	}
            try {
            	fos = new FileOutputStream(destino + File.separator + item.getCaminhoRelativo());
	            try
	            {
	               in = new FileInputStream(item.getCaminhoCompleto());
	               
	               while ((len = in.read(buffer)) > 0 && !this.parar)
	               {
	                  fos.write(buffer, 0, len);
	                  fos.flush();
	               }
	               if (new File(item.getCaminhoCompleto()).length() > new File(destino + File.separator + item.getCaminhoRelativo()).length() )
	               {
	            	   new File(destino + File.separator + item.getCaminhoRelativo()).delete();
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
}
