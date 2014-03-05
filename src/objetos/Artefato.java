package objetos;

public class Artefato {
	
	public int primaryKey;
	public String ultimaModificacao;
	
	public Artefato(String ultimaModificacao){
		this.primaryKey = 0;
		this.ultimaModificacao = ultimaModificacao;
	}
	
	public String getUltimaModificacao(){
		//System.out.println(ultimaModificacao.toString());
		return ultimaModificacao;
	}

}
