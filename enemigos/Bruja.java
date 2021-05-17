package enemigos;

import jugadorprincipal.Jugador;

public class Bruja implements Enemigo{
	String nombre;
	int vida;
	int armadura;
	int danio;
	
	public Bruja(String nombre,int vida,int armadura,int danio){
		this.nombre = nombre;
		this.vida = vida;
		this.armadura = armadura;
		this.danio = danio;
	}
	
	public int getVida() {
		return this.vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanio() {
		return this.danio;
	}

	
	public void setDanio(int danio) {
		this.danio = danio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getArmadura() {
		return this.armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public void ataqueBasico(Jugador jug) {
		
	}

	
	public void ataquePrincipal(Jugador jug) {
		
	}

	public void ataqueSecundario(Jugador jug) {
		
	}

	public void ataqueEspecial(Jugador jug) {
		
	}
}
