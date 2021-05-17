package enemigos;
import jugadorprincipal.*;

public class GusanoTierra extends Gusano{
	
	public GusanoTierra() {
		super("Gusano Tierra",100,40,40);
	}
	
	public void ataqueBasico(Jugador jug){
		System.out.println("ATAQUE: basico "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	
	public void ataquePrincipal(Jugador jug) {
		System.out.println("ATAQUE: Babas pegajosas "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.10 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	public void ataqueSecundario(Jugador jug) {
		System.out.println("ATAQUE: Absorcion "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.15 - (danio * (jug.getArmadura() / 100 ) ) )));
		
	}
	public void ataqueEspecial(Jugador jug) {
		System.out.println("ATAQUE: Moridisco venenoso "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.20 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	

}
