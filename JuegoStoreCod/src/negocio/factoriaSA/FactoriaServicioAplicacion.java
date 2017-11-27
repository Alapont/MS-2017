package negocio.factoriaSA;

import negocio.cliente.ServicioAplicacionCliente;
import negocio.compra.ServicioAplicacionCompra;
import negocio.videojuego.ServicioAplicacionVideojuego;

public abstract class FactoriaServicioAplicacion {
	private static FactoriaServicioAplicacion factoriaSA;

	public static FactoriaServicioAplicacion getInstance(){
		if (factoriaSA == null)
			factoriaSA = new FactoriaServicioAplicacionImp();
		return factoriaSA;
	}

	public abstract ServicioAplicacionVideojuego createSAVideojuego();
	public abstract ServicioAplicacionCliente createSACliente();
	public abstract ServicioAplicacionCompra createSACompra();
}
