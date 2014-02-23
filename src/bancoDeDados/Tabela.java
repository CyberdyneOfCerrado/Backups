package bancoDeDados;

public class Tabela 
{
	private String nomeTabela;
	private String sql;
	
	Tabela(String nomeTabela , String sql )
	{
		this.nomeTabela = nomeTabela;
		this.sql = sql;
	}

	public String getNomeTabela() {
		return nomeTabela;
	}

	public String getSqlCriacao() {
		return sql;
	}
}
