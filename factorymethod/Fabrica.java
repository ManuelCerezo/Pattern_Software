package factorymethod;
import enemigos.*;

public interface Fabrica {
	public Gusano crearGusano();
	public Bruja crearBruja();
	public Demonio crearDemonio();
}
