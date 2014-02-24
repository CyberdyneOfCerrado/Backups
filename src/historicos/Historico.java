package historicos;

import bancoDeDados.BancoDeDados;
import iteradores.Iterador;

public class Historico {
	private BancoDeDados bd;
	
	public Historico(){
		bd = BancoDeDados.obterInstancia();
	};
	
	public Iterador obter ( String sql ){ // terminar este método
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
