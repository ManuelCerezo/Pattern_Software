package jugadorprincipal;
import enemigos.*;
import strategyRol.*;

public class JugadorPrincipal implements Jugador{
	
	String nombre;
	int vida;
	Rol roljugador;
	
	public JugadorPrincipal(String a){
		this.nombre = a;
		this.vida = 200;
	}
	
	//Ataques
	public void ataqueBasico(Enemigo a){
		this.roljugador.ataqueBasico(a);
	}
	public void ataquePrincipal(Enemigo c) {
		this.roljugador.ataquePrimario(c);
	}
	public void ataqueSecundario(Enemigo b) {
		this.roljugador.ataqueSecundario(b);
	}
	
	
	public void ataqueEspecial(Enemigo h) {
		this.roljugador.ataqueEspecial(h);
		
		//Ataque Especial para Mago
		if(this.roljugador.getClass().equals(Mago.class)){ 
			System.out.println("Has Robado un 20% de la vida a "+ h.getNombre());
			System.out.println("Vida Anterior: "+this.getVida());
			this.setVida(this.getVida()+this.roljugador.getPoder());
			System.out.println("Vida Actual: "+this.getVida());
			
			//Ataque Especial para Asesino
		}else if(this.roljugador.getClass().equals(Asesino.class)) {
			System.out.println("Has Robado un 10% de poder de Ataque a "+ h.getNombre());
			System.out.println("El danio del Asesino incrementa a: "+this.roljugador.getPoder());
			//System.out.println("La vida del enemigo desciende a: "+h.getVida());
			
			//Ataque Especial para Guerrero
		}else if(this.roljugador.getClass().equals(Guerrero.class)){ //no tiene armadura.
			System.out.println("La vida del enemigo desciende a: "+h.getVida());
		}
	}
	
	
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public void setRol(Rol a) {
		roljugador = a;
	}
	public Rol getRol() {
		return this.roljugador;
	}
	public String getNombre() {
		return this.nombre;
	}

	public int getArmadura() {
		return 0;
	}

	public void setArmadura(int armadura) {
	}
	
}
