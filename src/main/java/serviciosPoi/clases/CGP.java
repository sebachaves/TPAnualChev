package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;

import serviciosPoi.clases.CGP.Servicios;

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
				
	}
	
	//Constructor
	public CGP(Coordenada unaCoordenada, String unaCalle, int unaAltura){
		
		super(unaCoordenada, unaCalle, unaAltura);
		
	}
	
	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, DayOfWeek diaSolicitado, Servicios unServicio){
		
		if(unServicio.equals(null)){
			
			return CGP.hayServicioDisponiblePara(horarioSolicitado, diaSolicitado);
			
		}
				
		return unServicio.getRangoAtencion() && unServicio.getDiasQueAtiende();
		
	}
	
	
	
	
	
}
