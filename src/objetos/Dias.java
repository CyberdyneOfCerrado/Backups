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
	
	public DiasSemana getDias(){
		//System.out.println(dia);
		return dia;
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
