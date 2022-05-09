package paquete_pract8;

import java.util.Random;

public class Datos {
	public static int numero() {
		Random r1 = new Random();
		Random r2 = new Random();
		int x = r1.nextInt(16)+0;
		int y,k=0;
		for(int i=0;i<x;i++) {
			y = r2.nextInt(3)+2;
			k = k+y;
		}
		
		return k;
	}
	
	public static float estatura() {
		Random rand = new Random();
		return (float) (1.6 + (1.9-1.6)*rand.nextDouble());
	}
	
	public static void iniciar(Jugador j[],int i) {
		String[] nom = new String[]{"ANTONIO GARCIA",
				"JOSE MARTINEZ",
				"FRANCISCO LOPEZ",
				"JUAN SANCHEZ",
				"MANUEL GONZALEZ",
				"PEDRO GOMEZ",
				"JESUS FERNANDEZ",
				"ANGEL MORENO",
				"MIGUEL JIMENEZ",
				"JAVIER PEREZ",
				"JOSE ANTONIO RODRIGUEZ",
				"DAVID NAVARRO",
				"CARLOS RUIZ",
				"JOSE LUIS DIAZ",
				"ALEJANDRO SERRANO",
				"MIGUEL ANGEL HERNANDEZ",
				"FRANCISCO JAVIER MUÑOZ",
				"RAFAEL SAEZ",
				"DANIEL ROMERO",
				"JUAN JOSE RUBIO",
				"LUIS ALFARO",
				"PABLO MOLINA",
				"JUAN ANTONIO LOZANO",
				"JOAQUIN CASTILLO",
				"SERGIO PICAZO",
				"FERNANDO ORTEGA",
				"JUAN CARLOS MORCILLO",
				"ANDRES CANO",
				"JOSE MANUEL MARIN",
				"JOSE MARIA CUENCA",
				"RAMON GARRIDO",
				"RAUL TORRES",
				"ALBERTO CORCOLES",
				"ENRIQUE GIL",
				"ALVARO ORTIZ",
				"VICENTE CALERO",
				"EMILIO VALERO",
				"FRANCISCO JOSE CEBRIAN",
				"DIEGO RODENAS",
				"JULIAN ALARCON",
				"JORGE BLAZQUEZ",
				"ALFONSO NUÑEZ",
				"ADRIAN PARDO",
				"RUBEN MOYA",
				"SANTIAGO TEBAR",
				"IVAN REQUENA",
				"JUAN MANUEL ARENAS",
				"PASCUAL BALLESTEROS",
				"JOSE MIGUEL COLLADO",
				"MARIO RAMIREZ"};
		
		for(int p=0,k=i;p<Main.a;p++,k++) {
			j[p] = new Jugador();
			j[p].setNombre(nom[k]);
			//j[p].setPuntos(numero());
			j[p].setNumero(p+1);
			j[p].setPosicion(posicion(p+1));
			j[p].setEstatura(estatura());
		}
		
	}
	
	public static String posicion(int k) {
		String [] ar = new String[]{"","Base","Base","Escolta","Escolta","Alero",
				"Alero","Ala-Pivot","Ala-Pivot","Pivot","Pivot"};
		
		return ar[k];	
	}
}
