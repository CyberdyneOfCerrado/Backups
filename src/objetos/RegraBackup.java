package objetos;


import GUI.SingleGuiMain;
import sistema.CopiarArtefatos;
import iteradores.IteradorDias;
import historicos.HistoricoDias;


public class RegraBackup {
	
	public int primaryKey;
	public String destino;
	public String origem;
	HistoricoDias hd;
	CopiarArtefatos ca;
	
	public RegraBackup(String destino, String origem){
		this.primaryKey = 0;
		this.destino = destino;
		this.origem = origem;
		hd = new HistoricoDias();
		ca = null;
	};
	
	public RegraBackup(int primaryKey, String destino, String origem){
		this.primaryKey = primaryKey;
		this.destino = destino;
		this.origem = origem;
		hd = new HistoricoDias();
		ca = null;
	};
	
	public String getDestino(){
		System.out.println(destino);
		return destino;
	};
	
	public Object[] rodarRegra( boolean isZip, String nomeZip ){
		ca = new CopiarArtefatos(origem, destino, false);
		if(isZip)ca.setZip(nomeZip);
		ca.start();
		
		while(ca.isRodando()){
			if(SingleGuiMain.getInstance().isCancelado) ca.parar();
			latencia(100);
		}

		latencia(300);
		
		Object [] objeto = new Object[2];
		
		objeto[0] = (Object) ca.getConcluidos();
		objeto[1] = (Object) ca.getResultado();
		
		return objeto; 
	};
	
	public String getOrigem(){
		System.out.println(origem);
		return origem;
	};
	
	public void salvarDia ( Dias dia ){
		hd.salvar(dia, primaryKey);
	};
	
	public IteradorDias recuperarDias(){
		return hd.obterHistorico(primaryKey);
	};
	
	public void latencia( int laten ){
		try {
			Thread.sleep(laten);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
