package enemigos;
import jugadorprincipal.Jugador;

public class GusanoInfernal extends Gusano {
	public GusanoInfernal() {
		super("Gusano_Infierno",200,50,55);
	}
	
	public void ataqueBasico(Jugador jug){
		System.out.println("ATAQUE: basico infernal "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	
	public void ataquePrincipal(Jugador jug) {
		System.out.println("ATAQUE: Babas pegajosas infernales "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.10 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	public void ataqueSecundario(Jugador jug) {
		System.out.println("ATAQUE: Absorcion infernal"+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.15 - (danio * (jug.getArmadura() / 100 ) ) )));
		
	}
	public void ataqueEspecial(Jugador jug) {
		System.out.println("ATAQUE: Mordisco venenoso infernal "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.20 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
}
