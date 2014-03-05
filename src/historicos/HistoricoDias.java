package historicos;

import objetos.Dias;
import iteradores.IteradorDias;

public class HistoricoDias extends Historico {
	final String sql = "SELECT * FROM DIAS WHERE FK = ";
	
	public IteradorDias obterHistorico( int primaryKey ){
		return new IteradorDias( super.obter(sql + primaryKey));
	};
	
	public int salvar( Dias dia , int primaryKeyReference ){
		return super.salvar(dia, primaryKeyReference);
	};
}
