package gestorTemplate;

import decorador.*;
import enemigos.Enemigo;
import factorymethod.*;
import jugadorprincipal.Jugador;
import stateniveles.Nivel;

public class JuegoInfierno extends Juego{
	public Enemigo [] rellenarEnemigos(){ //METODO ABSTRACTO
		Enemigo enemigos[] = new Enemigo[3]; //Creacion de enemigos infernales
		Fabrica factory = new FabricaInfierno();
			enemigos[0] = factory.crearGusano();
			enemigos[1] = factory.crearDemonio();
			enemigos[2] = factory.crearBruja();
			return enemigos;
	}
	public void introduccionHistoria(){ //METODO ABSTRACTO
		char op = 0;
		System.out.println("\n\n\n\n                     |HISTORIA|");
		System.out.println("(==================================================)");
		System.out.println(" (================================================)");
		System.out.println("||   	Una vez derrotados los enemigos en la 	 ||");
		System.out.println("        Tierra, "+jug.getNombre()+", decidio");
		System.out.println("||   	viajar al infierno para destruir dicho   ||");
		System.out.println("    	mundo, pero una vez mas tuvo que  	 ");
		System.out.println("||   	enfrentarse a los enemigos pero          ||");
		System.out.println("    	¡ Aun mas fuertes !, debido que al       ");
		System.out.println("||   	estar en el infierno, sus poderes        ||");
		System.out.println("    	han incrementado de forma notable        ");
		System.out.println("||   	¡ PERO ESTE DEFENSOR DE LA TIERRA        ||");
		System.out.println("    	NO SE VA A RENDIR TAN FACILMENTE !       ");
		System.out.println("||   	que comience la lucha...                 ||");
		System.out.println(" (================================================)");
		System.out.println("(==================================================)");
		while(op != 'A' && op != 'a'){
			System.out.print("PRESS A TO CONTINUE: "); op = src.next().charAt(0);
		}
	}
	public boolean combatir(){ //Clase dedicada a la lucha en la Tierra
		int i = 0;
		Nivel level = new Nivel();
		level.agregarJug(jug);
		level.aplicarNivel();
		for(i=0;i<3;i++) {
			while(enemigos[i].getVida()>0) {
				if(jug.getVida() <= 0){
					System.out.println("¡Has Perdido!");
					return false;
				}else {
					this.imprimirEstadisticas(i);
					turnoJugador(enemigos[i]);
					turnoEnemigo(enemigos[i],jug);
					this.dormir(1000);
				}
			}
			//Aqui entra cuando mata a un enemigo.
			if(i < 2) {
					this.limpiar(50);
					System.out.println("=====================================================");
					System.out.println("¡Has matado a "+enemigos[i].getNombre()+", sigue asi!");
					System.out.println("Siguiente enemigo: "+enemigos[i+1].getNombre());
					System.out.println("=====================================================");
				if(i == 1) {
					System.out.println("Has subido de nivel!");
					level.siguienteNivel();
					level.aplicarNivel();
					System.out.println("¡ Has conseguido Armadura de diamante. !");
					jug = new JugadorArmDiamante(jug);
					
				}else if(i == 0) {
					System.out.println("¡ Has conseguido Armadura de oro. !");
					jug = new JugadorArmOro(jug);
				}
				this.dormir(5000);
			}
			if(i == 2) {
				this.limpiar(50);
				System.out.println("============================================");
				System.out.println("¡Enorabuena has matado a todos los enemigos!");
				System.out.println("============================================");
				this.dormir(5000);
			}
		}
		return true;
	}

	private void turnoJugador(Enemigo a){
		char op;
		System.out.println("===============================");
		System.out.println("         TURNO JUGADOR");
		System.out.println("===============================");
		System.out.println("1. Ataque Basico");
		System.out.println("2. Ataque Principal");
		System.out.println("3. Ataque Secundario");
		System.out.println("4. Ataque Especial\n");
		do {
			System.out.print("[Elige ataque]: "); op = Juego.src.next().charAt(0);
		}while(op <'1' || op>'4');
		
		if(op == '1') {
			jug.ataqueBasico(a);
		}else if(op == '2') {
			jug.ataquePrincipal(a);
		}else if(op == '3') {
			jug.ataqueSecundario(a);
		}else{
			jug.ataqueEspecial(a);
		}
	}
		
	private void turnoEnemigo(Enemigo ene,Jugador jug){
		int op;
		System.out.println("===============================");
		System.out.println("    TURNO "+ene.getNombre().toUpperCase());
		System.out.println("===============================");
		op = (int) Math.random()*4;
		
		if(op == 1) {
			ene.ataqueBasico(jug);
		}else if(op == 2) {
			ene.ataquePrincipal(jug);
		}else if(op == 3) {
			ene.ataqueSecundario(jug);
		}else{
			ene.ataqueEspecial(jug);
		}
	}	
	
	public void historiafinal() {
		System.out.println("\n\n\n\n                     |HISTORIA|");
		System.out.println("(==================================================)");
		System.out.println(" (================================================)");
		System.out.println("||   	Una vez derrotados los enemigos en el 	 ||");
		System.out.println("        infierno, "+jug.getNombre()+", devolvio");
		System.out.println("||   	la paz a la tierra y a todo el universo,  ||");
		System.out.println("    	es asi como se convirtio en un ejemplo ");
		System.out.println("||   	para todos los heroes de la tierra.       ||");
		System.out.println("    	                                            ");
		System.out.println("||   	Ahora, todos los habitantes pueden        ||");
		System.out.println("    	vivir tranquilos sin ningun miedo        ");
		System.out.println("||   	¡ ENHORABUENA HAS LLEGADO AL FINAL DEL    ||");
		System.out.println("    	JUEGO, HAS DEMOSTRADO QUE ERES UN GRAN  ");
		System.out.println("||   	HEROE ! Nos vemos pronto..                ||");
		System.out.println(" (================================================)");
		System.out.println("(==================================================)");
	}
	
}