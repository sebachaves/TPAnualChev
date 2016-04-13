import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalQueries;

public class MainPruebas {
	
	public static void main(String[] args){
            
		OffsetTime empiezaALas = OffsetTime.of(10, 0, 0, 0, ZoneOffset.UTC);
		OffsetTime terminaALas = OffsetTime.of(22, 0, 0, 0, ZoneOffset.UTC);
		
		System.out.println(empiezaALas.until(terminaALas, ChronoUnit.HOURS));
		
		OffsetTime horarioSolicitado = OffsetTime.of(23, 0, 0, 0, ZoneOffset.UTC);
		
		System.out.println(empiezaALas);
		System.out.println(terminaALas);
		
		System.out.println(horarioSolicitado.isBefore(terminaALas));
		System.out.println(horarioSolicitado.isAfter(empiezaALas));
		
		System.out.println(DayOfWeek.FRIDAY.getValue());
		
		LocalDate diaSolicitado = LocalDate.of(2016, 4, 13);
		
		System.out.println(diaSolicitado);
		
		DayOfWeek dia = DayOfWeek.from(diaSolicitado);
		
		System.out.println(dia);
			
	}
	
}
