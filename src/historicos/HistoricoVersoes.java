package historicos;

import objetos.Versao;
import iteradores.IteradorVersoes;


public class HistoricoVersoes extends Historico {
	final String sql = "SELECT * FROM VERSAO WHERE FK = ";
	
	public IteradorVersoes obterHistorico( int primaryKey ){
		return new IteradorVersoes(super.obter(sql + primaryKey));
	};
	
	public int salvar( Versao versao , int primaryKeyReference ){
		return super.salvar(versao, primaryKeyReference);
	};
}
