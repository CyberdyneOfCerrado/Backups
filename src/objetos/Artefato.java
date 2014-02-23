package objetos;

import java.util.Date;

public class Artefato {
	
	public int primaryKey;
	public Date ultimaModificacao;
	
	public Artefato(Date ultimaModificacao){
		this.primaryKey = 0;
		this.ultimaModificacao = ultimaModificacao;
	}
	
	public Date getUltimaModificacao(){
		System.out.println(ultimaModificacao.toString());
		return ultimaModificacao;
	}

}
