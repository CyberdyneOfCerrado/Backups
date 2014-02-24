package bancoDeDados;

import java.sql.ResultSet;
import java.sql.SQLException;

import bancoDeDados.BancoEmbarcado;
import bancoDeDados.ReflexaoSql;
import bancoDeDados.Tabela;
// COISAS PENDENTES : 
// FALTANDO FAZER O M�TODO DE RESGATAR, POIS AINDA FALTA OS ITERADORES.

public class BancoDeDados 
{
	//definindo tabelas constates nesse banco de dados
	final String nomeBD = "Armazem";
	final Tabela backup      = new Tabela("BACKUP","CREATE TABLE BACKUP (PRIMARYKEY INT NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),NOMEBACKUP VARCHAR(45) ,DATAINICIO VARCHAR(31) ,PRIMARY KEY (PRIMARYKEY))");
	final Tabela regraBackup = new Tabela("REGRABACKUP","CREATE TABLE REGRABACKUP ( PRIMARYKEY INT NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1), DESTINO VARCHAR(150), ORIGEM VARCHAR(150), FK INT NOT NULL, PRIMARY KEY (PRIMARYKEY), CONSTRAINT fk_REGRABACKUP_BACKUP1 FOREIGN KEY (FK) REFERENCES BACKUP (PRIMARYKEY) )");
	final Tabela versao      = new Tabela("VERSAO","CREATE TABLE VERSAO (PRIMARYKEY INT NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),DATAINICIO VARCHAR(31) ,STATUS VARCHAR(45) ,FK INT NOT NULL,PRIMARY KEY (PRIMARYKEY),CONSTRAINT fk_VERSAO_BACKUP1 FOREIGN KEY (FK)REFERENCES BACKUP (PRIMARYKEY))");
	final Tabela artefato    = new Tabela("ARTEFATO","CREATE TABLE ARTEFATO(PRIMARYKEY INT NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),ULTIMAMODIFICACAO VARCHAR(31) ,FK INT NOT NULL,PRIMARY KEY (PRIMARYKEY),CONSTRAINT fk_ARTEFATO_VERSAO1 FOREIGN KEY (FK) REFERENCES VERSAO(PRIMARYKEY))");
	final Tabela dias        = new Tabela("DIAS","CREATE TABLE DIAS ( PRIMARYKEY INT NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),DIA VARCHAR(20) ,HORAS CHAR(5) ,DESLIGAR VARCHAR(6),FK INT NOT NULL,PRIMARY KEY (PRIMARYKEY),CONSTRAINT fk_DIAS_REGRABACKUP FOREIGN KEY (FK) REFERENCES REGRABACKUP (PRIMARYKEY))");
	//Fim defini��o.
	
	BancoEmbarcado be;
	ReflexaoSql    re;
	
	public BancoDeDados(){
		try {
			be = new BancoEmbarcado(nomeBD,backup,regraBackup,dias,versao,artefato);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		re = new ReflexaoSql();
	};
	
	public int salvar( Object ob ){
		ResultSet resultado;
		int id=0;
		System.out.println( be.executarQuery(re.gerarInsert(ob)) ); 
		
		try {
			resultado = be.executarSelect(re.recuperarId(ob));
			resultado.next();
			id = resultado.getInt("PRIMARYKEY");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	};
	
	public int salvar( Object ob, int primaryKeyReference ){
		ResultSet resultado;
		int id=0;
		System.out.println( be.executarQuery(re.gerarInsertComFk(ob,primaryKeyReference)) ); 
		
		try {
			resultado = be.executarSelect(re.recuperarId(ob));
			resultado.next();
			id = resultado.getInt("PRIMARYKEY");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	};
}