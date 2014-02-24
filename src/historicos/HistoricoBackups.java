package historicos;

import objetos.Backup;
import iteradores.IteradorBackups;

public class HistoricoBackups extends Historico{
	final String sql = "SELECT * FROM BACKUP";
	
	public IteradorBackups obterHistorico(){
		return (IteradorBackups) super.obter(sql);
	};
	
	public Backup salvar( Backup backup ){
		// Primeira posic�o � da id do Backup
		// Segunda posi��o �  a id da RegraBackup;		
		int primaryKeyBackup = backup.primaryKey = super.salvar(backup);
		int primaryKeyRegra = super.salvar(backup.getRegra(),primaryKeyBackup);
		backup.getRegra().primaryKey = primaryKeyRegra;
		
		return backup;
	};
}
