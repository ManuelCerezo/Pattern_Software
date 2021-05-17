package stateniveles;

public abstract class EstadoNivel {
	protected Nivel niveljug;
	
	public EstadoNivel(Nivel level) {
		this.niveljug = level;
	}
	
	public abstract EstadoNivel siguienteNivel();
	public abstract void aplicarNivel();
	
}
