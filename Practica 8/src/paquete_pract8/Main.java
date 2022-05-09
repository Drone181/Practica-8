package paquete_pract8;

import javax.swing.JOptionPane;

public class Main {
	public static int a=10;

	public static void main(String[] args) {
		Jugador j1[] = new Jugador[a];
		Jugador j2[] = new Jugador[a];
		Jugador j3[] = new Jugador[a];
		Jugador j4[] = new Jugador[a];
		Jugador j5[] = new Jugador[a];
		Datos.iniciar(j1,0);
		Datos.iniciar(j2,10);
		Datos.iniciar(j3,20);
		Datos.iniciar(j4,30);
		Datos.iniciar(j5,40);
		Torneo T1 = new Torneo(j1,j2,j3,j4,j5,"Torneo Apertura","Baja California");
		int o1,o2,o3,o4;
		boolean s1 = false,s2=false;
		do {
			o1 = Integer.parseInt(JOptionPane.showInputDialog("Menu del torneo:\n"+T1.getNombre()+
					"\n\n1.Informacion del Torneo\n2.Equipos\n3.Salir"));
			switch(o1) {
			case 1:
				JOptionPane.showMessageDialog(null,"****"+T1.getNombre()+"****"+"\nRegion: "+T1.getRegion()+
						"\nEquipos participantes: "+T1.getNumE()+"\nPartidos jugados: "+T1.getParJ()+
						"\nPartidos pendientes: "+T1.getParP());
				break;
			case 2:
				do {
					o2 = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion:\n\n1.Equipo: "+T1.ar[0].getNombre()
							+"\n2.Equipo: "+T1.ar[1].getNombre()+"\n3.Equipo: "+T1.ar[2].getNombre()+"\n4.Equipo: "+T1.ar[3].getNombre()
							+"\n5.Equipo: "+T1.ar[4].getNombre()));
					switch(o2) {
					case 1:	
						JOptionPane.showMessageDialog(null, "Nombre: "+T1.ar[0].getNombre()+"\nDivision: "+T1.ar[0].getDivision()
						+"\nJugadores registrados: "+T1.ar[0].jugadoresRegis()+"\nPuntos totales anotados: "+T1.ar[0].puntosTotales());
						JOptionPane.showMessageDialog(null,"Los jugadores se desplegaran en la consola");
						System.out.println("********Jugadores del equipo: "+T1.ar[0].getNombre()+"********\n");
						T1.ar[0].getJugador();
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Nombre: "+T1.ar[1].getNombre()+"\nDivision: "+T1.ar[1].getDivision()
						+"\nJugadores registrados: "+T1.ar[1].jugadoresRegis()+"\nPuntos totales anotados: "+T1.ar[1].puntosTotales());
						JOptionPane.showMessageDialog(null,"Los jugadores se desplegaran en la consola");
						System.out.println("********Jugadores del equipo: "+T1.ar[1].getNombre()+"********\n");
						T1.ar[1].getJugador();
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Nombre: "+T1.ar[2].getNombre()+"\nDivision: "+T1.ar[2].getDivision()
						+"\nJugadores registrados: "+T1.ar[2].jugadoresRegis()+"\nPuntos totales anotados: "+T1.ar[2].puntosTotales());
						JOptionPane.showMessageDialog(null,"Los jugadores se desplegaran en la consola");
						System.out.println("********Jugadores del equipo: "+T1.ar[2].getNombre()+"********\n");
						T1.ar[2].getJugador();
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Nombre: "+T1.ar[3].getNombre()+"\nDivision: "+T1.ar[3].getDivision()
						+"\nJugadores registrados: "+T1.ar[3].jugadoresRegis()+"\nPuntos totales anotados: "+T1.ar[3].puntosTotales());
						JOptionPane.showMessageDialog(null,"Los jugadores se desplegaran en la consola");
						System.out.println("********Jugadores del equipo: "+T1.ar[3].getNombre()+"********\n");
						T1.ar[3].getJugador();
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Nombre: "+T1.ar[4].getNombre()+"\nDivision: "+T1.ar[4].getDivision()
						+"\nJugadores registrados: "+T1.ar[4].jugadoresRegis()+"\nPuntos totales anotados: "+T1.ar[4].puntosTotales());
						JOptionPane.showMessageDialog(null,"Los jugadores se desplegaran en la consola");
						System.out.println("********Jugadores del equipo: "+T1.ar[4].getNombre()+"********\n");
						T1.ar[4].getJugador();
						break;
					default:
						JOptionPane.showMessageDialog(null, "Digite una opcion valida");
						break;
					}
					System.out.println("\n--------------------------------------------------------\n");
					do
					{
						o3 = Integer.parseInt(JOptionPane.showInputDialog("Desea regresar al menu de equipos?\n\n1.Si\n2.No"));
					}while(o3>2||o3<1);
					
					
				}while(o3!=2);
				
				
				break;
			case 3: 
				s1 = true;
				break;
			default: JOptionPane.showMessageDialog(null, "**Error**\n\nDigite una opcion valida");
				break;
			}
			
			if(s1==false) {
				do {
					o4 = Integer.parseInt(JOptionPane.showInputDialog("Desea regresar al menu de toreno?\n\n1.Si\n2.No"));
					if(o4==2) {
						s2 = true;
					}
				}while(o4>2||o4<1);
			}
			
			
		}while(s1==false&&s2==false);
		
		JOptionPane.showMessageDialog(null,"Hasta Luego!!!");
	}
		
}

