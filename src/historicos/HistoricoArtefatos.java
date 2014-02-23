package historicos;

import objetos.Artefato;
import iteradores.IteradorArtefatos;

public class HistoricoArtefatos extends Historico {

	public IteradorArtefatos obterHistorico( int primaryKey ){
		return null;
	};
	
	public int salvar( Artefato artefato , int primaryKeyReference ){
		return super.salvar(artefato, primaryKeyReference);
	};
}
