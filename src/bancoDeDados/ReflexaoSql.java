package bancoDeDados;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class ReflexaoSql {
	
	public ReflexaoSql(){
		
	};
	
	public String gerarInsert( Object ob ){	
		Class<? extends Object> classe = ob.getClass();
		
		String sql = "INSERT INTO " + classe.getSimpleName().toUpperCase() +" (";
		Field [] f = classe.getDeclaredFields();
		
		for( Field temp : f ){
			Type type = temp.getGenericType();
			if( !temp.getName().equals("primaryKey") && !type.toString().contains("historico")) sql += temp.getName().toUpperCase() +",";
		}
		
		sql = sql.substring(0,sql.length()-1) +") VALUES (";
		
		for( Field temp : f ){
			try {
				Type typef = temp.getGenericType();
				if( !temp.getName().equals("primaryKey") && !typef.toString().contains("historico")){
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
			if( !temp.getName().equals("primaryKey") && !type.toString().contains("historico")){
				sql += temp.getName().toUpperCase() +",";
			}
		}
		
		sql += "FK) VALUES (";
		
		for( Field temp : f ){
			try {
				Type typef = temp.getGenericType();
				if( !temp.getName().equals("primaryKey") && !typef.toString().contains("historico")){
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
					if( !temp.getName().equals("primaryKey") && !typef.toString().contains("historico")){
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
}
