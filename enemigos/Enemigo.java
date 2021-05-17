package enemigos;

import jugadorprincipal.*;

public interface Enemigo {
	public int getVida();
	public void setVida(int vida);
	public int getDanio();
	public void setDanio(int danio);
	public String getNombre();
	public void setNombre(String nombre);
	public int getArmadura();
	public void setArmadura(int armadura);
	public void ataqueBasico(Jugador jug);
	public void ataquePrincipal(Jugador jug);
	public void ataqueSecundario(Jugador jug);
	public void ataqueEspecial(Jugador jug);
}
