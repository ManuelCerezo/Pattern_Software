package enemigos;

import jugadorprincipal.Jugador;

public class BrujaInfernal extends Bruja {
	public BrujaInfernal() {
		super("Bruja Infernal",200,45,45);
	}
	
	public void ataqueBasico(Jugador jug){
		System.out.println("ATAQUE: basico "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	
	public void ataquePrincipal(Jugador jug) {
		System.out.println("ATAQUE: Hechizo venenoso infenal"+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.20 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	public void ataqueSecundario(Jugador jug) {
		System.out.println("ATAQUE: Pocion oscura infernal "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.25 - (danio * (jug.getArmadura() / 100 ) ) )));
		
	}
	public void ataqueEspecial(Jugador jug) {
		System.out.println("ATAQUE: Hechizo maldito infernal "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.30 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
}
