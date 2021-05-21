package gestorTemplate;


public class GameController {
	static  GameController controlador = null; //Solo 1 gameController (Singleton Pattern)
	Juego Mundo;
	
	private GameController(){
		this.Mundo = new JuegoTierra(); //mundo tierra
	}
	
	public static GameController getInstance() {
		if(controlador == null){
			controlador = new GameController();
			return controlador;
		}else{ //Si ya existe retornamos el controlador
			return controlador;
		}
	}
	
	public void startGame(){
		Mundo.introduccionHistoria();
		if (Mundo.combatir()) {
			Mundo = new JuegoInfierno();
			Mundo.introduccionHistoria();
			if(Mundo.combatir()) {
				Mundo.limpiar(100);
				System.out.println("=======================================");
				System.out.println("               [CREDITOS]");
				System.out.println("- Miguel Herencia");
				System.out.println("- Manuel Cerezo");
				System.out.println("- Asignatura: Disenio Software (2INSO A)");
				System.out.println("=======================================");
			}
		}
		System.out.println("=======================================");
		System.out.println("                GAME OVER");
		System.out.println("=======================================");
	}
}
