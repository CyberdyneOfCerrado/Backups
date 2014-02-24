package historicos;

import objetos.Backup;
import iteradores.IteradorBackups;

public class HistoricoBackups extends Historico{
	
	public IteradorBackups obterHistorico( int primaryKey ){
		return null;
	};
	
	public Backup salvar( Backup backup ){
		// Primeira posicão é da id do Backup
		// Segunda posição é  a id da RegraBackup;
		
		int primaryKeyBackup = backup.primaryKey = super.salvar(backup);
		int primaryKeyRegra = super.salvar(backup.getRegra(),primaryKeyBackup);
		backup.getRegra().primaryKey = primaryKeyRegra;
		
		return backup;
	};
}
