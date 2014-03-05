package objetos;

import iteradores.IteradorVersoes;
import historicos.HistoricoVersoes;


public class Backup {

	public int primaryKey;
	public String nomeBackup;
	public String dataInicio;
	public HistoricoVersoes hv;
	RegraBackup regra;
		
	public Backup(String nomeBackup, String dataInicio){
		this.primaryKey = 0;
		this.nomeBackup = nomeBackup;
		this.dataInicio = dataInicio;
		hv = new HistoricoVersoes();
	};
	
	public Backup(int primaryKey, String nomeBackup, String dataInicio){
		this.primaryKey = primaryKey;
		this.nomeBackup = nomeBackup;
		this.dataInicio = dataInicio;
		hv = new HistoricoVersoes();
	};
	
	public Backup(String nomeBackup, String dataInicio, RegraBackup regra ){
		this.primaryKey = 0;
		this.nomeBackup = nomeBackup;
		this.dataInicio = dataInicio;
		this.regra = regra;
		hv = new HistoricoVersoes();
	};
	/*
	public IteratorVersoes getVersao(){
		return historicoVersao;
	}*/
	
	public RegraBackup getRegra() {
		return regra;
	}

	public void setRegra(RegraBackup regra) {
		this.regra = regra;
	}

	public String getDataInicio(){
		System.out.println(dataInicio.toString());
		return dataInicio;
	}
	
	public String getNomeBackup(){
		System.out.println(nomeBackup);
		return nomeBackup;
	}
	
	//public String getDestino(){
	//	System.out.println(regra.getDestino());
	//	return regra.getDestino();
	//}
	
	//public RegraBackup getRegraBackup(){
		//System.out.println(regra);
		//return regra;
	//}
	public Versao salvarVersao( Versao versao){
		versao.primaryKey = hv.salvar(versao,primaryKey);
		return versao;
	};
	
	public IteradorVersoes resgatarVersoes ( ){
		return hv.obterHistorico(primaryKey);
	}
}
