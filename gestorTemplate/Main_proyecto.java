package gestorTemplate;

public class Main_proyecto {
	//Clase principal del proyecto.
	// EN la clase Main se iniciaran todos los objetos que luego pasados a la clase GameController los gestionará
	
	public static void main(String args[]) {
		
		
		GameController game = GameController.getInstance();
		game.startGame();
		
		
		/*JugadorPrincipal jug = new JugadorPrincipal("Manuel");
		jug.setRol(new Asesino());
		//System.out.println(jug.getArmadura());
		JugadorArmBronce jugbr = new JugadorArmBronce(jug);
		System.out.println("Armadura de bronce: "+jugbr.getArmadura());
		Nivel level = new Nivel();
		level.agregarJug(jugbr);
		level.aplicarNivel();
		level.siguienteNivel();
		level.aplicarNivel();
		level.siguienteNivel();
		level.aplicarNivel();
		level.siguienteNivel();
		
		System.out.println("-------------------------");
		System.out.println("La vida jug es: "+jugbr.getVida());
		System.out.println("El danio es: "+jugbr.getRol().getDanio());
		level.siguienteNivel();
		level.aplicarNivel();
		level.aplicarNivel();
		level.aplicarNivel();
		level.aplicarNivel();*/
		
		/*System.out.println("-------------------------");
		System.out.println("La vida jug es: "+jugbr.getVida());
		System.out.println("El danio es: "+jugbr.getRol().getDanio());*/
		
		
		/*JugadorPrincipal jug = new JugadorPrincipal("Manuel");	
		jug.setRol(new Asesino());
		
		System.out.println("------------------------------");
		System.out.println("Estamos sin Armadura. ");
		System.out.println("El nombre es: "+jug.getNombre());
		jug.getRol().getNombreRol();
		//System.out.println("La armadura de bronce es: "+jug.getArmadura());
		
		System.out.println("------------------------------");
		System.out.println("Estamos en bronce: ");
		JugadorArmBronce jugbr = new JugadorArmBronce(jug);
		System.out.println("El nombre es: "+jugbr.getNombre());
		jugbr.getNombreRol();
		System.out.println("La armadura de bronce es: "+jugbr.getArmadura());
		
		System.out.println("------------------------------");
		System.out.println("Estamos en Oro: ");
		JugadorArmOro jugoro = new JugadorArmOro(jugbr);
		System.out.println("Nombre es: "+jugoro.getNombre());
		jugoro.getNombreRol();
		System.out.println("La armadura de Oro es: "+jugoro.getArmadura());
		
		System.out.println("------------------------------");
		System.out.println("Estamos en Diamante: ");
		JugadorArmDiamante jugdim = new JugadorArmDiamante(jugoro);
		System.out.println("Nombre es: "+jugdim.getNombre());
		jugdim.getNombreRol();
		System.out.println("La armadura de Diamante es: "+jugdim.getArmadura());
		
		System.out.println("=============================================");
		System.out.println("La vida del guerrero diamante es: "+jugdim.getVida());
		System.out.println("La vida del guerrero sin armadura es: "+jug.getVida());
		System.out.println("Actualizamos la vida del guerrero sin armadura -> 150");
		//jugdim.setVida(50);
		jug.setVida(150);
		System.out.println("La vida del guerrero sin armadura es: "+jug.getVida());
		System.out.println("La vida del guerrero diamante es: "+jugdim.getVida());
		
		
		//Espada esp =  new Espada(jug);
		Enemigo enemigos[] = new Enemigo[3];
		
		Fabrica fabTierra = new FabricaTierra();
		enemigos[0] = fabTierra.crearBruja();
		enemigos[1] = fabTierra.crearDemonio();
		enemigos[2] = fabTierra.crearGusano();
		
		System.out.println("Casilla 0: "+enemigos[0].getNombre());
		System.out.println("Casilla 1: "+enemigos[1].getNombre());
		System.out.println("Casilla 2: "+enemigos[2].getNombre());
		
		enemigos[0].ataqueBasico(jugdim);
		//Enemigo gusano = new GusanoTierra();
		//gusano.ataqueEspecial(jugdim);
		System.out.println("La vida del guerrero diamante es: "+jugdim.getVida());
		//System.out.println("La vida del guerrero sin armadura es: "+jug.getVida());*/
		
		
		
		//jug.setRol(new Mago());
		//jug.ataqueEspecial(null);
		//Jugador p = JugadorPrincipal.getInstance("pop");//)("p"); */
		

	}
}