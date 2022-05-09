package paquete_pract8;

import java.util.Random;

public class Torneo {
	private String nombre;
	private String region;
	private int numEquipos;
	private int parJugados;
	private int parPendientes;
	private Jugador j1[];
	private Jugador j2[];
	private Jugador j3[];
	private Jugador j4[];
	private Jugador j5[];
	protected Equipo[] ar = new Equipo[5];
	
	public Torneo(Jugador j1[], Jugador j2[], Jugador j3[], Jugador j4[], Jugador j5[], String nombre, String region) {
		this.nombre = nombre;
		this.region = region;
		this.numEquipos = 5;
		this.parJugados = numPar();
		this.parPendientes = 7-this.parJugados;
		this.j1 = j1;
		this.j2 = j2;
		this.j3 = j3;
		this.j4 = j4;
		this.j5 = j5;
		
		ar[0] = new Equipo(j1,"Los Pollos","Pelusa Caligari");
		ar[1] = new Equipo(j2,"BasRad","Cris Cros");
		ar[2] = new Equipo(j3,"Stars","Josefo Venegas");
		ar[3] = new Equipo(j4,"TijuaClub","Joseph Smith");
		ar[4] = new Equipo(j5,"AquarioDeportivo","Raul Garcia");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getRegion() {
		return region;
	}
	
	public int getNumE() {
		return numEquipos;
	}
	
	public int getParJ() {
		return parJugados;
	}
	
	public int getParP() {
		return parPendientes;
	}
	
	private int numPar() {
		Random r1 = new Random();
		int x;
		return x = r1.nextInt(7)+0;
	}

}
