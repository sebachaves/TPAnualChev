package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;
import java.time.ZoneOffset;

public class Banco extends POI{

	//Constructor
	public Banco(Coordenada unaCoordenada, String unaCalle, int unaAltura){
		
		super(unaCoordenada, unaCalle, unaAltura);
		
		this.setInicioSemana(DayOfWeek.MONDAY.getValue());
		this.setFinDeSemana(DayOfWeek.FRIDAY.getValue());
		
		this.setHorarioApertura(OffsetTime.of(10, 0, 0, 0, ZoneOffset.UTC));
		this.setHorarioCierre(OffsetTime.of(15, 0, 0, 0, ZoneOffset.UTC));
		
	}

	//Metodos Abstractos
	public boolean estaDisponible(OffsetTime horarioSolicitado, DayOfWeek diaSolicitado){
		
		return (this.estaEnElDiaCorrecto(diaSolicitado)
				&& horarioSolicitado.isBefore(this.getHorarioCierre())
				&& horarioSolicitado.isAfter(this.getHorarioApertura()));
		
	}
	
}
