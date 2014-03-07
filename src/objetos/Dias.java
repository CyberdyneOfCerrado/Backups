package objetos;

import enuns.DiasSemana;

public class Dias {

	public int primaryKey;
	public DiasSemana dia;
	public String horas;
	public boolean desligar;
	
	public Dias(DiasSemana dia, String horas, boolean desligar){
		this.primaryKey = 0;
		this.dia = dia;
		this.horas = horas;
		this.desligar = desligar;		
	}
	
	public Dias(int primaryKey, DiasSemana dia, String horas, boolean desligar){
		this.primaryKey = primaryKey;
		this.dia = dia;
		this.horas = horas;
		this.desligar = desligar;		
	}
	
	public String getDias(){
		switch( dia.toString() ){
		case "SEGUNDA": return "Seg";	
		case "TERCA":   return "Ter";	
		case "QUARTA":  return "Qua";	
		case "QUINTA":  return "Qui";	
		case "SEXTA":   return "Sex";	
		case "SABADO":  return "Sab";	
		case "DOMINGO": return "Dom";	
		default :       return "vai te foder";
		}	
	}
	
	public String getHoras(){
		//System.out.println(horas);
		return horas;
	}
	
	public boolean getDesligar(){
		//System.out.println(desligar);
		return desligar;
	}
	
}
