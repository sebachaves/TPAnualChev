package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;

public class ParadaColectivo extends POI{
	
	//Constructor
	public ParadaColectivo(Coordenada unaCoordenada, String unaCalle, int unaAltura){
		
		super(unaCoordenada, unaCalle, unaAltura, DayOfWeek.MONDAY, DayOfWeek.SUNDAY);
		
	}
	
	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, String diaSolicitado){
		
		return true;
		
	}
	
}
