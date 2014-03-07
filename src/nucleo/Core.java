package nucleo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import GUI.SingleGuiMain;
import iteradores.IteradorArtefatos;
import iteradores.IteradorBackups;
import iteradores.IteradorDias;
import objetos.Backup;
import objetos.Dias;
import objetos.RegraBackup;
import historicos.HistoricoBackups;

public class Core implements Runnable {
	
	private HistoricoBackups hb;
	
	public Core (){
		hb = new HistoricoBackups();
		new Thread(this,"Procura agengamentos").start();
	};
	
	public boolean criarBackup( Backup backup, RegraBackup regraBackup, Dias dia){
		// Ainda tem que ser definido como essa merda dá pau
		backup.setRegra(regraBackup);
		backup = hb.salvar(backup);
		backup.getRegra().salvarDia(dia);
		return true;
	};
	
	public boolean criarBackup( Backup backup, RegraBackup regraBackup){
		// Ainda tem que ser definido como essa merda dá pau
		backup.setRegra(regraBackup);
		backup = hb.salvar(backup);
		return true;
	};
	
	public boolean rodarBackup( Backup backup ){//Funcional
		System.out.println("Executando uma regra de Backup");
		return backup.getRegra().rodarRegra();
	};
	
	public IteradorBackups resgatarBackups(){//Funcional
		return hb.obterHistorico();
	};
	
	public IteradorArtefatos buscarClones(String caminho ){//não funcional, falta a classe do Luiz. ( Só para precavêêeer)
		return new IteradorArtefatos(null);
	};

	//Verificar se há algum Backup agendado.
	@Override
	public void run() {
		while(true){
			IteradorBackups ib = hb.obterHistorico();
			while( ib.hasNext() ){
				Backup backup = ib.next();
				IteradorDias id = backup.getRegra().recuperarDias();
				
				 DateFormat dateFormat = new SimpleDateFormat("EEE,HH:mm");
				 String [] dados = dateFormat.format( new Date()).split(",");
				  
				while(id.hasNext()){
					Dias dia = id.next();
					
					 if(dia.getDias().equals(dados[0])){
						if(dia.getHoras().equals(dados[1])) rodarBackup(backup);
					}
				}
				
			}

			System.out.println("Esperando");
			sleep(1000*60);
		}
	}
	
	private void sleep(int value ){
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};

}
