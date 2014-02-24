package teste;

import historicos.HistoricoBackups;

import java.util.Date;

import enuns.Status;
import objetos.Artefato;
import objetos.Backup;
import objetos.RegraBackup;
import objetos.Versao;

public class Principal {
	public static void main (String [] args ){
		HistoricoBackups hb = new HistoricoBackups();
		hb.obterHistorico();
		//Backup b = new Backup("Meus codigos",new Date().toString(), new RegraBackup("Aqui","Ali2"));
		//b = hb.salvar(b);
		//System.out.println("Minha primaryKey Backup : " + b.primaryKey +" PrimaryKey Regra : " + b.getRegra().primaryKey);
		
		//Versao v = b.salvarVersao(new Versao(new Date(),Status.SUCESSO));
		//System.out.println("Minha id " + v.primaryKey);
		//Artefato a = v.salvarArtefato(new Artefato(new Date()));
		//System.out.println("Minha id " + a.primaryKey);
		
		
	}
}
