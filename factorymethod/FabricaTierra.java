package factorymethod;
import enemigos.*;

public class FabricaTierra implements Fabrica{

	public Gusano crearGusano() {
		return new GusanoTierra();
	}

	public Bruja crearBruja() {
		return new BrujaTierra();
	}

	public Demonio crearDemonio() {
		return new DemonioTierra();
	}
	

}
