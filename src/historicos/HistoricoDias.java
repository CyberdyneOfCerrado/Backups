package historicos;

import objetos.Dias;
import iteradores.IteradorDias;

public class HistoricoDias extends Historico {
	
	public IteradorDias obterHistorico( int primaryKey ){
		return null;
	};
	
	public int salvar( Dias dia , int primaryKeyReference ){
		return super.salvar(dia, primaryKeyReference);
	};
}
