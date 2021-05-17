package strategyRol;
import enemigos.*;

public class Asesino implements Rol {
	int danioBasico;
	
	public Asesino(){ //Constructor
		danioBasico = 40;
	}
	
	public void ataqueBasico(Enemigo h) {
		System.out.println("ATAQUE: basico Asesino!");	
		h.setVida(h.getVida()-((int)(danioBasico - (danioBasico * (h.getArmadura() / 100 ) ) )));
	}
	
	public void ataquePrimario(Enemigo a) {
		System.out.println("ATAQUE: Niebla Toxica!");
		a.setVida(a.getVida()-((int)(danioBasico*1.20 - (danioBasico * (a.getArmadura() / 100 ) ) )));
	}
	
	public void ataqueSecundario(Enemigo b) {
		System.out.println("ATAQUE: Filo Oscuro!");
		b.setVida(b.getVida()-((int)(danioBasico*1.30 - (danioBasico * (b.getArmadura() / 100 ) ) )));
	}

	public void ataqueEspecial(Enemigo c){ //Este ataque roba danio al enemigo. e infringe su vida.
		System.out.println("ATAQUE ESPECIAL: Absorcion Oscura");
		c.setVida(c.getVida()-((int)(danioBasico*1.4 - (danioBasico * (c.getArmadura() / 100 ) ) )));
		this.danioBasico = this.danioBasico + (int)(c.getDanio()*0.1);
		c.setDanio((int) (c.getDanio() * 0.9));
	}
	
	public int getPoder(){
		return danioBasico;
	}
	public void setDanio(int danio) {
		this.danioBasico = danio;
	}
	public int getDanio() {
		return this.danioBasico;
	}
	
	public void getNombreRol() {
		System.out.println("Esto es un Asesino");
	}

}
