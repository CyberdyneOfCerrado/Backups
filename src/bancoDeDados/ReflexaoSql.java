package bancoDeDados;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import objetos.Backup;
import objetos.RegraBackup;

public class ReflexaoSql {
	
	public ReflexaoSql(){
		
	};
	
	public String gerarInsert( Object ob ){	
		Class<? extends Object> classe = ob.getClass();
		
		String sql = "INSERT INTO " + classe.getSimpleName().toUpperCase() +" (";
		Field [] f = classe.getDeclaredFields();
		
		for( Field temp : f ){
			Type type = temp.getGenericType();
			if( !temp.getName().equals("primaryKey") && !type.toString().contains("historico") && !type.toString().contains("Regra") ) sql += temp.getName().toUpperCase() +",";
		}
		
		sql = sql.substring(0,sql.length()-1) +") VALUES (";
		
		for( Field temp : f ){
			try {
				Type typef = temp.getGenericType();
				if( !temp.getName().equals("primaryKey") && !typef.toString().contains("historico") && !typef.toString().contains("Regra")){
					String type = temp.getGenericType().toString();
					if( type.contains("String") || type.contains("DiasSemana") || type.contains("boolean") || type.contains("Date") ){
						sql += "'"+temp.get(ob) +"',";
					}
					else{
						sql += ""+temp.get(ob) +",";
					}
				}
			}
			catch (IllegalArgumentException | IllegalAccessException e){
				e.printStackTrace();
				return null;
			}
		}
		
		sql = sql.substring(0,sql.length()-1)+")";
		return sql;
	};
	
	public String gerarInsertComFk(Object ob , int fk ){
		Class<? extends Object> classe = ob.getClass();
		
		String sql = "INSERT INTO " + classe.getSimpleName().toUpperCase() +" (";
		Field [] f = classe.getDeclaredFields();
		
		for( Field temp : f ){
			Type type = temp.getGenericType();
			if( !temp.getName().equals("primaryKey") && !type.toString().contains("historico") && !type.toString().contains("Regra") ){
				sql += temp.getName().toUpperCase() +",";
			}
		}
		
		sql += "FK) VALUES (";
		
		for( Field temp : f ){
			try {
				Type typef = temp.getGenericType();
				if( !temp.getName().equals("primaryKey") && !typef.toString().contains("historico") && !typef.toString().contains("Regra")  ){
					String type = temp.getGenericType().toString();
					
					if( type.contains("String") || type.contains("DiasSemana") || type.contains("boolean") || type.contains("Date") || type.contains("Status") ){
						sql += "'"+temp.get(ob) +"',";
					}
					else{
						sql += ""+temp.get(ob) +",";
					}
				}
			}
			catch (IllegalArgumentException | IllegalAccessException e){
				e.printStackTrace();
				return null;
			}
		}
		return sql += fk +")";
	};
	
	public String recuperarId( Object ob ){
		Class<? extends Object> classe = ob.getClass();
		
		String sql = "SELECT PRIMARYKEY FROM " + classe.getSimpleName().toUpperCase() +" WHERE ( ";
		Field [] f = classe.getDeclaredFields();
		
		for( Field temp : f ){
			try {	
				Type typef = temp.getGenericType();
					if( !temp.getName().equals("primaryKey") && !typef.toString().contains("historico") && !typef.toString().contains("Regra") ){
					String type = temp.getGenericType().toString();
				
					if( type.contains("String") || type.contains("DiasSemana") || type.contains("boolean") || type.contains("Date") || type.contains("Status")){		
						sql +=  temp.getName().toUpperCase() +" = '"+ temp.get(ob)+"' AND ";
					}
					else
					{
						sql += temp.getName().toUpperCase() +" = "+ temp.get(ob)+" AND ";
					}
				}
			} 
			catch (IllegalArgumentException | IllegalAccessException e){
				e.printStackTrace();
			}
		}
		return sql.substring(0,sql.length()-4)+")";
	};
	
	public Object resgataObjeto ( ResultSet result ){
		ArrayList<Object> arl = new ArrayList<>();
		try {
			while (result.next()) { 
					switch(result.getMetaData().getTableName(1)){
					case"BACKUP":
						System.err.println("BACKUP");
						arl.add( new Backup(result.getInt(1),result.getString(2),result.getString(3)));
						break;
					case"REGRABACKUP":
						System.err.println("REGRABACKUP");
						arl.add( new RegraBackup(result.getInt(1), result.getString(2), result.getString(3)));
						break;
					case"VERSAO":
						System.err.println("VERSAO");
						break;
					case"ARTEFATO":
						System.err.println("ARTEFATO");
						break;
					case"DIAS":
						System.err.println("DIAS");
						break;
					}
				}
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return null;
	};
}
