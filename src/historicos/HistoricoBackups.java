package historicos;

import objetos.Backup;
import objetos.RegraBackup;
import iteradores.Iterador;
import iteradores.IteradorBackups;

public class HistoricoBackups extends Historico{
	final String sqlBackup = "SELECT * FROM BACKUP";
	final String sqlRegra  = "SELECT * FROM REGRABACKUP";
	
	public IteradorBackups obterHistorico(){
		IteradorBackups ib = new IteradorBackups(super.obter(sqlBackup));
		Iterador it        = new Iterador(super.obter(sqlRegra));
		
		while( ib.hasNext() ){
			RegraBackup temp = null;
			if( it.hasNext() ) temp = ( RegraBackup ) it.next();
			ib.next().setRegra( temp );
		}
		ib.zerar();
		
		return ib;
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
