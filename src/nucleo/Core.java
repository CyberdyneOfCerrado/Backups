package nucleo;

import iteradores.IteradorArtefatos;
import iteradores.IteradorBackups;
import objetos.Backup;
import objetos.Dias;
import objetos.RegraBackup;
import historicos.HistoricoBackups;

public class Core {
	
	private HistoricoBackups hb;
	
	public Core (){
		hb = new HistoricoBackups();
	};
	
	public boolean criarBackup( Backup backup, RegraBackup regraBackup, Dias dia){
		// Ainda tem que ser definido como essa merda d� pau
		backup.setRegra(regraBackup);
		backup = hb.salvar(backup);
		backup.getRegra().salvarDia(dia);
		
		return true;
	};
	
	public boolean rodarBackup( Backup backup ){//Funcional
		return backup.getRegra().rodarRegra();
	};
	
	public IteradorBackups resgatarBackups(){//Funcional
		return hb.obterHistorico();
	};
	
	public IteradorArtefatos buscarClones(String caminho ){//n�o funcional, falta a classe do Luiz. ( S� para precav��eer)
		return new IteradorArtefatos(null);
	}
}
