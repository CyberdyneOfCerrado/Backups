package bancoDeDados;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BancoEmbarcado {
	private String nomeBD;
	private String driverBD;
	private String stringDeConexao;
	private Connection conexaoBD;
	private Statement executor;
	private Tabela [] tabelas;
	
	BancoEmbarcado( String nomeBD, Tabela ... tabelas ) throws SQLException{
		this.nomeBD = nomeBD;
		this.tabelas = tabelas;
		
		driverBD = "org.apache.derby.jdbc.EmbeddedDriver";
		stringDeConexao = "jdbc:derby:" + nomeBD + ";create=true";
		
		conectaBD();
		verificarTabelas();
	};
	
	private void conectaBD() throws SQLException{
		conexaoBD = DriverManager.getConnection(stringDeConexao);
		executor = conexaoBD.createStatement();
		System.out.println("Conexão estabelecida com sucesso ao BD " + nomeBD );
	};
	
	private void verificarTabelas() throws SQLException{
		boolean controle = false;
		ArrayList<String> nomeTabelas = new ArrayList<>();
		
		DatabaseMetaData dbmd = conexaoBD.getMetaData();
		
		ResultSet resultSet = dbmd.getTables(null, null, null, null);
		
		while (resultSet.next()) { nomeTabelas.add(resultSet.getString("TABLE_NAME"));};
		    
		for( Tabela temp : tabelas ){
			for( String nomeTabela : nomeTabelas ){
		    	if( temp.getNomeTabela().toUpperCase().equals(nomeTabela) ) controle = true;  
		    }
		    	
		    if( !controle ){
			    executor.execute(temp.getSqlCriacao());
			    System.out.println("Criando tabela : " + temp.getNomeTabela() );
			}
		    	controle = false;
		}  
	};
	
	public boolean executarQuery( String query ){
		boolean run = false;
		System.out.println("Executando Query : " + query );
		try{	
			run = executor.execute(query);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return run;
	};
	
	public ResultSet executarSelect(String select ) {
		ResultSet resultado = null;
		try {
			resultado =  executor.executeQuery(select);
		} 
		catch (SQLException e){	
			e.printStackTrace();
		}
		return resultado;
	};
	
	public void finalizar() throws SQLException{
			desconectaDB();
			encerraDB();
	};
	
	private void desconectaDB() throws SQLException{
        conexaoBD.close();
	};
	
	private void encerraDB() throws SQLException{
        if (driverBD.equals("org.apache.derby.jdbc.EmbeddedDriver")) {
        	try{
        		DriverManager.getConnection("jdbc:derby:;shutdown=true");
        	} 
        	catch (SQLException se)  {	
        		if ( se.getSQLState().equals("XJ015") ) {		
        			System.out.println("Base de dados foi encerrada com sucesso!");	
        		}
        		else{
        			throw new SQLException("Erro ao encerrar a base de dados! "+se.getMessage(),se.getSQLState(),se);
        		}
           }
        }
	};
}
