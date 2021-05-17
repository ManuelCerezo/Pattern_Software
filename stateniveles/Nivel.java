package stateniveles;
import jugadorprincipal.*;

public class Nivel {
	Jugador jug;
	EstadoNivel estnivel;
	
	public Nivel() {
		this.estnivel = new primerNivel(this);
	}
	public void agregarJug(Jugador jugador) {
		this.jug = jugador;
	}
	public void eliminarJug() {
		this.jug = null;
	}
	
	public void siguienteNivel() {
		estnivel = estnivel.siguienteNivel();
	}
	public void aplicarNivel() {
		estnivel.aplicarNivel();
	}
}
