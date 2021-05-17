package decorador;

import enemigos.*;
import jugadorprincipal.*;
import strategyRol.*;

public class JugadorArmOro extends Decorador {
	int armadura;
	
	public JugadorArmOro(Jugador objeto) {
		super(objeto);
		this.armadura = 50;
	}
	
	//Ataques
	public void ataqueBasico(Enemigo a){
		this.getRol().ataqueBasico(a);
	}
	public void ataquePrincipal(Enemigo c) {
		this.getRol().ataquePrimario(c);
	}
	public void ataqueSecundario(Enemigo b) {
		this.getRol().ataqueSecundario(b);
	}
	
	
	public void ataqueEspecial(Enemigo h) {
		this.getRol().ataqueEspecial(h);
		
		//Ataque Especial para Mago
		if(this.getRol().getClass().equals(Mago.class)){ 
			System.out.println("Has Robado un 20% de la vida a "+ h.getNombre());
			System.out.println("Vida Anterior: "+this.getVida());
			this.setVida(this.getVida()+this.getRol().getPoder());
			System.out.println("Vida Actual: "+this.getVida());
			
			//Ataque Especial para Asesino
		}else if(this.getRol().getClass().equals(Asesino.class)){
			System.out.println("Has Robado un 10% de poder de Ataque a "+ h.getNombre());
			System.out.println("El danio del Asesino incrementa a: "+this.getRol().getPoder());
			System.out.println("La vida del enemigo desciende a: "+h.getVida());
			
			//Ataque Especial para Guerrero
		}else if(this.getRol().getClass().equals(Guerrero.class)){
			System.out.println("La vida del enemigo desciende a: "+h.getVida());
			this.armadura += this.getRol().getPoder();
			System.out.println("La armadura del guerrero ha ascendido a: "+this.getArmadura());
		}
	}
	
	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	public void getNombreRol() {
		this.getRol().getNombreRol();
	}
}
