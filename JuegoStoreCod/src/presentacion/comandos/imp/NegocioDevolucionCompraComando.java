package presentacion.comandos.imp;

import negocio.compra.imp.TransferLineaDeCompra;
import negocio.factoriaSA.FactoriaServicioAplicacion;
import presentacion.ListaComandos;
import presentacion.comandos.Comando;
import presentacion.controlador.Contexto;

public class NegocioDevolucionCompraComando implements Comando {

	@Override
	public Contexto execute(Object datos) {
		int id = FactoriaServicioAplicacion.getInstance().createSACompra().devolverArticulo((TransferLineaDeCompra)datos);
		return new Contexto (ListaComandos.NEGOCIO_DEVOLUCION_COMPRA , id);
	}

}
