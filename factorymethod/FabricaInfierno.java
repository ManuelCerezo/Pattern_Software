package factorymethod;

import enemigos.*;

public class FabricaInfierno implements Fabrica{
	public Gusano crearGusano() {
		return new GusanoInfernal();
	}

	public Bruja crearBruja() {
		return new BrujaInfernal();
	}

	public Demonio crearDemonio() {
		return new DemonioInfernal();
	}
}
