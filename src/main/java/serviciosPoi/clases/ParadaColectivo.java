package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;

public class ParadaColectivo extends POI{
	
	//Constructor
	public ParadaColectivo(Coordenada unaCoordenada, String unaCalle, int unaAltura){
		
		super(unaCoordenada, unaCalle, unaAltura);
		
		this.setInicioSemana(DayOfWeek.MONDAY.getValue());
		this.setFinDeSemana(DayOfWeek.SUNDAY.getValue());
				
	}
	
	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, DayOfWeek diaSolicitado, String unServicio){
		
		return true;
		
	}

	
}
