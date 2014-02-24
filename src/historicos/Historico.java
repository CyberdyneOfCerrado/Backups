package historicos;

import java.util.ArrayList;

import bancoDeDados.BancoDeDados;

public class Historico {
	private BancoDeDados bd;
	
	public Historico(){
		bd = BancoDeDados.obterInstancia();
	};
	
	public ArrayList<Object> obter ( String sql ){ // terminar este m�todo
		return bd.resgatar(sql);
	};
	
	public int  salvar ( Object ob ){
		int primaryKey = bd.salvar(ob);
		return primaryKey;
	};
	
	public int salvar ( Object ob , int primaryKeyReference ){
		int primaryKey = bd.salvar(ob,primaryKeyReference);
		return primaryKey;
	};
}
