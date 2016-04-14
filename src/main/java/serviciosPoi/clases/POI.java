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
	private ArrayList<Integer> diasAbierto;
	
	/* Algunas variables para despues.
	private Coordenada coordenadaPOI;
	private ArrayList<String> palabrasClave;
	private Direccion direccion;
	*/
	
	//Constructor
	public POI(Coordenada unaCoordenada, String unaCalle, int unaAltura){
		
		//this.coordenadaPOI = unaCoordenada;
		//this.palabrasClave = new ArrayList<String>();
		this.diasAbierto = new ArrayList<Integer>();
		//this.direccion = new Direccion(unaCalle, unaAltura);	
		
	}
	
	//Getters 
	public OffsetTime getHorarioApertura(){
		
		return this.horarioApertura;
		
	}
	
	public OffsetTime getHorarioCierre(){
		
		return this.horarioCierre;
		
	}
	
	public ArrayList<Integer> getDiasQueAbre(){
		
		return this.diasAbierto;
		
	}
	
	//Setters
	public void setHorarioApertura(OffsetTime unHorario){
		
		this.horarioApertura = unHorario;
		
	}
	
	public void setHorarioCierre(OffsetTime unHorario){
		
		this.horarioCierre = unHorario;
		
	}
	
	public void setInicioSemana(int unInicioDeSemana){
		
		this.inicioSemana = unInicioDeSemana;
		
	}
	
	public void setFinDeSemana(int unFinDeSemana){
		
		this.inicioSemana = unFinDeSemana;
		
	}
	
	@SuppressWarnings("unchecked")
	public void setDiasQueAbre(ArrayList<DayOfWeek> unosDias){
		
		this.diasAbierto = (ArrayList<Integer>) unosDias.stream().mapToInt(unDia -> unDia.getValue());
		
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
	
	public abstract boolean estaDisponible(OffsetTime horarioSolicitado, DayOfWeek diaSolicitado, String unServicio);
	
	//Metodos
	public boolean estaEnElDiaCorrecto(DayOfWeek diaSolicitado){
		
		Integer numeroDeDiaSolicitado = diaSolicitado.getValue();
		
		return (numeroDeDiaSolicitado >= this.inicioSemana && numeroDeDiaSolicitado <= this.finSemana) ||
				this.diasAbierto.contains(numeroDeDiaSolicitado);
		
	}

}
