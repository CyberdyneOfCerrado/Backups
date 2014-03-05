package objetos;

import iteradores.IteradorArtefatos;
import historicos.HistoricoArtefatos;


import enuns.Status;

public class Versao {
	
	public int primaryKey;
	public String dataInicio;
	public Status status;
	HistoricoArtefatos ha;
	
	public Versao(String dataInicio, Status status){
		this.primaryKey = 0;
		this.dataInicio = dataInicio;
		this.status = status;
		ha = new HistoricoArtefatos();
	}
	
	public Versao(int primaryKey ,String string, Status status){
		this.primaryKey = primaryKey;
		this.dataInicio = string;
		this.status = status;
		ha = new HistoricoArtefatos();
	}
	
	/*
	public IteratorArtefato getArtefatos(){
		return artefatos;
	}*/
	
	public String getDataInicio(){
		System.out.println(dataInicio.toString());
		return dataInicio;
	}
	
	public Artefato salvarArtefato( Artefato artefato){
		artefato.primaryKey = ha.salvar(artefato,primaryKey);
		return artefato;
	};
	
	public IteradorArtefatos resgatarArtefatos(){
		return ha.obterHistorico(primaryKey);
	}
}
