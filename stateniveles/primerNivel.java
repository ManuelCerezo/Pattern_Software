package stateniveles;

public class primerNivel extends EstadoNivel {
	boolean aplicado;
	public primerNivel(Nivel level) {
		super(level);
		System.out.println("Nivel 1 Alcanzado !!");
		this.aplicado = false;
	}
	@Override
	public void aplicarNivel() {
		if(aplicado == false) {
			this.niveljug.jug.setVida(this.niveljug.jug.getVida()+150);
			this.niveljug.jug.getRol().setDanio(this.niveljug.jug.getRol().getDanio()+20);
			System.out.print("Aumento de danio ascendido: "+this.niveljug.jug.getRol().getDanio());
			this.niveljug.jug.getRol().getNombreRol();
			System.out.println("Vida ascendida: "+this.niveljug.jug.getVida());
			this.aplicado = true;
		}else {
			System.out.println("Ya has aplicado el nivel!");
		}
	}
	@Override
	public EstadoNivel siguienteNivel() {
		return new segundoNivel(this.niveljug);
	}

}
