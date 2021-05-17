package stateniveles;

public class tercerNivel extends EstadoNivel{
	boolean aplicado;
	public tercerNivel(Nivel level){
		super(level);
		System.out.println("Nivel 3 Alcanzado !!");
		this.aplicado = false;
	}

	public void aplicarNivel(){
		if(aplicado == false) {
			this.niveljug.jug.setVida(350);
			this.niveljug.jug.getRol().setDanio(this.niveljug.jug.getRol().getDanio()+10);
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
		//Ultimo nivel alcanzado.
		return this;
	}

}
