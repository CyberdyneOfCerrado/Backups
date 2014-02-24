package objetos;

import historicos.HistoricoDias;



public class RegraBackup {
	
	
	public int primaryKey;
	public String destino;
	public String origem;
	HistoricoDias historicoDias;
	
	public RegraBackup(String destino, String origem){
		this.primaryKey = 0;
		this.destino = destino;
		this.origem = origem;
		historicoDias = new HistoricoDias();
	}
	
	/*
	public IteradorDias getDias(){
		return historicoDias;
	}*/
	
	public String getDestino(){
		System.out.println(destino);
		return destino;
	}
	
	public String getOrigem(){
		System.out.println(origem);
		return origem;
	}

}
