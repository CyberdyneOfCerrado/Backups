package objetos;

import iteradores.IteradorDias;
import historicos.HistoricoDias;


public class RegraBackup {
	
	public int primaryKey;
	public String destino;
	public String origem;
	HistoricoDias hd;
	
	public RegraBackup(String destino, String origem){
		this.primaryKey = 0;
		this.destino = destino;
		this.origem = origem;
		hd = new HistoricoDias();
	}
	
	public RegraBackup(int primaryKey, String destino, String origem){
		this.primaryKey = primaryKey;
		this.destino = destino;
		this.origem = origem;
		hd = new HistoricoDias();
	}
	/*
	public IteradorDias getDias(){
		return historicoDias;
	}*/
	
	public String getDestino(){
		System.out.println(destino);
		return destino;
	}
	
	public boolean rodarRegra(){
		return true;
	}
	public String getOrigem(){
		System.out.println(origem);
		return origem;
	}
	
	public void salvarDia ( Dias dia ){
		hd.salvar(dia, primaryKey);
	};
	
	public IteradorDias recuperarDias(){
		return hd.obterHistorico(primaryKey);
	}
}
