package objetos;

import historicos.HistoricoArtefatos;

import java.util.Date;

import enuns.Status;

public class Versao {
	
	public int primaryKey;
	public Date dataInicio;
	public Status status;
	HistoricoArtefatos ha;
	
	public Versao(Date dataInicio, Status status){
		this.primaryKey = 0;
		this.dataInicio = dataInicio;
		this.status = status;
		ha = new HistoricoArtefatos();
	}
	
	/*
	public IteratorArtefato getArtefatos(){
		return artefatos;
	}*/
	
	public Date getDataInicio(){
		System.out.println(dataInicio.toString());
		return dataInicio;
	}
	
	public Artefato salvarArtefato( Artefato artefato){
		artefato.primaryKey = ha.salvar(artefato,primaryKey);
		return artefato;
	};
}
