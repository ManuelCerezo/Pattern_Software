package gestorTemplate;
import java.util.Scanner;
import enemigos.*;
import jugadorprincipal.*;
import strategyRol.*;

public abstract class Juego {
	
	static Scanner src = new Scanner(System.in);
	static  Jugador jug = null ;
	Enemigo enemigos[];
	
	Juego(){
		jug =  getInstanceofJugador(); //jugador principal siempre se crea igual
		this.enemigos = rellenarEnemigos();
	}
	public static Jugador getInstanceofJugador(){
		if(jug == null) {
			return crearJugadorPrincipal();
		}else {
			return jug;
		}
	}
	public void imprimirEstadisticas(int i){ //Igual para todas los algoritmos.
		System.out.println("-----------[ESTADISTICAS]-----------");
		estadisticaJug();
		estadisticaEnemigos(enemigos[i]);
		System.out.println("------------------------------------");
	}
	private void estadisticaJug(){
		System.out.println("[JUGADOR]:");
		System.out.println("Nombre: "+jug.getNombre());
		System.out.println("- Rol: "+jug.getRol().getNombreRol());
		System.out.println("- Vida: "+jug.getVida());
		System.out.println("- Danio: "+jug.getRol().getDanio());
		System.out.println("- Armadura: "+jug.getArmadura());
	}
	private void estadisticaEnemigos(Enemigo a) {
		System.out.println("\n[ENEMIGO]:");
		System.out.println("Nombre: "+a.getNombre());
		System.out.println("- Vida: "+a.getVida());
		System.out.println("- Danio: "+a.getDanio());
		System.out.println("- Armadura: "+a.getArmadura());
	}
	private static Jugador crearJugadorPrincipal(){ //IgualPara todos los algoritmos
		String nombre;
		System.out.println("INSERTAR NOMBRE PARA EL JUGADOR PRINCIPAL: ");
		nombre = src.nextLine();
		Jugador jug = new JugadorPrincipal(nombre);
		System.out.println("INSERTAR ROL PARA EL JUGADOR PRINCIPAL: ");
		jug.setRol(escogerRol());
		//jug = new JugadorArmBronce(jug);
		return jug;
	}
	private static Rol escogerRol(){
		int op;
		System.out.println("1. 	[ASESINO]");
		System.out.println("DanioBasico -> 40");
		System.out.println("Habilidad Especial -> Robar Danio\n");
		System.out.println("2.	[MAGO]:");
		System.out.println("DanioBasico -> 30");
		System.out.println("Habilidad Especial -> Robar Vida\n");
		System.out.println("3.	[GUERRERO]:");
		System.out.println("DanioBasico -> 45");
		System.out.println("Habilidad Especial -> Robar Armadura\n");
		System.out.println("|-----------------[1, 2, 3]---------------|");
		do {
			System.out.print("ESCOGER SELECCION: ");
			op = src.nextInt();	
		}while(op != 1 && op != 2 && op != 3);
		if(op == 1) {
			return new Asesino();
		}else if(op == 2) {
			return new Mago();
		}else if( op == 3) {
			return new Guerrero();
		}
		return null ;
	}
	public void limpiar(int lineas){
		for (int i=0; i < lineas; i++){
			System.out.println("");
		}
	}
	public void dormir(int timeline) {
		try{
		    Thread.sleep (timeline);  // El tiempo en milisegundos
		} catch (Exception e){
		    // Tratamiento de la excepción
		}
	}
	
	public abstract void introduccionHistoria();
	public abstract Enemigo[] rellenarEnemigos();
	public abstract boolean combatir();
}
