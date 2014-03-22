package sistema;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;

import GUI.SingleGuiMain;

import enuns.Status;
import objetos.Artefato;

public class CopiarArtefatos extends Thread{
	private String origem = null, destino = null, nomezip = null;
	private boolean isZip = false, parar = false;
	private ArrayList<Artefato> copiados;
	private long cont=0;
	private Status resultado = Status.FALHATOTAL;

	public CopiarArtefatos(String origem, String destino, boolean desligar)
	{
		this.copiados = new ArrayList<Artefato>();
		this.origem = origem;
		this.destino = destino.replaceAll("\\|", "");
	}	
	public void run()
	{
		this.parar = false;
		String[] paths = this.origem.split("\\|");
		ArrayList<Item> relacao = new ArrayList<Item>();

		for(String path : paths)
		{
			if ( path == null || path.length() == 0 )	continue;
			if ( this.parar )	return;
			path = path.replaceAll("\n", "");
			System.out.println(path);
			try
			{
				relacao.addAll(varrerDiretorios(path.substring(0 , path.lastIndexOf(File.separator)), path));
			} catch ( Exception e)
			{
				
			}
		}
		if ( this.nomezip != null )
		{
			this.destino += (this.destino.endsWith(File.separator)) ? this.nomezip + ".zip" : File.separator + this.nomezip + ".zip";
			this.isZip = true;
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
		SingleGuiMain.getInstance().stopCarregamento();
		this.parar = true;
	}
	public ArrayList<Artefato> getConcluidos()
	{
		return this.copiados;
	}
	public boolean isRodando()
	{
		return !this.parar;
	}
	public Status getResultado()
	{
		return this.resultado;
	}
	public void setZip(String nomezip)
	{
		this.nomezip = nomezip;
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
			this.cont++;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Falhou.");
			return;
		}
	        
        for ( Item item : relacao )
        {
        	if ( this.parar )	break;
        	ZipEntry ze = new ZipEntry(item.getCaminhoRelativo());
        	if ( !item.isFile())
        	{
        		this.cont++;
        		continue;
        	}        	
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
	               this.copiados.add(new Artefato(item.getCaminhoCompleto(),Long.toString((new File(item.getCaminhoCompleto())).lastModified())));
	               this.cont++;
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
        if ( this.cont == 0 && relacao.size() > 0 )
        {
        	this.resultado = Status.FALHATOTAL;
        	return;
        }
        if ( this.cont < relacao.size())
        {
        	
        	this.resultado = Status.FALHAPARCIAL;
        	return;
        }
        this.resultado = Status.SUCESSO;
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
        		this.cont++;
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
	               this.cont++;
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
        if ( this.cont == 0 && relacao.size() > 0 )
        {
        	this.resultado = Status.FALHATOTAL;
        	return;
        }
        if ( this.cont < relacao.size())
        {
        	this.resultado = Status.FALHAPARCIAL;
        	return;
        }
        this.resultado = Status.SUCESSO;
	}	
}
