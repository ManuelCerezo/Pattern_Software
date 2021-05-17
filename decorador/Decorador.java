package decorador;

import jugadorprincipal.*;
import strategyRol.*;

abstract public class Decorador implements Jugador{
	Jugador jug;
	
	public Decorador(Jugador objeto) {
		this.jug = objeto;
	}
	
	public String getNombre(){ //funciones abstractas para todos los metodos
		return this.jug.getNombre();
	}
	public Rol getRol() {
		return this.jug.getRol();
	}
	public int getVida() {
		return this.jug.getVida();
	}
	public void setVida(int vida) {
		this.jug.setVida(vida);
	}
	
}
