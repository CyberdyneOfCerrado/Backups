package objetos;


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
		ca = new CopiarArtefatos(origem, destino, false);
	};
	
	public RegraBackup(int primaryKey, String destino, String origem){
		this.primaryKey = primaryKey;
		this.destino = destino;
		this.origem = origem;
		hd = new HistoricoDias();
		ca = new CopiarArtefatos(origem, destino, false);
	};
	
	public String getDestino(){
		System.out.println(destino);
		return destino;
	};
	
	public Object[] rodarRegra( boolean isZip ){
		ca.start();
		
		while(ca.isRodando()){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Object [] objeto = new Object[2];
		
		objeto[0] = ca.getConcluidos();
		objeto[1] = ca.getState();
		
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
}
