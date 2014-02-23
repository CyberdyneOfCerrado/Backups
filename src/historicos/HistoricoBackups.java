package historicos;

import objetos.Backup;
import iteradores.IteradorBackups;

public class HistoricoBackups extends Historico{
	
	public IteradorBackups obterHistorico( int primaryKey ){
		return null;
	};
	
	public Backup salvar( Backup backup ){
		backup.primaryKey = super.salvar(backup);
		return 	backup;
	};
}
