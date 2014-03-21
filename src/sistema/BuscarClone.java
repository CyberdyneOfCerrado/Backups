package sistema;

import java.util.ArrayList;

import GUI.SingleGuiMain;

import objetos.Artefato;

public class BuscarClone extends Thread{
	private ArrayList<Artefato> duplicados = null;
	private String path, nome;
	private boolean parar = true;
	
	public BuscarClone(String path, String nome)
	{
		this.path = path;
		this.nome = nome;
	}
	public void parar()
	{
		this.parar = true;
	}
	public boolean isRodando()
	{
		return !this.parar;
	}
	public ArrayList<Artefato> getDuplicados()
	{
		return this.duplicados;
	}
	public void run()
	{
		this.parar= false;
		ArrayList<Item> relacao;

		relacao = new ObterItens(this.path, this.nome).getList();
		
		int x=0, y, z, cont;
		Item aux;
		while ( x < relacao.size() )
		{
			if ( this.parar )	return;
			cont = 0;
			aux = relacao.get(x);
			if ( !aux.isFile() )
			{
				relacao.remove(x);
				continue;
			}
			
			for (y=x+1;y<relacao.size();y++)
			{
				if ( this.parar )	return;
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
					if ( this.parar )	return;
					if ( relacao.get(z).isFile() && relacao.get(z).getNomeArquivo().compareTo(aux.getNomeArquivo()) == 0 )
					{
						this.duplicados.add(new Artefato(relacao.get(z).getCaminhoCompleto(), Long.toString(relacao.get(z).getTam())));
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
		SingleGuiMain.getInstance().stopCarregamento();
		this.parar = true;
	}
}
