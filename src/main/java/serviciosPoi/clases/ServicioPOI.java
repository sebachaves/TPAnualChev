package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class ServicioPOI {
	
	//Variables
	private Collection<POI> puntosDeInteres;
	public static Coordenada coordenada;	
	public static Collection<String> DiasHabiles = new ArrayList<String>();
	
	//Metodos
	/*
	public boolean estaCerca(POI unPOI){
	
		return unPOI.estaCerca();
	
	}
	*/
	
	public boolean estaDisponible(POI poiSolicitado, String diaSolicitado, OffsetTime horarioSolicitado){
		
		return poiSolicitado.estaDisponible(horarioSolicitado, diaSolicitado);
		
	}
	
	/*
	public void buscarPOISegun(String palabraClave){
		
		Stream<POI> puntosQuePuedenInteresar = puntosDeInteres.stream().filter(unPunto -> unPunto.buscarSegun(palabraClave));
		
	}
	*/
	
}
