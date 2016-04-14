package serviciosPoi.clases;

import java.time.DayOfWeek;

import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

public class ServicioPOI {

	//Metodos
	/*
	public boolean estaCerca(POI unPOI){
	
		return unPOI.estaCerca();
	
	}
	*/
	
	public boolean estaDisponible(POI poiSolicitado, LocalDateTime unDia, String unServicio){
		
		OffsetTime horarioSolicitado = OffsetTime.of(unDia.getHour(), unDia.getMinute(), 
									unDia.getSecond(), 0, ZoneOffset.UTC);
		
		DayOfWeek diaSolicitado = DayOfWeek.from(unDia);
		
		return poiSolicitado.estaDisponible(horarioSolicitado, diaSolicitado, unServicio);
		
	}
	
	/*
	public void buscarPOISegun(String palabraClave){
		
		Stream<POI> puntosQuePuedenInteresar = puntosDeInteres.stream().filter(unPunto -> unPunto.buscarSegun(palabraClave));
		
	}
	*/
	
}
