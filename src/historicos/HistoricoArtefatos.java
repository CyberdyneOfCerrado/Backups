package historicos;

import objetos.Artefato;
import iteradores.IteradorArtefatos;

public class HistoricoArtefatos extends Historico {
	final String sql = "SELECT * FROM ARTEFATO WHERE FK = ";
	
	public IteradorArtefatos obterHistorico( int primaryKey){
		return new IteradorArtefatos( super.obter(sql + primaryKey));
	};
	
	public int salvar( Artefato artefato , int primaryKeyReference ){
		return super.salvar(artefato, primaryKeyReference);
	};
}
