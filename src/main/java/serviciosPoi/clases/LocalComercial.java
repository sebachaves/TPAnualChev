package serviciosPoi.clases;

import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class LocalComercial extends POI{

	//Variables
	private OffsetTime horarioApertura;
	private OffsetTime horarioCierre;
		
	private ArrayList<String> diasAbierto;
	
	//Constructor
	public LocalComercial(Coordenada unaCoordenada, String unaCalle, int unaAltura, DayOfWeek diaInicial, DayOfWeek diaFinal){
		
		super(unaCoordenada, unaCalle, unaAltura, diaInicial, diaFinal);
		
		this.horarioApertura = OffsetTime.of(horaApertura, 0, 0, 0, ZoneOffset.UTC);
		this.horarioCierre = OffsetTime.of(horaCierre, 0, 0, 0, ZoneOffset.UTC);
	
		
	}

	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, String diaSolicitado){
		
		return (diasAbierto.contains(diaSolicitado.toUpperCase()) 
				&& horarioSolicitado.isBefore(horarioCierre)
				&& horarioSolicitado.isAfter(horarioApertura));
		
	}

}
