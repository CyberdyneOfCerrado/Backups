package teste;




import objetos.Backup;
import objetos.Versao;
import iteradores.IteradorBackups;
import iteradores.IteradorVersoes;
import historicos.HistoricoBackups;
import GUI.SingleGuiMain;

//OS ARVOROS SOMOS NOZES

public class Principal {
	public static void main (String [] args ){
		new SingleGuiMain();
		
		HistoricoBackups hb = new HistoricoBackups();
		
		IteradorBackups ib = hb.obterHistorico();
		
		while(ib.hasNext()){
			Backup b = ib.next();
			
			IteradorVersoes iv = b.resgatarVersoes();
			while(iv.hasNext()){
				Versao v = iv.next();
				System.out.println("FK: "+b.primaryKey+" id: "+ v.primaryKey);
			}
		}
		//allysom mudei seu carregamento de banco pro pacote Banco qualquer coisa fala comigo ok
	}
}
