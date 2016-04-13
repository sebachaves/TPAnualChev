package serviciosPoi.clases;

import java.time.DayOfWeek;
import java.time.OffsetTime;
import java.util.ArrayList;

public abstract class POI {
	
	//Variables
	private OffsetTime horarioApertura;
	private OffsetTime horarioCierre;

	private int inicioSemana;
	private int finSemana;

	private Coordenada coordenadaPOI;
	private ArrayList<String> palabrasClave;
	private Direccion direccion;
	
	//Constructor
	public POI(Coordenada unaCoordenada, String unaCalle, int unaAltura, DayOfWeek diaInicial, DayOfWeek diaFinal){
		
		this.coordenadaPOI = unaCoordenada;
		this.palabrasClave = new ArrayList<String>();
		this.direccion = new Direccion(unaCalle, unaAltura);	

		this.inicioSemana = diaInicial.getValue();
		this.finSemana = diaFinal.getValue();
		
	}
	
	//Getters 
	public OffsetTime getHorarioApertura(){
		
		return this.horarioApertura;
		
	}
	
	public OffsetTime getHorarioCierre(){
		
		return this.horarioCierre;
		
	}
	
	//Setters
	public void setHorarioApertura(OffsetTime unHorario){
		
		this.horarioApertura = unHorario;
		
	}
	
	public void setHorarioCierre(OffsetTime unHorario){
		
		this.horarioCierre = unHorario;
		
	}
	
	
	//Clases Internas
	//Clase Direccion
	public class Direccion {
		String nombreDireccion;
		int numero;
		
		public Direccion(String nombreCalle,int numero){
			this.NombreDireccion(nombreCalle);
			this.Numero(numero);
		}

		public String NombreDireccion() {
			return nombreDireccion;
		}

		public void NombreDireccion(String direccion) {
			this.nombreDireccion = direccion;
		}

		public int Numero() {
			return numero;
		}

		public void Numero(int numero) {
			this.numero = numero;
		}
		
	}

	
	//Metodos Abstractos
	//public abstract boolean estaCerca();
	//public abstract boolean buscarSegun(String palabraClave);
	
	public abstract boolean estaDisponible(OffsetTime horarioSolicitado, String diaSolicitado);

	
	//Metodos
	public boolean estaEnElDiaCorrecto(String diaSolicitado){
		
		Integer numeroDeDiaSolicitado = DayOfWeek.valueOf(diaSolicitado.toUpperCase()).getValue();
		
		return numeroDeDiaSolicitado >= this.inicioSemana && numeroDeDiaSolicitado <= this.finSemana;
		
	}

}
