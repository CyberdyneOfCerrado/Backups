package objetos;

public class Artefato {
	
	public int primaryKey;
	public String nome;
	public String ultimaModificacao;
	
	
	public Artefato(String nome , String ultimaModificacao){
		this.primaryKey = 0;
		this.nome = nome;
		this.ultimaModificacao = ultimaModificacao;
	}
	
	public String getUltimaModificacao(){
		//System.out.println(ultimaModificacao.toString());
		return ultimaModificacao;
	}
	
	public String getNome(){
		return nome;
	}
}
