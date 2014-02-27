package teste;



import java.util.Date;

import enuns.DiasSemana;
import enuns.Status;
import objetos.Artefato;
import objetos.Backup;
import objetos.Dias;
import objetos.RegraBackup;
import objetos.Versao;
import iteradores.IteradorBackups;
import historicos.HistoricoBackups;

//OS ARVOROS SOMOS NOZES

public class Principal {
	public static void main (String [] args ){
		HistoricoBackups hb = new HistoricoBackups();
		for( int i = 0 ; i < 100 ; i ++){
			Backup b = new Backup("Meus codigos",new Date().toString(), new RegraBackup("Aqui"+i,"Ali2"));
			b = hb.salvar(b);
			System.out.println("Minha primaryKey Backup : " + b.primaryKey +" PrimaryKey Regra : " + b.getRegra().primaryKey);
			
			for( int x = 0 ; x < 7 ; x++ ) b.getRegra().salvarDia(new Dias(DiasSemana.DOMINGO, new Date().toString().substring(17,19),true));
			
			Versao v = b.salvarVersao(new Versao(new Date(),Status.SUCESSO));
			System.out.println("Minha id " + v.primaryKey);
			Artefato a = v.salvarArtefato(new Artefato(new Date()));
			System.out.println("Minha id " + a.primaryKey);
		}
		
		IteradorBackups ib = hb.obterHistorico();
		
		while(ib.hasNext()){
			Backup br = ib.next();
			
			System.out.println(" Nome Back up _> " + br.getNomeBackup() +"Primarykey ; "+br.primaryKey+" Alguns dados da regra _> " + br.getRegra().getDestino());
		}
	}
}
