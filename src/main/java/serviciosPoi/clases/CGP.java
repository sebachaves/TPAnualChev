package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;
import java.util.ArrayList;

public class CGP extends POI{

	//Variables
	private ArrayList<Servicio> servicios;
	
	//Constructor
	public CGP(Coordenada unaCoordenada, String unaCalle, int unaAltura){
		
		super(unaCoordenada, unaCalle, unaAltura);
		
	}
	
	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, DayOfWeek diaSolicitado, String nombreDeUnServicio){
		
		Servicio servicioBuscado = (Servicio) servicios.stream().filter(unServicio -> unServicio.getNombre().equalsIgnoreCase(nombreDeUnServicio));
		
		return servicioBuscado.estaDisponibleElDia(diaSolicitado) && servicioBuscado.estaDisponibleALaHora(horarioSolicitado);
		
	}
	
	
	
	
	
}
