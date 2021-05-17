package enemigos;
import jugadorprincipal.*;

public class DemonioTierra extends Demonio{
	
	public DemonioTierra() {
		super("Demonio Tierra",120,45,50);
	}
	
	public void ataqueBasico(Jugador jug){
		System.out.println("ATAQUE: basico "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	
	public void ataquePrincipal(Jugador jug) {
		System.out.println("ATAQUE: Bola de fuego "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.15 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	public void ataqueSecundario(Jugador jug) {
		System.out.println("ATAQUE: Ola de fuego "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.20 - (danio * (jug.getArmadura() / 100 ) ) )));
		
	}
	public void ataqueEspecial(Jugador jug) {
		System.out.println("ATAQUE: LLuvia de cenizas "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.25 - (danio * (jug.getArmadura() / 100 ) ) )));
	}

}
