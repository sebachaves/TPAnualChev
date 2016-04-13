package serviciosPoi.clases;

public class Coordenada {
	private double latitud;
	private double longitud;
	
	public Coordenada (double latitud, double longitud ){
		this.Latitud(latitud);
		this.Longitud(longitud);
	}

	public double Latitud() {
		return latitud;
	}
	
	public void Latitud(double latitud) {
		this.latitud = latitud;
	}

	public double Longitud() {
		return longitud;
	}

	public void Longitud(double longitud) {
		this.longitud = longitud;
	}
	
}