package paquete_pract8;

import java.util.Random;

public class Equipo {
	private String nomEquipo;
	private String division;
	private String entrenador;
	private int torneosPar;
	private int torneosGan;
	private int torneosPer;
	private Jugador j[];
	
	public Equipo(Jugador j[],String nombre, String entrenador) {
		this.nomEquipo = nombre;
		this.division = "1ra division";
		this.entrenador = entrenador;
		this.torneosPar = numTor();
		this.torneosGan = torGan(this.torneosPar);
		this.torneosPer = this.torneosPar-this.torneosGan;
		this.j = j;
	}
	
	public String getNombre() {
		return nomEquipo;
	}
	
	public String getDivision() {
		return division;
	}
	
	public String getEntrenador() {
		return entrenador;
	}
	
	public int getTorPar() {
		return torneosPar;
	}
	
	public int getTorGan() {
		return torneosGan;
	}
	
	public int getTorPer() {
		return torneosPer;
	}
	
	public void getJugador() {
		for(int i=0;i<Main.a;i++) {
			System.out.println("Numero de uniforme: "+j[i].getNumero()+"\nNombre: "+j[i].getNombre()+"\n");
		}
	}
	
	public int puntosTotales() {
		int s=0;
		for(int i=0;i<Main.a;i++) {
			s = s+j[i].getPuntos();
		}
		return s;
	}
	
	public int jugadoresRegis() {
		int s=0;
		for(int i=0;i<Main.a;i++) {
			if(j[i].getNombre().equals(null)!=true) {
				s++;
			}
		}
		return s;
	}
	
	private int numTor() {
		Random r1 = new Random();
		int x;
		return x = r1.nextInt(100)+1;
	}
	
	private int torGan(int p) {
		Random r1 = new Random();
		int x;
		return x = r1.nextInt(p)+0;
	}
}
