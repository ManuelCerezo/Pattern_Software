package enemigos;

import jugadorprincipal.Jugador;

public class DemonioInfernal extends Demonio {
	public DemonioInfernal() {
		super("Demonio Infernal",220,60,65);
	}
	
	public void ataqueBasico(Jugador jug){
		System.out.println("ATAQUE: basico infernal "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	
	public void ataquePrincipal(Jugador jug) {
		System.out.println("ATAQUE:Bola de fuego infernal "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.10 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	public void ataqueSecundario(Jugador jug) {
		System.out.println("ATAQUE: Ola de fuego infernal"+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.15 - (danio * (jug.getArmadura() / 100 ) ) )));
		
	}
	public void ataqueEspecial(Jugador jug) {
		System.out.println("ATAQUE:  LLuvia de cenizas infernal "+this.getNombre());	
		jug.setVida(jug.getVida()-((int)(danio*1.20 - (danio * (jug.getArmadura() / 100 ) ) )));
	}
	
}
