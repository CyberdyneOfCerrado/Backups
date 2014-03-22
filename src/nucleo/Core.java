package nucleo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import GUI.SingleGuiMain;
import enuns.Status;
import iteradores.IteradorArtefatos;
import iteradores.IteradorBackups;
import iteradores.IteradorDias;
import objetos.Artefato;
import objetos.Backup;
import objetos.Dias;
import objetos.RegraBackup;
import objetos.Versao;
import sistema.BuscarClone;
import historicos.HistoricoBackups;

public class Core implements Runnable {
	
	private HistoricoBackups hb;
	
	public Core (){
		hb = new HistoricoBackups();
		new Thread(this,"Procura agendamentos").start();
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
	
	public boolean rodarBackup( Backup backup, boolean isZip ){//Funcional
		
		System.out.println("Executando uma regra de Backup");
		Object [] objeto = backup.getRegra().rodarRegra(isZip,backup.getNomeBackup());
		
		Status status = (Status) objeto[1];
		IteradorArtefatos ia = new IteradorArtefatos((ArrayList<Object>) objeto[0] );
		
		Versao versao = backup.salvarVersao(new Versao(new Date().toString(),status));
		
		while(ia.hasNext()){
			Artefato artefato = ia.next();
			versao.salvarArtefato(artefato);
		}
		
		return true;
	};
	
	public IteradorBackups resgatarBackups(){//Funcional
		return hb.obterHistorico();
	};
	
	public ArrayList<Artefato> buscarClones(String caminho, String nome ){//não funcional, falta a classe do Luiz. ( Só para precavêêeer)
		
		System.out.println(caminho+nome);
		BuscarClone c = new BuscarClone(caminho,nome);
		c.start();
		
		while(c.isRodando()){
			sleep(100);
		}
		
		return c.getDuplicados();
	};

	//Verificar se há algum Backup agendado.
	@Override
	public void run() {
		while(true){
			IteradorBackups ib = null;
			try{
				ib = hb.obterHistorico();
			}catch( Exception e ){
				continue;
			}
			
			while( ib.hasNext() ){
				Backup backup = ib.next();
				IteradorDias id = backup.getRegra().recuperarDias();
				
				 DateFormat dateFormat = new SimpleDateFormat("EEE,HH:mm");
				 String [] dados = dateFormat.format( new Date()).split(",");
				  
				while(id.hasNext()){
					Dias dia = id.next(); 
					 if(dia.getDias().equals(dados[0])){
						 
						 String [] horaDia = dia.getHoras().split(":");
						 String [] horaNow = dados[1].split(":");
						 
						//Verificando hora
						 if(Integer.parseInt(horaDia[0].trim()) == Integer.parseInt(horaNow[0].trim())){
							 //Verificando minuto
							 if(Integer.parseInt(horaDia[1].trim()) == Integer.parseInt(horaNow[1].trim())){
								 System.out.println("Rodando regra automáticamente.");
								 rodarBackup(backup,true);//Definindo política padrão automática.
							 }
						 }
					}
				}
				
			}

			System.out.println("Esperando");
			sleep(1000*30);
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
