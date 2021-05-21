package strategyRol;
import enemigos.Enemigo;

public class Guerrero implements Rol{
	int danioBasico;
	int roboArmadura;
	
	
	public Guerrero(){
		this.danioBasico = 45;
		this.roboArmadura = 0;
	}
	
	public void ataqueBasico(Enemigo h) {
		System.out.println("ATAQUE: basico Guerrero");	
		h.setVida(h.getVida()-((int)(danioBasico - (danioBasico * (h.getArmadura() / 100 ) ))));
	}
	public void ataquePrimario(Enemigo a) {
		System.out.println("ATAQUE:  !");
		a.setVida(a.getVida()-((int)(danioBasico*1.20 - (danioBasico * (a.getArmadura() / 100 ) ))));
	}
	
	public void ataqueSecundario(Enemigo b){
		System.out.println("ATAQUE: Lanza Gladiador !");
		b.setVida(b.getVida()-((int)(danioBasico*1.30 - (danioBasico * (b.getArmadura() / 100 ) ))));
	}
	public void ataqueEspecial(Enemigo c){
		System.out.println("ATAQUE: Espada Celestial !");
		c.setVida(c.getVida()-((int)(danioBasico*1.10) + (int)(c.getArmadura()*0.2)));
		this.roboArmadura = (int) (c.getArmadura()*0.2);
	}
	public int getDanio() {
		return this.danioBasico;
	}
	
	public int getPoder() {
		return this.roboArmadura;
	}
	public void setDanio(int danio) {
		this.danioBasico = danio;
	}
	public String getNombreRol() {
		return "Guerrero";
	}
	
}
