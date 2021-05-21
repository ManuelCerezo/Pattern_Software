package jugadorprincipal;

import enemigos.Enemigo;
import strategyRol.Rol;

public interface Jugador {
	public int getVida();
	public void setRol(Rol a);
	public Rol getRol();
	public String getNombre();
	public int getArmadura();
	public void setArmadura(int armadura);
	public void setVida(int vida);
	public void ataqueBasico(Enemigo a);
	public void ataquePrincipal(Enemigo c);
	public void ataqueSecundario(Enemigo b);
	public void ataqueEspecial(Enemigo h);
}
