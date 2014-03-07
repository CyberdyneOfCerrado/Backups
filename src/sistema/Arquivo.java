package sistema;

import java.io.File;
import java.util.ArrayList;

import objetos.Artefato;

public class Arquivo {
//	public Arquivo()
	public ArrayList<Artefato> buscarClone(String path, String nome)
	{
		ArrayList<Artefato> duplicados = new ArrayList<Artefato>();
		ArrayList<Item> relacao;
		ArrayList<String> arquivos = new ArrayList<String>();
		File[] f = new File[0];
		f[0] = new File(nome);
		
		relacao = new ObterItens(path, f).getList();
		
		int x=0, y, z, cont;
		Item aux;
		while ( x < relacao.size() )
		{
			cont = 0;
			aux = relacao.get(x);
			if ( !aux.isFile() )
			{
				x++;
				continue;
			}
			
			for (y=x+1;y<relacao.size();y++)
			{
				if ( aux.getNomeArquivo().compareTo(relacao.get(y).getNomeArquivo()) == 0 )
				{
					cont++;
				}
			}
			if ( cont > 0 )
			{
				z = x;
				while ( z < relacao.size() )
				{
					if ( relacao.get(z).getNomeArquivo().compareTo(aux.getNomeArquivo()) == 0 )
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
		}
		return duplicados;
	}
}
