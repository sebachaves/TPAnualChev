package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class Servicio {
	
	//Variables
	private String nombre;
	private ArrayList<Integer> diasAbierto;
	private OffsetTime horarioApertura;
	private OffsetTime horarioCierre;
	
	//Constructor
	public Servicio(String unNombre, ArrayList<DayOfWeek> unosDias, int unHorarioApertura, int unHorarioCierre){
		
		this.setNombre(unNombre);
		
		diasAbierto = new ArrayList<Integer>();
		
		this.setDiasAbierto(unosDias);	
		
		this.setHorarioApertura(OffsetTime.of(unHorarioApertura, 0, 0, 0, ZoneOffset.UTC));
		this.setHorarioCierre(OffsetTime.of(unHorarioCierre, 0, 0, 0, ZoneOffset.UTC));
		
	}
	
	
	//Getters
 	public String getNombre(){
		
		return this.nombre;
		
	}
	
 	public OffsetTime getHorarioApertura(){
 		
 		return this.horarioApertura;
 		
 	}
 	
 	public OffsetTime getHorarioCierre(){
 		
 		return this.horarioCierre;
 		
 	}
 	
	//Setters
	public void setNombre(String unNombre){
		
		this.nombre = unNombre;
		
	}

	@SuppressWarnings("unchecked")
	public void setDiasAbierto(ArrayList<DayOfWeek> unosDias){
		
		this.diasAbierto = (ArrayList<Integer>) unosDias.stream().mapToInt(unDia -> unDia.getValue());
		
	}
	
	public void setHorarioApertura(OffsetTime unHorarioApertura){
		
		this.horarioApertura = unHorarioApertura;
		
	}
	
	public void setHorarioCierre(OffsetTime unHorarioCierre){
		
		this.horarioCierre = unHorarioCierre;
		
	}
	
	//Metodos
	public boolean estaDisponibleElDia(DayOfWeek diaSolicitado){
		
		Integer numeroDeDiaSolicitado = diaSolicitado.getValue();
		
		return this.diasAbierto.contains(numeroDeDiaSolicitado);
		
	}
	
	public boolean estaDisponibleALaHora(OffsetTime horarioSolicitado){
		
		return horarioSolicitado.isBefore(this.getHorarioCierre())
				&& horarioSolicitado.isAfter(this.getHorarioApertura());
		
	}
	
}
