package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class LocalComercial extends POI{

	//Constructor
	public LocalComercial(Coordenada unaCoordenada, String unaCalle, int unaAltura, 
							DayOfWeek diaInicial, DayOfWeek diaFinal, int unaHoraApertura, int unaHoraCierre){
		
		super(unaCoordenada, unaCalle, unaAltura);
		
		this.setInicioSemana(diaInicial.getValue());
		this.setFinDeSemana(diaFinal.getValue());
		
		this.setHorarioApertura(OffsetTime.of(unaHoraApertura, 0, 0, 0, ZoneOffset.UTC));
		this.setHorarioCierre(OffsetTime.of(unaHoraCierre, 0, 0, 0, ZoneOffset.UTC));
	
	}
	
	public LocalComercial(Coordenada unaCoordenada, String unaCalle, int unaAltura, ArrayList<DayOfWeek> diasQueAbre, 
							int unaHoraApertura, int unaHoraCierre){

		super(unaCoordenada, unaCalle, unaAltura);

		this.setHorarioApertura(OffsetTime.of(unaHoraApertura, 0, 0, 0, ZoneOffset.UTC));
		this.setHorarioCierre(OffsetTime.of(unaHoraCierre, 0, 0, 0, ZoneOffset.UTC));

	}

	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, String diaSolicitado){
		
		return (diasAbierto.contains(diaSolicitado.toUpperCase()) 
				&& horarioSolicitado.isBefore(horarioCierre)
				&& horarioSolicitado.isAfter(horarioApertura));
		
	}

}
