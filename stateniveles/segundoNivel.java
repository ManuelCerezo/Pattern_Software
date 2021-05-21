package stateniveles;

public class segundoNivel extends EstadoNivel {
	boolean aplicado;
	public segundoNivel(Nivel level) {
		super(level);
		System.out.println("Nivel 2 Alcanzado !!");
		this.aplicado = false;
	}
	
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
		return new tercerNivel(this.niveljug);
	}

}
