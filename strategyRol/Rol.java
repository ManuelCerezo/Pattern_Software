package strategyRol;
import enemigos.Enemigo;

public interface Rol{
	public int getPoder();
	public int getDanio();
	public void setDanio(int danio);
	public void ataqueBasico(Enemigo h);
	public void ataquePrimario(Enemigo a);
	public void ataqueSecundario(Enemigo b);
	public void ataqueEspecial(Enemigo c);
	public String getNombreRol();
}
