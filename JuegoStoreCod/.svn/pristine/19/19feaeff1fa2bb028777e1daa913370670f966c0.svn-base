package negocio.factoriaSA;

import negocio.cliente.ServicioAplicacionCliente;
import negocio.cliente.imp.ServicioAplicacionClienteImp;
import negocio.compra.ServicioAplicacionCompra;
import negocio.compra.imp.ServicioAplicacionCompraImp;
import negocio.videojuego.ServicioAplicacionVideojuego;
import negocio.videojuego.imp.ServicioAplicacionVideojuegoImp;

public class FactoriaServicioAplicacionImp extends FactoriaServicioAplicacion {
	@Override
	public ServicioAplicacionVideojuego createSAVideojuego() {
		return new ServicioAplicacionVideojuegoImp();
	}

	@Override
	public ServicioAplicacionCliente createSACliente() {
		return new ServicioAplicacionClienteImp();
	}

	@Override
	public ServicioAplicacionCompra createSACompra() {
		return new ServicioAplicacionCompraImp();
	}
}
