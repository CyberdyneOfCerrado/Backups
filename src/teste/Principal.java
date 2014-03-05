package teste;



import java.util.Date;

import GUI.SingleGuiMain;
import enuns.DiasSemana;
import enuns.Status;
import objetos.Artefato;
import objetos.Backup;
import objetos.Dias;
import objetos.RegraBackup;
import objetos.Versao;
import iteradores.IteradorArtefatos;
import iteradores.IteradorBackups;
import iteradores.IteradorDias;
import iteradores.IteradorVersoes;
import historicos.HistoricoBackups;

//Jamais toque na minha classe de testes novamente Ass: Allyson : )

public class Principal {
	public static void main (String [] args ){
		//new SingleGuiMain();
		
		/*Criando um objeto hb para resgatar/adicionar os backups existentes no BD*/
		HistoricoBackups hb = new HistoricoBackups();
		/*
		HistoricoBackups hb = new HistoricoBackups();
		
		
			Backup b = new Backup("Meus codigos",new Date().toString(), new RegraBackup("Aqui","Ali2"));
			//Cria-se primeiramente o objeto Backup, este objeto terá a sua chave primária 0 como default. Após a criação, chamamos o método 'salvar' e insere-se
			//o objeto backps. O método salvar retorna o mesmo objeto backup que entrou, porém já com a chave primária do banco de dados.
			b = hb.salvar(b);
			
			System.out.println("Minha primaryKey Backup : " + b.primaryKey +" PrimaryKey Regra : " + b.getRegra().primaryKey);
			
			//Adicionando 7 dias em uma regra de Backup
			for( int x = 0 ; x < 7 ; x++ ) b.getRegra().salvarDia(new Dias(DiasSemana.DOMINGO, new Date().toString().substring(17,18)+x,true));
			
			//Salvando uma versão e salvando uma artefato e uma versão.
			Versao v = b.salvarVersao(new Versao(new Date().toString(),Status.SUCESSO));
			System.out.println("Minha id " + v.primaryKey);
			Artefato a = v.salvarArtefato(new Artefato(new Date().toString()));
			System.out.println("Minha id " + a.primaryKey);
		
		*/
		
		IteradorBackups ib = hb.obterHistorico();
		
		while(ib.hasNext()){
			Backup br = ib.next();
			
			System.out.println(" Nome Backup: " + br.getNomeBackup() +"Primarykey : "+br.primaryKey+" Alguns dados da regra: " + br.getRegra().getDestino());
			
			IteradorDias id = br.getRegra().recuperarDias();
			System.out.println("Dias Da regra de BackUp : ");
			while( id.hasNext() ){
				Dias dia = id.next();
				System.out.println("Info : " + dia.getHoras() +" dia : " + dia.getDias() + " desliga : " + dia.getDesligar());
			}
			
			IteradorVersoes iv = br.resgatarVersoes();
			
			System.out.println("Versoes disponíveis para esse Backup : ");
			while( iv.hasNext() ){
				Versao versao = iv.next();
				System.out.println("info : "+ versao.getDataInicio()+"");
				
				System.out.println("Artefatos dessa versão: ");
				
				IteradorArtefatos ia = versao.resgatarArtefatos();
				while( ia.hasNext() ){
					Artefato artefato = ia.next();
					System.out.println("info"+ artefato.getUltimaModificacao());
				}
			}
		}
	}
}
