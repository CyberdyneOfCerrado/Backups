package sistema;
import java.io.Serializable;

public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String caminhoCompleto, caminhoRelativo, nome;
	private boolean isFile;
	private long tam;
	
	public Item (String caminhoCompleto, String caminhoRelativo, boolean isFile, long tam){
		this.caminhoCompleto = caminhoCompleto;
		this.caminhoRelativo = caminhoRelativo;
		this.nome = (isFile ) ? caminhoRelativo.substring(caminhoRelativo.lastIndexOf("\\")+1) : null;
		this.isFile = isFile;
		this.tam = tam;
	}
	
	public String getCaminhoCompleto()	{	return caminhoCompleto;	}
	public String getCaminhoRelativo()	{	return caminhoRelativo;	}
	public String getNomeArquivo()		{	return nome;			}
	public boolean isFile()	{	return isFile;	}
	public long getTam()		{	return tam;	}
}
