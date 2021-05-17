package enemigos;
import jugadorprincipal.*;

public class BrujaTierra extends Bruja {
	public BrujaTierra() {
		super("Bruja Tierra",100,35,35);
	}
	
	public void ataqueBasico(Jugador jug){
		System.out.println("ATAQUE: basico "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	
	public void ataquePrincipal(Jugador jug) {
		System.out.println("ATAQUE: Hechizo venenoso "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.15 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	public void ataqueSecundario(Jugador jug) {
		System.out.println("ATAQUE: Pocion oscura "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.20 - (danio * (jug.getArmadura() / 100 ) ) )));
		
	}
	public void ataqueEspecial(Jugador jug) {
		System.out.println("ATAQUE: Hechizo maldito "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.25 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
}
