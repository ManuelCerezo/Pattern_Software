package strategyRol;

import enemigos.Enemigo;

public class Mago implements Rol {
	int vidarobada; //Atributo donde almacena la vida robada (Poder del mago)
	int danioBasico;
	
	public Mago(){
		this.vidarobada = 0;
		this.danioBasico = 30;
	}
	
	public void ataqueBasico(Enemigo h) {
		System.out.println("ATAQUE: basico Mago");	
		h.setVida(h.getVida()-((int)(danioBasico - (danioBasico * (h.getArmadura() / 100 ) ) )));
	}
	public void ataquePrimario(Enemigo a) {
		System.out.println("ATAQUE: Bola de Magia!");
		a.setVida(a.getVida()-((int)(danioBasico*1.20 - (danioBasico * (a.getArmadura() / 100 ) ) )));
	}
	
	public void ataqueSecundario(Enemigo b){
		System.out.println("ATAQUE: Relampago Magico!");
		b.setVida(b.getVida()-((int)(danioBasico*1.30 - (danioBasico * (b.getArmadura() / 100 ) ) )));
	}
	public void ataqueEspecial(Enemigo c){
		System.out.println("ATAQUE: Robo de vida");
		vidarobada =  (int) (c.getVida()*0.2);
		c.setVida(c.getVida()-vidarobada);
	}
	
	public int getPoder(){
		return vidarobada;
	}
	public void getNombreRol() {
		System.out.println("Esto es un Mago");
	}
	public int getDanio() {
		return this.danioBasico;
	}
	public void setDanio(int danio) {
		this.danioBasico = danio;
	}

}
