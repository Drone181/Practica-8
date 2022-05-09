package paquete_pract8;

public class Jugador {
	private String nombre;
	private int numero;
	private int puntosA;
	private String posicion;
	private float estatura;
	
	public Jugador() {
		this.nombre = "vacio";
		this.numero = 0;
		this.puntosA = Datos.numero();
		this.posicion = "vacio";
		this.estatura = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getPuntos() {
		return puntosA;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public float getEstatura() {
		return estatura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPuntos(int puntos) {
		this.puntosA = puntos;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
}
