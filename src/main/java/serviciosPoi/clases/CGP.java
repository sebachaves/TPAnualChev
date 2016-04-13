package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;

public class CGP extends POI{

	//Variables
	private Servicios servicios;
	
	//Enum
	public enum Servicios{
		
		RENTAS("RENTAS", 10, 20);
		
		
		private final String nombreServicio;
		private final int horaApertura;
		private final int horaCierre;
		
		Servicios(String nombreServicio, int unaHoraApertura, int unaHoraCierre){
			
			this.nombreServicio = nombreServicio;
			this.horaApertura = unaHoraApertura;
			this.horaCierre = unaHoraCierre;
			
		}
		
		public boolean estaAtendiendo(){
			
			
			
		}
				
	}
	
	//Constructor
	public CGP(Coordenada unaCoordenada, String unaCalle, int unaAltura, DayOfWeek diaInicial, DayOfWeek diaFinal){
		
		super(unaCoordenada, unaCalle, unaAltura, diaInicial, diaFinal);
		
	}
	
	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, DayOfWeek diaSolicitado){
		
		
		
	}
	
	
	
}
