package teste;

import historicos.HistoricoBackups;

import java.util.Date;

import enuns.Status;
import objetos.Artefato;
import objetos.Backup;
import objetos.Versao;

public class Principal {
	public static void main (String [] args ){
		HistoricoBackups hb = new HistoricoBackups();
		
		Backup b = new Backup("Meus codigos",new Date());
		b = hb.salvar(b);
		System.out.println("Minha id " + b.primaryKey);
		
		Versao v = b.salvarVersao(new Versao(new Date(),Status.SUCESSO));
		System.out.println("Minha id " + v.primaryKey);
		Artefato a = v.salvarArtefato(new Artefato(new Date()));
		System.out.println("Minha id " + a.primaryKey);
	}
}
