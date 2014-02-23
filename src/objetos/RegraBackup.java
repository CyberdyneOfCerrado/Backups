package objetos;



public class RegraBackup {
	
	
	int primaryKey;
	String destino;
	String origem;
	//HistoricoDias historicoDias;
	
	public RegraBackup(int primaryKey, String destino, String origem){
		this.primaryKey = primaryKey;
		this.destino = destino;
		this.origem = origem;
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
