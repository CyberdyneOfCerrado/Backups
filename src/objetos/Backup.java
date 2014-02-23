package objetos;

import historicos.HistoricoVersoes;

import java.util.Date;





public class Backup {

	public int primaryKey;
	public String nomeBackup;
	public Date dataInicio;
	public HistoricoVersoes hv;

	//RegraBackup regra = new RegraBackup(primaryKey, nomeBackup, nomeBackup);
		
	public Backup(String nomeBackup, Date dataInicio){
		this.primaryKey = 0;
		this.nomeBackup = nomeBackup;
		this.dataInicio = dataInicio;
		hv = new HistoricoVersoes();
	}
	/*
	public IteratorVersoes getVersao(){
		return historicoVersao;
	}*/
	
	public Date getDataInicio(){
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

}
