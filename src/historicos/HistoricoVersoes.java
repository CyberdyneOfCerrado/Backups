package historicos;

import objetos.Versao;
import iteradores.IteradorVersoes;


public class HistoricoVersoes extends Historico {

	public IteradorVersoes obterHistorico( int primaryKey ){
		return null;
	};
	
	public int salvar( Versao versao , int primaryKeyReference ){
		return super.salvar(versao, primaryKeyReference);
	};
}
