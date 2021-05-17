package gestor;
import enemigos.*;
import jugadorprincipal.*;

public class GameController {
	static GameController controlador = null; //Solo 1 gameController (Singleton Pattern)
	JugadorPrincipal jugador;
	Enemigo enemy;
	
	private GameController(JugadorPrincipal a,Enemigo b){
		this.jugador = a;
		this.enemy = b;
	}
	
	public static GameController getInstance(JugadorPrincipal a, Enemigo b) {
		if(controlador == null) {
			controlador = new GameController(a,b);
			return controlador;
		}else{ //Si ya existe retornamos el controlador
			return controlador;
		}
	}
	
	
	
}
