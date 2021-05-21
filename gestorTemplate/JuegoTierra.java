package gestorTemplate;
import decorador.JugadorArmBronce;
import enemigos.*;
import factorymethod.*;
import jugadorprincipal.*;
import stateniveles.*;

public class JuegoTierra extends Juego{
	
	//Constructor de JuegoTierra esta definido en la clase padre
	
	public Enemigo [] rellenarEnemigos(){ //METODO ABSTRACTO
		Enemigo enemigos[] = new Enemigo[3]; //Creacion de enemigos en tierra
		Fabrica factory = new FabricaTierra();
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
		System.out.println("||   	Habia una vez un "+jug.getRol().getNombreRol()+" cuyo nombre	 ||");
		System.out.println("        es "+jug.getNombre());
		System.out.println("||   	Iba caminando por el planta tierra	 ||");
		System.out.println("    	Cuando de repente se encuentra a 	 ");
		System.out.println("||  	tres de sus enemigos mas temibles.       ||");
		System.out.println("     	Estos deseaban destruir el planeta       ");
		System.out.println("||  	tierra donde habitan millones de         ||");
		System.out.println("     	humanos.                                 ");
		System.out.println("||    	¡ NO PODIA PERMITIR QUE SUCEDIERA !      ||");
		System.out.println("    	asi que el guerrero sin mas preangulo    ");
		System.out.println("||    	decidio enfrentarse a los tres enemigos  ||");
		System.out.println(" (================================================)");
		System.out.println("(==================================================)");
		while(op != 'A' && op != 'a'){
			System.out.print("PRESS A TO CONTINUE: "); op = src.next().charAt(0);
		}
		limpiar(100);
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
				if(i == 0 || i == 2) {
					System.out.println("Has subido de nivel!");
					level.siguienteNivel();
					level.aplicarNivel();
				}else {
					System.out.println("Has recibido una armadura de Bronce!");
					jug = new JugadorArmBronce(jug);
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
}